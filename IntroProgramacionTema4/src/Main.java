public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;
        if (numeroIf > 0) {
            System.out.println("Is Positive");
        } else if (numeroIf < 0) {
            System.out.println("Is Negative");
        } else
            System.out.println("Is Zero");

        int numeroWhile = 0;
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 1);

        for (int numeroFor = 0; numeroFor <= 3 ; numeroFor++) {
            System.out.println(numeroFor);
        }

        String estacion ="winter";
        switch (estacion){
            case "winter":
                System.out.println("Is Winter");
                break;
            case "spring":
                System.out.println("Is Spring");
                break;
            case "summer":
                System.out.println("Is Summer");
                break;
            case "autumm":
                System.out.println("Is Autumm");
                break;
            default:
                System.out.println("Nothing");
        }
    }
}