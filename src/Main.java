public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setEdad(35);
        System.out.println("cliente.getEdad() = " + cliente.getEdad());
        cliente.setNombre("Ramiro");
        System.out.println("cliente.getNombre() = " + cliente.getNombre());
        cliente.setTelefono(942749295);
        System.out.println("cliente.getTelefono() = " + cliente.getTelefono());
        cliente.setCredito(19875.25);
        System.out.println("cliente.getCredito() = " + cliente.getCredito());
        
        System.out.println("*******************************");
        
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(28);
        System.out.println("trabajador.getEdad() = " + trabajador.getEdad());
        trabajador.setNombre("Luis");
        System.out.println("trabajador.getNombre() = " + trabajador.getNombre());
        trabajador.setTelefono(966895782);
        System.out.println("trabajador.getTelefono() = " + trabajador.getTelefono());
        trabajador.setSueldo(4529.99);
        System.out.println("trabajador.getSueldo() = " + trabajador.getSueldo());
    }
}
