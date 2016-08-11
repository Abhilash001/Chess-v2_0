package abhilash001.chess.model;

class Figure implements Cloneable{

	private char x;
	private int y;

	public Figure(char x, int y){
		this.x=x;
		this.y=y;
	}
	
	//setters and getters

	public Figure clone(){
		char xCloned = x;
		int yCloned = y;
		return new Figure(xCloned, yCloned);
	}

	public String toString(){
		return String.valueOf(x)+String.valueOf(y);
	}

}
