public class Pyramid {

  int high;
  char symbole;

  public Pyramid(int high, char symbole) {
    this.high = high;
    this.symbole = symbole;
  }


  public void printPyramid(){
    for (int i = 1; i <= this.high; i++) {
      for (int j = this.high - i; j > 0; j--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i * 2 - 1; j++) {
        System.out.print(this.symbole);
      }
      System.out.println();
    }
  }
}




