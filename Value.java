package Exo3;

public class Value implements Expr {
	private double Value;

	public Value(double d) {
		this.Value = d;
	}
	
	public Value() {
		this(0.0);
	}
	

	@Override
	public double eval() {
		return Value;
	}
}
