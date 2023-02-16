public class Lista {
    private Funcionario[] funcionarios;
    private int tamanho;
    private static final int CAPACIDADE = 100;

    public Lista() {
        funcionarios = new Funcionario[CAPACIDADE];
        tamanho = 0;
    }

    public void adiciona(Funcionario func) {
        if (tamanho < CAPACIDADE) {
            funcionarios[tamanho++] = func;
        } else {
            System.out.println("Lista cheia, não é possível adicionar mais funcionários.");
        }
    }

    public Funcionario busca(int posicao) {
        if (posicao >= 0 && posicao < tamanho) {
            return funcionarios[posicao];
        }
        return null;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < tamanho;
    }

    public void remove(int posicao) {
        if (posicaoOcupada(posicao)) {
            for (int i = posicao; i < tamanho - 1; i++) {
                funcionarios[i] = funcionarios[i + 1];
            }
            funcionarios[--tamanho] = null;
        } else {
            System.out.println("Posição inválida, não é possível remover o funcionário.");
        }
    }

    public boolean contem(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (funcionarios[i].getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return tamanho;
    }

    public void imprimeLista() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Funcionário " + (i + 1) + ": " + funcionarios[i].getNome() + ", salário: " + funcionarios[i].getSalario());
        }

        }
    }

