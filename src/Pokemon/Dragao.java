package Pokemon;

public class Dragao extends Pokemon
{
	private String ataque1 = "exemplo1";
	private String ataque2 = "exemplo2";
	private String ataque3 = "exemplo3";
	
	private int dano1 = 1;
	private int dano2 = 2;
	private int dano3 = 3;
	
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
