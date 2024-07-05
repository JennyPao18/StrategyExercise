public class navegadorGPS {
    private RutaStrategy strategy;

    public navegadorGPS(RutaStrategy strategy) {
        this.strategy = strategy;
    }

    public void setRutaStrategy(RutaStrategy strategy) {
        this.strategy = strategy;
    }

    public void calcularRuta(String puntoA, String puntoB){
        System.out.println(strategy.calcularRuta(puntoA, puntoB));
    }
}
