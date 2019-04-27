package main.controllers;

import java.awt.event.KeyEvent;
import main.models.SpaceShip;
import main.main.GamePanel;


/**
 * creates a thread to process spaceShip input
 * @author ghast
 *
 */
public class CmdCenter {

	private GamePanel invaders = null;
	private SpaceShip spaceShip = null;
	public Action action;

	public CmdCenter(GamePanel invaders, SpaceShip spaceShip) {
		this.invaders = invaders;
		this.spaceShip = spaceShip;
	}

	public void handleInput(KeyEvent event) {
		if (action == Action.PRESS) {
			if (KeyEvent.VK_ENTER == event.getKeyCode()) {
				if (invaders.gameOver || invaders.gameWon) {
					invaders.initWorld();
					invaders.game();
				}
			}

			else
				spaceShip.keyPressed(event);
		}
		else if (action == Action.RELESEASE)
			spaceShip.keyReleased(event);
	}

	public enum Action {
		PRESS,
		RELESEASE
	}
}
