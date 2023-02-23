package exercise10;

public class CentroDeControl {
    private int monto;
    private static CentroDeControl instance = null;

    public CentroDeControl() {
        monto = 0;
        System.out.println("Monto inicial: "+monto);
    }

    private synchronized static void multiThreadManage(){
        if (instance == null){
            instance = new CentroDeControl();
        }
    }
    public static CentroDeControl getInstance(){
        if (instance == null){
            multiThreadManage();
        }
        return instance;
    }
    public synchronized void registro(String placa){
        System.out.println("$$$$$$$$$REGISTRO$$$$$$$$$$");
        System.out.println("Auto: "+placa+" Registrado.");
    }
    public synchronized void pago(){
        System.out.println("$$$$$$$$$PAGO$$$$$$$$$$");
        monto = monto+2;
        System.out.println("Pago realizado, el monto actual es: "+monto);
    }
}
