package hithub;


import java.util.Scanner;
public class ejem2 {
private double x,y;
public void Inicializar(){
Scanner teclado=new Scanner(System.in);
System.out.println("Introudce X");
x=teclado.nextDouble();
System.out.println("Introudce Y");
y=teclado.nextDouble();
}
public void Cuadrante(){
if (x>0 && y>0){
System.out.println("El punto introducido está en el primer cuadrante");
}else if (x<0 && y>0){
System.out.println("El punto introducido está en el segundo cuadrante");
}else if (x>0 && y<0){
System.out.println("El punto introducido está en el cuarto cuadrante");
}else if (x==0 && y==0){
System.out.println("El punto introducido está en el punto de origen");
}else if (x==0){
 System.out.println("El punto introducido está en las abcisas");
}else{
System.out.println("El punto introducido está en las ordenadas");
}
} 
public static void main(String[] args){
ejem2 punto= new ejem2();
punto.Inicializar();
punto.Cuadrante();
}
}
