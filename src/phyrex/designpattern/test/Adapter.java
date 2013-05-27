package phyrex.designpattern.test;

import org.junit.Test;

import phyrex.designpattern.code.adapter.*;

public class Adapter {

	@Test
	public void test(){
		Player MichaelJordan = new Forwards("Michael Jordan");
		
		MichaelJordan.attack();
		MichaelJordan.defence();
		
		Player KobeBryant = new Guards("Kobe Bryant");
		
		KobeBryant.attack();
		KobeBryant.defence();
		
		Player MingYao = new Translator("Ming Yao");
		
		MingYao.attack();
		MingYao.defence();
		
	}
	
}
