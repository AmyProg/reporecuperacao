package br.senai.sc.ti2014n1.pw4.amy.main;

import br.senai.sc.t12014n1.pw4.amy.model.MedicamentoRn;
import br.senai.sc.ti2014n1.pe4.amy.dominio.Medicamento;
import br.senai.sc.ti2014n1.pw4.amy.dao.Dao;

public class Main {

	public static MedicamentoRn medicamentoRn;

	public static void main(String[] args) {
		medicamentoRn = new MedicamentoRn();
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



	private static void conectar() {
		Dao dao = new Dao() {
		};
		dao.getConnection();

	}
}
