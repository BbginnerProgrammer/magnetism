package com.weblab.magnetism.service.impl;

import com.weblab.magnetism.service.interf.CRUDService;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCRUDService<E, K> implements CRUDService<E, K> {

    abstract CrudRepository<E, K> getRepository();

    @Override
    public void create (E object){
        getRepository().save(object);
    }

    public E findById(K id) {
        return getRepository().findById(id).orElse(null);
    }

    public List<E> findAll(){
        List<E> objects = new ArrayList<>();
        getRepository().findAll().forEach(objects::add);
        return objects;
    }

    public E update(E object){
        getRepository().save(object);
         return object;
    }

    public void delete(E object){
        getRepository().delete(object);
    }

}
