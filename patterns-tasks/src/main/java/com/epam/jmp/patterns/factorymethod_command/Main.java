package com.epam.jmp.patterns.factorymethod_command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/**
 * Зарефакторить код с применением паттерна Command и Factory method
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String command = reader.readLine();
            if (command.equals("date")) {
                System.out.println(new Date());
            } else if (command.equals("mem")) {
                long megaBytes = 1024 * 1024;
                long freeMemory = Runtime.getRuntime().freeMemory();
                System.out.println(freeMemory / megaBytes);
            } else if (command.equals("proc")) {
                int processors = Runtime.getRuntime().availableProcessors();
                System.out.println(processors);
            } else {
                System.out.println("Unknown command. Please try again");
            }
        }
    }
}
