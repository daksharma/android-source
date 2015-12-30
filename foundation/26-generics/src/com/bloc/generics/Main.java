package com.bloc.generics;

import com.bloc.generics.things.*;

public class Main extends Object {

	public static void main(String [] args) {

		ToyBox toyBox = new ToyBox();
		
		/************************************************
 		 *	ASSIGNMENT:
 		 *	Place several Toy objects into toyBox
		/************************************************/
        Toy<Book> toyCode = new Toy<Book>(new Book());
        Toy<ActionFigure> toyFigure = new Toy<ActionFigure> (new ActionFigure());
        Toy<Spoon> toySpoon = new Toy<Spoon> (new Spoon());


        Toy<Book> toyBook = new Toy<Book>(new Book());
        Toy<ActionFigure> toyAction = new Toy<ActionFigure> (new ActionFigure());
        Toy<Spoon> toySpoon1 = new Toy<Spoon> (new Spoon());


        toyBox.addToy(toyCode);
        toyBox.addToy(toyFigure);
        toyBox.addToy(toySpoon);


        toyBox.addToy(toyBook);
        toyBox.addToy(toyAction);
        toyBox.addToy(toySpoon1);
        


		assert toyBox.getToyCount() > 0 : "Let's get some toys in that box!";
		System.out.println("Inside your toybox you've got:");
		for (int i = 0; i < toyBox.getToyCount(); i++) {
			System.out.println(" - " + toyBox.getToyAtIndex(i).get());
		}
		System.out.println("Sounds like fun!\n");

		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/*   If you see this,   */");
		System.out.println("/*   congratulations!   */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}
}
