package Pokemon;

public class Terrestre extends Pokemon
{

	public Terrestre(String nome)
	{
		super(nome, "terrestre");
		int[] dano = new int[4];
		dano[0] = 20;
		dano[1] = 15;
		dano[2] = 10;
		dano[3] = 25;
		setDano(dano);

		int[] prioridade = new int[4];
		prioridade[0] = 4;
		prioridade[1] = 3;
		prioridade[2] = 2;
		prioridade[3] = 1;

		String[] ataque = new String[4];
		ataque[0] = "Mordida";
		ataque[1] = "Arranhao";
		ataque[2] = "Soco";
		ataque[3] = "Investida";
		setAtaque(ataque);
	}

}
