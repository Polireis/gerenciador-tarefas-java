package service;

import model.Tarefa;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {

    private List<Tarefa> tarefas;
    private int contadorId;

    public GerenciadorTarefas() {
        tarefas = new ArrayList<>();
        contadorId = 1;
    }

    public void adicionarTarefa(String descricao) {
        Tarefa novaTarefa = new Tarefa(contadorId, descricao);
        tarefas.add(novaTarefa);
        contadorId++;
    }

    public List<Tarefa> listarTarefas() {
        return tarefas;
    }
}
