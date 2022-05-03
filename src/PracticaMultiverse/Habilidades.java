package PracticaMultiverse;
public class Habilidades {
    public static void main(String[] args){
        def();
    }

    public static void def(){
        PeterParker peter = new PeterParker("PeterParker", "Hombre");
        peter.powers(1);
        System.out.println(peter.getInfo());

        GwenStacy gwen = new GwenStacy("GwenStacy", "Mujer");
        gwen.powers(1);
        System.out.println(gwen.getInfo());

        MillesMorales milles = new MillesMorales("MillesMorales", "Hombre");
        milles.powers(1);
        System.out.println(milles.getInfo());


        peter.powers(2);
        System.out.println(peter.getInfo());

        gwen.powers(3);
        System.out.println(gwen.getInfo());

        milles.powers(3);
        System.out.println(milles.getInfo());


    }
}
