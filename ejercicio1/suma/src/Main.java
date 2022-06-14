public class Main {
    public static void main(String[] args) {

         Suma(5, 50, 25);


        //Objectos Coche
        Coche mazda=new Coche();
        Coche toyota=new Coche();
        mazda.AumentoDepuerta(5);
        toyota.AumentoDepuerta(50);
    }

    // metodo para sumar tres numero
    public static void Suma(int a,int b, int c){
        int resultado=a+b+c;
        System.out.println( "La suma es: "+resultado);
    }

    //Clase para agregar puerta al Coche
    public static class Coche{
        int numPuerta=4;

        //Metodo para agregar Puerta al Coche
        public void AumentoDepuerta(int num){
            int total=num +numPuerta;

            System.out.println("Numero de puerta: "+total);
        }
    }
}

