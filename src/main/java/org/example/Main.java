package org.example;

public class Main {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();


        jobSite.addVacancy("First Java position");
        jobSite.addVacancy("Second Java position");

        Observer firstSubscriber = new Subscriber("Max");
        Observer secondSubscriber = new Subscriber("Pit");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java Position");


        jobSite.removeVacancy("First Java position");


    }
}
