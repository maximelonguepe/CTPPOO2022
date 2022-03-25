package dao;

import jsondao.JsonDaoAliments;

import java.io.FileNotFoundException;

public class DaoFactoryJson extends DaoFactory {

    @Override
    public DaoAliments getDaoAliments() {
        return JsonDaoAliments.getInstance();

    }

    @Override
    public DaoRepas getDaoRepas() {
        return null;
    }
}
