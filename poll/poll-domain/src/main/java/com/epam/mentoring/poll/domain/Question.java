package com.epam.mentoring.poll.domain;

import lombok.Data;

import java.util.List;

@Data
public class Question {

    private long id;

    private String text;

    private List<Answer> answers;
}
