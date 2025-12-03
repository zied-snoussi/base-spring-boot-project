package tn.esprit.com.services.interfaces;

import java.util.List;

public interface IService <T, ID> {
    T add(T entity);
    List<T> saveAll(List<T> entities);
    T findById(ID id);
    List<T> findAll();
    T update(T entity);
    void delete(T entity);
    void deleteAll();
    void deleteById(ID id);
    boolean existsById(ID id);
}
