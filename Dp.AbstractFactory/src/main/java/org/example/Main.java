package org.example;

public class Main {
    public static void main(String[] args) {
        var engineer = new AbstractFactoryProducer().getProfessionFactory(false)
                .getProfession("engineer");
        engineer.print();
    }
}

