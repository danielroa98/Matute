import java.util.Scanner;

public class reloj
{
  public static void main(String[] args)
  {
    Scanner lectura = new Scanner(System.in);
    int hora, min, sec, horasec, minsec,doce,distancia1,distancia2,suma;

    System.out.println("Inserta la hora en formato de 24 horas");
    hora = lectura.nextInt();

    System.out.println("Inserta los minutos");
    min = lectura.nextInt();

    System.out.println("Inserta los segundos");
    sec = lectura.nextInt();

    horasec = hora * 360;
    minsec = min * 60;
    doce= 43200;
    suma = horasec + minsec + sec;

    if (suma<=doce) {
    distancia1= doce-suma;
    System.out.printf("El tiempo transcurrido desde la ultima rotacion de doce horas es %d segundos. %n",distancia1);


    }

    else if (suma>doce) {
      distancia2= suma-doce;
      System.out.printf("El tiempo transcurrido desde la ultima rotacion de doce horas es %d segundos. %n",distancia2);


    }

  }
}
