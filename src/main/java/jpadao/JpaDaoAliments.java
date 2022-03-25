package jpadao;

import dao.DaoAliments;
import entities.E_TAlimentsEntity;

public class JpaDaoAliments extends JpaDao<E_TAlimentsEntity> implements DaoAliments {
    private static JpaDaoAliments instance;
    public static JpaDaoAliments getInstance(){
        if(instance==null){
            instance=new JpaDaoAliments();
        }
        return instance;
    }
}
