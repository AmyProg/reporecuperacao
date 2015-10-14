package br.senai.sc.ti2014n1.pw4.amy.main;

import br.senai.sc.t12014n1.pw4.amy.model.MedicamentoRn;
import br.senai.sc.ti2014n1.pe4.amy.dominio.Medicamento;
import br.senai.sc.ti2014n1.pw4.amy.dao.Dao;

public class Main {

	public static MedicamentoRn medicamentoRn;

	public static void main(String[] args) {
		medicamentoRn = new MedicamentoRn();
	}

	private static void excluir() {
		try {
			medicamentoRn.excluir(3L);
			System.out.println("Excluido");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void editar() {
		Medicamento medicamento = medicamentoRn.buscarPorId(1L);
		medicamento.setNome(medicamento.getNome().concat(" A."));
		try {
			medicamentoRn.salvar(medicamento);
			System.out.println("Salvo");
		} catch (Exception e) {
			System.out.println("Erro ao salvar: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private static void buscarPorId() {
		mostrar(medicamentoRn.buscarPorId(2L));
	}

	private static void listarTodos() {
		for (Medicamento medicamento : medicamentoRn.listar()) {
			mostrar(medicamento);
		}
	}

	private static void mostrar(Medicamento medicamento) {
		System.out.println("Nome: " + medicamento.getNome());
		System.out.println("Dosagem: " + medicamento.getDosagem());
		System.out.println("Intervalo:" + medicamento.getIntervalo());
		System.out.println("Duracao:" + medicamento.getDuracao());
		System.out.println("------------------------------");
	}

	private static void inserirUm() {
		Medicamento medicamento = new Medicamento();
		medicamento.setNome("Joao");
		medicamento.setDosagem("10 gotas ou 2 comprimidos");
		medicamento.setIntervalo("De 8 em 8 horas");
		medicamento.setDuracao("4 horas");
		try {
			medicamentoRn.salvar(medicamento);
			System.out.println("Salvo");
		} catch (Exception e) {
			System.out.println("Erro ao salvar: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private static void conectar() {
		Dao dao = new Dao() {
		};
		dao.getConnection();

	}
}
