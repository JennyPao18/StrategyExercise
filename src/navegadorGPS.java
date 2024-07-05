public class navegadorGPS {
    //Instancia de RutaStrategy
    private RutaStrategy strategy;

    //Metodo navegador GPS en el cual se podra especificar la estrategia a utilizar
    public navegadorGPS(RutaStrategy strategy) {
        this.strategy = strategy;
    }

    //Metodo setRutaStrategy
    public void setRutaStrategy(RutaStrategy strategy) {
        this.strategy = strategy;
    }

    //Metodo calcularRuta que se especifico en la interfaz RutaStrategy
    public void calcularRuta(String puntoA, String puntoB){
        System.out.println(strategy.calcularRuta(puntoA, puntoB));
    }
}
