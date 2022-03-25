package dao;


import jpadao.JpaDaoAliments;
import jpadao.JpaDaoRepas;

public class DaoFactoryJpa extends DaoFactory  {


    @Override
    public DaoAliments getDaoAliments() {
        return JpaDaoAliments.getInstance();
    }

    @Override
    public DaoRepas getDaoRepas() {
        return JpaDaoRepas.getInstance();
    }
}
