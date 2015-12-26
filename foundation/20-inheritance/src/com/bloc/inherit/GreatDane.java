package com.bloc.inherit;

/************************************************
 * ASSIGNMENT:
 * Define the GreatDane class below
 * <p/>
 * Great Danes have an extra size category, "huge".
 * After growing to a "large" size, they may grow
 * to an additional, "huge" size after 3 meals.
 * /
 ************************************************/

public class GreatDane extends Dog {
    int daneCount = 0;

    public GreatDane() {
        super();
    }



    @Override
    public void feed() {
        mWeight += WEIGHT_GAINED_FROM_FEEDING;
        if (++daneCount % 3 == 0) {
            switch (mSize) {
                case "tiny": mSize = "small";
                    break;
                case "small": mSize = "average";
                    break;
                case "average": mSize = "large";
                    break;
                case "large": mSize = "huge";
                    break;
                case "huge":
                    break;
            }
        }
    }

    @Override
    public void changeSize(boolean grow) {
        int sizeIndex = getSizeIndex();
        sizeIndex += (grow ? 1 : -1);

        if (sizeIndex > 3) {
            sizeIndex = 4;
        } else if (sizeIndex < 0) {
            sizeIndex = 0;
        }
        setSize(fromSizeIndex(sizeIndex));
    }

    @Override
    public int getSizeIndex(String size) {
        if ("tiny".equals(size)) {
            return 0;
        } else if ("small".equals(size)) {
            return 1;
        } else if ("average".equals(size)) {
            return 2;
        } else if ("large".equals(size)) {
            return 3;
        } else if ("huge".equals(size)) {
            return 4;
        } else {
            return 2;
        }
    }

    @Override
    public String fromSizeIndex(int index) {
        switch (index) {
            case 0:
                return "tiny";
            case 1:
                return "small";
            case 2:
                return "average";
            case 3:
                return "large";
            case 4:
                return "huge";
            default:
                return "average";
        }
    }
}
