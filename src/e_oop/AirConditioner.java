package e_oop;
import java.util.Scanner;
public class AirConditioner {
	boolean power; // 전원
	int temperature; // 온도
	int airVolume; // 풍향
	
	final int MAX_TEMPERATURE = 30;
	final int MIN_TEMPERATURE = 18;
	
	AirConditioner(){
		power = false;
		temperature = 24;
		airVolume = 1;
	}
	Scanner s = new Scanner(System.in);
	

	
	// 전원버튼
	void power(){
		power = !power; // on/off
		System.out.println("POWER : "  + (power ? "ON" : "OFF"));
	}
	// 온도 + 버튼
	void temperatureUp(){
		if(power && temperature < MAX_TEMPERATURE){
			temperature++;
		}
	}
	// 온도 - 버튼
	void temperatureDown(){
		if(power && MIN_TEMPERATURE < temperature){
			temperature--;
		}
	}
	//풍량 버튼
	void airVolume(){
		if(power){
			if(3 < ++airVolume){ // 누를때마다 1씩 증가 3이 넘으면 다시 1로 돌아간다.
				airVolume = 1; // 1로 돌아간다.
		}
			
		}
	}
	
	//온도가 18~30 까지만 변경할 수 있게 해주시고, 전원을 켰을때만 버튼들이 작동되도록 메소드들을 변경해주세요.
	
	public static void main(String[] args){
		AirConditioner ac = new AirConditioner();
		ac.power();
		System.out.println(ac.power);
		ac.temperatureUp();
		System.out.println(ac.temperature);
		ac.temperatureUp();
		System.out.println(ac.temperature);
		ac.temperatureUp();
		System.out.println(ac.temperature);
		ac.temperatureUp();
		System.out.println(ac.temperature);
		ac.temperatureUp();
		System.out.println(ac.temperature);
		ac.temperatureUp();
		System.out.println(ac.temperature);
		ac.temperatureDown();
		System.out.println(ac.temperature);
		ac.temperatureDown();
		System.out.println(ac.temperature);
		ac.temperatureDown();
		System.out.println(ac.temperature);
		ac.temperatureDown();
		System.out.println(ac.temperature);
		ac.temperatureDown();
		System.out.println(ac.temperature);
		ac.temperatureDown();
		System.out.println(ac.temperature);
		ac.temperatureDown();
		System.out.println(ac.temperature);
		ac.temperatureDown();
		System.out.println(ac.temperature);
		ac.temperatureDown();
		System.out.println(ac.temperature);
		ac.temperatureDown();
		System.out.println(ac.temperature);
		ac.temperatureDown();
		System.out.println(ac.temperature);
		ac.temperatureDown();
		System.out.println(ac.temperature);
		ac.airVolume();
		System.out.println(ac.airVolume);
		ac.airVolume();
		System.out.println(ac.airVolume);
		ac.airVolume();
		System.out.println(ac.airVolume);
	}
	
	
}
