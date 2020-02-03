package c_statment;

import java.util.Scanner;
public class SimLiTest {

	public static void main(String[] args) {
		String a = null;
		Scanner s = new Scanner(System.in);
		System.out.println("나는 금사빠다. * 금방 사랑에 빠진다.");
		a = s.nextLine();
		if (a.equals("y")) {
			System.out.println("연애할 때 끌려다니는 타입이다.");
			a = s.nextLine();
			if (a.equals("y")) {
				System.out.println("감정 표현에 솔직한 편이다.");
				a = s.nextLine();
			} else if (a.equals("n")) {
				System.out.println("데이트 코스는 미리 짜두는 것이 편하다.");
				a = s.nextLine();
				if (a.equals("y")) {
					System.out.println("활동적인 데이트가 좋다.");
					a = s.nextLine();
				} else if (a.equals("n")) {
					System.out.println("아무것도 아닌 일에 섭섭함이 쌓인다.");
					a = s.nextLine();
				}
			}
			if (a.equals("y")) {
				System.out.println("이성친구는 존재할 수 없다.");
				a = s.nextLine();
			} else if (a.equals("n")) {
				System.out.println("활동적인 데이트가 좋다.");
				a = s.nextLine();
			}
			if (a.equals("y")) {
				System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
				a = s.nextLine();
				if (a.equals("y")) {
					System.out.println("무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입");
				} else if (a.equals("n")) {
					System.out.println("구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
				}
			}
		} else if (a.equals("n")) {
			System.out.println("감정 기복이 크지 않다.");
			a = s.nextLine();
		}
		
	}
}
		
		/*if(a.equals("y")){
			System.out.println("연애할 때 끌려다니는 타입이다.");
			a = s.nextLine();
			if(a.equals("y")){
				System.out.println("감정 표현에 솔직한 편이다.");
				a = s.nextLine();
				
				if(a.equals("y")){
					System.out.println("이성친구는 존재할 수 없다.");
					a = s.nextLine();
					if(a.equals("y")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						a = s.nextLine();
						if(a.equals("y")){
							System.out.println("무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입");
							else if(a.equals("n")){
								System.out.println("이것은 의리인가 사랑인가... 친구같이  편안한 연애를 하는 타입")}
						}
					}
				else if(a.equals("n")){
					System.out.println("활동적인 데이트가 좋다.");
					a = s.nextLine();
				if(a.equals("y")){
					System.out.println("이성친구는 존재할 수 없다.");
				}else if(a.equals("n")){
					System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
				}
				a = s.nextLine();
				if(a.equals("y")){
					System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");}
				else if(a.equals("n")){
					System.out.println("구속을 하는 것도 받는 것도 싫은 자유로운 연애를 하는 타입!");
					a = s.nextLine();
				if(a.equals("y")){
					System.out.println("무조건 잘해주고 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
				}else if(a.equals("n")){
					System.out.println("이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
				}
				}
				}
			}
			else if(a.equals("n")){
				System.out.println("데이트 코스는 미리 짜는게 편하다.");
				a = s.nextLine();
				if(a.equals("y")){
					System.out.println("활동적인 데이트가 좋다.");
					if(a.equals("y")){
						System.out.println("이성친구는 존재할 수 없다.");
						}
					}
					else if(a.equals("n")){
						System.out.println("감정 표현에 솔직한 편이다.");
						a = s.nextLine();
						if(a.equals("y")){
							System.out.println("이성친구는 존재할 수 없다.");}
						else if(a.equals("n")){
							System.out.println("활동적인 데이트가 좋다.");
							a = s.nextLine();
							if(a.equals("y")){
								System.out.println("이성친구는 존재할 수 없다.");}
								else if(a.equals("n")){
									System.out.println("아무것도 아닌 일에 섭섭함이 쌓인다.");
									a = s.nextLine();
									if(a.equals("y")){
										System.out.println("무조건 잘해주고 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
									}else if(a.equals("n")){
										System.out.println("이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
									}
								}
						}
					}
			}
		}
		}
	}*/


