public class Main {
    public static void main(String[] args) {
        int suma = sumar(2,3,4);
        System.out.println(suma);

        coche nuevoCoche = new coche();
        nuevoCoche.IncrementarNumeroDePuertas();
        System.out.println(nuevoCoche.numeroDePuertas);

    }

    public static int sumar(int a, int b, int c){
        return a+b+c;
    }
}

class coche {
    public int numeroDePuertas = 4;

    public void IncrementarNumeroDePuertas() {
        this.numeroDePuertas++;
    }
}