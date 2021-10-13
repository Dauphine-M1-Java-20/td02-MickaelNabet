package Exo3;

public class RacineCarree implements Expr{
	private Expr value;
	
	public RacineCarree(Expr value) {
		this.value = value;
	}

	public RacineCarree() {
		this(new Value(0));
	}
	@Override
	public double eval() {
		// TODO Auto-generated method stub
		return Math.sqrt(value.eval());
	}
	
	
}
