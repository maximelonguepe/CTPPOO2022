package jpadao;

import dao.Dao;

import java.util.List;

public class JpaDao<T> implements Dao<T> {
    @Override
    public boolean create(T obj) {
        return false;
    }

    @Override
    public T find(Integer id, Class<T> tClass) {
        return null;
    }

    @Override
    public List<T> findAll(Class<T> tClass) {
        return null;
    }

    @Override
    public boolean update(T obj) {
        return false;
    }

    @Override
    public boolean delete(T obj) {
        return false;
    }

    @Override
    public boolean deleteAll(Class<T> tClass) {
        return false;
    }

    @Override
    public void close() {

    }
}
