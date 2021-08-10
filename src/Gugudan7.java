class GuguCalculate{
	public static int[] calculate(int times) {
		int [] result=new int[9];
		for(int i=0;i<result.length;i++) {
			result[i]=times*(i+1);
		} return result;
	}
	public static void print(int times, int [] res) {
		for(int i=0; i<res.length; i++) {
			System.out.println(times+" X "+(i+1)+" = "+res[i]);
		}
		System.out.println();
	}
	
}


public class Gugudan7 {
	public static void main(String[] args) {
		GuguCalculate gugu=new GuguCalculate();
		for(int j=2;j<10;j++) {
			gugu.print(j, gugu.calculate(j));
		}
	}
}
