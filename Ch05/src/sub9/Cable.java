package sub9;

public class Cable implements Socket {

	private Bulb bulb;
	
	public Cable(Bulb bulb) {
		this.bulb = bulb;
	}
	
	
	
	@Override
	public void switchOn() {
		bulb.lighton();
	}

	@Override
	public void switchOff() {
		bulb.lightoff();
	}

}
