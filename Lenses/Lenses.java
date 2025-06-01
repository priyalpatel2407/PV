package Lenses;

import java.util.ArrayList;

public abstract class Lenses {

    protected ArrayList<String> coatings;
    protected String material;
    protected double price;
    protected String type;

    protected Lenses() {

    }

    public ArrayList<String> getCoatings() {
        return this.coatings;
    }

    protected String getMaterial() {
        return this.material;
    }

    // This method will only change the price of the lenses so it will update the
    // price of the lenses.
    // we
    protected void changePrice(double newPrice) {
        this.price += newPrice;
    }

    protected abstract void changeType(String newType);

    protected double getPrice() {
        return this.price;
    }

    protected String getType() {
        return this.type;
    }

}