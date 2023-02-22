package exercise2;

public class LaunchContrato {
    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        contrato.setSueldo(5000);
        contrato.setCargarHoraria(80);
        contrato.setCursoEducacionSuperior(true);
        contrato.setAccesoPlataforma(true);
        contrato.setMarcadoBiometrico(false);
        contrato.setMarcadoHoraEntrada("08:00");
        contrato.setMarcadoHoraSalida("18:00");
        contrato.setNombre("");
        contrato.setApellido("");

        Contrato c1 = contrato.clone();
        Contrato c2 = contrato.clone();
        Contrato c3 = contrato.clone();
        Contrato c4 = contrato.clone();
        Contrato c5 = contrato.clone();
        Contrato c6 = contrato.clone();
        Contrato c7 = contrato.clone();
        Contrato c8 = contrato.clone();
        Contrato c9 = contrato.clone();
        Contrato c10 = contrato.clone();
        Contrato c11 = contrato.clone();
        Contrato c12 = contrato.clone();
        Contrato c13 = contrato.clone();
        Contrato c14 = contrato.clone();
        Contrato c15 = contrato.clone();

        c1.setNombre("Elias");
        c1.setApellido("Torrico");

        c2.setNombre("Pavel");
        c2.setApellido("Enriquez");

        c3.setNombre("Alan");
        c3.setApellido("Mendez");

        c4.setNombre("Jonas");
        c4.setApellido("Paredes");

        c5.setNombre("Ignacio");
        c5.setApellido("Aramayo");

        c6.setNombre("Camilo");
        c6.setApellido("Solares");

        c7.setNombre("Ronaldo");
        c7.setApellido("Caceres");

        c8.setNombre("Erika");
        c8.setApellido("Cuellar");

        c9.setNombre("Cecilia");
        c9.setApellido("Soler");

        c10.setNombre("Matias");
        c10.setApellido("Roca");

        c11.setNombre("Jaime");
        c11.setApellido("Castedo");

        c12.setNombre("Alexis");
        c12.setApellido("Uzqueda");

        c13.setNombre("Fraz");
        c13.setApellido("Palermo");

        c14.setNombre("Alejandro");
        c14.setApellido("Tavarez");

        c15.setNombre("Maria");
        c15.setApellido("Usayo");

        c1.showContrato();
        c2.showContrato();
        c3.showContrato();
        c4.showContrato();
        c5.showContrato();
        c6.showContrato();
        c7.showContrato();
        c8.showContrato();
        c9.showContrato();
        c10.showContrato();
        c11.showContrato();
        c12.showContrato();
        c13.showContrato();
        c14.showContrato();
        c15.showContrato();
    }
}
