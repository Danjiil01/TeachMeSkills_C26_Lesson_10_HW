package com.teachmeskills.hw10.maintask;

import com.teachmeskills.hw10.maintask.card.Card;
import com.teachmeskills.hw10.maintask.client.Client;

public class Runner {
    public static void main(String[] args) {
        // Создаем несколько карт для клиента
        Card card1 = new Card(123, "1111 2222 3333 4444", 100.0);
        Card card2 = new Card(456, "5555 6666 7777 8888", 200.0);
        Card card3 = new Card(123, "1111 2222 3333 4444", 300.0);
        Card card4 = new Card(900, "1234 5555 6789 0000", 1000.0);
        Card card5 = new Card(900, "1234 5555 6789 0000", 11200.0);
        Card card6 = new Card(564, "1111 1928 3333 1001", 900.0);

        // Создаем объект клиента с заданными картами
        Client client = new Client(new Card[] {card1, card2, card3, card4, card5, card6});

        // Подсчитываем количество одинаковых карт и выводим сообщение
        int sameCardsCount = client.countSameCards();
    }
}
