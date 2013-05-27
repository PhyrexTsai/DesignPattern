package phyrex.designpattern.code.factory;

import phyrex.designpattern.code.simplefactory.Operate;
import phyrex.designpattern.code.simplefactory.OperateAdd;

public class AddFactory extends FactoryImpl {

	@Override
	public Operate createOperation() {
		return new OperateAdd();
	}

}
