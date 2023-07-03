package sub3;

public class AddThread extends Add implements Runnable { // 상속 여러개 안되기떄문에 Runnable 사용
 
	private int start;
	private int end;
	
	
	public AddThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {

		for(int k=start; k<=end; k++) {
			setNum(k);
		}
		
	}
}
