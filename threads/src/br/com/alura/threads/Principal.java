package br.com.alura.threads;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        ImprimeString tarefa = new ImprimeString();
        Thread thread = new Thread(tarefa);

        thread.start();
    }
}
