package Semana1;

public class PruebaBicicleta {
    public static void main(String[] args) {
        def();
    }

    public static void  def(){
        Bicicleta biciMountain = new Bicicleta();
        Bicicleta biciPista = new Bicicleta();
        biciMountain.setColor("Negra");
        biciMountain.setPins(6);
        biciMountain.setRodadas(26);
        biciMountain.setVelocidad(13.2);
        String msg = "Soy una bici de montana con estas caracteristicas";
        msg += "\n Color: " + biciMountain.getColor();
        msg += "\n Velocidad: " + biciMountain.getVelocidad();
        msg += "\n Pins: " + biciMountain.getPins();
        msg += "\n Rodada: " + biciMountain.getRodada();

        System.out.print(msg);
    }



}
