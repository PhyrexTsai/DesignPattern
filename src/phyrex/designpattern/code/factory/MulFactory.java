package phyrex.designpattern.code.factory;

import phyrex.designpattern.code.simplefactory.Operate;
import phyrex.designpattern.code.simplefactory.OperateMul;

public class MulFactory extends FactoryImpl {

	@Override
	public Operate createOperation() {
		return new OperateMul();
	}

}
