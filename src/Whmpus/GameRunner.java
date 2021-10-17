package Whmpus;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			World whmpusWorld = new World().generateRandomWorld();

			Agent agent = new Agent(whmpusWorld);
		
			agent.moveAgent();
			
	
			Desktop d = Desktop.getDesktop();
			try {
				File gameUI = new File("D:\\xampp\\htdocs\\Wumpus.html");
				d.browse(gameUI.toURI());
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
