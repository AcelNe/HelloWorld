
public class Gugudan5 {
	public static void main(String[] args) {
		//2단
		System.out.println("구구단 2단 배열 출력");
		int[] result=new int[9];
		for(int i=0;i<result.length;i++) {
			result[i]=2*(i+1);
			System.out.println("2 X "+(i+1)+" = "+result[i]);			
		}
		System.out.println("\n구구단 1~9단 배열 출력");
		int gugudan[][]=new int[9][9];
		for(int i=0;i<gugudan.length;i++) {
			System.out.println("\n"+(i+1)+"단");
			for(int j=0;j<gugudan.length;j++) {
				gugudan[i][j]=(i+1)*(j+1);
				System.out.println((i+1)+" X "+(j+1)+" = "+gugudan[i][j]);
			}
		}
	}
}
