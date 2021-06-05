
public class Zombie {

	private int lifePoints;
	
	public Zombie(int points) {
		
		this.lifePoints = points;
	}
	
	public int getLifePoints() {
		
		return this.lifePoints;
		
	}
	
	public void setLifePoints() {
		
	}
	
	
	public void takeHit(int hit) {
		
		this.lifePoints -= hit;
	}
}
