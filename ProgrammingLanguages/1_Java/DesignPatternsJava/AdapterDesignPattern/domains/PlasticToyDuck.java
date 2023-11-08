package DesignComponents.DesignPatternsJava.AdapterDesignPattern.domains;

import DesignComponents.DesignPatternsJava.AdapterDesignPattern.interfaces.ToyDuck;

public class PlasticToyDuck implements ToyDuck {

    @Override
    public void squeak() {
        System.out.println("Squeak");
    }
}
