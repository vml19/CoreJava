package org.example;

class TraineeProfessionFactory extends AbstractFactory {
    Profession getProfession(String profession) {
        switch (profession) {
            case "trainee engineer":
                return new TraineeEngineer();
            case "trainee doctor":
                return new TraineeDoctor();
            default:
                return null;
        }
    }
}
