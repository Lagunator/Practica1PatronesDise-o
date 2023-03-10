package exercise5;

public class LaunchRestaurante {

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        PlatoBife bife = new PlatoBife();
        PlatoLomito lomito = new PlatoLomito();
        PlatoTira tira = new PlatoTira();

        restaurante.setTipoPlato(bife);
        restaurante.buildPlato();

        Plato plato = restaurante.getPlato();
        System.out.println("$$$$$$$$$$$Bife$$$$$$$$$");
        plato.showPlato();

        restaurante.setTipoPlato(lomito);
        restaurante.buildPlato();

        Plato plato2 = restaurante.getPlato();
        System.out.println("$$$$$$$$$Lomito$$$$$$$$$");
        plato2.showPlato();

        restaurante.setTipoPlato(tira);
        restaurante.buildPlato();

        Plato plato3 = restaurante.getPlato();
        System.out.println("$$$$$$$$$Tira$$$$$$$$$");
        plato3.showPlato();
    }
}
