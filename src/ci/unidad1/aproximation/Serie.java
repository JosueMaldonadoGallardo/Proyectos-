/*
ITESS- Tics
Enero -junio 2024
Calculo integral
TI-202
16/febrero/2024
Aproximacion de areas usando sumas

 */
package ci.unidad1.aproximation;

public class Serie {
    private int iIni;
    private int iEnd;
    private int n;
    private int i[];
    private int f[];
    private int suma;

    public Serie(int iIni, int iEnd) {
        this.iIni = iIni;
        this.iEnd = iEnd;
        n=iEnd - iIni +1;
        i=new int[n];
        f=new int[n];
    }
    
    public void compute(){
        int index=0;
    for(int i =iIni; i<= iEnd;i++){
        this.i[index]=i;
        f[index]=2*i*i-2*i;
        index++;
    }
    }
    public void print(){
        System.out.print("index   |    f");
    for(int index = 0;index< n ;index++)
    System.out.println(index+"  |  "+i[index]+"  1  "+f[index]);
    
    
    }
}
