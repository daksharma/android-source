package com.bloc.interfaces.people;
import com.bloc.interfaces.people.hobbies.Skydiver;

/************************************************
 *	ASSIGNMENT:
 *	Have Mary implement the Skydiver interface
/************************************************/

public class Mary extends Person implements Skydiver{
	public Mary() {
		super("Mary", "Whiters", "Female", 1.65d, 62d, "Blue");
	}

	@Override
	public void getInPlane() {
		System.out.println("Mary is on top of the plane");
	}

	@Override
	public void jumpFromPlane() {
		System.out.println("Mary... just jumped off the plane");
	}

	public void releaseParachute() {
		System.out.println("Mary has released her parachute");
	}
}