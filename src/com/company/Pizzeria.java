package com.company;

import java.util.Arrays;

public class Pizzeria {

    public static void main(String[] args) {

        Pizza[] pizzaList = new Pizza[3];
        pizzaList[0] = new Pizza("соус помодоро, сыр моцарелла, сыр пармезан, сыр рокфор, сыр фета, сыр радомер.", "5 сыров", 140.00, 60);
        pizzaList[1] = new Pizza("сыр моцарелла, бекон, сыр пармезан, яйцо, ветчина.", "Карбонара", 150.00, 40);
        pizzaList[2] = new Pizza("сыр моцарелла, маслины, помидор, сыр фета, грибы шампиньоны, перец болгарский, соус помодоро", "Вегетарианская", 105.00, 60);

        for (Pizza pizza : pizzaList) {
            System.out.println("пицца №1: " + pizzaList [0]);
            System.out.println("пицца №2: " + pizzaList [1]);
            System.out.println("пицца №3: " + pizzaList [2]);
            break;
        }
    }
}