package hithub;

import java.util.Scanner;
public class ejem3 {
private Scanner teclado;
private int lado,perimetro,superficie;
public void inicializar() {
teclado=new Scanner(System.in);
System.out.println("Introduce el lado del cuadradro:");
lado=teclado.nextInt();
}
public void imprimir() {
System.out.println("El lado del cuadrado tiene un valor de:"+lado);
}
public void mostrar() {
     perimetro=lado*4;
    System.out.println("El perimetro del cuadrado es "+perimetro);
    superficie=lado*lado;
    System.out.println("El area del cuadrado es "+superficie);  
    
}
public static void main(String[] ar) {
ejem3 cuadrado;
cuadrado=new ejem3();
cuadrado.inicializar();
cuadrado.imprimir();
cuadrado.mostrar();
}
}