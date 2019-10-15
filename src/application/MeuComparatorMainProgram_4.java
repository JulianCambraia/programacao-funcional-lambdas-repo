package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.entities.Produto;

public class MeuComparatorMainProgram_4 {

	public static void main(String[] args) {
		List<Produto> liProdutos = new ArrayList<Produto>();
		liProdutos.add(new Produto("Tv", 900.00));
		liProdutos.add(new Produto("Notebook", 1200.00));
		liProdutos.add(new Produto("Tablet", 450.00));

		// Cria uma função anônima - lambda para realizar a comparação com o Comparator
		// e pra finalizar passamos a função lambda como argumento direto na chamada do sort()
		liProdutos.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));
		for (Produto produto : liProdutos) {
			System.out.println(produto);
		}

	}

}
