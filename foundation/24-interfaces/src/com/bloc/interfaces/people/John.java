package com.bloc.interfaces.people;
import com.bloc.interfaces.people.hobbies.Driver;

/************************************************
 *	ASSIGNMENT:
 *	Have John implement the Driver interface
/************************************************/

public class John extends Person implements Driver {
	public John() {
		super("John", "Smith", "Male", 1.7d, 69d, "Brown");
	}

	@Override
	public void getInCar() {
		System.out.println("The smell of German leather seats");
	}

	@Override
	public void startEngine() {
		System.out.println("Transporter Ready for Package");
	}

	@Override
	public void driveFast() {
		System.out.println("Package Secure: Escape the Police");
	}
}
