package com.epam.mentoring.poll.domain;

import lombok.Data;

@Data
public class Result {

    private long id;

    private String explanation;

    private int minScore;

    private int maxScore;
}
