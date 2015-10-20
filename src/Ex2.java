
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {10,6,4,5,3,2,78,1};
		int temp = 0;
	
		for(int i = 0; i < n.length; i++){
			 if(n[i] > n[i+1]){
				temp = n[i];
				n[i] = n[i+1];
				for(i = 0; i < n[temp]; i++){
					if(n[i+1] > temp){
						n[i+1] = temp;
					}
				}
				
				
				

			}
			
}
		for(int x =0; x < n.length; x++){
			System.out.println("Array" + n[x]);
		}

	}

}
