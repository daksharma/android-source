package com.bloc.interfaces.people;
import com.bloc.interfaces.people.hobbies.SalsaDancer;

/************************************************
 *	ASSIGNMENT:
 *	Have Albert implement the SalsaDancer interface
/************************************************/

public class Albert extends Person implements SalsaDancer {
	public Albert() {
		super("Albert", "Cobb", "Male", 1.8d, 72d, "Green");
	}

    @Override
    public void putOnShoes() {
        System.out.println("Albert: Booted and Suited");
    }

    @Override
    public void findAPartner(){
        System.out.println("RRReady to Salsa My Lady?");
    }

    @Override
    public void salsa() {
        System.out.println("Albert got the crowd going wild");
    }
}
