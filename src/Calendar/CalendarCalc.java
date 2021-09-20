package Calendar;

import java.util.Calendar;
import java.util.Scanner;

class CalendarCalc{
	private static final int[] MaxDays= {31,28,31,30,31,30,31,31,30,31,30,31};//일반연
	private static final int[] LeapMaxDays= {31,29,31,30,31,30,31,31,30,31,30,31};//윤연
	
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
		System.out.printf("  << %4d년 %3d월 >>\n",year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		
		
		int maxDay=getMaxDaysOfMonth(year, month);
		
		int weekday=getWeekDay(year, month);//weekday=weekNum=요일숫자
		int count=7-weekday;
		
		for(int i=1; i<weekday; i++) {
		System.out.print("   ");//3칸
		}
		for(int i=1; i<=maxDay;i++) {
			System.out.printf("%3d",i);
			if(((weekday-1)+i)%7==0) {
				System.out.println();
			}
		}
		
		/*for(int i=count+1; i<=maxDay;i++) {
			if(count==7) count=0;
			System.out.printf("%3d",i);
			if(i%7==count) {
				System.out.println();
			}
		}*/
		System.out.println();
	}
	
	private int getWeekDay(int year, int month) {//sum:1 ~ sat:7
		Calendar cal=Calendar.getInstance();
		int weekNum;
		cal.set(year,month-1,1);
		weekNum=cal.get(cal.DAY_OF_WEEK);
		
		return weekNum;
	}
}
