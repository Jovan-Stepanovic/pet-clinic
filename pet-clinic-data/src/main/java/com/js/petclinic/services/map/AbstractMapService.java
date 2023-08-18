package com.js.petclinic.services.map;

import com.js.petclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {

        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        }

        return object;
    }

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    void delete(T t) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    private Long getNextId() {
        return map.keySet().isEmpty()
                ? 1L
                : Collections.max(map.keySet()) + 1;
    }

}
