import java.util.Scanner;

public class Gugudan2 {
	public static void main(String[] args) {
				
		System.out.println("출력할 구구단은?");
		Scanner scanner=new Scanner(System.in);
		int dan=scanner.nextInt();
		
		System.out.println(dan+"단");
		int result= dan*1;
		System.out.println(dan+" X 1 = "+result);
		result=dan*2;
		System.out.println(dan+" X 2 = "+result);
		
	}
}
