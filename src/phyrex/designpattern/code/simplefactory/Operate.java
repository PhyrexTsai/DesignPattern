package phyrex.designpattern.code.simplefactory;

public abstract class Operate {
	
	double numberA;
	
	double numberB;
	
	public void setNumberA(double numberA){
		this.numberA = numberA;
	}
	
	public double getNumberA(){
		return numberA;
	}
	
	public void setNumberB(double numberB){
		this.numberB = numberB;
	}
	
	public double getNumberB(){
		return numberB;
	}
	
	public abstract double getResult();
	
}
