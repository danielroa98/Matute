public class Tarea1DoWhile
{
  public static void main(String[]args)
  {
    int a;
    a=1;

    do {
      int c;
      c = (a*(1+a))/2;
      a++;


      System.out.printf("%d.%n",c);

    } while (a<=50);
  }
  /*
  1
  3
  6
  10
  15
  21
  28
  36
  45
  55
  66
  78
  91
  105
  120
  136
  153
  171
  190
  210
  231
  253
  276
  300
  325
  351
  378
  406
  435
  465
  496
  528
  561
  595
  630
  666
  703
  741
  780
  820
  861
  903
  946
  990
  1035
  1081
  1128
  1176
  1225
  1275
  MacBook-Pro-de-Juan-8:Programacion juanfra$
  La suma final de todos los numeros del 1-50 es el ultimo resultado, pero queria retarme a hacer mas,
  y construir una secuencia logica con la que se vea como llegue al resultados
  */
}
