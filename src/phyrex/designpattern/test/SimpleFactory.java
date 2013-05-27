package phyrex.designpattern.test;


import org.junit.Test;

import phyrex.designpattern.code.simplefactory.*;

public class SimpleFactory {

	Operate operate = null;
	
	public Operate createOperate(String operator){
		
		// 透過這邊選擇 Factory
		if(operator.equals("+")){
			operate = new OperateAdd();
		}else if(operator.equals("-")){
			operate = new OperateDiv();
		}else if(operator.equals("*")){
			operate = new OperateMul();
		}else if(operator.equals("/")){
			operate = new OperateSub();
		}
		
		return operate;
	}
	
	@Test
	public void test() {
		
		Operate o = createOperate("*");
		if(o != null){
			o.setNumberA(3.5);
			o.setNumberB(4.7);
			
			System.out.println("result : " + o.getResult());
		}else{
			System.out.println("Operate Error!");
		}
		
	}
	
}
