package com.example;

public class Application {

    private Pants pants;
    private Tops tops;
    private Shoes shoes;

    public Application(ClothesFactory factory) {
        pants = factory.createPants();
        tops = factory.createTops();
        shoes = factory.createShoes();
    }

    public void showClothes() {
        pants.typeOfPants();
        tops.typeOfTops();
        shoes.typeOfShoes();
    }
}

// Configuration class
