import java.util.Scanner;

class GugudanCalculate{
	int result[][]=new int[19][19];
	
	public void calculate() {		
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result.length;j++) {
				result[i][j]=(i+1)*(j+1);
			}
		}
	}
	public void printing(int dan) {
		for(int i=0;i<dan;i++) {
			System.out.println("\n   "+(i+1)+"단");
			for(int j=0;j<result.length;j++) {
				System.out.println((i+1)+" X "+(j+1)+" = "+result[i][j]);
			}
		}
	}
	public void printing2(String st) {		
		int pos=st.indexOf(',');
		
		int line=Integer.parseInt(st.substring(0,pos));
		int low=Integer.parseInt(st.substring(pos+1));
		
		for(int i=0;i<line;i++) {
			System.out.println("\n   "+(i+1)+"단");
			for(int j=0;j<result.length;j++) {
				System.out.println((i+1)+" X "+(j+1)+" = "+result[i][j]);
				if(result[i][j]==line*low) {break;}
				
			}
		}
	}
}

public class Gugudan8 {

	public static void main(String[] args) {
		GugudanCalculate gugudan=new GugudanCalculate();
		Scanner sc=new Scanner(System.in);
		
		gugudan.calculate();
		
		System.out.print("출력할 단을 숫자로 입력: ");
		int dan1=sc.nextInt();
		gugudan.printing(dan1);
		
		Scanner scan=new Scanner(System.in);
		System.out.print("출력할 단을 입력: ");
		String dan2=scan.next();
		gugudan.printing2(dan2);		
	}
}
