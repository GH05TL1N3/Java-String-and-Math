import java.util.Scanner;
class FunMath {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		double num1, num2, sum;
		int num1x, num2x, user_input, g=0, b=0;
		System.out.println("======================");
		System.out.println("=== ADD RANDOM NUMBER==");
		System.out.println("======================");
		System.out.println("<< Please fill valid answer >>  \n");
		System.out.println("<< Type '00' in answer field for exit program >>\n");
		for(int i = 1; i !=0;i++){
						num1 =  Math.random() * 100;
						num2 =  Math.random() * 100;
						num1x = (int) num1;
						num2x = (int) num2;
						sum = num1x + num2x;
						System.out.print("["+i+"]" +"  "+num1x + " + " + num2x + " = ");
						user_input = sc.nextInt();
						if(user_input == 00){
							System.out.println("\n\nGood : " + g);
							System.out.println("\nBad : " + b);
							System.out.println("\nBye Bye Have a nice day... :) \n");
							System.exit(0);
						}
						if(user_input == sum){
							System.out.println("Good Job. :)\n");
							g = g+1;
						}else{
							System.out.println("Bad Job. :(\n");
							b = b +1;
						}
						

			}
	}
}
