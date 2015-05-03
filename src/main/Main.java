package main;

import java.util.Scanner;

import treinador.Treinador;
import Pokemon.Aquatico;
import Pokemon.Fogo;
import Pokemon.Terrestre;

public class Main
{
	static Scanner scanner = new Scanner(System.in);

	static void escolhaDePokemon(Treinador t)
	{
		String nome;
		int tipo;
		System.out
				.println("Digite o tipo de Pokemon:\n1-fogo\n2-aquatico\n3-terrestre: ");
		tipo = scanner.nextInt();

		if (tipo == 1 || tipo == 2 || tipo == 3)
		{
			System.out.println("Digite o nome do seu Pokemon: ");
			nome = scanner.next();
			if (tipo == 1)
				t.addPokemon(new Fogo(nome));
			if (tipo == 2)
				t.addPokemon(new Aquatico(nome));
			if (tipo == 3)
				t.addPokemon(new Terrestre(nome));
		} else
		{
			System.out.println("Informe um número válido");
		}

	}

	static void exibeOpcoes(Treinador t, Treinador t1, Treinador t2)
	{
		int op;
		boolean jogando = true;
		while (jogando)
		{
			if (t.equals(t1))
				System.out.println("(Treinador 1) Opções:");
			else
				System.out.println("(Treinador 2) Opções:");
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
				t.listaPokemon(t.getAtivo());
				break;
			case 4:
				escolheAtivo(t);
				break;
			case 5:

				break;
			case 6:

				break;
			}
		}
		System.out.println();

	}

	private static void escolheAtivo(Treinador t)
	{
		String nome;
		System.out.println("Selecione um pokemon: ");
		t.listarPokemons();
		System.out.print("Nome do ativo: ");
		nome = scanner.next();
		t.ativaPokemon(nome);
	}

	public static void main(String[] args)
	{
		String nome;
		int nPok = Treinador.getnPok();
		System.out.println("Bem vindo ao jogo Pokemon Leste.");
		System.out.println();
		System.out.print("Digite o nome do treinador 1: ");
		nome = scanner.next();
		Treinador t1 = new Treinador(nome);
		System.out.println();
		System.out.print("Digite o nome do treinador 2: ");
		nome = scanner.next();
		Treinador t2 = new Treinador(nome);
		System.out.println();
		System.out.println("Treinador 1");
		for (int i = 0; i < nPok; i++)
		{
			escolhaDePokemon(t1);
		}

		escolheAtivo(t1);
		System.out.println();
		System.out.println("Treinador 2");
		for (int i = 0; i < nPok; i++)
		{
			escolhaDePokemon(t2);
		}

		escolheAtivo(t2);
		System.out.println();
		System.out.println("## --- Inicio da batalha --- ##");
		System.out.println("Treinador 1 começa");
		System.out.println();
		while (!t1.perdeu() && !t2.perdeu())
		{
			exibeOpcoes(t1, t1, t2);

			exibeOpcoes(t2, t1, t2);
		}

		scanner.close();

	}
}
