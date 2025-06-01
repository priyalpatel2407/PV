package Lenses;

import java.util.ArrayList;

public abstract class SingleVision extends Lenses {

    protected ArrayList<String> features;
    protected String design;

    public SingleVision() {
        super();
        this.type = "Single Vision";
        this.material = "1.59";
        this.price = 200; // starting price for the lenses is 200.
        features.add("Scratch Resistant");
        features.add("UV300");
    }

    protected void addNewFeatures(String newFeature) {
        this.features.add(newFeature);
    }

    protected abstract Lenses changeLensDesign(String newLens);
}
