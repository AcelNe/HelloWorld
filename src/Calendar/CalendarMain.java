package Calendar;

import java.util.Scanner;

class Calendar{
	private static final int[] MaxDays= {31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[] LeapMaxDays= {31,29,31,30,31,30,31,31,30,31,30,31};
	
	public boolean isLeapYear(int year) {
		if(year%4==0 && year%100!=0 || year%400==0) return true;
		return false;		
	}
	
	public int getMaxDaysOfMonth(int year, int month) {
		if(isLeapYear(year)){
			return LeapMaxDays[month-1];
		}
		return MaxDays[month-1];
	}
	public void printCalendar(int year, int month) {
		System.out.printf("    <<%4d %3d>>\n",year, month);
		System.out.println("SU MO TU WE TH FR SA");
		System.out.println("--------------------");
		
		int maxDay=getMaxDaysOfMonth(year, month);
		for(int i=1; i<=maxDay;i++) {
			System.out.printf("%3d",i);
			if(i%7==0) {
				System.out.println();
			}
		}
		System.out.println("\n");
	}
}

public class CalendarMain{	

	public void runPrompt() {
		Scanner sc=new Scanner(System.in);
		Calendar cal=new Calendar();
		
		int month=-1;
		int year=-1;
		while(true) {
			System.out.print("연도를 입력하세요\nYear>>");
			year=sc.nextInt();
			System.out.print("달을 입력하세요\nMonth>>");
			month=sc.nextInt();
			if(month==-1){
				break;
			}
			
			if(month>12) {
				continue;
			}
			cal.printCalendar(year, month);
		}
		System.out.println("Bye");
		sc.close();
	}
	
	public static void main(String[] args) {
		CalendarMain c=new CalendarMain();
		c.runPrompt();
		
	}
}
