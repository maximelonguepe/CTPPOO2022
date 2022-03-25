package dao;


import enums.PersistenceType;

public abstract class DaoFactory {

    public abstract DaoAliments getDaoAliments();
    public abstract DaoRepas getDaoRepas();

    public static DaoFactory getDaoFactory(PersistenceType type){
        DaoFactory dao=null;
        if(type.equals(PersistenceType.JPA)){
            dao=new DaoFactoryJpa();

        }
        else if (type.equals(PersistenceType.JSON)){
            dao=new DaoFactoryJson();

        }
        return dao;
    }


}
