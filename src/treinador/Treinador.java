package treinador;

import Pokemon.Pokemon;

public class Treinador
{
	private String nome;
	private Pokemon[] lista = new Pokemon[6];
	private static int nPok = 3;
	private int qtPok = 0;
	private boolean perdeu = false;
	private Pokemon ativo;

	public static int getnPok()
	{
		return nPok;
	}

	public void ativaPokemon(String nome)
	{
		for (int i = 0; i < nPok; i++)
		{
			if (lista[i].getNome().equals(nome))
			{
				ativo = lista[i];
				break;
			}
		}
	}

	public Pokemon getAtivo()
	{
		return ativo;
	}

	public void setAtivo(Pokemon ativo)
	{
		this.ativo = ativo;
	}

	public Treinador(String nome)
	{
		this.nome = nome;
	}

	public void addPokemon(Pokemon pok)
	{
		if (qtPok < nPok)
			lista[qtPok++] = pok;
	}

	public void listarPokemons()
	{
		for (int i = 0; i < nPok; i++)
		{
			listaPokemon(lista[i]);
		}
	}

	public void listaPokemon(Pokemon pok)
	{
		if (!pok.equals(ativo))
			System.out
					.println("Nome: " + pok.getNome() + " Hp: " + pok.getHp());
		else
			System.out.println("Nome: " + pok.getNome() + " Hp: " + pok.getHp()
					+ "Ativo");
	}

	public boolean perdeu()
	{
		for (int i = 0; i < nPok; i++)
		{
			if (lista[i].getHp() > 0)
				return false;
		}
		return true;
	}

}
