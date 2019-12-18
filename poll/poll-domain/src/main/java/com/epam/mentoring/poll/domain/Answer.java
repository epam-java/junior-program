package com.epam.mentoring.poll.domain;

import lombok.Data;

@Data
public class Answer {

    private long id;

    private String text;

    private int weight;
}
