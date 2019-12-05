
public class Warrior extends Hero{
	
	private int attackPoints = 0;
	private static int getNoWarrior = 0;
	
	Warrior(int lifePoints, int attackPoints){
		super(lifePoints);
		this.attackPoints = attackPoints;
		getNoWarrior++;
	}
	
	@Override
	public Object attack(Hero secondHero) {//TODO: change Hero to Object
		if(this == secondHero) {
			System.out.println("Error - hero can not attack himself");
			return null;
		}
		if(secondHero instanceof Warrior) {
			((Warrior) secondHero).reduceAttackPoints(this.attackPoints);
			return null;
		}
		
		if(secondHero instanceof Magician) {
			((Magician) secondHero).reduceAttackPoints(this.attackPoints / 2);
			if (((Magician) secondHero).lifePoints() <= this.lifePoints()){
				return new Warrior(this.lifePoints(), this.attackPoints);
			}
		}		
		return null;
	}
	
	public static int getNoWarrior() {
		return getNoWarrior;
	}
	
	public String toString()
	{
		return "Warrior with " + lifePoints() +" lifePoints and " + attackPoints + " attackpoints";
	}
}