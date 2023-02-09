public class Main {
    public static void main(String[] args) {
        Lista funcionarios = new Lista();

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
        if (funcionarios.contem("Gabriel Araujo")) {
            System.out.println("Funcionário encontrado");
        } else {
            System.out.println("Funcionário não encontrado");
        }
        System.out.println();

        // Busque um funcionário por sua posição
        System.out.println("Buscando um funcionário por sua posição