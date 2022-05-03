package PracticaMultiverse;

public class Spiderman {
    public String name;
    public String gender;
    public String powers;

    Spiderman(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    public String getName() { return name; }
    public String getGender() { return gender; }

    public String getInfo(){
        return "\n" + "Nombre: " + name + "\n" +
                "Genero: " + gender + "\n" +
                "Poderes: " + powers;
    }

    public boolean setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
            return true;
        } else {
            return false;
        }
    }

    public boolean setLGender(String gender) {
        if (!gender.isEmpty()) {
            this.gender = gender;
            return true;
        } else {
            return false;
        }
    }

    private void powers(){
        this.powers = "Lanzo telaraña y trepo paredes";
    }
}

class PeterParker extends Spiderman implements IPowers{
    PeterParker(String name, String gender) {
        super(name, gender);
    }

    void powers(int poder){
        if (poder == 1) {
            this.powers = power1();
        }
        if (poder == 2) {
            this.powers = power2();
        }
        if (poder == 3) {
            this.powers = power3();
        }
    }

    @Override
    public String power1() {
        return "Sentido Arácnido";
    }

    @Override
    public String power2() {
        return "Lanzar telaraña";
    }

    @Override
    public String power3() {
        return "Fuerza sobrehumana";
    }
}

class GwenStacy extends Spiderman implements IPowers{
    GwenStacy(String name, String gender) {
        super(name, gender);
    }

    void powers(int poder){
        if (poder == 1) {
            this.powers = power1();
        }
        if (poder == 2) {
            this.powers = power2();
        }
        if (poder == 3) {
            this.powers = power3();
        }
    }

    @Override
    public String power1() {
        return "Factor de Curación";
    }

    @Override
    public String power2() {
        return "Piel adherente";
    }

    @Override
    public String power3() {
        return "Agilidad";
    }
}

class MillesMorales extends Spiderman implements IPowers{
    MillesMorales(String name, String gender) {
        super(name, gender);
    }

    void powers(int poder){
        if (poder == 1) {
            this.powers = power1();
        }
        if (poder == 2) {
            this.powers = power2();
        }
        if (poder == 3) {
            this.powers = power3();
        }
    }

    @Override
    public String power1() {
        return "Rayo venenoso";
    }

    @Override
    public String power2() {
        return "Explosión de energía";
    }

    @Override
    public String power3() {
        return "Camuflaje arácnido";
    }
}

interface IPowers{
    String power1();
    String power2();
    String power3();
}
