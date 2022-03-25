package dao;


import jpadao.JpaDaoAliments;

public class DaoFactoryJpa extends DaoFactory  {


    @Override
    public DaoAliments getDaoAliments() {
        return JpaDaoAliments.getInstance();
    }
}
