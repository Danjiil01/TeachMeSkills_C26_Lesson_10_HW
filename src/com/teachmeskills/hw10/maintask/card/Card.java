package com.teachmeskills.hw10.maintask.card;

public class Card {

    // Поля класса
    private int cvvCode;
    private String cardNumber;
    private double balance;

    // Конструктор класса
    public Card(int cvvCode, String cardNumber, double balance) {
        this.cvvCode = cvvCode;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    // Методы доступа к полям класса
    public int getCvvCode() {
        return cvvCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getBalance() {
        return balance;
    }
}
