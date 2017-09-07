import java.util.Scanner;

public class rueda
{
  public static void main(String[] args)
  {
  double grosor, diametro, no1, no2, no3, no4;
  no1 = 1.4;
  no2 = 0.4;
  no3 = 0.8;
  no4 = 0.25;

  Scanner lectura = new Scanner(System.in);

  System.out.println("Escriba el grosor de la llanta");
  grosor = lectura.nextDouble();

  System.out.println("Escriba el diametro");
  diametro = lectura.nextDouble();

  fi(grosor, diametro, no1, no2, no3, no4);
}

public static void fi(double grosor, double diametro, double no1, double no2, double no3, double no4)
{
  no1 = 1.4;
  no2 = 0.4;
  no3 = 0.8;
  no4 = 0.25;

  if (diametro>no1 && grosor<no2) {
    System.out.println("La rueda es para un vehiculo grande");
    System.out.println("El grosor para esta rueda es inferior al recomendado");
  }
  else if (diametro<=no1 && diametro>no3 && grosor<no4) {
    System.out.println("La rueda es para un vehiculo mediano");
    System.out.println("El grosor para esta rueda es inferior al recomendado");
  }
  else if (diametro>no1 && grosor>=no2) {
    System.out.println("La rueda es para un vehiculo grande");
  }
  else if (diametro<=no1 && diametro>no3 && grosor>=no4) {
    System.out.println("La rueda es para un vehiculo mediano");
  }
  else if (diametro<=no3) {
    System.out.println("La rueda es para un vehiculo chico");
  }
  else;

  }
}
