package phyrex.designpattern.code.simplefactory;

public class OperateSub extends Operate {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		
		double result = 0.0d;
				
		if(numberB != 0){
			result = numberA / numberB;
		}		
			
		return result;
	}

}
