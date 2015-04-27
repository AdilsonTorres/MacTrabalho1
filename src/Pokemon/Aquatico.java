package Pokemon;

public class Aquatico extends Pokemon
{
	private String ataque1 = "Jato de agua";
	private String ataque2 = "Nadadeira cortante";
	private String ataque3 = "Onda do mar";
	
	private int dano1 = 10;
	private int dano2 = 25;
	private int dano3 = 40;
	
	public Aquatico(String nome) 
	{
		super(nome, "aquatico");
	}
	
	public void exibeAtaques()
	{
		System.out.println("(1) " +ataque1+ ", com dano de " +dano1+ "hp.");
		System.out.println("(2) " +ataque2+ ", com dano de " +dano2+ "hp.");
		System.out.println("(3) " +ataque3+ ", com dano de " +dano3+ "hp.");
	}
}
