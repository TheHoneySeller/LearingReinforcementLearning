import java.util.ArrayList;

public class State {
	private MDP p;
	ArrayList<Integer> actions; // indexes of available actions. 
	
	public State( MDP parent) {
		p = parent;
		actions = new ArrayList<Integer>();
	}
}
