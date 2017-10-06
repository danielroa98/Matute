import java.util.Scanner;

public class PiramideDW
{
  public static void main(String[] args)
  {
    Scanner lectura = new Scanner(System.in);
    int a=1, contador=0, n;

    System.out.println("Hasta que numero quieres llegar?");
    n=lectura.nextInt();

    do{
    do {
      a++;
      System.out.printf("%d", a);
    } while (a<=contador);

      System.out.println("");
      contador++;
      a=1;
    }while(contador<n);

    do{
      do{
        System.out.printf("%d",a);
        a++;
      }while(a<=contador);

      System.out.println();
      contador--;
      a=1;
    }while(contador>0);

    /*
    C:\Users\danie\Favorites\Programacion\Matute>java PiramideDW
    Hasta que numero quieres llegar?
    3
    2
    2
    23
    123
    12
    1
    */

  }
}
