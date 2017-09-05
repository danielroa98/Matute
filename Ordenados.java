import java.util.Scanner;

public class Ordenados
{
  public static void main(String[] args)
  {
    Scanner lectura = new Scanner(System.in);
    double no1, no2, no3;

    System.out.println("Inserte tres numeros.");

    System.out.println("Uno:");
    no1 = lectura.nextDouble();

    System.out.println("Dos:");
    no2 = lectura.nextDouble();

    System.out.println("Tres:");
    no3 = lectura.nextDouble();

    if (no1>no2 && no1>no3)
    {
      System.out.println("El primero es mayor");
    }
    else if(no1<no2 && no1<no3)
    {
      System.out.println("El primero es menor");
    }
  }
}
