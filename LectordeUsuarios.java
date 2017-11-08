import java.util.Scanner;

public class LectordeUsuarios
{
  public static void main(String[] args)
  {
    Scanner lectura = new Scanner(System.in);

    int d;
    int [][] matriz = new int[9][d];//arreglo que contiene el numero de empleados


    System.out.println("Que usuario deseas acceder?");
      System.out.print("Escriba la nómina del usuario a continuación: ");
    d = lectura.nextInt();

    System.out.println("");

    usuarios(d, matriz);

  System.out.println("");

  }
   public static void usuarios(int d, int[][] matriz) //Aqui se contrastarán los datos para ver los datos del ususario
   {
     String a, b, c;
     Scanner lectura = new Scanner(System.in);

    for (int i=0; i<matriz[0].length; i++)
        {
          if (matriz[0][i])
          {
            System.out.println("Demo, todo chido");
          }
        }
      }
}
