package org.example;

import java.util.List;

public class Haters implements Observer {
    String name;

    public Haters(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("I'm " + name + " and i hate your site and you job with you vacancies" + vacancies +
                "\n==============================================\n");
    }
}
