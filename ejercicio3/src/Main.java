public class Main {
    public static void main(String[] args) {

        Persona persona1 =new Persona();
        persona1.setEdad(23);
        persona1.setNombre("Javier");
        persona1.setTelefono("890-098-098");
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getTelefono());

    }
   static class Persona{
        private int edad;
        private String nombre;
        private String telefono;

        public void setEdad(int edad){
            this.edad=edad;
        }
        public int getEdad(){
            return this.edad;
        }

        public void setNombre(String nombre){
            this.nombre=nombre;
        }
        public String getNombre(){
            return this.nombre;
        }

        public void setTelefono(String telefono){
            this.telefono=telefono;
        }
        public String getTelefono(){
            return this.telefono;
        }
    }
}