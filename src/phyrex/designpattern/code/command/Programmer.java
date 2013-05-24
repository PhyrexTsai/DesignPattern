package phyrex.designpattern.code.command;

public class Programmer implements Command {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName() + " Execute!");
	}
	
}
