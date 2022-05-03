package PracticaHarry;

public class Personaje {

    public String house, genero, nombre, boggart, patronus;

    public String getHouse() {return  house;  }
    public String getGenero() {  return genero;  }
    public String getNombre() {  return nombre;  }
    public String getBoggart() {  return boggart;  }
    public String getPatronus() {  return patronus;  }

    public boolean setHouse(String house){
        if(!house.isEmpty()){
            this.house = house;
            return true;
        }else
            return false;
    }
    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }
    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }
    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }
    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }else
            return false;
    }

    public String printState(){
        return "House: " + house + "\n" +
                "Nombre: " + nombre + "\n" +
                "Genero: " + genero + "\n" +
                "Boggart: " + boggart + "\n" +
                "Patronus: " + patronus;
    }

}
