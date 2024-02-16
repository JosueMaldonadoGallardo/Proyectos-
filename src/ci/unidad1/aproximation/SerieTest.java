/*
ITESS- Tics
Enero -junio 2024
Calculo integral
TI-202
16/febrero/2024
Aproximacion de areas usando sumas

 */
package ci.unidad1.aproximation;

/**
 *
 * @author josue
 */
public class SerieTest {
    public static void main(String...args){
        Serie s = new Serie(1,25);
        s.compute();
        s.print();
    }
}