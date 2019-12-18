package com.epam.mentoring.poll.dao;

import com.epam.mentoring.poll.domain.Answer;

import java.util.List;

public interface AnswerDao extends Dao<Answer> {

    List<Answer> findByQuestionId(long questionId);
}
