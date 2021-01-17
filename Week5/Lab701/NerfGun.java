package Week5.Lab701;
// KAN BUPPANIROJ 632115005
public class NerfGun {

	private int data;
	private int displayGunID=1;

	public NerfGun(int data) {
		this.data = data;
	;
		displayGunID++;
	}

public NerfGun() {
	
	}

	public void displayNumOfAmmunition() {

		System.out.println(data+" bullet left");
	}

	public void displayGunID() {

		System.out.println("The ID of this Gun is "+displayGunID);
	}

	public void reload(int i) {
			if (data + i > 15) {
			System.out.println("Error !! the ammunition is overload");
		}
		else {
			data = data + i;
		}
	}

	public void fire() {
		if (data == 0) {
			System.out.println("There is no ammunition");
		} else {
			data--;
			System.out.println("BANG !!!");
		}
	}

}
