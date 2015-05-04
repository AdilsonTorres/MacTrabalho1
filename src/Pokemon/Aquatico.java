package Pokemon;

public class Aquatico extends Pokemon
{
	public Aquatico(String nome)
	{
		super(nome, "aquatico");
		int[] dano = new int[4];
		dano[0] = 10;
		dano[1] = 25;
		dano[2] = 40;
		dano[3] = 25;
		setDano(dano);
		
		int[] prioridade = new int[4];
		prioridade[0] = 4;
		prioridade[1] = 3;
		prioridade[2] = 2;
		prioridade[3] = 1;
		setPrioridade(prioridade);

		String[] ataque = new String[4];
		ataque[0] = "Jato de agua";
		ataque[1] = "Nadadeira cortante";
		ataque[2] = "Onda do mar";
		ataque[3] = "Investida";
		setAtaque(ataque);
	}

}
