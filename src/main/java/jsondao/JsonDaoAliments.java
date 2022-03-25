package jsondao;

import dao.DaoAliments;
import entities.E_TAlimentsEntity;


public class JsonDaoAliments extends JsonDao<E_TAlimentsEntity> implements DaoAliments {
    private static JsonDaoAliments instance;
    public static JsonDaoAliments getInstance(){
        if(instance==null){
            instance=new JsonDaoAliments();
        }
        return instance;
    }

}
