package exercise7;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class LaunchEmpresa {
    public static void main(String[] args) {
        Profix profix = new Profix("Samuel Barron");
        List<Empleado> empleadosProfix = List.of(new Empleado("Samuel","46822"),
                new Empleado("Barron", "46822"), new Empleado("Leandres", "02376y"));
        profix.setEmpleados(empleadosProfix);

        Medusa medusa = new Medusa("Pedro Ticona");
        Empleado[] empleadosMedusa = { new Empleado("Colque", "KEUK3"),
                new Empleado("Riveros", "OI937H") };
        medusa.setEmpleado(empleadosMedusa);

        Ares ares = new Ares("Leonardo Llanos");
        Vector<Empleado> empleadosAres = new Vector<>();
        empleadosAres.add(new Empleado("Leonard", "78169H"));
        empleadosAres.add(new Empleado("Jose", "QDWE22"));
        ares.setEmpleados(empleadosAres);

        Dradler dradler = new Dradler("Jordi Capra");
        Stack<Empleado> empleadosDradler = new Stack<>();
        empleadosDradler.push(new Empleado("Urdininea", "CIHKA76"));
        empleadosDradler.push(new Empleado("Jimenez", "7395HD"));
        dradler.setEmpleados(empleadosDradler);

        HashMap<String, Empleado> listaFinal = new HashMap<>();
        Iterator iterator = profix.createIterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            listaFinal.put(empleado.getCi(), empleado);
        }

        iterator = medusa.createIterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            listaFinal.put(empleado.getCi(), empleado);
        }

        iterator = ares.createIterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            listaFinal.put(empleado.getCi(), empleado);
        }

        iterator = dradler.createIterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            listaFinal.put(empleado.getCi(), empleado);
        }

        listaFinal.get("00012K").showInfo();
        listaFinal.get("QQ42").showInfo();
        listaFinal.get("LL751").showInfo();
        listaFinal.get("PPP00").showInfo();
    }
}
