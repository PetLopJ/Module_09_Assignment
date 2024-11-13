package com.example;

public class PartyFactory implements ClothesFactory {

    @Override
    public Pants createPants() {
        return new PartyPants();
    }

    @Override
    public Tops createTops() {
        return new PartyTops();
    }

    @Override
    public Shoes createShoes() {
        return new PartyShoes();
    }
}

// Concrete factory class for Party clothes