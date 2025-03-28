import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
		char player = 'X';
		int row, column;
		
		while (true) {
			System.out.println("  0 1 2");
			System.out.println("0 " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
			System.out.println("  -+-+-");
			System.out.println("1 " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
			System.out.println("  -+-+-");
			System.out.println("2 " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
			
			System.out.println();
			System.out.println("Vez do jogador " + player + ".");
			System.out.println("Digite a linha: ");
			row = sc.nextInt();
			System.out.println("Digite a coluna: ");
			column = sc.nextInt();
			
			if ( row < 0 || row > 2 || column < 0 || column > 2 || board[row][column] != ' ') {
				System.out.println("Jogada inválida");
				continue;
			}
			
			board[row][column] = player;
			
			if (board[0][0] == player && board[0][1] == player && board[0][2] == player ||
				board[1][0] == player && board[1][1] == player && board[1][2] == player ||
				board[2][0] == player && board[2][1] == player && board[2][2] == player ||
				board[0][0] == player && board[1][0] == player && board[2][0] == player ||
				board[0][1] == player && board[1][1] == player && board[2][1] == player ||
				board[0][2] == player && board[1][2] == player && board[2][2] == player ||
				board[0][0] == player && board[1][1] == player && board[2][2] == player ||
				board[0][2] == player && board[1][1] == player && board[2][0] == player) {
				System.out.println("Jogador " + player + " venceu!");
				break;
			}
			
			if (board[0][0] != ' ' && board[0][1] != ' ' && board[0][2] != ' ' &&
				board[1][0] != ' ' && board[1][1] != ' ' && board[1][2] != ' ' &&
				board[2][0] != ' ' && board[2][1] != ' ' && board[2][2] != ' ' &&
				board[0][0] != ' ' && board[1][0] != ' ' && board[2][0] != ' ' &&
				board[0][1] != ' ' && board[1][1] != ' ' && board[2][1] != ' ' &&
				board[0][2] != ' ' && board[1][2] != ' ' && board[2][2] != ' ' &&
				board[0][0] != ' ' && board[1][1] != ' ' && board[2][2] != ' ' &&
				board[0][2] != ' ' && board[1][1] != ' ' && board[2][0] != ' ') {
				System.out.println("Deu velha!");
				break;
			}
			
			if (player == 'X') {
				player = 'O';
			}
			else {
				player = 'X';
			}
		}
		
		
		sc.close();

	}
}
