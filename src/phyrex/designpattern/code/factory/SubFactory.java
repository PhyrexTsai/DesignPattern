package phyrex.designpattern.code.factory;

import phyrex.designpattern.code.simplefactory.Operate;
import phyrex.designpattern.code.simplefactory.OperateSub;

public class SubFactory extends FactoryImpl {

	@Override
	public Operate createOperation() {
		return new OperateSub();
	}

}
