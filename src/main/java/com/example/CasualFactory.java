package com.example;

public class CasualFactory implements ClothesFactory {


    @Override
    public Pants createPants() {
        return new CasualPants();
    }

    @Override
    public Tops createTops() {
        return new CasualTops();
    }

    @Override
    public Shoes createShoes() {
        return new CasualShoes();
    }
}

// Concrete factory class for Casual clothes