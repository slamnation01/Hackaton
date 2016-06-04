package main;

import layout.MainFrame;
import layout.Menu;
import projekt.NewProject;

public class Main {

	public static void main(String[] args) {
		MainFrame glowneOkno = new MainFrame();
		new Menu(glowneOkno);
	}
}
