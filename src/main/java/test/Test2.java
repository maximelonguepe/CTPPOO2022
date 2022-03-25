package test;

import dao.DaoAliments;
import dao.DaoFactory;
import entities.E_TAlimentsEntity;
import enums.PersistenceType;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        DaoAliments daoAliments = DaoFactory.getDaoFactory(PersistenceType.JSON).getDaoAliments();

        E_TAlimentsEntity entity = new E_TAlimentsEntity(1,"Aliment 1");
        daoAliments.create(entity);


        entity.setDescription("nouvelle description aliment 1");
        daoAliments.update(entity);

        E_TAlimentsEntity entity2 = new E_TAlimentsEntity(2,"Aliment 2");
        daoAliments.create(entity2);

        E_TAlimentsEntity entity1 = daoAliments.find(2,E_TAlimentsEntity.class);

        daoAliments.delete(entity);

        List<E_TAlimentsEntity> list=daoAliments.findAll(E_TAlimentsEntity.class);
        System.out.println(list);

        daoAliments.deleteAll(E_TAlimentsEntity.class);
    }

}
