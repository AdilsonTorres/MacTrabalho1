package Pokemon;

public class Pokemon 
{
	private String nome;
	private String tipo;
	private int hp = 100;
	
	Pokemon(String nome, String tipo)
	{
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public int getHp()
	{
		return hp;
	}
	
	public void recebeAtaque(int dano)
	{
		if (hp - dano >= 0) hp -= dano;
		else                hp = 0;
	}
	public void exibeAtaques()
	{
		
	}
	
}