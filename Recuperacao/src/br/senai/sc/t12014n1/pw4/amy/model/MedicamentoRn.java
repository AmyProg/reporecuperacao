package br.senai.sc.t12014n1.pw4.amy.model;

import java.util.List;

import br.senai.sc.ti2014n1.pe4.amy.dominio.Medicamento;
import br.senai.sc.ti2014n1.pw4.amy.dao.MedicamentoDao;


public class MedicamentoRn {

	private MedicamentoDao dao;

	public MedicamentoRn() {
		dao = new MedicamentoDao();
	}

	public void salvar(Medicamento medicamento) throws Exception {
		if (medicamento.getNome().trim().isEmpty()){
			throw new Exception("O nome do medicamento é obrigatório.");
		}
		if (medicamento.getDosagem().trim().isEmpty()){
			throw new Exception("A dosagem do medicamento é obrigatória.");
		}
		if (medicamento.getIntervalo().trim().isEmpty()){
			throw new Exception("O intervalo do medicamento é obrigatório.");
		}
		if (medicamento.getDuracao().trim().isEmpty()){
			throw new Exception("A duração do medicamento é obrigatória.");
		}
		dao.salvar(medicamento);
	}

	public List<Medicamento> listar() {
		return dao.listarTodos();
	}
	
	public Medicamento buscarPorId(Long id){
		return dao.buscaPorId(id); 
	}
	
	public void excluir (Long id) throws Exception{
		dao.excluir(id);
	}
	
}
