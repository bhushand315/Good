package threads;

public class Packageforthreads extends Thread {
	private boolean i=true;
	
	@Override
	public void run() {
		while(i)
		{
			/*for(int x=0; x<10; x++)
			{*/
				System.out.println("Thread");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	
	public void shutDown()
	{
		i=false;
	}
	
}
