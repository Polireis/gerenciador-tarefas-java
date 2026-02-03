package app;

import service.GerenciadorTarefas;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("===== GERENCIADOR DE TAREFAS =====");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionarTarefa(descricao);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    System.out.println("Lista de tarefas:");

                    gerenciador.listarTarefas().forEach(tarefa ->
                            System.out.println(tarefa.getId() + " - " +
                                    tarefa.getDescricao() + " - " +
                                    (tarefa.isConcluida() ? "Concluída" : "Pendente"))
                    );
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
