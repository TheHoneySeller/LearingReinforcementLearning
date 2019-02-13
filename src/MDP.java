import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MDP {
	Map v;		//value function.
	Map q;		//action value function.
	Map pi;		// policy.
	Map p_as;	// probability distrubition for moving to state s' given satate s and action a.
	//Map p_asr;	// probability distrubition for moving to state s' with reward r given state s and action a. ( won't be used in this implementation.)
	Map r; 		// reward.
	
	ArrayList<State> states; 	//States will be identified by their indexes.
	ArrayList<Action> actions;	//Actions will be identified by their indexes.
	
			
	public MDP() {
		v = new HashMap<State,Double>(); // value function, assigns States to double values.
		q = new HashMap<Tuple<State,Action>,Double>(); // action value function, assigns state action pairs to double values.
		pi = new HashMap<Tuple<State,Action>,Double>(); // policy function. maps state action pairs to the probabilty to take that action in that state.
		p_as = new HashMap<Tuple<State,Action>,Double>(); // probability distrubition for moving to state s' given satate s and action a.
		r = new HashMap<Tuple<State,Action>,Double>(); // reward function. maps state action pairs to double rewards.
	}
	
	
}
