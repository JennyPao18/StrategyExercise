public class rutaMasCorta implements RutaStrategy{
    private String nombre;
    private float distanciaKM;

    public rutaMasCorta(String nombre, float distanciaKM) {
        this.nombre = nombre;
        this.distanciaKM = distanciaKM;
    }

    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        System.out.println("Nombre de la Ruta: " + nombre);
        System.out.println("Distancia en KM: " + distanciaKM);
        return "Ruta más corta entre " + puntoA + " y " + puntoB;
    }
}
