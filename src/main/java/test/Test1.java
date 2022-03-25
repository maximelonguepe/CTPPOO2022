package test;

import dao.DaoAliments;
import dao.DaoFactory;
import entities.E_TAlimentsEntity;
import enums.PersistenceType;
import jpadao.JpaDao;
import jpadao.JpaDaoAliments;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        //on récupère le daoAliment qui sera ici un jpadaoaliment
        DaoAliments daoAliments=DaoFactory.getDaoFactory(PersistenceType.JPA).getDaoAliments();

        //on créé un nouvel aliment et on récupère son id
        E_TAlimentsEntity e_tAlimentsEntity=new E_TAlimentsEntity("Aliment 2");
        int id_create=daoAliments.create(e_tAlimentsEntity);

        // ici on va chercher le premier aliment
        E_TAlimentsEntity entity=daoAliments.find(1,E_TAlimentsEntity.class);

        //on update le premier aliment
        entity.setDescription("Nouvelle description Aliment 1");
        daoAliments.update(entity);

        // on liste tous les aliments
        List<E_TAlimentsEntity> list=daoAliments.findAll(E_TAlimentsEntity.class);

        // on supprime le deuxieme aliment
        e_tAlimentsEntity.setId(id_create);
        daoAliments.delete(e_tAlimentsEntity);

        //on créé un nouvel aliment et on récupère son id
        E_TAlimentsEntity e_tAlimentsEntity1=new E_TAlimentsEntity("Aliment 3");
        daoAliments.create(e_tAlimentsEntity);

        //on supprime tous les aliments
        daoAliments.deleteAll(E_TAlimentsEntity.class);


    }

}
