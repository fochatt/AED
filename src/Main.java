public class Main {
    public static void main(String[] args) {
        Empresa funcionarios = new Empresa();

        // Cadastre o nome e o salário de 5 funcionários
        funcionarios.adiciona(new Funcionario("Nathan Marques", 2000.0));
        funcionarios.adiciona(new Funcionario("Bernardo Cabral", 3000.0));
        funcionarios.adiciona(new Funcionario("Pedro Augusto", 2500.0));
        funcionarios.adiciona(new Funcionario("Ana Maria", 4000.0));
        funcionarios.adiciona(new Funcionario("Gabriel Araujo", 3500.0));

        // Liste todos os dados dos funcionários
        System.out.println("Todos os funcionários:");
        funcionarios.imprimeLista();
        System.out.println();

        // Pesquise por nome um funcionário existente
        System.out.println("Pesquisando por um funcionário existente");
        if (funcionarios.contem("Ana Maria")) {
            System.out.println("Funcionário encontrado");
        } else {
            System.out.println("Funcionário não encontrado");
        }
        System.out.println();

        // Pesquise por nome um funcionário que não existe
        System.out.println("Pesquisando por um funcionário que não existe");
        if (funcionarios.contem("Pedro Araujo")) {
            System.out.println("Funcionário encontrado");
        } else {
            System.out.println("Funcionário não encontrado");
        }
        System.out.println();
        funcionarios.imprimePos(2);

        funcionarios.ordenaPos();
        funcionarios.imprimeLista();
    }
    ////////////////////////
            Pilha PilhaF= new Pilha();

            // Cadastro de funcionários
            PilhaF.push(new Funcionario("Nathan Marques", 2000.0));
           PilhaF.push(new Funcionario("Bernardo Cabral", 1500.0));
          PilhaF.push(new Funcionario("Pedro Augusto", 4000.0));
          PilhaF.push(new Funcionario("Joao Renato", 5000.0));
         PilhaF.push(new Funcionario("Gustavo Pedrosa", 3000.0));
            // Listagem de funcionários

}




