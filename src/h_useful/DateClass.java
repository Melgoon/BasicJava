package h_useful;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date today = new Date(); // 날짜를 표현하는 클래스,현재 날짜가 저장
		System.out.println(today);
		
		//날짜 -> 포멧 -> 문자열
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.sss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yy-MM-dd hh:mm:ss a");
		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		
		//문자열 -> 포멧 -> 날짜
		String str = "2020년 2월 20일";
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		try {
			Date dateStr = sdf5.parse(str);
			System.out.println(sdf3.format(dateStr));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//날짜
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(new Date());
		cal.set(2020, 1, 19); //2020/02/19(월은 0부터 시작)
		System.out.println(sdf3.format(cal.getTime()));
		
		//날짜 계산
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.MONTH, 2);
		cal.add(Calendar.DAY_OF_MONTH, -3);
		cal.add(Calendar.HOUR, 2);
		cal.add(Calendar.MINUTE, 5);
		cal.add(Calendar.SECOND, -10);
		
		System.out.println(sdf3.format(cal.getTime()));
	}

}
