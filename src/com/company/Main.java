package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Circle circle = new Circle(16,"Italy flag");
            circle.area = Math.PI * (circle.getRadius() * circle.getRadius());
            circle.circumference = 2*Math.PI*circle.getRadius();
            System.out.println(circle.getArea());
            System.out.println(circle.getCircumference());
        }
}