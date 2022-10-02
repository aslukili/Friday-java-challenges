import java.util.Scanner;
import java.util.stream.IntStream;

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


    int finalHigh = high;
    IntStream.range(1, high + 1).forEach(i -> {
      IntStream.range(i-finalHigh, 0).forEach(j->System.out.print(" "));
      IntStream.range(0,i*2-1).forEach(j -> System.out.print(symbole));
      System.out.println();
      }
    );
  }
}
