import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);


    System.out.println("Quel symbole voulez-vous pour le triangle ?");
    char symbole = userInput.next().charAt(0);
    System.out.println("Combien de lignes (de 8 a 35)?");

    int high;
    do {
      high =  userInput.nextInt();
    } while (high < 8 || high > 35);


    Pyramid pyramid = new Pyramid(high, symbole);
    pyramid.printPyramid();
  }
}
