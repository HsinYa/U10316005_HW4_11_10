import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//Create a object
		NewMyStack stack = new NewMyStack();
	
		//User enters five strings and invokes method
		for(int i=0 ; i<5 ; i++){
			System.out.print("Please enter " + (i+1) + " string: ");
			stack.push(input.next());
		}
		
	

	}
}
