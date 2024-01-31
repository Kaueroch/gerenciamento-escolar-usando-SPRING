package com.gerenciamento.escolar;

import java.util.ArrayList;


public class Aluno {
	private String Nome;
	private int matricula;
	private ArrayList<Double> notas = new ArrayList<Double>();
  //@Table(Column="tb_notas")
	
	public double Media() {
		double n1 = 0, n2 = 0, n3 = 0, n4 = 0;
		double media = (n1 + n2 + n3 + n4) / 4;
		return media;
	}
    
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public ArrayList<Double> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}
	//fazer com a tabela de banco de dados 
}
