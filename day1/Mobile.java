package week1.day1;

public class Mobile {
	public void makeCall() {
		System.out.println("makeCall");
		String mobileModel;
		float mobileWeight;
	}
    public void sendMsg() {
    	System.out.println("sendMsg");
    	boolean fullCharged;
    	int mobileCost;
}
    public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.makeCall();
		obj.sendMsg();
		System.out.println("This is my Mobile");
	}

}
