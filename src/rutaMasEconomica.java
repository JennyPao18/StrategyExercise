public class rutaMasEconomica implements RutaStrategy{
    private String nombre;
    private String precio;

    public rutaMasEconomica(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        System.out.println("Nombre de la Ruta: " + nombre);
        System.out.println("Precio del Viaje: " + precio);
        return "Ruta más económica para viajar desde " + puntoA + " hasta " + puntoB;
    }
}
