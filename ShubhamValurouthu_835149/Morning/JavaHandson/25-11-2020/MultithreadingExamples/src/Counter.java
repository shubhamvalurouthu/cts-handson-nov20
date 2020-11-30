
public class Counter implements Runnable  {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 100; i++) {
			System.out.println("Counter: "+i);
		}
		
	}

}
