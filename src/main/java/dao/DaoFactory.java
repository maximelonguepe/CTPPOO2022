package dao;


import enums.PersistenceType;

public abstract class DaoFactory {

    public abstract DaoAliments getDaoAliments();
    public static DaoFactory getDaoFactory(PersistenceType type){
        DaoFactory dao;
        if(type.equals(PersistenceType.JPA)){
            dao=new DaoFactoryJpa();
            return dao;
        }
        else if (type.equals(PersistenceType.JSON)){

        }
        return null;
    }


}
