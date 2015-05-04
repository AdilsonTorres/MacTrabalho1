package Pokemon;

public class Fogo extends Pokemon
{

	public Fogo(String nome)
	{
		super(nome, "fogo");
		int[] dano = new int[4];
		dano[0] = 35;
		dano[1] = 40;
		dano[2] = 55;
		dano[3] = 25;
		setDano(dano);

		String[] ataque = new String[4];
		ataque[0] = "Bola de fogo";
		ataque[1] = "Cauda flamejante";
		ataque[2] = "Mordida";
		ataque[3] = "Investida";
		setAtaque(ataque);
	}

}
