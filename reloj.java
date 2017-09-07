import java.util.Scanner;

public class reloj
{
  public static void main(String[] args)
  {
    Scanner lectura = new Scanner(System.in);
    int hora, min, sec, horasec, minsec;

    System.out.println("Inserta la hora en doce horas");
    hora = lectura.nextInt();

    System.out.println("Inserta los minutos");
    min = lectura.nextInt();

    System.out.println("Inserta los segundos");
    sec = lectura.nextInt();

    horasec = hora * 360;
    minsec = min * 60;

    horasec
  }
}
