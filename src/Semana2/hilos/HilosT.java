package Semana2.hilos;



public class HilosT extends Thread{

    @Override  //Runnable
    public void run() {
        System.out.println("El hilo se esta ejecutando");
    }
    /*
    public void start(){

        //inicia la ejecucion de un hilo
        //La JVM llama al metodo run() del hilo

    }

    sleep - detiene de manera temporal el numero esperado
    join() - espera a que el hilo se muera
    getPriotrity - regresa la prioridad del hilo
    setpriority - establece la prioridad del hilo
    get name - nombre del hilo
    currentThread - referencia al hilo que se esta ejecutando
    getId - regresa el id del hilo
    Thread.State getState - regresa el State del hilo
    isAlive - si esta vivo
    */

    public static void main(String[] args) {
        HilosT hilo= new HilosT(); //entra al state new
        hilo.start();
    }
static class  HilosR implements  Runnable{
    @Override
    public void run() {
        System.out.println("El hilo de runnable esta" + "corriendo");
    }

    public static void main(String[] args) {
        HilosR h = new HilosR();
        Thread t = new Thread();
        t.start();
    }
}

}
