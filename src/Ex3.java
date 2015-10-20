import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		int[] n = {10,6,4,5,3,2,78,1};
		int x = 0;
		System.out.println("Intruduza um Numero");
		int N = Input.nextInt();
		
		for(int i = 0; i <= n.length; i++){
			if(n[i] == N){
				x = 1;
				break;

			}else{
				x = 2;
			}
		}
		
		if(x == 1)
			System.out.println("O Numero Existe");
		else
			System.out.println("O Numero Não Existe");
	}

}
