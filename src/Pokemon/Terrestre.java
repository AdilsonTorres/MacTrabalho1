package Pokemon;

public class Terrestre extends Pokemon
{
	// private String ataque1 = "Mordida";
	// private String ataque2 = "Arranhao";
	// private String ataque3 = "Soco";

	// private int dano1 = 20;
	// private int dano2 = 15;
	// private int dano3 = 10;

	public Terrestre(String nome)
	{
		super(nome, "terrestre");
		int[] dano = new int[4];
		dano[0] = 20;
		dano[1] = 15;
		dano[2] = 10;
		dano[3] = 25;
		setDano(dano);

		String[] ataque = new String[4];
		ataque[0] = "Mordida";
		ataque[1] = "Arranhao";
		ataque[2] = "Soco";
		ataque[3] = "Investida";
		setAtaque(ataque);
	}
	/*
	 * public void exibeAtaques() { System.out.println("(1) " + ataque1 +
	 * ", com dano de " + dano1 + "hp."); System.out.println("(2) " + ataque2 +
	 * ", com dano de " + dano2 + "hp."); System.out.println("(3) " + ataque3 +
	 * ", com dano de " + dano3 + "hp."); }
	 */
}
