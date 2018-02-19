import java.util.Scanner;
public class BeanMachine{
	
	public static void main(String[]args){
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("Enter the number of balls to drop:");
		int balls=keyboard.nextInt();
		
		System.out.println("Enter the number of slots in the bean machine:");
		int separators=keyboard.nextInt()-1;
		
		String[] paths=new String[balls*separators];
		int[] finalplace=new int[separators+1];

		int Rs=0;
		for(int i=0; i<paths.length;i++){
			
			if((int)(Math.random()*2)==0){
				paths[i]="R";
			}
			else{
				paths[i]="L";
			}
			
			if(i%separators==0){
				System.out.println();
			}
			System.out.print(paths[i]);
		
			if(paths[i]=="R"){
				Rs++;
			}
			
			if((i+1)%separators==0){
				finalplace[Rs]++;
				Rs=0;
			}	
		}
		
		System.out.println();
		System.out.println();
		for(int n=0; n<=separators; n++){
			System.out.println((n+1)+": "+finalplace[n]+".");
		}
		
		print(finalplace);
	
	}

	public static void print(int[] list) {
		int max = max(list);

		while (max > 0) {
			System.out.println();
			for (int i = 0; i < list.length; i++) {
				if (list[i] >= max) {
					System.out.print("O");
				}
				else
					System.out.print(" ");
			}
			max--;
		}
		System.out.println();
	}

	public static int max(int[] list) {
		int max = list[0];

		for (int i = 1; i < list.length; i++) {
			if (list[i] > max)
				max = list[i];
		}
		return max;
	}
}
