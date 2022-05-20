package br.com.fiap;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Equipe {
	private String nome;
	private ArrayList<String> integrantes;

	public Equipe() {

	}

	public Equipe(String nome, ArrayList<String> integrantes) {
		this.nome = nome;
		this.integrantes = integrantes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(ArrayList<String> integrantes) {
		this.integrantes = integrantes;
	}
	public void listaEquipe() {
		String exibe = "Nome da equipe: " + nome + "\n";
		Collections.sort(integrantes);
		int cont = 1;
		for (String i : integrantes) {
			exibe += "Integrante " + cont + ": " + i + "\n";
			cont++;
		}
		JOptionPane.showMessageDialog(null, exibe);
	}
}
