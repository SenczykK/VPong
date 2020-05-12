package senczykk.vpong.entities;

public class MapEntity {
	private int width, heigh;
	private char [][]map = new char[10][10];

	private Player firstPlayer, secondPlayer;
	
	public Player[] getPlayers() {
		return [firstPlayer, secondPlayer];
	}
	
	public void print() {
		for(int i=0; i<firstPlayer.getLength(); i++) {
			map[firstPlayer.getX()][firstPlayer.getY()+i] = 'X';
		}
		for(int i=0; i<secondPlayer.getLength(); i++) {
			map[secondPlayer.getX()][secondPlayer.getY()+i] = 'T';
		}
		
		for(int i=0; i<10; i++) {
			System.out.print(map[i][0]+map[i][1]+map[i][2]+map[i][3]+map[i][4]+map[i][5]+map[i][6]+map[i][7]+map[i][8]+map[i][9]);
		}
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeigh() {
		return heigh;
	}
	
	public void setHeigh(int heigh) {
		this.heigh = heigh;
	}
	   
	public String toString() {
		return "w:"+this.width+" h:"+this.heigh;
	}
}
