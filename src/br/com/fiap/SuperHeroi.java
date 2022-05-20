package br.com.fiap;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class SuperHeroi {
	private String nome;
	private String idSecreta;
	private ArrayList<String> poderes;
	private ArrayList<String> fraquezas;

	public SuperHeroi() {

	}

	public SuperHeroi(String nome, String idSecreta, ArrayList<String> poderes, ArrayList<String> fraquezas) {
		this.fraquezas = fraquezas;
		this.nome = nome;
		this.idSecreta = idSecreta;
		this.poderes = poderes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdSecreta() {
		return idSecreta;
	}

	public void setIdSecreta(String idSecreta) {
		this.idSecreta = idSecreta;
	}

	public ArrayList<String> getPoderes() {
		return poderes;
	}

	public void setPoderes(ArrayList<String> poderes) {
		this.poderes = poderes;
	}

	public ArrayList<String> getFraquezas() {
		return fraquezas;
	}

	public void setFraquezas(ArrayList<String> fraquezas) {
		this.fraquezas = fraquezas;
	}
	public void listaHeroi() {
		String exibe = "Nome: " + nome + "\n";
		exibe += "Identidade Secreta: "+ idSecreta +"\n";
		Collections.sort(poderes);
		Collections.sort(fraquezas);
		int cont = 1;
		for (String i : poderes) {
			exibe += "Poderes " + cont + ": " + i + "\n";
			cont++;
		}
		cont = 1;
		for (String i : fraquezas) {
			exibe += "Fraquezas " + cont + ": " + i + "\n";
			cont++;
		}
		JOptionPane.showMessageDialog(null, exibe);
	}
}
