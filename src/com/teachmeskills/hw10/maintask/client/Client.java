package com.teachmeskills.hw10.maintask.client;

import com.teachmeskills.hw10.maintask.card.Card;

public class Client {
    // Поле класса - массив для хранения карт клиента
    private Card[] cards;

    // Конструктор класса
    public Client(Card[] cards) {
        this.cards = cards;
    }

    // Метод для подсчета количества одинаковых карт
    public int countSameCards() {
        // Проверяем, есть ли карты у клиента
        if (cards.length == 0) {
            System.out.println("There are no duplicates");
            return 0;
        }

        int count = 0; // Счетчик одинаковых карт

        // Проходим по каждой карте клиента
        for (int i = 0; i < cards.length - 1; i++) {
            // Проверяем, есть ли одинаковые карты
            for (int j = i + 1; j < cards.length; j++) {
                if (cards[i].getCvvCode() == cards[j].getCvvCode() &&
                        cards[i].getCardNumber().equals(cards[j].getCardNumber())) {
                    count++;
                    break;
                }
            }
        }

        // Выводим сообщение в зависимости от результатов подсчета
        if (count == 0) {
            System.out.println("There are no duplicates");
        } else {
            System.out.println("Client has " + count + " duplicate cards");
        }

        return count;
    }
}
