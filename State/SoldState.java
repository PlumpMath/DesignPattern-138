



//yes：
public class NoQuarterState implements IState{
	GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine)
	{
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter(){
		System.out.println("you insertd a quarter\n");

	}
}


