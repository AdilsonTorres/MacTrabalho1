package Pokemon;

public class Gato extends Pokemon
{
	private String ataque1 = "Mordida";
	private String ataque2 = "Arranhao";
	private String ataque3 = "Soco";
	
	private int dano1 = 20;
	private int dano2 = 15;
	private int dano3 = 10;
	
	Gato(String nome, String tipo) 
	{
		super(nome, tipo);
	}
	
	void ExibeAtaques()
	{
		System.out.println("(1) " +ataque1+ ", com dano de " +dano1+ "hp.");
		System.out.println("(2) " +ataque2+ ", com dano de " +dano2+ "hp.");
		System.out.println("(3) " +ataque3+ ", com dano de " +dano3+ "hp.");
	}
}
