package Lenses;

public class StandardSingleVision extends SingleVision {
    private static final double STARTING_PRICE = 200;

    public StandardSingleVision(String type, String material) {
        super();
        this.price = STARTING_PRICE; // this is the starting price of the single vision lenses.
        this.design = "Standard Single Vision";
    }

    // now if are adding new coating then we will be adding new features in the
    // lenses.

    // This method will check if whatever lense design we are changing to
    protected Lenses changeLensDesign(String newLens) {
        Lenses newLense = new StandardSingleVision(newLens, newLens);
        return newLense;
    }

    protected void changePrice(double newPrice) {
        this.price += newPrice;
    }

    // main task is to update the coating so that it will change the price of the
    // lenses if we are adding new coatings then it will add more cost

    // so the plan is the make two method one will addd new coating in the lenses
    // and the other method will remove the extra or unnecessary coating from the
    // lenses.

    public void addNewCoating(String newCoating) {
        if (!coatings.contains(newCoating)) {
            if (newCoating.equals("Blue Light")) {
                changePrice(90.00);
            }
            // first we have to remove the price of the blue light lenses and then we have
            // to add new price for the transition lens.

            if (newCoating.equals("Transitions Gens")) {
                changePrice(200.00);
            }

        }
    }

}
