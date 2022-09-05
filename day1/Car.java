package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("Applied Break");
}
	public void soundHorn() {
		System.out.println("sound horn");
}
	public static void main(String[] args) {
		Bike obj = new Bike();
		 obj.applyBreak();
		 obj.soundHorn();
		}

}
