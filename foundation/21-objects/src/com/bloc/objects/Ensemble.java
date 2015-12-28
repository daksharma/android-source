package com.bloc.objects;

class Ensemble extends Object {
	// Name
	String mName;

	// All of the artists in the group
	Artist[] mArtists;

	/*
	 * Ensemble
	 *
	 * This constructor takes in a variable length of Artist objects.
	 * This is an overloaded constructor that calls down to the complete
	 * constructor below.
	 *
	 * @param artists variable length artists (Artist... artists)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the first Ensemble constructor
	/************************************************/
	public Ensemble (Artist... artists) {
        this(null, artists);
        //this.mArtists = artists;
        /*
        System.out.println("First Ensemble Constructor: ");
        System.out.println("mArtist.length: " + mArtists.length);
        System.out.println("param artists: " + artists[0].mFirstName + " " + artists[0].mLastName);
        System.out.println("mArtists: " + mArtists[0].mFirstName + " " + mArtists[0].mLastName);
        System.out.println("Ensemble mName: " + mName);
        */
    }

	/*
	 * Ensemble
	 *
	 * This constructor takes a name and a variable length of Artist objects
	 * Side-effect: if the 'name' parameter is null, uses the first and
	 * 				last name of the first Artist
	 * Hint:		You can add Strings together with a '+'
	 *
	 * @param name the name of the group (String)
	 * @param artists variable length artists (Artist... artists)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the second Ensemble constructor
	/************************************************/
    public Ensemble (String name, Artist... artists) {
        //this();
        this.mArtists = artists;
        if (name == null && mName == null) {
            this.mName = artists[0].mFirstName + artists[0].mLastName;
        } else {
            this.mName = name;
        }

        /*
        System.out.println(name);
        System.out.println(mName);

        System.out.println("Second Ensemble Constructor: ");
        System.out.println("mArtist.length: " + mArtists.length);
        System.out.println("param artists: " + artists[0].mFirstName + " " + artists[0].mLastName);
        System.out.println("mArtists: " + mArtists[0].mFirstName + " " + mArtists[0].mLastName);
        System.out.println("Ensemble mName: " + mName);
        */
    }
}