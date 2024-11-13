package com.example;

public class DriverClass {

    private static Application configureApplication() {


        Application app;
        ClothesFactory factory;

        String print = "Party";

        if(print.contains("Party")) {
            factory = new PartyFactory();
            app = new Application(factory);
        } else if(print.contains("Professional")) {
            factory = new ProfessionalFactory();
            app = new Application(factory);
        } else {
            factory = new CasualFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.showClothes();
    }
}


//Driver class to run the Abstract Factory