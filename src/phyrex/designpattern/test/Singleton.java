package phyrex.designpattern.test;

import org.junit.Test;

import phyrex.designpattern.code.singleton.Instance;

public class Singleton {

	@Test
	public void test(){
		
		for(int i = 0; i < 3; i++){
			Instance.getInstance();
		}
		
	}
	
}
