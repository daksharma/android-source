package com.bloc.classes;

class Dog {
    // The length of hair which
    final float HAIR_CUT_LENGTH = 0.15f;
    // Minimum weight that any Dog can be
    final float MIN_WEIGHT = 1.25f;
	// Amount of weight to gain after eating
	final float WEIGHT_GAIN = 0.25f;
	// Amount of weight to lose after playing
	final float WEIGHT_LOSS = 0.2f;
	// Hair length
	float mHairLength;
	// Gender, either "male" or "female"
	String mGender;
	// Size, either "tiny", "small", "average", or "large"
	String mSize;
	// Its age
	int mAge;
	// Its weight in pounds
	float mWeight;
	// The color of its coat
	String mColor;

	/************************************************
	 * ADD MEMBER VARIABLES HERE IF NECESSARY	
	/************************************************/
    int playCount = 0;
    int feedCount = 0;


	/*
	 * getHairLength
	 *
	 * @return this Dog's hair length (float)
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getHairLength method
	/************************************************/
    public float getHairLength() {
        return mHairLength;
    }

	/*
	 * setHairLength
	 *
	 * Sets the length of the Dog's hair (float)
	 *
	 * @param hairLength the new length of the hair (float)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setHairLength method
	/************************************************/
    public void setHairLength(float hairLength) {
        this.mHairLength = hairLength;
    }

	/*
	 * getGender
	 *
	 * @return this Dog's gender (String)
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getGender method
	/************************************************/
    public String getGender() {
        return mGender;
    }

	/*
	 * setGender
	 *
	 * Sets this Dog's gender
	 *
	 * @param gender the new gender of the Dog (String)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setGender method
	/************************************************/
    public void setGender(String gender) {
        this.mGender = gender;
    }

	/*
	 * getSize
	 *
	 * @return the size of the dog (String)
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getSize method
	/************************************************/
    public String getSize() {
        return mSize;
    }

	/*
	 * setSize
	 *
	 * Sets the size of the Dog
	 *
	 * @param size the new size of the Dog (String)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setSize method
	/************************************************/
    public void setSize(String size) {
        this.mSize = size;
    }

	/*
	 * getAge
	 *
	 * @return this Dog's age (int)
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getAge method
	/************************************************/
    public int getAge() {
        return mAge;
    }
	/*
	 * setAge
	 *
	 * Sets the age of the Dog
	 *
	 * @param age the new age of the Dog (int)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setAge method
	/************************************************/
    public void setAge(int age) {
        this.mAge = age;
    }

	/*
	 * getWeight
	 *
	 * @return this Dog's weight (float)
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getWeight method
	/************************************************/
    public float getWeight() {
        return mWeight;
    }

	/*
	 * setWeight
	 *
	 * Sets the weight of the Dog
	 *
	 * @param weight the new weight of the Dog (float)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setWeight method
	/************************************************/
    public void setWeight(float weight) {
        this.mWeight = weight;
    }
	/*
	 * getColor
	 *
	 * @return this Dog's color (String)
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getColor method
	/************************************************/
    public String getColor () {
        return mColor;
    }

	/*
	 * setColor
	 *
	 * Sets the color of the Dog
	 *
	 * @param color the new color of the Dog's coat (String)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setColor method
	/************************************************/
    public void setColor (String color) {
        this.mColor = color;
    }

	/*
	 * feed
	 *
	 * Feeds the Dog.
	 *
	 * Side-effect: 1. The Dog gains weight, specifically WEIGHT_GAIN
	 *              2. Every 3 meals, the Dog grows to a larger size, if
	 *                 possible
	 *                 i.e. "tiny" (3 meals later ->) "small" (3 meals later ->)
	 *                 "average" (3 meals later ->) "large"
	 *				   the Dog cannot exceed the "large" size or shrink smaller than
	 *				   "tiny"
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the feed method
	/************************************************/
    public void feed() {
        feedCount++;
        mWeight += WEIGHT_GAIN;

        if ((feedCount % 3) == 0) {
            switch(mSize) {
                case "tiny" : mSize = "small";
                    break;
                case "small" : mSize = "average";
                    break;
                case "average" : mSize = "large";
                    break;
            }
        }
    }

	/*
	 * play
	 *
	 * Let the Dog play.
	 *
	 * Side-effect: 1. The Dog loses weight, specifically WEIGHT_LOSS
	 *				2. Every 6 play invocations, the Dog shrinks to a smaller 
	 *		   		   size, if possible i.e. "large" (6 plays later->) "average" (6 plays later->) 
	 *		   		   "small" -> "tiny"
	 *		   		3. The Dog cannot shrink to a weight smaller than
	 *		  		   MIN_WEIGHT
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the play method
	/************************************************/
    public void play() {
        playCount++;

        if ( (mWeight != MIN_WEIGHT) && !(mWeight < MIN_WEIGHT)) {
            mWeight -= WEIGHT_LOSS;
        }

        if ( playCount % 6 == 0 ) {
            switch(mSize) {
                case "large": mSize = "average";
                    break;
                case "average": mSize = "small";
                    break;
                case "small" : mSize = "tiny";
                    break;
            }
        }
    }

	/*
	 * cutHair
	 *
	 * Cut the Dog's hair.
	 *
	 * Side-effect: the Dog's hair length is reduced by HAIR_CUT_LENGTH
	 * 				The Dog's hair cannot be shorter than 0f
	 *
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the cutHair method
	/************************************************/
    public void cutHair () {
        if ((mHairLength != 0)){
            mHairLength -= HAIR_CUT_LENGTH;
            if (mHairLength < 0)
                mHairLength = 0;
        }
    }

}
