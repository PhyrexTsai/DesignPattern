package phyrex.designpattern.code.adapter;

public class ForeignPlayer {

	private String name;

	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void attack_zh_tw(){
		System.out.println(name + ":§ðÀ»!");
	}
	
	public void defence_zh_tw(){
		System.out.println(name + ":¨¾¿m!");
	}
	
}
