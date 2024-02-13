/*
ITESS- Tics
Enero -junio 2024
Calculo integral
TI-202
12/febrero/2024
Aproximacion de areas usando sumas

 */
package ci.unidad1.aproximation;

public class funcitonAproximationTest {
    public static void main(String [] args){
        functionAproximation fa=new functionAproximation(0.0,4.0,4);
        fa.compute();
        System.out.print("area:"+fa.getArea());
    }
}
