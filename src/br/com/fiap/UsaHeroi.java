package br.com.fiap;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class UsaHeroi {
	public static void main(String[] args) {
		SuperHeroi SH;
		String aux, nome,idSecreto,escolha = "sim";
		
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				nome = JOptionPane.showInputDialog("Digite o seu nome: ");
				idSecreto = JOptionPane.showInputDialog("Digite a sua Identidade Secreta: ");
				String poderes1 = "continua";
				ArrayList<String> poderes = new ArrayList<String>();
				while (poderes1.equalsIgnoreCase("continua")) {
					aux = JOptionPane.showInputDialog("Digite os seus poderes ou \"fim\" para encerrar");
					if (aux.equalsIgnoreCase("fim")) {
						poderes1 = "fim";
					} else {
						poderes.add(aux);
					}
				}
				String fraquezas1 = "continuar";
				ArrayList<String> fraquezas = new ArrayList<String>();
				while (fraquezas1.equalsIgnoreCase("continuar")) {
					aux = JOptionPane.showInputDialog("Digite suas fraquezas ou \"fim\" para encerrar");
					if (aux.equalsIgnoreCase("fim")) {
						fraquezas1 = "fim";
					} else {
						fraquezas.add(aux);
					}
				}
				SH = new SuperHeroi(nome,idSecreto,poderes,fraquezas);
				SH.listaHeroi();
				escolha = JOptionPane.showInputDialog("Deseja continuar?");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		JOptionPane.showMessageDialog(null, "fim do programa, Até breve");
	}
}
