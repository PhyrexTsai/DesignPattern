package phyrex.designpattern.test;

import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import phyrex.designpattern.code.command.Designate;

public class Command {

	@Test
	public void test(){
		List<phyrex.designpattern.code.command.Command> queue = Designate.list();
        
        for(Iterator it = queue.iterator(); it.hasNext();){
            ((phyrex.designpattern.code.command.Command)it.next()).execute();
        }
	}
	
}
