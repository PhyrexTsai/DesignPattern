package phyrex.designpattern.code.adapter;

public class Forwards extends Player {

	public Forwards(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Forwards. " + name + ":attack!");
	}

	@Override
	public void defence() {
		// TODO Auto-generated method stub
		System.out.println("Forwards. " + name + ":defence!");
	}

}
