package org.example;

class AbstractFactoryProducer {
    //Return a factory
    AbstractFactory getProfessionFactory(boolean isTrainee) {
        if (isTrainee) {
            return new TraineeProfessionFactory();
        }
        return new ProfessionFactory();
    }
}
