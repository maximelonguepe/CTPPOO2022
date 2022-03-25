package jpadao;

import dao.DaoAliments;
import dao.DaoRepas;
import entities.E_TAlimentsEntity;
import entities.E_TRepasEntity;

public class JpaDaoRepas extends JpaDao<E_TRepasEntity> implements DaoRepas {
    private static JpaDaoRepas instance;
    public static JpaDaoRepas getInstance(){
        if(instance==null){
            instance=new JpaDaoRepas();
        }
        return instance;
    }

}
