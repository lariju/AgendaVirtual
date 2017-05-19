package br.edu.ifpe.AgendaVirtual.model.entity;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Usuario {
	
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String nome;
	@Column
	private String email;
	@Column
	private String senha;
	@OneToOne (cascade=CascadeType.ALL)
	private HorarioDeEstudo horarioDeEstudo;
	@OneToOne
	private Boletim boletim;
	@OneToMany(mappedBy="usuario_id", fetch=FetchType.EAGER, orphanRemoval=true, cascade=CascadeType.ALL)
	private List<Anotacao> anotacao;
	@OneToMany(mappedBy="usuario_id", fetch=FetchType.EAGER, orphanRemoval=true, cascade=CascadeType.ALL)
	private List<Agendamento> agendamento;
	
	
	public Usuario(int id, String nome, String email, String senha, HorarioDeEstudo horarioDeEstudo, Boletim boletim,
			List<Anotacao> anotacao, List<Agendamento> agendamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.horarioDeEstudo = horarioDeEstudo;
		this.boletim = boletim;
		this.anotacao = anotacao;
		this.agendamento = agendamento;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public HorarioDeEstudo getHorarioDeEstudo() {
		return horarioDeEstudo;
	}
	public void setHorarioDeEstudo(HorarioDeEstudo horarioDeEstudo) {
		this.horarioDeEstudo = horarioDeEstudo;
	}
	public Boletim getBoletim() {
		return boletim;
	}
	public void setBoletim(Boletim boletim) {
		this.boletim = boletim;
	}
	public Anotacao getAnotacao() {
		return (Anotacao) anotacao;
	}
	
	public void setAnotacao(List<Anotacao> anotacao) {
		this.anotacao = anotacao;
	}
	
	public Agendamento getAgendamento() {
		return (Agendamento) agendamento;
	}

	public void setAgendamento(List<Agendamento> agendamento) {
		this.agendamento = agendamento;
	}
}