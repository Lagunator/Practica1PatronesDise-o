package exercise1;

public class LaunchVentanilla {
    public static void main(String[] args) {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$");
        Cajero cajero = new Cajero("XAZDOP");
        cajero.logIn();
        System.out.println("$$$$$$$$Estudiante 1$$$$$$$$");
        Estudiante est1 = new Estudiante("Jose Maria", "028774");
        est1.logIn();
        est1.pagoColegiatura(1200);
        VentanillaDePago.getInstance().montoActual();

        System.out.println("$$$$$$$$$$$Estudiante 2$$$$$$$$$$$$$");
        Estudiante est2 = new Estudiante("Pablo", "906993");
        est2.logIn();
        est2.pagoColegiatura(900);
        VentanillaDePago.getInstance().montoActual();

        System.out.println("$$$$$$$$$$$$Estudiante 3$$$$$$$$$$$$$");
        Estudiante est3 = new Estudiante("Carlos", "512533");
        est3.logIn();
        est3.pagoColegiatura(1400);
        VentanillaDePago.getInstance().montoActual();

        System.out.println("$$$$$$$$$$Estudiante 4$$$$$$$$$$$$");
        Estudiante est4 = new Estudiante("Daniel", "696943");
        est4.logIn();
        est4.pagoColegiatura(2200);
        VentanillaDePago.getInstance().montoActual();

        System.out.println("$$$$$$$$$$$Estudiante 5$$$$$$$$$$$$");
        Estudiante est5 = new Estudiante("Alejandro", "099870");
        est5.logIn();
        est5.pagoColegiatura(4100);
        VentanillaDePago.getInstance().montoActual();
    }
    }

