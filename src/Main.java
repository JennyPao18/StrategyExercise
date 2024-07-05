public class Main {
    public static void main(String[] args) {
        //Titulo
        System.out.println("----- Ruta Más Rápida -----");
        //Emplear una estrategia
        navegadorGPS gps = new navegadorGPS(new rutaMasRapida("Ruta del Pacífico", "2 horas y 15 minutos"));
        //Especificar los parámetros del método CalcularRuta
        gps.calcularRuta("Ciudad 1", "Ciudad 21");

        //Saltos de Línea
        System.out.println();
        System.out.println();

        //Titulo
        System.out.println("----- Ruta Más Corta -----");
        // Cambiar a otra estrategia
        gps.setRutaStrategy(new rutaMasCorta("Ruta del Sol", 15.60F));
        //Especificar los parámetros del método CalcularRuta
        gps.calcularRuta("Ciudad 7", "8");

        //Saltos de Línea
        System.out.println();
        System.out.println();

        //Titulo
        System.out.println("----- Ruta Más Económica -----");
        // Cambiar a otra estrategia
        gps.setRutaStrategy(new rutaMasEconomica("Ruta de las Grandes Montañas", "Q 46.85"));
        //Especificar los parámetros del método CalcularRuta
        gps.calcularRuta("Ciudad 3", "Ciudad 14");
    }
}