package com.bloc.inherit;

/************************************************
 * ASSIGNMENT:
 * Define the GoldenRetriever class below
 * <p/>
 * Golden Retrievers shrink to a smaller size after
 * playing only 3 times.
 * /
 ************************************************/

public class GoldenRetriever extends Dog {
    int goldCounter = 0;

    public GoldenRetriever() {
        super();
    }

    @Override
    public void play() {

        if (getWeight() < MINIMUM_WEIGHT) {
            if (mWeight <= 0) {
                setWeight(MINIMUM_WEIGHT);
            }
            mWeight -= WEIGHT_LOST_FROM_FEEDING;
        }

        if (++goldCounter % 3 == 0) {
            changeSize(false);
        }
    }

}
