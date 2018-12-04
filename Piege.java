
public class Piege extends Case{
	
	public Piege(int x, int y) {
		super(x, y);
		this.idCase = 4;
	}
	
	public boolean activation(int posXHero,int posYHero) {
		if (posXHero == coordX && posYHero == coordY) {
			return true;
		}
		return false;
	}
	
	public int degatsPiege(int pvHero,int posXHero,int posYHero) {
		if (activation(posXHero, posYHero)) {
			pvHero -= 20; 
		}
		return 	pvHero;
	}
	
}
