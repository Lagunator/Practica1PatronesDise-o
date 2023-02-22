package exercise1;

public class Estudiante {
    private String nombre;
    private String id;
    public Estudiante(String nombre, String ci) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String ci) {
        this.id = ci;
    }
    public void logIn(){
        VentanillaDePago.getInstance().registro(id);
        System.out.println("Registro exitoso! ya es posible realizar su pago "+getNombre());
    }
    public void pagoColegiatura(int dinero){
        VentanillaDePago.getInstance().pagar(dinero);
    }
}
