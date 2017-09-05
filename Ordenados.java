import java.util.Scanner;

public class Ordenados
{
  public static void main(String[] args)
  {
    Scanner lectura = new Scanner(System.in);
    double no1, no2, no3, mayor, mitad, menor, resta;
    //int mayor, mitad, menor;

    System.out.println("Inserte tres numeros.");

    System.out.println("Uno:");
    no1 = lectura.nextDouble();

    System.out.println("Dos:");
    no2 = lectura.nextDouble();

    System.out.println("Tres:");
    no3 = lectura.nextDouble();

    if (no1>no2 && no1>no3)
    {
      mayor = no1;
    }
    else if(no1<no2 && no3<no2)
    {
      mayor = no2;
    }
    else
      mayor = no3;


    if (no1<no2 && no1<no3)
    {
      menor = no1;
    }
    else if (no2<no1 && no2<no3)
    {
      menor = no2;
    }
    else
      menor = no3;


    mitad = (no1+no2+no3)-(mayor + menor);
    System.out.printf("El numero mayor es %f.%n el que se encuentra en medio es %f.%n y el menor es %f.%n",mayor, mitad, menor);
  }
}
