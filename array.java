import java.until.Random;

public class Array {
	int[] array = new int[10];

	public void rellenararray(){
		Random rand = new Random();
		for (int i = 0; i < array.length; i++){
			array[i] = rand.nextInt(20) + 1;
		}
	}
}
