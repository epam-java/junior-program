package com.epam.jmp.patterns.templatemethod;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    private File file;

    public Reader(File file) {
        this.file = file;
    }

    public List<Person> readAll() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        List<Person> persons = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {
            String[] details = line.split(",");

            Person person = new Person();
            person.setName(details[0]);
            person.setPhone(details[1]);
            person.setScore(Integer.valueOf(details[2]));

            persons.add(person);
        }
        br.close();
        return persons;
    }
}
