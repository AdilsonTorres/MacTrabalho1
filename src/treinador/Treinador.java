package treinador;
import Pokemon.Pokemon;

public class Treinador 
{
	private String nome;
	private Pokemon[] lista = new Pokemon[6];
	private int nPok = 0;
	
	Treinador(String nome)
	{
		this.nome = nome;
	}
	
	void addPokemon(Pokemon pok)
	{
		if (nPok < 6) lista[nPok++] = pok;
	}

}
