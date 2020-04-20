package com.company;

public class Pizza {

    public Circle basis;
    public String composition;
    public String name;
    public double cost;

    public Pizza (String composition, String name, double cost, double diameter) {
        this.basis = new Circle(diameter/2);
        this.composition = composition;
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "basis=" + basis +
                ", composition='" + composition + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost + " грн." +
                '}';
    }
}