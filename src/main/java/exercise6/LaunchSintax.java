package exercise6;

import androidx.activity.result.contract.ActivityResultContracts;

public class LaunchSintax {
    public static void main(String[] args) {
        String oracion = "Como administrador Quiero generar un reporte diario Para evaluar las ganancias.";

        SintaxisGherkins change = new SintaxisGherkins(oracion);
        String oracionGherkins = change.outputMessage();
        System.out.println("Sintaxis Gherkins: "+oracionGherkins);
    }
}

