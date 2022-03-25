package test;

import dao.Dao;
import dao.DaoAliments;
import dao.DaoFactory;
import dao.DaoRepas;
import entities.E_TAlimentsEntity;
import entities.E_TRepasEntity;
import enums.PersistenceType;
import jpadao.JpaDao;
import jpadao.JpaDaoAliments;

import java.sql.Time;
import java.sql.Date;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        DaoAliments daoAliments=DaoFactory.getDaoFactory(PersistenceType.JPA).getDaoAliments();
/*
        //on récupère le daoAliment qui sera ici un jpadaoaliment


        //on créé un nouvel aliment et on récupère son id
        E_TAlimentsEntity e_tAlimentsEntity=new E_TAlimentsEntity("Aliment 2");
        int id_create=daoAliments.create(e_tAlimentsEntity);

        // ici on va chercher le premier aliment
        E_TAlimentsEntity entity=daoAliments.find(1,E_TAlimentsEntity.class);

        //on update le premier aliment
        entity.setDescription("Nouvelle description Aliment 1");
        daoAliments.update(entity);

        // on liste tous les aliments
        */
        List<E_TAlimentsEntity> list=daoAliments.findAll(E_TAlimentsEntity.class);
        System.out.println(list);
        /*
        // on supprime le deuxieme aliment
        e_tAlimentsEntity.setId(id_create);
        daoAliments.delete(e_tAlimentsEntity);

        //on créé un nouvel aliment et on récupère son id
        E_TAlimentsEntity e_tAlimentsEntity1=new E_TAlimentsEntity("Aliment 3");
        daoAliments.create(e_tAlimentsEntity1);

        //on supprime tous les aliments
        daoAliments.deleteAll(E_TAlimentsEntity.class);
        System.out.println("fin");
         */


        DaoRepas daoRepas=DaoFactory.getDaoFactory(PersistenceType.JPA).getDaoRepas();

        Time time=new Time(12,25,0);
        Date date=new Date(2022,12,12);
        daoRepas.create(new E_TRepasEntity(date,time,"ptit dej"));
    }

}
