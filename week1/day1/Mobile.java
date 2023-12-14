package week1.day1;

public class Mobile {

	public void makeCall() {

		String mobileModel = "GalaxyF62";
		float mobileWeight = 300.30f;
		System.out.println("mobileModel : " + mobileModel);
		System.out.println("mobileWeight : " + mobileWeight);

	}

	public void sendMsg() {

		boolean isFullCharged = true;
		int mobileCost = 20000;

		System.out.println("isFullCharged : " + isFullCharged);
		System.out.println("mobileCost : " + mobileCost);

	}

	public static void main(String[] args) {

		Mobile Mob = new Mobile();

		Mob.makeCall();
		Mob.sendMsg();

		System.out.println("This is my mobile");

	}

}
