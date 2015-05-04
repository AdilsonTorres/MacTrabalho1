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
				.println("1-fogo;\n2-aquatico;\n3-terrestre.\nDigite o tipo de Pokemon: ");
		tipo = scanner.nextInt();

		if (tipo == 1 || tipo == 2 || tipo == 3)
		{
			System.out.println("Digite o nome do seu Pokemon: ");
			nome = scanner.next();
			if (tipo == 1) t.addPokemon(new Fogo(nome));
			if (tipo == 2) t.addPokemon(new Aquatico(nome));
			if (tipo == 3) t.addPokemon(new Terrestre(nome));
		} else
		{
			System.out.println("Informe um número válido");
		}

	}

	static int exibeOpcoes(Treinador t, Treinador t1, Treinador t2)
	{
		int op, op2 = 0;
		boolean jogando = true;
		while (jogando)
		{
			if (t.equals(t1)) System.out.println("(Treinador 1) Opções:");
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
				System.out.println("Escolher ataque:");
				t.getAtivo().exibeAtaques();
				System.out.println("0 - Voltar");
				op2 = scanner.nextInt();
				if (op2 != 0) jogando = false;
				break;
			case 3:
				t.listaPokemon(t.getAtivo());
				break;
			case 4:
				escolheAtivo(t);
				jogando = false;
				break;
			case 5:
				t.getAtivo().curar();

				System.out.println("Treinador " + t.getNome()
						+ " curou seu pokemon.");
				jogando = false;
				break;
			case 6:
				System.out.println("Treinador " + t.getNome() + " desistiu.");
				op2 = -1;
				jogando = false;
				break;
			}
			System.out.println();
		}
		return op2;
	}

	static void escolheAtivo(Treinador t)
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
		int opt1 = 0;
		int opt2 = 0;
		while (!t1.perdeu() && !t2.perdeu())
		{
			opt1 = exibeOpcoes(t1, t1, t2);
			if (opt1 < 0) break;

			opt2 = exibeOpcoes(t2, t1, t2);
			if (opt2 < 0) break;

			if (opt1 > 0 && opt2 > 0)
			{
				if ((t1.getAtivo()).getPrioridade(opt1 - 1) >= (t2.getAtivo())
						.getPrioridade(opt2 - 1))
				{
					t2.getAtivo().recebeAtaque(t1.getAtivo().getDano(opt1 - 1));
					t1.getAtivo().recebeAtaque(t2.getAtivo().getDano(opt2 - 1));

				} else
				{
					t1.getAtivo().recebeAtaque(t2.getAtivo().getDano(opt2 - 1));
					t2.getAtivo().recebeAtaque(t1.getAtivo().getDano(opt1 - 1));

				}
			} else if (opt1 > 0 && opt2 == 0)
			{
				t2.getAtivo().recebeAtaque(t1.getAtivo().getDano(opt1 - 1));
			} else if (opt1 == 0 && opt2 > 0)
			{
				t1.getAtivo().recebeAtaque(t2.getAtivo().getDano(opt2 - 1));
			}

			System.out.println("Informações após a rodada: ");
			System.out.print("Treinador 1: ");
			t1.listaPokemon(t1.getAtivo());
			System.out.print("Treinador 2: ");
			t2.listaPokemon(t2.getAtivo());
			System.out.println();
			while (t1.getAtivo().getHp() == 0)
			{
				System.out.println("Treinador 1");
				System.out.println("Pokemon " + (t1.getAtivo()).getNome()
						+ " morreu, escolha outro.");
				Main.escolheAtivo(t1);
			}
			while (t2.getAtivo().getHp() == 0)
			{
				System.out.println("Treinador 2");
				System.out.println("Pokemon " + (t2.getAtivo()).getNome()
						+ " morreu, escolha outro.");
				Main.escolheAtivo(t2);
			}
		}
		System.out.println();
		if (t1.perdeu() || opt1 < 0) System.out.println("Treinado 2 ganhou!");
		else
			System.out.println("Treinado 1 ganhou!");
		System.out.println("## --- Fim da batalha --- ##");
		scanner.close();

	}
}
