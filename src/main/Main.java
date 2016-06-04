package main;

import layout.MainFrame;
import layout.Menu;

public class Main {

	//main
	
	public static void main(String[] args) {
		MainFrame glowneOkno =MainFrame.getInstance();
		new Menu(glowneOkno);
	}
}
