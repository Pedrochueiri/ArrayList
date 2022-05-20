package br.com.fiap;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class UsaEquipe {
	public static void main(String[] args) {
		Equipe grupo;
		String aux,nome,escolha = "sim";
		
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				nome = JOptionPane.showInputDialog("Digite o nome da sua Equipe: ");
				String membros = "continua";
				ArrayList<String> integrantes = new ArrayList<String>();
				while (membros.equalsIgnoreCase("continua")) {
					aux = JOptionPane.showInputDialog("Digite integrante da equipe ou \"fim\" para encerrar");
					if (aux.equalsIgnoreCase("fim")) {
						membros = "fim";
					} else {
						integrantes.add(aux);
					}
				}
				//grupo = new Equipe();
				//grupo.setNome(nome);
				//grupo.setIntegrantes(integrantes);
				grupo = new Equipe(nome,integrantes);
				grupo.listaEquipe();
				escolha = JOptionPane.showInputDialog("Deseja continuar? sim - nao");			
			} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, e.getMessage());
			}
		}
		JOptionPane.showMessageDialog(null, "fim do programa,Até a proxima");
	}
}
