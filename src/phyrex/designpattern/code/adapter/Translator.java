package phyrex.designpattern.code.adapter;

public class Translator extends Player {

	private ForeignPlayer foreignPlayer = new ForeignPlayer();
	
	public Translator(String name) {
		super(name);
		foreignPlayer.setName(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		foreignPlayer.attack_zh_tw();
	}

	@Override
	public void defence() {
		// TODO Auto-generated method stub
		foreignPlayer.defence_zh_tw();
	}

}
