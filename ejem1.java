package hithub;

import java.util.Scanner;
public class ejem1 {
private Scanner teclado;
double lado1,lado2,lado3;
public void inicializar() {
    teclado=new Scanner(System.in);
    System.out.println("Introduce el 1 lado del triangulo");
    lado1=teclado.nextDouble();
    System.out.println("Introduce el 2 lado del triangulo");
    lado2=teclado.nextDouble();
    System.out.println("Introduce el 2 lado del triangulo");
    lado3=teclado.nextDouble();
}
public void mostrar() {
System.out.println("El lado 1 vale:"+lado1);
System.out.println("El lado 2 vale:"+lado2);
System.out.println("El lado 3 vale:"+lado3);
}
public void resultado() {
if (lado1==lado2 && lado2==lado3){
    System.out.println("El traingulo es equilatero");
}
else{
    if (lado1==lado2 && lado2!=lado3){
        System.out.println("El triangulo es isosceles"); 
    }
    else
    {
        if (lado1!=lado2 && lado2!=lado3){
            System.out.println("El triangulo es escaleno");
        }
    }
}
}
public static void main(String[] ar) {
ejem1 triangulo;
triangulo=new ejem1();
triangulo.inicializar();
triangulo.mostrar();
triangulo.resultado();
}
}
