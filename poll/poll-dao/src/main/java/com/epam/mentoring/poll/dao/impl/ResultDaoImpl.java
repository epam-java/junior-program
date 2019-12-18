package com.epam.mentoring.poll.dao.impl;

import com.epam.mentoring.poll.dao.ResultDao;
import com.epam.mentoring.poll.domain.Result;

import java.util.List;

public class ResultDaoImpl implements ResultDao {

    @Override
    public List<Result> findAll() {
        return null;
    }

    @Override
    public Result findById(long id) {
        return null;
    }

    @Override
    public List<Result> findByPollId(long pollId) {
        return null;
    }

    @Override
    public Result findByScore(long pollId, int score) {
        return null;
    }
}
