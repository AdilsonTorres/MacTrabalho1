package Pokemon;

public class Dragao extends Pokemon
{
	private String ataque1 = "Bola de fogo";
	private String ataque2 = "Cauda cortante";
	private String ataque3 = "Mordida";
	
	private int dano1 = 35;
	private int dano2 = 40;
	private int dano3 = 55;
	
	Dragao(String nome, String tipo) 
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
