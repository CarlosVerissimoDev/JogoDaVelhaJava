
import java.util.Scanner;

public class JogoDaVelha {

	char[][] posicao = new char[3][3];
	int linha;
	int coluna;
	boolean jogador = true;
	int jogadasDisponiveis;
	
	public JogoDaVelha() {
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				posicao[i][j] = '-';
			}
		}
		jogadasDisponiveis = 0;
	}
	
	public void tabela() {
		System.out.println("************************");
		System.out.println("    _0_____1_____2__");
		for(int i = 0; i<3; i++) {
			System.out.print( i + "  |");
			for(int j = 0; j<3; j++) {
				System.out.print(" " + posicao[i][j] + "  | ");
			}
			System.out.print("\n   |____|_____|_____|\n");
		}
		System.out.println("");
		System.out.println("***********************");
		
		
	}
	
	public void escolherPosicao() {
		Scanner p = new Scanner(System.in);
		try{
			do{
			
				System.out.print("Informe a linha: ");
				linha = p.nextInt();
			}while (linha != 0 && linha != 1 && linha != 2);
			do{
				System.out.print("Informe a Coluna: ");
				coluna = p.nextInt();
			}while (coluna != 0 && coluna != 1 && coluna != 2);
		} catch (final Exception e) {
			limpaTela();
			System.out.println("Voce digitou uma opção invalida! Digite novamente a linha e a coluna.");
			this.jogar();
		}
		
	}
	
	public void jogar() {
		this.tabela();
		jogadorAtual();
		escolherPosicao();
		if(posicao[linha][coluna] == '-') {
			if(jogador == true) {
				posicao[linha][coluna] = 'X';
				jogador = false;
				limpaTela();
			} else {
				posicao[linha][coluna] = 'O';
				jogador = true;
				limpaTela();
			}
		} else {
			limpaTela();
			System.out.println("Essa posicao ja foi marcada! Escolha outra");
			
		}
		this.verificarVencedor();
		
	}

	public void verificarVencedor() {
		
		//PRIMEIRA LINHA
		if(posicao[0][0] == 'X' && posicao[0][1] == 'X' && posicao[0][2] == 'X') {
			tabela();
			System.out.println("O X venceu!");
		} else if(posicao[1][0] == 'X' && posicao[1][1] == 'X' && posicao[1][2] == 'X') {
			//SEGUNDA LINHA
			tabela();
			System.out.println("O X venceu!");
		} else if(posicao[2][0] == 'X' && posicao[2][1] == 'X' && posicao[2][2] == 'X') {
			//TERCEIRA LINHA
			tabela();
			System.out.println("O X venceu!");
		} else if(posicao[0][0] == 'X' && posicao[1][0] == 'X' && posicao[2][0] == 'X') {
			//PRIMERA COLUNA
			tabela();
			System.out.println("O X venceu!");
		} else if(posicao[0][1] == 'X' && posicao[1][1] == 'X' && posicao[2][1] == 'X') {
			//SEGUNDA COLUNA
			tabela();
			System.out.println("O X venceu!");
		} else if(posicao[0][2] == 'X' && posicao[1][2] == 'X' && posicao[2][2] == 'X') {
			//TERCEIRA COLUNA
			tabela();
			System.out.println("O X venceu!");
		} else if(posicao[0][0] == 'X' && posicao[1][1] == 'X' && posicao[2][2] == 'X') {
			//DIAGONAL EQUERDA DIREITA
			tabela();
			System.out.println("O X venceu!");
		} else if(posicao[0][2] == 'X' && posicao[1][1] == 'X' && posicao[2][0] == 'X') {
			//DIAGONAL DIREITA ESQUERDA
			tabela();
			System.out.println("O X venceu!");
		} else if(posicao[0][0] == 'O' && posicao[0][1] == 'O' && posicao[0][2] == 'O') {
			//PRIMEIRA LINHA
			tabela();
			System.out.println("O O venceu!");
		} else if(posicao[1][0] == 'O' && posicao[1][1] == 'O' && posicao[1][2] == 'O') {
			//SEGUNDA LINHA
			tabela();
			System.out.println("O O venceu!");
		} else if(posicao[2][0] == 'O' && posicao[2][1] == 'O' && posicao[2][2] == 'O') {
			//TERCEIRA LINHA
			tabela();
			System.out.println("O O venceu!");
		} else if(posicao[0][0] == 'O' && posicao[1][0] == 'O' && posicao[2][0] == 'O') {
			//PRIMERA COLUNA
			tabela();
			System.out.println("O O venceu!");
		} else if(posicao[0][1] == 'O' && posicao[1][1] == 'O' && posicao[2][1] == 'O') {
			//SEGUNDA COLUNA
			tabela();
			System.out.println("O O venceu!");
		} else if(posicao[0][2] == 'O' && posicao[1][2] == 'O' && posicao[2][2] == 'O') {
			//TERCEIRA COLUNA
			tabela();
			System.out.println("O O venceu!");
		} else if(posicao[0][0] == 'O' && posicao[1][1] == 'O' && posicao[2][2] == 'O') {
			//DIAGONAL EQUERDA DIREITA
			tabela();
			System.out.println("O O venceu!");
		} else if(posicao[0][2] == 'O' && posicao[1][1] == 'O' && posicao[2][0] == 'O') {
			//DIAGONAL DIREITA ESQUERDA
			tabela();
			System.out.println("O O venceu!");	
		} else if(posicao[0][0] != '-' 
				&& posicao[0][1] != '-'
				&& posicao[0][2] != '-'
				&& posicao[1][0] != '-'
				&& posicao[1][1] != '-'
				&& posicao[1][2] != '-'
				&& posicao[2][0] != '-'
				&& posicao[2][1] != '-'
				&& posicao[2][2] != '-') {
			//velha
			tabela();
			System.out.println("Deu velha!");	
		} else {
			this.jogar();
		}
		
		
		
	}
	
	public void jogadorAtual() {
		if(jogador) {
			System.out.println("Vez do jogador X");
		} else {
			System.out.println("Vez do jogador O");
		}
	}
	
	public void verificarVelha() {
		jogadasDisponiveis += 1;
	}
	
	public void limpaTela() {
		for (int i = 0; i < 100; ++i)  
		       System.out.println();  
	}
	
	
	
	
}


