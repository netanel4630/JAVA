
public abstract class Hero {
	
	private int lifePoints = 0;
	
	public Hero(int lifepoint){
		this.lifePoints = lifepoint;
	}
	
	/************************************************************************
	* Function: lifePoints()
	* Purpose:  Get lifePoints
	* Input:    None
	* Return:   Life points 
	************************************************************************/
	public int lifePoints() {
		return this.lifePoints;
	}
	
	/************************************************************************
	* Function: reduceAttackPoints()
	* Purpose:  Reduce attack points from opponent
	* Input:    attackPoints - attack points to reduce
	* Return:   None
	************************************************************************/
	public void reduceAttackPoints(int attackPoints) {
		this.lifePoints -= attackPoints;
	}
	
	/************************************************************************
	* Function: attack()
	* Purpose:  Attack opponent
	* Input:    secondHero - second hero
	* Return:   Object - return new hero if necessary  
	************************************************************************/
	public abstract Object attack(Hero secondHero);

}
