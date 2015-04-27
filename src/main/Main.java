package main;
import java.util.Scanner;

import Pokemon.Aquatico;
import Pokemon.Fogo;
import Pokemon.Terrestre;
import treinador.Treinador;

public class Main 
{
	static Scanner scanner = new Scanner(System.in);
	
	static void escolhaDePokemon(Treinador t)
	{
		String  nome;
		int tipo;
		System.out.println("Digite o tipo de Pokemon:\n1-fogo\n2-aquatico\n3-terrestre: ");
		tipo = scanner.nextInt();
		
		if (tipo == 1)
		{
			System.out.println("Digite o nome do seu Pokemon: ");
			nome = scanner.next();
			t.addPokemon(new Fogo(nome));
		}
		
		if (tipo == 3)
		{
			System.out.println("Digite o nome do seu Pokemon: ");
			nome = scanner.next();
			t.addPokemon(new Terrestre(nome));
		}
		
		if (tipo == 2)
		{
			System.out.println("Digite o nome do seu Pokemon: ");
			nome = scanner.next();
			t.addPokemon(new Aquatico(nome));
		}
		
	}
	
	static void exibeOpcoes(Treinador t)
	{
		int op;
		System.out.println("Opções:");
		System.out.println("1 - Listar pokemons ");
		System.out.println("2 - Atacar");
		System.out.println("3 - Ver pokemon atual");
		System.out.println("4 - Mudar pokemon atual");
		System.out.println("5 - Usar poção");
		System.out.println("6 - Desistir");
		op = scanner.nextInt();
		switch (op)
		{
		case 1:
			t.listarPokemons();
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		}
		
	}
	
	private static void escolheAtivo(Treinador t1) 
	{
		String nome;
		System.out.println("Selecione um pokemon: ");
		t1.listarPokemons();
		System.out.println("Nome: ");
		nome = scanner.next();
		t1.ativaPokemon(nome);
	}
	
	
	public static void main(String[] args) 
	{
		String nome;		
		System.out.println("Bem vindo ao jogo Pokemon Leste.");
		System.out.println("Digite o nome do treinador 1: ");
		nome = scanner.next();
		Treinador t1 = new Treinador(nome);
		System.out.println("Digite o nome do treinador 2: ");
		nome = scanner.next();
		Treinador t2 = new Treinador(nome);
		System.out.println("Treinador 1");
		for (int i = 0; i < 3; i++)
		{
			escolhaDePokemon(t1);
		}
		
		escolheAtivo(t1);
		
		System.out.println("Treinador 2");
		for (int i = 0; i < 3; i++)
		{
			escolhaDePokemon(t2);
		}	
		
		escolheAtivo(t2);
		
		System.out.println("Inicio da batalha");
		System.out.println("Treinador 1 começa");
		
		while (!t1.perdeu() && !t2.perdeu())
		{
			
		}
		
		
		scanner.close();
		
	}


	
		
}
