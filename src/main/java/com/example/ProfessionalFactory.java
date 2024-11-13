package com.example;

public class ProfessionalFactory implements ClothesFactory {

    @Override
    public Pants createPants() {
        return new ProfessionalPants();
    }

    @Override
    public Tops createTops() {
        return new ProfessionalTop();
    }

    @Override
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}


// Concrete factory class for Professional clothes