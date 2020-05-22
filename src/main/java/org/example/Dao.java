package org.example;

import java.io.FileNotFoundException;

public interface Dao<T> {

    T create(T obj) throws FileNotFoundException;

    T find(String id);

    void delete(String file);
}