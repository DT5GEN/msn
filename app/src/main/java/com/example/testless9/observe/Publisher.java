package com.example.testless9.observe;

import java.util.ArrayList;
import java.util.List;

import com.example.testless9.data.CardData;

public class Publisher {
    private List<Observer> observers;

    public Publisher() {
        this.observers = new ArrayList<Observer>();
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyTask(CardData cardData) {
        for (Observer observer : observers) {
            observer.updateState(cardData);
            unsubscribe(observer);
        }
    }
}
