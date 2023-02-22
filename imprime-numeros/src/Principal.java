public class Principal {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new TarefaImprimeNumeros());
        Thread thread2 = new Thread(new TarefaImprimeNumeros());

        thread1.start();
        thread2.start();
    }
}
