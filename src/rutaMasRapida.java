public class rutaMasRapida implements RutaStrategy{
    //Declaración de variables de la estrategia
    private String nombre;
    private String tiempoRecorrido;

    //Constructor con parámetros
    public rutaMasRapida(String nombre, String tiempoRecorrido) {
        this.nombre = nombre;
        this.tiempoRecorrido = tiempoRecorrido;
    }

    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        //Mostrar los datos propios de la estrategia
        System.out.println("Nombre de la Ruta: " + nombre);
        System.out.println("Tiempo de Recorrido: " + tiempoRecorrido);
        //Retornar el valor correspondiente
        return "Ruta más rápida entre " + puntoA + " y " + puntoB;
    }
}
