public class Main {
    public static void main(String[] args) {
        int numeroif = 0;

        if (numeroif > 0){
            System.out.println("numero if es positivo");
        } else if (numeroif < 0) {
            System.out.println("numero if es negativo");
        } else {
            System.out.println("numero if es 0");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile + " numero While");
            numeroWhile++;
        }

        do {
            System.out.println(numeroWhile + " numero DoWhile");
            numeroWhile++;
        }while(numeroWhile < 3);

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor + " numero For");
        }
        String estacion = "invierno";
        switch (estacion){
            case "verano":
                System.out.println("Es Verano");
                break;
            case "otoño":
                System.out.println("Es Otoño");
                break;
            case "invierno":
                System.out.println("Es Invierno");
                break;
            case "primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("El valor ingresado no es una estacion");
        }
    }
}