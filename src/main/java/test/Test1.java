package test;

import dao.DaoAliments;
import dao.DaoFactory;
import entities.E_TAlimentsEntity;
import enums.PersistenceType;
import jpadao.JpaDao;
import jpadao.JpaDaoAliments;

public class Test1 {
    public static void main(String[] args) {
        DaoAliments daoAliments=DaoFactory.getDaoFactory(PersistenceType.JPA).getDaoAliments();
        daoAliments.create(new E_TAlimentsEntity("Medicament 1"));

    }

}
