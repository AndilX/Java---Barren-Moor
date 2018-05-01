package game;

import java.util.Scanner;

import game.Player;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//creating player object at the start
		Player ref = new Player();
		//grid map = new grid(); 
		
		System.out.println("-------The Adventures of Barren Moore-------");
		System.out.println("___Enter 'Start' to begin or '?' for help___");
		System.out.println("__________'Options' for settings____________");
		
		Scanner playerInput = new Scanner(System.in);
		String textEntered = playerInput.nextLine();
		
		//map.create();
		ref.begin(textEntered);
		

	}

}
