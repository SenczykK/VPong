package senczykk.vpong.entities;

public class Player {
	private String name;
	private int length, x, y;
	
	private char moveLeftKey, moveRightKey;
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public Player() {
		this.length = 4;
	}
	
	public void setStartPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setMovementKeys(char leftKey, char rightKey) {
		this.moveLeftKey = leftKey;
		this.moveRightKey = rightKey;
	}

	public int getLength() {
		return length;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public char getMoveLeftKey() {
		return moveLeftKey;
	}


	public char getMoveRightKey() {
		return moveRightKey;
	}

	public String getName() {
		return name;
	}
	
	
}
