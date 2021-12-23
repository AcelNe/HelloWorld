
public class TestingIntegerSubstring {

	public static void main(String[] args) {
		String test="012,4567";
		int t=test.indexOf(',');
		System.out.println(",의 위치: "+t);
		String num1=test.substring(0,t);
		System.out.println("integer-substring 0~t까지: "+num1);
		String num2=test.substring(t+1);
		System.out.println("integer-substring t~까지: "+num2);
		
		int num11=Integer.parseInt(num1);
		System.out.println("1번 변환값: "+num11);
		int num22=Integer.parseInt(num2);
		System.out.println("2번 변환값: "+num22);
		
		int try1=Integer.parseInt(test.substring(5));
		System.out.println("시도 Integer+substring 결과값: "+try1);				

		//헬로월드
	}

}
