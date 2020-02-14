package f_oop2;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	
	@Override // 오브젝트에게 상속받음
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}


	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		if(hour < 0){  // 24시가 넘어가면 남은 시간을 돌림
			this.hour = 0;
		}else{
			this.hour = hour % 24;
		}
//		if(hour < 0){
//			this.hour = 0;
//		}else if(23 < hour){
//			this.hour =23;
//			
//		}else{
//		this.hour = hour;
//	}
	}


	public int getMinute() {
		return minute;
	}


	public void setMinute(int minute) {
		if(second < 0){ // 분이 넘어가면 시간으로 넘기면서 남은 분값을 표시
			this.minute = 0;
		}else{
			setHour(this.hour + minute / 60);
			this.minute = minute % 60;
		}
//		if(minute < 0){
//			this.minute = 0;
//		}else if(59 < minute){
//			this.minute = 59;
//		}else{
//			this.minute = minute;
//		}
	}

	public int getSecond() {
		return second;
	}


	public void setSecond(int second) {
		if(second < 0){ // 초가 넘어가면 분으로 넘기고 남은 값을 초로 표시
			this.second = 0;
		}else{
			setMinute(this.minute + second / 60);
			this.second = second%60;
		}
	}
//		if(second < 0){
//			this.second = 0;
//		}else if(59 < second){
//			this.second = 59;
//		}else{
//			this.second = second;
//		}
//	}
	
	

}
