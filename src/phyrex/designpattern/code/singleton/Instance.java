package phyrex.designpattern.code.singleton;

public class Instance {

	private static Instance instance = null;
	
	public static Instance getInstance() {
		
		if(instance == null){
			instance = new Instance();
			System.out.println("New Instance!");
		}else{
			System.out.println("Already have Instance!");
		}
		
		return instance;
	}
	
}
