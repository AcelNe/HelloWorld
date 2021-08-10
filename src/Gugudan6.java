
public class Gugudan6 {
	public static int[] calculate(int times) {
		int[] result=new int[9];
		
		for(int i=0; i<result.length;i++) {
			result[i]=times*(i+1);
		} return result;
	}
	
	public static void print(int[] result) {
		for(int i=0;i<result.length;i++) {
			System.out.println("   X "+i+" = "+result[i]);
		}
	}
	
	public static void forCal(int a) {
		int [] res=new int[9];
		System.out.println("\n   "+a+"단");
		for(int i=0;i<res.length;i++) {
			res[i]=a*(i+1);//calculate
			System.out.println(a+" X "+(i+1)+" = "+res[i]);//print
		}
	}
	
	public static void main(String[] args) {
		for(int j=2;j<10;j++) {
			System.out.println(j+"단");
			print(calculate(j));//출력(계산)
			System.out.println();
		}
		System.out.println("===============");
		
		for(int j=2;j<10;j++) {
			forCal(j);
		}
	}
}
