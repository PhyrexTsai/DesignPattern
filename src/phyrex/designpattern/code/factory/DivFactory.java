package phyrex.designpattern.code.factory;

import phyrex.designpattern.code.simplefactory.Operate;
import phyrex.designpattern.code.simplefactory.OperateDiv;

public class DivFactory extends FactoryImpl {

	@Override
	public Operate createOperation() {
		return new OperateDiv();
	}

}
