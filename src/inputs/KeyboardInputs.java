package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import gamestates.GameStates;
import main.GamePanel;

public class KeyboardInputs implements KeyListener{
	private GamePanel gamePanel;
	
	public KeyboardInputs(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (GameStates.state) {
		case MENU:
			gamePanel.getGame().getMenu().keyPressed(e);
			break;
			
		case PLAYING:
			gamePanel.getGame().getPlaying().keyPressed(e);
			break;
			
		case PREPLAYMENU:
			gamePanel.getGame().getPreplayMenu().keyPressed(e);
			break;
			
		case OPTIONS:
			gamePanel.getGame().getOptions().keyPressed(e);
			break;
			
		case QUIT:
			break;
		default:
			break;
		 }
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (GameStates.state) {
		case MENU:
			gamePanel.getGame().getMenu().keyReleased(e);
			break;
			
		case PLAYING:
			gamePanel.getGame().getPlaying().keyReleased(e);
			break;
			
		case OPTIONS:
			gamePanel.getGame().getOptions().keyReleased(e);
			break;
			
		case PREPLAYMENU:
			gamePanel.getGame().getPreplayMenu().keyReleased(e);
			break;
			
		case QUIT:
			break;
		default:
			break;
		 }
	}

}
