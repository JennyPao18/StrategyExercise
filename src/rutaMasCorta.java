public class rutaMasCorta implements RutaStrategy{
    //Declaración de variables de la estrategia
    private String nombre;
    private float distanciaKM;

    //Constructor con parámetros
    public rutaMasCorta(String nombre, float distanciaKM) {
        this.nombre = nombre;
        this.distanciaKM = distanciaKM;
    }

    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        //Mostrar los datos propios de la estrategia
        System.out.println("Nombre de la Ruta: " + nombre);
        System.out.println("Distancia en KM: " + distanciaKM);
        //Retornar el valor correspondiente
        return "Ruta más corta entre " + puntoA + " y " + puntoB;
    }
}
