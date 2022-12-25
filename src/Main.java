public class Main {
    public static void main(String[] args) {

        Persona person1 = new Persona();
        person1.setNombre("Nicolas");
        person1.setEdad(25);
        person1.setTelefono(356461112);
        System.out.println(person1.getEdad());
        System.out.println(person1.getNombre());
        System.out.println(person1.getTelefono());
        cliente client1 = new cliente();
        client1.setNombre("Nicolas");
        client1.setEdad(25);
        client1.setTelefono(356461112);
        client1.setCredito(32000);
        System.out.println(client1.getEdad());
        System.out.println(client1.getNombre());
        System.out.println(client1.getTelefono());
        System.out.println(client1.getCredito());
        trabajador trabajador1 = new trabajador();

        trabajador1.setNombre("Nicolas");
        trabajador1.setEdad(25);
        trabajador1.setTelefono(356461112);
        trabajador1.setSalario(25000);
        System.out.println(trabajador1.getEdad());
        System.out.println(trabajador1.getNombre());
        System.out.println(trabajador1.getTelefono());
        System.out.println(trabajador1.getSalario());


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
class cliente extends Persona{
        private float credito;

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public float getCredito() {
        return credito;
    }
}
class trabajador extends Persona{
    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}
