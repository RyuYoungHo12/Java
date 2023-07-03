package sub4;

public class SubThread extends Thread{
	
	@Override
	public void run() {

		while(true) {
			
			try {
				Thread.sleep(1000); //1000은 1초에 한번씩 실행
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
			System.out.println("SubThread 실행...");
		}
	}

}
