
public abstract class Hero {
	
	private int lifePoints = 0;
	
	Hero(int lifepoint){
		this.lifePoints = lifepoint;
	}
	
	public int lifePoints() {
		return this.lifePoints;
	}
	
	public void reduceAttackPoints(int attackPoints) {
		this.lifePoints -= attackPoints;
	}
	
	public abstract Object attack(Hero secondHero);

}