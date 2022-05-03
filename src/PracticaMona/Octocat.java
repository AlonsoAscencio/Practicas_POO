package PracticaMona;

public class Octocat{
    String Nombre, Apariencia, Actividad;

    Octocat(String Nombre, String Apariencia){
        this.Nombre = Nombre;
        this.Apariencia = Apariencia;
    }
}

class Stormtroopocat extends Octocat{
    String Actividad;

    Stormtroopocat(String Nombre, String Apariencia, String Actividad){

        super(Nombre, Apariencia);
        this.Actividad = Actividad;
    }
    void display(){
        System.out.println("La version de Octocat es: " + Nombre + "Su apariencia es: " + Apariencia + "Y la actividad que realiza es: " + Actividad);
    }
}

class Heisencat extends Octocat{
    String Actividad;

    Heisencat(String Nombre, String Apariencia, String Actividad){

        super(Nombre, Apariencia);
        this.Actividad = Actividad;
    }
    void display(){
        System.out.println("La version de Octocat es: " + Nombre + "Su apariencia es: " + Apariencia + "Y la actividad que realiza es: " + Actividad);
    }
}

class IronCat extends Octocat{
    String Actividad;

    IronCat(String Nombre, String Apariencia, String Actividad){

        super(Nombre, Apariencia);
        this.Actividad = Actividad;
    }
    void display(){
        System.out.println("La version de Octocat es: " + Nombre + "Su apariencia es: " + Apariencia + "Y la actividad que realiza es: " + Actividad);
    }
}

class Dinotocat extends Octocat{
    String Actividad;

    Dinotocat(String Nombre, String Apariencia, String Actividad){

        super(Nombre, Apariencia);
        this.Actividad = Actividad;
    }
    void display(){
        System.out.println("La version de Octocat es: " + Nombre + "Su apariencia es: " + Apariencia + "Y la actividad que realiza es: " + Actividad);
    }
}

class Filmtocat extends Octocat{
    String Actividad;

    Filmtocat(String Nombre, String Apariencia, String Actividad){

        super(Nombre, Apariencia);
        this.Actividad = Actividad;
    }
    void display(){
        System.out.println("La version de Octocat es: " + Nombre + "Su apariencia es: " + Apariencia + "Y la actividad que realiza es: " + Actividad);
    }
}

class Kimonotocat extends Octocat{
    String Actividad;

    Kimonotocat(String Nombre, String Apariencia, String Actividad){

        super(Nombre, Apariencia);
        this.Actividad = Actividad;
    }
    void display(){
        System.out.println("La version de Octocat es: " + Nombre + "Su apariencia es: " + Apariencia + "Y la actividad que realiza es: " + Actividad);
    }
}

class TestOctocat{
    public static void main(String[] args) {
        Stormtroopocat S = new Stormtroopocat("Stormtroopocat ", "Tiene uniforme de Stormtropper ", "Le dispara con su arma a los jedis");
        S.display();

        Heisencat H = new  Heisencat("Heisencat ", "Tiene un traje amarillo con una mascara de gas", "Fabrica meta");
        H.display();

        IronCat I = new IronCat("IronCat ", "Usa un traje de nanotecnologia que le permite volar ","Venga el mundo");
        I.display();

        Dinotocat D = new Dinotocat("Dinotocat ","Usa un traje de dinosaurio ", "destruye ciudades y carros");
        D.display();

        Filmtocat F = new Filmtocat("Filmocat ","usa una camara y un microfono ","Filma peliculas en especial de pulpos ");
        F.display();

        Kimonotocat K = new Kimonotocat("Kimonocat ","Usa un Kimono morado "," en su mano izquierda sostiene una katana y en su mano derecha un abanico ");
        K.display();
    }

}
