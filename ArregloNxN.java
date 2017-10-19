import java.util.Random;
import java.util.Scanner;

public class ArregloNxN
{
  public static void main(String[] args)
  {

    Random aleatorio = new Random();
    Scanner lector = new Scanner(System.in);

    int numero,anc,alt;

    System.out.println("Escriba de que tamaño quiere la altura de la matriz");
    alt = lector.nextInt();

    System.out.println("Escriba de que tamaño quiere el ancho de la matriz");
    anc = lector.nextInt();



    int[][] matriz = new int[alt][anc];

//-----------------------*Creador de columnas*----------------------------------

    for (int renglones =0; renglones <matriz.length; renglones++)
    {
      for(int columnas =0; columnas<matriz[0].length; columnas++)
      {

        matriz[renglones][columnas]= aleatorio.nextInt(7);
        System.out.printf("%d\t",matriz[renglones][columnas]);
      }
      System.out.println("");

    }
    imprime(alt,anc);
  }

//-------------------------*Metodo Simetría-------------------------------------

public static void imprime(int alt, int anc)
{
  if (anc==alt) {
    System.out.printf("La matriz es simétrica");
    System.out.println("");
  }

  else if (anc!=alt) {
    System.out.printf("La matriz no es simétrica");
    System.out.println("");

  }


  }
}
