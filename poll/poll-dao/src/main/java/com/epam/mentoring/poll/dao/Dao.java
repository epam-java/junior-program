package com.epam.mentoring.poll.dao;

import java.util.List;

public interface Dao<T> {

    List<T> findAll();

    T findById(long id);
}
