package exercise1;

public class Cajero {
    private String cajeroCodigo;
    public Cajero(String codigoCajero) {
        this.cajeroCodigo = codigoCajero;
    }

    public String getCodigoCajero() {
        return cajeroCodigo;
    }

    public void setCodigoCajero(String codigoCajero) {
        this.cajeroCodigo = codigoCajero;
    }
    public void logIn (){
        VentanillaDePago.getInstance().registro(cajeroCodigo);
        System.out.println("Bienvenido! Cajero");
    }}
