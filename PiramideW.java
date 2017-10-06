import java.util.Scanner;

public class PiramideW
{
  public static void main(String[] args)
  {
    Scanner lectura = new Scanner(System.in);

    int a = 1, contador = 0, p=0, n;

    System.out.println("Ingresa un numero");
    n=lectura.nextInt();

    while(contador<=n-1)
    {
      contador++;
      System.out.printf("%d%n", contador);

      for ( p=1; p<=contador; p++)
      {
      System.out.printf("%d",p);
      }
    }
    p -= 2;

    for (int g=p;g>=1 ;g-- )
    {
      System.out.println("");


    for (p=1;p<=g ;p++ ) {

      System.out.printf("%d",p);


    }
    }
    System.out.println("");

    /*
    C:\Users\danie\Favorites\Programacion\Matute>java PiramideW
    Ingresa un numero
    3
    1
    12
    123
    123
    12
    1
    */
  }
}
