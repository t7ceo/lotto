import java.util.Random;


public class Lotto {

	/**
	 * @param args
	 * Ŭ���� Ÿ���� ����
	 */
	public static void main(String[] args) {

		new Lotto().printLottor();


	}
	public void printLottor() {
		for (int i = 0; i < 6; i++) {
			System.out.println(getNumber());			
		}
	}

	
	Random random = new Random();
	private int getNumber() {
		return random.nextInt(45)+1;
	}

}
