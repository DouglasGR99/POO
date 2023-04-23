package br.edu.faeterj;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
	Scanner sc = new Scanner(System.in);
	String nome;
	double valor;
	int quantidade;
	String descricao;
	int codBarra;

	public void criarProduto() {
		System.out.println("Digite as info do produto:");

		System.out.println("nome:");
		nome = sc.next();

		System.out.println("valor:");
		valor = sc.nextDouble();

		System.out.println("quantidade:");
		quantidade = sc.nextInt();

		System.out.println("descricao:");
		descricao = sc.next();

		System.out.println("cod barra:");
		codBarra = sc.nextInt();

	}

	public void mostrarLProduto(ArrayList<Produto> listaProduto) {
		for (int i = 0; i < listaProduto.size(); i++) {
			System.out.println("nome: " + listaProduto.get(i).nome);
			System.out.println("valor: " + listaProduto.get(i).valor);
			System.out.println("quantidade: " + listaProduto.get(i).quantidade);
			System.out.println("descricao: " + listaProduto.get(i).descricao);
			System.out.println("cod barra: " + listaProduto.get(i).codBarra);
		}
	}
}
