import java.until.Random;

public class Array {
	int[] array = new int[10];

	public void rellenararray(){
		Random rand = new Random();
		for (int i = 0; i < array.length; i++){
			array[i] = rand.nextInt(20) + 1;
		}
	}
public void imprimirarray(){
for (int i = 0; i < array.length; i++){
System.out.println(array[i]);
    }
  }
public void nuevometodo1(){
 	System.out.println("Metodo nuevo 1 ¡¡¡¡¡¡¡¡¡modificado!!!!!!!!!!");
 }
}
