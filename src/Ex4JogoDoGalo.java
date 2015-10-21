import java.util.Scanner;

public class Ex4JogoDoGalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m ;
		int M = 3;
		int N = 3;
		m = new int [M][N];
		Scanner jogador = new Scanner(System.in);

		
		System.out.println("Matriz do Jogo Do Galo");
		
		for(int i = 0;i < M; i++){
			System.out.println("");
			for(int j = 0; j < N; j++){
				System.out.print( m[i][j]);
			}
			
			
		}
		int find = 0;

		do{
			int jogadorA = 1;
			int jogadorB = 2;
			
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println("Introduza a Linha");
			int jogarALinha = jogador.nextInt();
			
			System.out.println("Introduza a Coluna");
			int jogarAColuna = jogador.nextInt();
						
			
		}while( find != 1 );
		
	}
	
	// Conclusão Da Matriz #COMMITED

}
