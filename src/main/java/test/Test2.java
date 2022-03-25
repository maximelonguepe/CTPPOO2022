package test;

import dao.DaoAliments;
import dao.DaoFactory;
import entities.E_TAlimentsEntity;
import enums.PersistenceType;

public class Test2 {
    public static void main(String[] args) {
        DaoAliments daoAliments = DaoFactory.getDaoFactory(PersistenceType.JSON).getDaoAliments();
        E_TAlimentsEntity entity = new E_TAlimentsEntity(1,"Aliment 1");
        daoAliments.update(entity);
       // E_TAlimentsEntity e_tAlimentsEntity= daoAliments.find(1234,)
        //System.out.println(daoAliments.find(1234,E_TAlimentsEntity.class));
    }

}
