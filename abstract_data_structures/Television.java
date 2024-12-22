public class Television {
	String brand;
	int channel;
	int volume;
	boolean on;

	public Television() {
		on = false;
	}

	public void turnOn() {
		on = true;
		System.out.println("TV" + brand + " ligada");
	}

	public void turnOff() {
		on = false;
		System.out.println("TV" + brand + " desligada");
	}

	public void setBrand(String brandName) {
		brand = brandName;
		System.out.println("Brand is set: " + brand);
	} 

	public void setVolume(int vol) {
		if(on) {
			volume = vol;
			System.out.println("Volume definido para " + volume);
		} else {
			System.out.println("Please, turn on the TV " + brand);
		}
	}

	public void setChannel(int chnl) {
		if(on) {
			channel = chnl;
			System.out.println("Canal definido para " + volume);
		} else {
			System.out.println("Please, turn on the TV " + brand);
		}
	}

	public void raiseVolume() {
		volume++;
		System.out.println("TV " + brand + "volume atual:" + volume);
	}

}