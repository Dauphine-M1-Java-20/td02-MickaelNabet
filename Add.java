package Exo3;
public class Add implements Expr {
	private Expr value1;
	private Expr value2;

	public Add(Expr value1, Expr value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public Add() {
		this(new Value(0.0), new Value(0.0));
	}

	@Override
	public double eval() {
		// TODO Auto-generated method stub
		return value1.eval()+value2.eval();
	}

}
