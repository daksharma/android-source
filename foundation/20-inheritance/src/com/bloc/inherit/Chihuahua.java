package com.bloc.inherit;

/************************************************
 * ASSIGNMENT:
 * Define the Chihuahua class below
 * <p/>
 * Chiuahuas must be fed 5 times in order to grow
 * larger.
 * /
 ************************************************/

public class Chihuahua extends Dog {
    int chiCount = 0;

    public Chihuahua() {
        super();
    }

    @Override
    public void feed() {
        mWeight += WEIGHT_GAINED_FROM_FEEDING;
        if (++chiCount % 5 == 0) {
            changeSize(true);
            /*
            switch (mSize) {
                case "tiny": mSize = "small";
                    break;
                case "small": mSize = "average";
                    break;
                case "average": mSize = "large";
                    break;
            }*/
        }
    }
}
