import java.util.Scanner;

public class Gugudan4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("출력할 구구단은?");
		int number=scanner.nextInt();
		
		if(number<2||number>9) {
			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다");
		}else {
			for(int i=1;i<10;i++) {
				System.out.println(number+"단");
				System.out.println(number+" X "+i+" = "+number*i);
			}
		}
	}
}
