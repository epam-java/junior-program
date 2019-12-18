package com.epam.mentoring.poll.domain;

import lombok.Data;

import java.util.List;

@Data
public class Poll {

    private long id;

    private String name;

    private String description;

    private List<Question> questions;

    private List<Result> results;
}
