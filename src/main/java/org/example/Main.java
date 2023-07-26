package org.example;

public class Main {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();


        jobSite.addVacancy("First Java position");
        jobSite.addVacancy("Second Java position");

        Observer firstSubscriber = new Subscriber("Max");
        Observer secondSubscriber = new Subscriber("Pit");

        Observer hater1 = new Haters("John");
        Observer hater2 = new Haters("Pol");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);
        jobSite.addObserver(hater1);
        jobSite.addObserver(hater2);



        jobSite.addVacancy("Third Java Position");
        jobSite.removeVacancy("First Java position");


    }
}
