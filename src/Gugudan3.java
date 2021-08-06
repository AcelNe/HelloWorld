import java.util.Scanner;

public class Gugudan3 {
	public static void main(String[] args) {
		int i=1; int result;
		Scanner scanner=new Scanner(System.in);
		System.out.println("while문으로 출력할 구구단은?");
		int j=scanner.nextInt();
		System.out.println(j+"단");
		while(i<10) {
			result=j*i;
			System.out.println(j+" X "+i+" = "+result);
			i++;
		}
		System.out.println();
		System.out.println("for문으로 출력할 구구단은?");
		j=scanner.nextInt();
		for(int a=1;a<10;a++) {
			result=j*a;
			System.out.println(j+" X "+a+" = "+result);
		}
	}
}
