package com.example.testless9.data;

public interface CardsSource {
    CardsSource init(CardsSourceResponse cardsSourceResponse);

    CardData getCardData(int position);

    int size();

    void deleteCardData(int position);

    void updateCardData(int position, CardData newCardData);

    void addCardData(CardData newCardData);

    void clearCardData();
}
