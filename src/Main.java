
public class Main {
    public static void main(String[] args) {
        threeParams(3,2, 1);
        Coche miCoche = new Coche();
        miCoche.masPuertas();
        System.out.println(miCoche.puertas);
    }
    public static void threeParams(int a, int b, int c){
        System.out.println("a is equal to: " + a);
        System.out.println("b is equal to: " + b);
        System.out.println("c is equal to: " + c);
    }
}
class Coche{
    public int puertas = 0;
    public void masPuertas(){
        this.puertas++;
    }
}