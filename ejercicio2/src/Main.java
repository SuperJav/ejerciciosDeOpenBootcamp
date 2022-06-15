import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int numeroif=0;

        if (numeroif >= 0){
            System.out.println("positivo!");
        }else {
            System.out.println("Negativo!");
        };
        System.out.println("---------------------------------------");
        //---------------------------------------
        int numeroWhile=0;
        while ( numeroWhile < 3){
                numeroWhile++;
            System.out.println(numeroWhile);
        }
        System.out.println("----------------------------------------");
        //--------------------------------------------------------------
        int numeroDo=0;
        do {
            System.out.println(numeroDo);
            numeroDo++;
        }while (numeroDo > 5);

        System.out.println("-----------------------------------------");
        //-------------------------------------------------------------
        for (int numeroFor=0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println("------------------------------------------");
        //-------------------------------------------------------------
        String estacion="Vera";

        switch (estacion){

            case "Verano":
                System.out.println("Verano!!");
                break;
            case "Otono":
                System.out.println("Otono!!");
                break;
            case "Primavera":
                System.out.println("Primavera!!!");
                break;
            case "Invierno":
                System.out.println("Invierno!!!");
                break;
            default:
                System.out.println("Este no es una estacion");

        }
    }
}