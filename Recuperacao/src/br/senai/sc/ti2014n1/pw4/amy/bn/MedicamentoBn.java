package br.senai.sc.ti2014n1.pw4.amy.bn;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.senai.sc.t12014n1.pw4.amy.model.MedicamentoRn;
import br.senai.sc.ti2014n1.pe4.amy.dominio.Medicamento;

@ManagedBean
public class MedicamentoBn {

	private List<Medicamento> medicamentos;
	private Medicamento medicamento;
	private MedicamentoRn rn;

	@PostConstruct
	public void init() {
		rn = new MedicamentoRn();
		medicamento = new Medicamento();
	}

	public List<Medicamento> getMedicamentos() {
		if (medicamentos == null) {
			medicamentos = rn.listar();
		}
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public String salvar(){
		try {
			rn.salvar(medicamento);
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		} 
		return "listMedicamentos";
	}
	
	
}
