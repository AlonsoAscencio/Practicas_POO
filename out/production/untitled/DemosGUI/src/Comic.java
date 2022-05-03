public class Comic {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;

        screen.out("Chainsawman no.1 \n", "Arial L", 35,Colors.BlueHorizon);
        screen.setVisible(true);

        str = d.readString("Quieres leer este comic? Y/N");
        if (str.charAt(0) == 'Y' || str.charAt(0) == 'y'){

            for (int i =1; i<=53; i++){
                try {
                    screen.showImage("Ch"+i+".jpg");
                    screen.setSize(1100,1400);
                    Thread.sleep(7000);
                    screen.cls();
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }

            screen.out("Continuara");
        } else
            screen.out("Nos vemos luego", "Arial L", 35,  Colors.BlueHorizon);


    }


}