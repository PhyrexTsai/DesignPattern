package phyrex.designpattern.test;

import org.junit.Test;

import phyrex.designpattern.code.factory.AddFactory;
import phyrex.designpattern.code.factory.FactoryImpl;
import phyrex.designpattern.code.simplefactory.Operate;

public class Factory {

	@Test
	public void test(){
		FactoryImpl factory = new AddFactory();
		
		Operate operate = factory.createOperation();
		
		operate.setNumberA(5.5);
		operate.setNumberB(7.2);
		
		System.out.println("result : " + operate.getResult());
	}

}
