package phyrex.designpattern.code.adapter;

public class Center extends Player {

	public Center(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Center. " + name + ":attack!");
	}

	@Override
	public void defence() {
		// TODO Auto-generated method stub
		System.out.println("Center. " + name + ":defence!");
	}

}
