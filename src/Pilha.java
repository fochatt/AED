public class Pilha {
    private Funcionario[] funcionarios;
    private int topo;

    public Pilha() {
        this.funcionarios = new Funcionario[100];
        this.topo = -1;
    }

    public void push(Funcionario func) {
        if (topo < 99) {
            topo++;
            funcionarios[topo] = func;
        }
    }

    public Funcionario busca(int posicao) {
        if (posicaoOcupada(posicao)) {
            return funcionarios[posicao];
        }
        return null;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao <= topo;
    }

    public void pop(int posicao) {
        if (posicaoOcupada(posicao)) {
            for (int i = posicao; i < topo; i++) {
                funcionarios[i] = funcionarios[i+1];
            }
            topo--;
        }
    }

    public boolean contem(String nome) {
        for (int i = 0; i <= topo; i++) {
            if (funcionarios[i].getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return topo + 1;
    }

    public void imprimeLista() {
        for (int i = 0; i <= topo; i++) {
            System.out.println("Nome: " + funcionarios[i].getNome() + " - Salário: " + funcionarios[i].getSalario());
        }
    }

    public void ordenaPorNome() {
        for (int i = 0; i < topo; i++) {
            for (int j = i+1; j <= topo; j++) {
                if (funcionarios[i].getNome().compareToIgnoreCase(funcionarios[j].getNome()) > 0) {
                    Funcionario aux = funcionarios[i];
                    funcionarios[i] = funcionarios[j];
                    funcionarios[j] = aux;
                }
            }
        }
    }
}