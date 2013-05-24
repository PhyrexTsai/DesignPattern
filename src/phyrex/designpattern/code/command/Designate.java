package phyrex.designpattern.code.command;

import java.util.ArrayList;
import java.util.List;

public class Designate {

	public static List<Command> list(){
        
        List<Command> queue = new ArrayList<Command>();
        
        queue.add( new Engineer() );
        queue.add( new Programmer() );
        
        return queue;
    }
	
}
