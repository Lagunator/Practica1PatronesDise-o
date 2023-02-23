package exercise8;

public class PrestamoFinanciamento {
    public void prestamo(int monto){
        CuentaDeBanco.getInstance().prestar(monto);
    }
}
