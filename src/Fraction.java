
public class Fraction 
{
	private int numerateur ;
	private int denominateur ;
	
	public Fraction(int num, int denom)
	{
		this.numerateur = num;
		this.denominateur = denom;
	}
	public String toString()
	{
		return this.numerateur + "/" + this.denominateur;
	}

}
