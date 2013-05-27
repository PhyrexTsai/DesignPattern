package phyrex.designpattern.code.adapter;

public class Guards extends Player {

	public Guards(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Guards. " + name + ":attack!");
	}

	@Override
	public void defence() {
		// TODO Auto-generated method stub
		System.out.println("Guards. " + name + ":defence!");
	}

}
