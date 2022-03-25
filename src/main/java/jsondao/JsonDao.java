package jsondao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dao.Dao;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JsonDao<T> implements Dao<T> {
    File file;

    public JsonDao() {

    }

    @Override
    public int create(T obj) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        file = new File("src/main/resources/" + obj.getClass().getSimpleName() + ".json");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Object ob = JSONValue.parse(br);
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONArray array = (JSONArray) ob;
        array.add(obj);

        String jsonString = gson.toJson(array);
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter("src/main/resources/" + obj.getClass().getSimpleName() + ".json");
            myWriter.write(jsonString);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 1;
    }

    @Override
    public T find(Integer id, Class<T> tClass) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        file = new File("src/main/resources/" + tClass.getSimpleName() + ".json");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Object ob = JSONValue.parse(br);
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONArray array = (JSONArray) ob;
        for (int i = 0; i < array.size(); i++) {
            JSONObject object = (JSONObject) array.get(i);
            Long toto = (Long) object.get("id");
            Long longid = new Long(id);
            if (Objects.equals(toto, longid)) {
                String test = object.toJSONString();
                return gson.fromJson(test, tClass);
            }
        }
        return null;
    }

    @Override
    public List<T> findAll(Class<T> tClass) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        ArrayList<T> list=new ArrayList<T>();
        file = new File("src/main/resources/" + tClass.getSimpleName() + ".json");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Object ob = JSONValue.parse(br);
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONArray array = (JSONArray) ob;
        for (int i = 0; i < array.size(); i++) {
            JSONObject object = (JSONObject) array.get(i);
            String test =object.toJSONString();
            list.add(gson.fromJson(test,tClass));

        }

        return list;
    }

    @Override
    public boolean update(T obj) {

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        file = new File("src/main/resources/" + obj.getClass().getSimpleName() + ".json");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Object ob = JSONValue.parse(br);
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONArray array = (JSONArray) ob;
        String objToJson= gson.toJson(obj);
        JSONObject objectToJsonObject=gson.fromJson(objToJson,JSONObject.class);
        Double idobj=(Double) objectToJsonObject.get("id");
        String description= (String) objectToJsonObject.get("description");
        JSONArray array1=new JSONArray();
        int i;
        for (i = 0; i < array.size(); i++) {

            //T test= (T) gson.fromJson(objToJson,tClass);

            JSONObject object = (JSONObject) array.get(i);
            Long idArrayObject = (Long) object.get("id");

            Double idArrayObjectDouble = idArrayObject.doubleValue();


            if(idArrayObjectDouble.equals(idobj)){
                object.put("description",description);
                array1.add(object);
            }
            else {
                array1.add(object);
            }
            //array.remove(i);
            FileWriter myWriter;
            try {
                myWriter = new FileWriter("src/main/resources/" + obj.getClass().getSimpleName() + ".json");
                myWriter.write(array1.toJSONString());
                myWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        return true;
    }

    @Override
    public boolean delete(T obj) {

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        file = new File("src/main/resources/" + obj.getClass().getSimpleName() + ".json");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Object ob = JSONValue.parse(br);
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONArray array = (JSONArray) ob;
        String objToJson= gson.toJson(obj);
        JSONObject objectToJsonObject=gson.fromJson(objToJson,JSONObject.class);
        Double idobj=(Double) objectToJsonObject.get("id");
        String description= (String) objectToJsonObject.get("description");
        JSONArray array1=new JSONArray();
        int i;
        for (i = 0; i < array.size(); i++) {

            //T test= (T) gson.fromJson(objToJson,tClass);

            JSONObject object = (JSONObject) array.get(i);
            Long idArrayObject = (Long) object.get("id");

            Double idArrayObjectDouble = idArrayObject.doubleValue();


            if(idArrayObjectDouble.equals(idobj)){

            }
            else {
                array1.add(object);
            }
            //array.remove(i);
            FileWriter myWriter;
            try {
                myWriter = new FileWriter("src/main/resources/" + obj.getClass().getSimpleName() + ".json");
                myWriter.write(array1.toJSONString());
                myWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        return true;
    }

    @Override
    public boolean deleteAll(Class<T> tClass) {
        FileWriter myWriter;
        try {
            myWriter = new FileWriter("src/main/resources/" + tClass.getSimpleName() + ".json");
            myWriter.write("[]");
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    @Override
    public void close() {

    }
}
