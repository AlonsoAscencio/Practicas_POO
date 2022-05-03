package Semana1.Viernes;


class Animal {
    //Caso1
    String color="Blanco";

    //Caso2
    void eat(){
        System.out.println("Comiendo...");
    }

    //Caso3
    Animal(){
        System.out.println("Se crea un animal");
    }

}

class Gato extends Animal{
    //Caso1
    String color="Cafe";
    void printColor(){
        System.out.println("Color de la clase Gato: " + color);
        System.out.println("Color de la clase Animal: " + super.color);
    }


    //Caso2
    void eat(){
        System.out.println("Come atun");
    }
    //Caso2
    void dormir(){
        System.out.println("Ya se durmio el michi");
    }
    //Caso2
    void call(){
        super.eat();
        dormir();
    }
    //Caso3
    Gato(){
        super();
        System.out.println("Se ha creado un gato");
    }

}

public class SuperTest {
    public static void main(String[] args) {

        //Caso1
        new Gato().printColor();

        //Caso2
        new Gato().call();

        //Caso3
        new Gato();

    }


}
