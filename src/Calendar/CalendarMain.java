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
	public void printCalendar(int year, int month, int weekday) {
		System.out.printf("    <<%4d %3d>>\n",year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		
		for(int i=0; i<weekday; i++) {
			System.out.print("   ");//3칸
		}
		int maxDay=getMaxDaysOfMonth(year, month);
		
		int count=7-weekday;
		for(int i=1; i<=count;i++) {
			System.out.printf("%3d",i);
		}
		System.out.println();
		for(int i=count+1; i<=maxDay;i++) {
			if(count==7) count=0;
			System.out.printf("%3d",i);
			if(i%7==count) {
				System.out.println();
			}
		}
		System.out.println();
	}
}

public class CalendarMain{
	
	public int parseDay(String week) {
		if(week.equals("SU")) return 0;
		else if(week.equals("Mo")) return 1;
		else if(week.equals("TU")) return 2;
		else if(week.equals("WE")) return 3;
		else if(week.equals("TH")) return 4;
		else if(week.equals("FR")) return 5;
		else if(week.equals("SA")) return 6;
		else return 0;
	}

	public void runPrompt() {
		Scanner sc=new Scanner(System.in);
		Calendar cal=new Calendar();
		
		int month=-1;
		int year=-1;
		int weekday=0;
		while(true) {
			System.out.print("연도를 입력하세요\nYear>>");
			year=sc.nextInt();
			System.out.print("달을 입력하세요\nMonth>>");
			month=sc.nextInt();
			System.out.print("첫날의 요일을 입력하세요\n>>");
			String nameOfWeek=sc.next();
			weekday=parseDay(nameOfWeek);
			if(month==-1){
				break;
			}
			
			if(month>12) {
				continue;
			}
			cal.printCalendar(year, month, weekday);
		}
		System.out.println("Bye");
		sc.close();
	}
	
	public static void main(String[] args) {
		CalendarMain c=new CalendarMain();
		c.runPrompt();
		
	}
}
