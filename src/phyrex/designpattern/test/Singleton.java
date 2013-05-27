package phyrex.designpattern.test;

import org.junit.Test;

import phyrex.designpattern.code.singleton.Instance;

public class Singleton {

	@Test
	public void test(){
		
		// 只會在第一次 new 出實體，之後都會使用已經 new 好的 instance
		for(int i = 0; i < 3; i++){
			Instance.getInstance();
		}
		
	}
	
}
