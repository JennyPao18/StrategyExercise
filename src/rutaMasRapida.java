public class rutaMasRapida implements RutaStrategy{
    private String nombre;
    private String tiempoRecorrido;

    public rutaMasRapida(String nombre, String tiempoRecorrido) {
        this.nombre = nombre;
        this.tiempoRecorrido = tiempoRecorrido;
    }

    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        System.out.println("Nombre de la Ruta: " + nombre);
        System.out.println("Tiempo de Recorrido: " + tiempoRecorrido);
        return "Ruta más rápida entre " + puntoA + " y " + puntoB;
    }
}
