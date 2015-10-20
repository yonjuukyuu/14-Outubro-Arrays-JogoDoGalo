import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		
		int[] n;
		n = new int[3];
		int N = 3;
		
		
		for (int i = 0; i < N; i++){
			System.out.println("Intruduza a sua idade");
			 n[i] = Input.nextInt();
			 int check = n[i] % 2;
			 if (check == 0){
					System.out.println("A sua idade é numero par");
			 }else
			 {
				 System.out.println("A sua idade é numero Impar");
			 }
			}

		int tempIdade= 200;
		int tempIdadeM = 0;
		
		for(int x= 0; x < N; x++){
			
			if (tempIdade>n[x]) {
				tempIdade=n[x];
				
			}
			
				
			
		}
		for(int x= 0; x < N; x++){
			
			if (tempIdade<n[x]) {
				tempIdadeM=n[x];
				
			}
		}
		
		System.out.println("A idade da pessoa mais nova é:"+tempIdade);
		System.out.println("A idade da pessoa mais Velha é:"+ tempIdadeM);
		int diferenca = tempIdadeM - tempIdade;
		System.out.println("A Diferença de idades é:"+ diferenca);

		
	
	
	
	}

}
