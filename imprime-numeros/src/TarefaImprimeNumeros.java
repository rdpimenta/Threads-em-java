public class TarefaImprimeNumeros implements Runnable {
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        for (int i = 1; i <= 1000; i++) {
            System.out.println(thread.getId() + " - " + i);
        }
    }
}
