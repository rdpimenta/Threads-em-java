public class TarefaAcessaBancoProcedimento implements Runnable {
    private PoolDeConexao pool;
    private GerenciadorDeTransacao tx;

    public TarefaAcessaBancoProcedimento(PoolDeConexao pool, GerenciadorDeTransacao tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public void run() {
        synchronized (tx) {
            System.out.println("Peguei a chave do tx");
            tx.begin();

            synchronized (pool) {
                System.out.println("Peguei a chave da pool");
                pool.getConnection();
            }
        }
    }
}
