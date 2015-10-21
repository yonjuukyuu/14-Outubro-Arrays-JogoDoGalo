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
		if (find!=1)
		do{
			
			  	int jogadorA = 1;
				int jogadorB = 2;
				int	jogadorVencedor;
				
				int validarPosiçao = 0;
				int jogadorAJogar = jogadorA;
//jogador A--------------				
				do	{
					System.out.println(" ");
					System.out.println("Jogador A");
					System.out.println(" ");
					System.out.println("Introduza a Linha");
					int jogarALinha = jogador.nextInt();
					
					System.out.println("Introduza a Coluna");
					int jogarAColuna = jogador.nextInt();
					
					
					//for(int i = 0;i < M; i++){
						//for(int j = 0; j < N; j++){
						    // System.out.print( m[i][j]);
							
							if(m[jogarALinha][jogarAColuna] == jogadorA || m[jogarALinha][jogarAColuna] == jogadorB){
								validarPosiçao = 0;
								
							}else{
								validarPosiçao = 1;
								m[jogarALinha][jogarAColuna]  = jogadorA;
								
							//}
					//	}
						
						
					}
					
					if(m[0][0] == jogadorA && m[0][1] == jogadorA && m[0][2] == jogadorA ){
						find = 1;
						jogadorVencedor = jogadorA;
					}else if(m[1][0] == jogadorA && m[1][1] == jogadorA && m[1][2] == jogadorA ){
						find = 1;
						jogadorVencedor = jogadorA;
					}
					else if(m[2][0] == jogadorA && m[2][1] == jogadorA && m[2][2] == jogadorA ){
						find = 1;
						jogadorVencedor = jogadorA;
					}else if(m[0][0] == jogadorA && m[1][0] == jogadorA && m[2][0] == jogadorA ){
						find = 1;
						jogadorVencedor = jogadorA;
					}
					else if(m[0][1] == jogadorA && m[1][1] == jogadorA && m[2][1] == jogadorA ){
						find = 1;
						jogadorVencedor = jogadorA;
					}else if(m[0][2] == jogadorA && m[1][2] == jogadorA && m[2][2] == jogadorA ){
						find = 1;
						jogadorVencedor = jogadorA;
					}else if(m[0][0] == jogadorA && m[1][1] == jogadorA && m[2][2] == jogadorA ){
						find = 1;
						jogadorVencedor = jogadorA;
					}
					else if(m[0][2] == jogadorA && m[1][1] == jogadorA && m[2][0] == jogadorA ){
						find = 1;
						jogadorVencedor = jogadorA;
					}
					
					
					
					
				}while(validarPosiçao != 1);// && jogadorAJogar != jogadorA);
				
				System.out.println("Matriz do Jogo Do Galo");
				
				for(int i = 0;i < M; i++){
					System.out.println("");
					for(int j = 0; j < N; j++){
						System.out.print( m[i][j]);
					}
					
					
				}
System.out.println("AAAA"+find);
				
//jogador B--------------				
				jogadorAJogar = jogadorB;
				validarPosiçao = 0;
				
				if (find!=1)
				do	{
					System.out.println(" ");
					System.out.println("Jogador B");
					System.out.println(" ");
					System.out.println("Introduza a Linha");
					int jogarBLinha = jogador.nextInt();
					
					System.out.println("Introduza a Coluna");
					int jogarBColuna = jogador.nextInt();
					
					
					//for(int i = 0;i < M; i++){
					//	for(int j = 0; j < N; j++){
						    // System.out.print( m[i][j]);
							
							if(m[jogarBLinha][jogarBColuna] == jogadorA || m[jogarBLinha][jogarBColuna] == jogadorB){
								validarPosiçao = 0;
								
							}else{
								validarPosiçao = 1;
								m[jogarBLinha][jogarBColuna]  = jogadorB;
								
						//	}
					//	}
						
						
					}
							
					if(m[0][0] == jogadorB && m[0][1] == jogadorB && m[0][2] == jogadorB ){
						find = 1;
						jogadorVencedor = jogadorB;
					}else if(m[1][0] == jogadorB && m[1][1] == jogadorB && m[1][2] == jogadorB ){
						find = 1;
						jogadorVencedor = jogadorB;
					}
					else if(m[2][0] == jogadorB && m[2][1] == jogadorB && m[2][2] == jogadorB ){
						find = 1;
						jogadorVencedor = jogadorB;
					}else if(m[0][0] == jogadorB && m[1][0] == jogadorB && m[2][0] == jogadorB ){
						find = 1;
						jogadorVencedor = jogadorB;
					}
					else if(m[0][1] == jogadorB && m[1][1] == jogadorB && m[2][1] == jogadorB ){
						find = 1;
						jogadorVencedor = jogadorA;
					}else if(m[0][2] == jogadorB && m[1][2] == jogadorB && m[2][2] == jogadorB ){
						find = 1;
						jogadorVencedor = jogadorB;
					}else if(m[0][0] == jogadorB && m[1][1] == jogadorB && m[2][2] == jogadorB){
						find = 1;
						jogadorVencedor = jogadorB;
					}
					else if(m[0][2] == jogadorB && m[1][1] == jogadorB && m[2][0] == jogadorB ){
						find = 1;
						jogadorVencedor = jogadorB;
					}
					
				}while(validarPosiçao != 1);// && jogadorAJogar == jogadorB);
				jogadorAJogar = jogadorA;

				
				
				System.out.println("Matriz do Jogo Do Galo");
				
				for(int i = 0;i < M; i++){
					
					System.out.println("");
					for(int j = 0; j < N; j++){
						System.out.print( m[i][j]);
					}

System.out.println("BBBB"+find);
					
					
				}
			
			}while( find != 1 );
		
		System.out.println("Jogo Do Galo END " );

	}
	

}
