
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner userInput = new Scanner(System.in);
    int panjang, lebar, luas;
    System.out.print("==== MENGHITUNG LUAS ==== \n \n");
    System.out.print("Panjang = ");
    panjang = userInput.nextInt(); //just like cin >> x in c++
    System.out.print("Lebar = ");
    lebar = userInput.nextInt();
    luas = panjang * lebar;
    System.out.println("Luas = " + luas);
    
    
    
  }
}