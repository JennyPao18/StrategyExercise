public class rutaMasEconomica implements RutaStrategy{
    //Declaración de variables de la estrategia
    private String nombre;
    private String precio;

    //Constructor con parámetros
    public rutaMasEconomica(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        //Mostrar los datos propios de la estrategia
        System.out.println("Nombre de la Ruta: " + nombre);
        System.out.println("Precio del Viaje: " + precio);
        //Retornar el valor correspondiente
        return "Ruta más económica para viajar desde " + puntoA + " hasta " + puntoB;
    }
}
