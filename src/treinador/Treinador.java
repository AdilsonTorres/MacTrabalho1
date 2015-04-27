package treinador;
import Pokemon.Pokemon;

public class Treinador 
{
	private String nome;
	private Pokemon[] lista = new Pokemon[6];
	private int nPok = 0;
	private boolean perdeu = false;
	private Pokemon ativo;
	
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
		if (nPok < 6) lista[nPok++] = pok;
	}
	
	public void listarPokemons()
	{
		for (int i = 0; i < nPok; i++)
		{
			if(!lista[i].equals(ativo)) System.out.println("Nome: "+lista[i].getNome()+" Hp: "+lista[i].getHp());
			else System.out.println("Nome: "+lista[i].getNome()+" Hp: "+lista[i].getHp()+"Ativo");
		}
	}
	
	public boolean perdeu()
	{
		for (int i = 0; i < nPok; i++)
		{
			if (lista[i].getHp() > 0) return false; 
		}
		return true;
	}

}
