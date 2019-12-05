
public class Magician extends Hero{

	private int magicPoints = 0;
	private static int getNoMagician  = 0;
	
	Magician(int lifePoints, int magicPoints){
		super(lifePoints);
		this.magicPoints = magicPoints;
		getNoMagician++;
	}
	
	@Override
	public Object attack(Hero secondHero) {//TODO: change Hero to Object
		if(this == secondHero) {
			System.out.println("Error - hero can not attack himself");
			return null;
		}
		secondHero.reduceAttackPoints(secondHero.lifePoints() / this.magicPoints);
		if(secondHero.lifePoints() <= 0) {
			return new Magician(this.lifePoints(), this.magicPoints);
		}
		
		return null;
	}
	
	public static int getNoMagician() {
		return getNoMagician;
	}
	
	public String toString()
	{
		return "Magician with "+ lifePoints() + " lifePoints and "+ magicPoints + " spellPoints";
	}
}
