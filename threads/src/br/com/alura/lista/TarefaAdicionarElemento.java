package br.com.alura.lista;

import java.util.ArrayList;
import java.util.List;

public class TarefaAdicionarElemento implements Runnable {
    private List<String> lista;
    private int numeroDaThread;
    public TarefaAdicionarElemento(List<String> lista, int numeroDaThread) {
        this.lista = lista;
        this.numeroDaThread = numeroDaThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            lista.add("Thread" + numeroDaThread + " - " + i);
        }
    }
}
