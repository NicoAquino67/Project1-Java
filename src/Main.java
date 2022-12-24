public class Main {
    public static void main(String[] args) {

        Persona person1 = new Persona();

        person1.setNombre("Nicolas");
        person1.setEdad(25);
        person1.setTelefono(356461112);
        System.out.println(person1.getEdad());
        System.out.println(person1.getNombre());
        System.out.println(person1.getTelefono());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}