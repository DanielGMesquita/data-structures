public class ClassThatUsesTV {
	public static void main (String args[]) {
		Television t = new Television();
		t.setBrand("Samsung");
		t.turnOn();
		t.setVolume(10);
		t.setChannel(4);
		t.raiseVolume();
		t.turnOff();
	}
}