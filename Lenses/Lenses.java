package Lenses;

import java.util.ArrayList;

public abstract class Lenses {

    private ArrayList<String> coatings;
    private String material;
    private double price;
    private String type;

    public Lenses(String material, String type, double price) {
        this.material = material;
    }

    protected ArrayList<String> getCoatings() {
        return this.coatings;
    }

    protected String getMaterial() {
        return this.material;
    }

    protected void changePrice(double newPrice) {
        this.price = newPrice;
    }

    protected void changeMaterial(String newMaterial) {
        this.material = newMaterial;
    }

    protected void changeType(String newType) {
        this.type = newType;
    }

    protected double getPrice() {
        return this.price;
    }

}