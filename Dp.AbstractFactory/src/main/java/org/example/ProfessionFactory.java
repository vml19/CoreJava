package org.example;

class ProfessionFactory extends AbstractFactory {
    Profession getProfession(String profession) {
        switch (profession) {
            case "engineer":
                return new Engineer();
            case "doctor":
                return new Doctor();
            default:
                return null;
        }
    }
}