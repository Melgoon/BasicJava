package e_oop;

public class TV {

	//TV와 최대한 비슷하게 TV클래스를 만들어주세요.
	
	boolean power; // 전원
	int TVVolume; // 음향
	int chanel; //  채널
	boolean Mute;
	
	final int MAX_chanel = 100;
	final int MIN_chanel = 1;
	
	final int MAX_Volume = 40;
	final int MIN_Volume = 0;
	
	
	
	TV(){
		power = false;
		TVVolume = 7;
		chanel = 7;
		Mute = false;
	}
	
	void power(){
		power = !power; // on/off
		System.out.println("POWER : "  + (power ? "ON" : "OFF"));
	}
	
	void TVVolumeUp(){
		if(power && TVVolume < MAX_Volume){
			TVVolume++;
		}
	}
	void TVVolumeDown(){
		if(power &&  MIN_Volume < TVVolume){
			TVVolume--;
		}
	}
	void chanelUp(){
		if(power && TVVolume < MAX_chanel){
			chanel++;
		}
	}
	void chaneDown(){
		if(power &&  MIN_chanel < TVVolume){
			chanel--;
		}
	}
	void Mute(){
		Mute = !Mute; // on/off
		System.out.println("Mute : "  + (Mute ? "ON" : "OFF"));
	}
	
	public static void main(String[] args){
		TV tv = new TV();
		tv.power();
		System.out.println(tv.power);
		tv.TVVolumeUp();
		System.out.println(tv.TVVolume);
		tv.TVVolumeDown();
		
		tv.chanelUp();
		
		tv.chaneDown();
		
		tv.Mute();
		System.out.println(tv.Mute);
		
		
	}
	
	
	
}
