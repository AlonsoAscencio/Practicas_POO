package PracticaHarry;

public class PruebaPersonaje {

    public static void main(String[] args) {
        def();
    }


    public static void def(){
        String msg = "\n" + "Soy un personaje de la saga de Harry Potter con estas caracteristicas";

        Personaje Harry = new Personaje();
        Harry.setHouse("Gryffindor");
        Harry.setNombre("Harry Potter");
        Harry.setGenero("Masculino");
        Harry.setPatronus("Ciervo");
        Harry.setBoggart("Dementor");

        System.out.print(msg + "\n" + Harry.printState());


        Personaje Snape = new Personaje();
        Snape.setHouse("Slytherin");
        Snape.setNombre("Severus Snape");
        Snape.setGenero("Masculino");
        Snape.setPatronus("Ciervo");
        Snape.setBoggart("Lord Voldemort");

        System.out.print("\n" + msg + "\n" + Snape.printState());

        Personaje Dumbledore = new Personaje();
        Dumbledore.setHouse("Gryffindor");
        Dumbledore.setNombre("Albus Dumbledore");
        Dumbledore.setGenero("Masculino");
        Dumbledore.setPatronus("Fenix");
        Dumbledore.setBoggart("El cuerpo de su hermana Ariana");

        System.out.print("\n" + msg + "\n" + Dumbledore.printState());

        Personaje Ron = new Personaje();
        Ron.setHouse("Gryffindor");
        Ron.setNombre("Ron Weasley");
        Ron.setGenero("Masculino");
        Ron.setPatronus("Jack Russel Terrier");
        Ron.setBoggart("Acromantula");

        System.out.print("\n" + msg + "\n" + Ron.printState());

        Personaje Ginevra = new Personaje();
        Ginevra.setHouse("Gryffindor");
        Ginevra.setNombre("Ginevra Weasley");
        Ginevra.setGenero("Femenino");
        Ginevra.setPatronus("Caballo");
        Ginevra.setBoggart("Volver a ser controlada por Voldemort");

        System.out.print("\n" + msg + "\n" + Ginevra.printState());

        Personaje Minerva = new Personaje();
        Minerva.setHouse("Gryffindor");
        Minerva.setNombre("Minerva McGonagall");
        Minerva.setGenero("Femenino");
        Minerva.setPatronus("Gato con lineas alrededor de los ojos");
        Minerva.setBoggart("Desconocido");

        System.out.print("\n" + msg + "\n" + Minerva.printState());
    }


}

