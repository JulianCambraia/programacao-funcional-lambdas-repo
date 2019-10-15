package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.entities.Produto;

public class MeuComparatorMainProgram_5 {

	public static void main(String[] args) {
		List<Produto> liProdutos = new ArrayList<Produto>();
		liProdutos.add(new Produto("Tv", 900.00));
		liProdutos.add(new Produto("Notebook", 1200.00));
		liProdutos.add(new Produto("Tablet", 450.00));

		// Cria uma função anônima - lambda para realizar a comparação com o Comparator
		// enxuga mais ainda a função anônima pois ela só tem uma instrução
		Comparator<Produto> comp = (p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
		liProdutos.sort(comp);
		for (Produto produto : liProdutos) {
			System.out.println(produto);
		}

	}

}
