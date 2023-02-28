public class Empresa {
    private Funcionario funcionarios[];
    private int tamanho;
    private static final int CAPACIDADE = 100;

    public Empresa() {
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
            System.out.println();
            System.out.println("\nFuncionário " + (i + 1) + ": " + funcionarios[i].getNome() + ", salário: " + funcionarios[i].getSalario());
        }


    }

    public boolean buscaPosicao(int pos) {
        if (funcionarios[pos] != null) {
            return true;
        }
        return false;
    }

    public void imprimePos(int pos) {
        System.out.println("Buscando um funcionário por sua posição");
        if (buscaPosicao(pos)) {
            System.out.print(funcionarios[pos].getNome());
        } else System.out.print("Funcionário não encontrado");

    }

    public Funcionario[] ordenaPos() {
        Funcionario funcionarioAux;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (funcionarios[i].getNome().compareTo(funcionarios[j].getNome()) < 0) {
                    funcionarioAux = funcionarios[i];
                    funcionarios[i] = funcionarios[j];
                    funcionarios[j] = funcionarioAux;
                }

            }
        }
        return funcionarios;
    }
}