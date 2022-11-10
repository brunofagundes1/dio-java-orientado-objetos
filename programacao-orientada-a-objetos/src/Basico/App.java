package Basico;
public class App {
    public static void main(String[] args) throws Exception {
        
        Carro carro1 = new Carro();

        carro1.setCor("Prata");
        carro1.setModelo("Honda Fit 2007");
        carro1.setCapacidadeTanque(40);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(4.39));

        Carro carro2 = new Carro("Azul", "Ferrari Italia", 55);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(4.39));

    }
}
