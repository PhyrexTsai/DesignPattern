package phyrex.designpattern.code.simplefactory;

public class OperateAdd extends Operate {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		
		double result = 0.0d;
		
		result = numberA + numberB;
		
		return result;
	}

}
