package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.MeuComparator;
import model.entities.Produto;

public class MeuComparatorMainProgram_1 {

	public static void main(String[] args) {
		// Usando a Interface Comparator direto na Entidade Produto
		List<Produto> liProdutos = new ArrayList<Produto>();
		liProdutos.add(new Produto("Tv", 900.00));
		liProdutos.add(new Produto("Notebook", 1200.00));
		liProdutos.add(new Produto("Tablet", 450.00));

		liProdutos.sort(new MeuComparator());
		for (Produto produto : liProdutos) {
			System.out.println(produto);
		}

	}

}
