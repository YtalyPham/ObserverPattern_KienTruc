package com.example.observerpattern;

public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyAllObserver();
}
