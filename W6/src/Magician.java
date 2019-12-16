
public class Magician extends Hero {

	private int magicPoints = 0;
	private static int getNoMagician  = 0;
	
	public Magician(int lifePoints, int magicPoints) {
		super(lifePoints);
		this.magicPoints = magicPoints;
		getNoMagician++;
	}
	
	/************************************************************************
	* Function: attack()
	* Purpose:  Attack opponent
	* Input:    secondHero - second hero
	* Return:   Object - return new hero if necessary  
	************************************************************************/
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
	
	/************************************************************************
	* Function: getNoMagician()
	* Purpose:  Get Numbers of Magicians
	* Input:    None
	* Return:   Numbers of Magicians
	************************************************************************/
	public static int getNoMagician() {
		return getNoMagician;
	}
	
	/************************************************************************
	* Function: toString()
	* Purpose:  Edit toString function in Magician class
	* Input:    None
	* Return:   String
	************************************************************************/
	public String toString() {
		return "Magician with "+ lifePoints() + " lifePoints and "+ magicPoints + " spellPoints";
	}
}
