package com.muhammet.repository;

import java.util.List;
import java.util.Optional;

/**
 * Temel CRUD işlemlerini tanımlar ve soruları belirtir.
 * @param <T> Entity
 * @param <ID> Identity
 */
public interface ICrud<T, ID> {
    T save(T t);
    Iterable<T> saveAll(Iterable<T> entities);
    Optional<T> findById(ID id);
    boolean existById(ID id);
    List<T> findAll();
    List<T> findAllColumnAndValue(String columnName, Object value);
    void deleteById(ID id);
    List<T> findAllEntity(T entity);
}
