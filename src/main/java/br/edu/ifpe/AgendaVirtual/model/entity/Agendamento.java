package br.edu.ifpe.AgendaVirtual.model.entity;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Agendamento {

	@Id
	@GeneratedValue
	private int id;
	@Column
	private String atividade;
	@Column
	private Date dataHora;
	@Column
	private String Descricao;
	@OneToMany(mappedBy="usuario", fetch=FetchType.EAGER, orphanRemoval=true, cascade=CascadeType.ALL)
	@JoinColumn(name="disciplina_id")
	private ArrayList <Disciplina> disciplina;
	@ManyToOne
	@JoinColumn(name="usuario_id", updatable=false)
	private Usuario usuario;
	
	public Agendamento(int id, String atividade, Date dataHora, String descricao, ArrayList<Disciplina> disciplina) {
		super();
		this.id = id;
		this.atividade = atividade;
		this.dataHora = dataHora;
		this.Descricao = descricao;
		this.disciplina = disciplina;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public ArrayList<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(ArrayList<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
	
	

}
