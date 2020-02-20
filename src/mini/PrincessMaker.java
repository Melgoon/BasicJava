package mini;

import java.util.Random;

public class PrincessMaker {

}

class Princess{
	String name;
	int strength = 1; // 근력
	int intellect = 1; // 지력
	int grace = 1; // 기품
	int charm = 1; // 매력
	int ethicality = 1; // 도덕성
	int appraisal = strength + intellect + grace + charm + ethicality;//평가
	
	void info(){ 
		System.out.println("-------------------------------");
		System.out.println( "이름 : " + name );
		System.out.println("근력 : " + strength);
		System.out.println("지력  : " + intellect);
		System.out.println("기품  : " + grace);
		System.out.println("매력  : " + charm);
		System.out.println("도덕성  : " + ethicality);
		System.out.println(" 현금 : " + money);
		System.out.println("평가  : " + appraisal);
		System.out.println("-------------------------------");
	}
	
	int money = 100000;
	
	void logging(){
		Random random = new Random(); 
		Boolean [] logging = new Boolean[4];
		 for(int i=0; i<logging.length; i++) {
		        logging[i] = random.nextBoolean();
		         
		        if(logging[i]) {
		            System.out.println("나무 장작 패는 중......");              
		}
		else System.out.println("헛 도끼질 하는 중.....");
		}
				if(logging[0]){
					System.out.println("공주님이 도망갔습니다.");
					money -= 1000;
					strength += 1;
				}else if(logging[1]){
					System.out.println("평범하게 일했습니다.");
					money += 2200;
					strength += 3;
				}else if(logging[2]){
					System.out.println("할당량 이상에 효율적인 도끼질을 했습니다.");
					money += 3800;
					strength += 5;
				}else if(logging[3]){
					System.out.println("도끼가 부러졌습니다.");
					money += 660;
					strength += 2;
				}
			}

			void hospital(){
				Random random = new Random(); 
				Boolean [] hospital = new Boolean[4];
				 for(int i=0; i<hospital.length; i++) {
					 hospital[i] = random.nextBoolean();
			             
			            if(hospital[i]) {
			                System.out.println("환자 돌보는 중.....");              
			}
			else System.out.println("환자 응접하는 중.....");
			    }
			if(hospital[0]){
				System.out.println("공주님이 도망갔습니다.");
				money -= 1000;
				intellect += 1;
			}else if(hospital[1]){
				System.out.println("평범하게 일했습니다.");
				money += 2100;
				intellect += 3;
			}else if(hospital[2]){
				System.out.println("환자들에게 살갑게 대하였습니다.");
				money += 5200;
				intellect += 5;
			}else if(hospital[3]){
				System.out.println("처방전을 찢어버렸습니다.");
				money += 1000;
				intellect += 2;
			}
			
		}

					void maid(){
						Random random = new Random(); 
						Boolean [] maid = new Boolean[4];
						 for(int i=0; i<maid.length; i++) {
							 maid[i] = random.nextBoolean();
					             
					            if(maid[i]) {
					                System.out.println("저택 청소하는 중......");              
					}
					else System.out.println("메이드장에게 혼나는 중.....");
					    }
					if(maid[0]){
						System.out.println("공주님이 도망갔습니다.");
						money -= 1000;
						grace += 1;
					}else if(maid[1]){
						System.out.println("평범하게 일했습니다.");
						money += 2300;
						grace += 3;
					}else if(maid[2]){
						System.out.println("열심히 저택을 청소하였습니다.");
						money += 4700;
						grace += 5;
					}else if(maid[3]){
						System.out.println("메이드장에게 물을 엎질렀습니다.");
						money += 800;
						grace += 2;
					}
			}
			void bar(){
				Random random = new Random(); 
				Boolean [] bar = new Boolean[4];
				 for(int i=0; i<bar.length; i++) {
					 bar[i] = random.nextBoolean();
			             
			            if(bar[i]) {
			                System.out.println("진상 상대중......");              
			}
			else System.out.println("서빙 하는 중.....");
			    }
			if(bar[0]){
				System.out.println("공주님이 도망갔습니다.");
				money -= 1000;
				grace -= 1;
				charm += 1;
			}else if(bar[1]){
				System.out.println("평범하게 일했습니다.");
				money += 2000;
				grace -= 3;
				charm += 3;
			}else if(bar[2]){
				System.out.println("손님 순환을 잘 시켰습니다.");
				money += 7000;
				grace -= 5;
				charm += 5;
			}else if(bar[3]){
				System.out.println("진상 손님에게 한방 먹였습니다.");
				money += 700;
				grace -= 2;
				charm += 2;
			}
		}

			void INN(){
				Random random = new Random(); 
				Boolean [] INN = new Boolean[4];
				 for(int i=0; i<INN.length; i++) {
					 INN[i] = random.nextBoolean();
			             
			            if(INN[i]) {
			                System.out.println("진상 상대중......");              
			}
			else System.out.println("빨래 하는 중......");
			    }
			if(INN[0]){
				System.out.println("공주님이 도망갔습니다.");
				money -= 1000;
				strength += 1;
			}else if(INN[1]){
				System.out.println("평범하게 일했습니다.");
				money += 2000;
				strength += 3;
			}else if(INN[2]){
				System.out.println("집 주인 아내가 빨래하는 것을 보고는 호평을 합니다.");
				money += 4000;
				strength += 5;
			}else if(INN[3]){
				System.out.println("여관 주인에게 혼났습니다.");
					money += 700;
					strength += 2;
				}
			}
			void ghostwriteshop(){
				Random random = new Random(); 
				Boolean [] ghostwriteshop = new Boolean[4];
				 for(int i=0; i<ghostwriteshop.length; i++) {
					 ghostwriteshop[i] = random.nextBoolean();
			             
			            if(ghostwriteshop[i]) {
			                System.out.println("대필 해주는 중....");              
			}
			else System.out.println("글씨가 개발새발이라 혼나는 중....");
			    }
			if(ghostwriteshop[0]){
				System.out.println("공주님이 도망갔습니다.");
				money -= 1000;
				intellect += 1;
			}else if(ghostwriteshop[1]){
				System.out.println("평범하게 일했습니다.");
				money += 2000;
				intellect += 3;
			}else if(ghostwriteshop[2]){
				System.out.println("손님이 글을 보고는 명필이라 말합니다.");
				money += 4000;
				intellect += 5;
			}else if(ghostwriteshop[3]){
				System.out.println("연애 편지를 결투신청처럼 적었습니다.");
					money += 700;
					intellect += 2;
				}
			}
				void church(){
					Random random = new Random(); 
					Boolean [] church = new Boolean[4];
					 for(int i=0; i<church.length; i++) {
						 church[i] = random.nextBoolean();
				             
				            if(church[i]) {
				                System.out.println("신도의 참회 받아주는 중......");              
			}
			else System.out.println("신앙심 향상을 위해 예배중....");
			    }
			if(church[0]){
				System.out.println("공주님이 도망갔습니다.");
				money -= 1000;
				ethicality += 1;
			}else if(church[1]){
				System.out.println("평범하게 일했습니다.");
				money += 2000;
				ethicality += 3;
			}else if(church[2]){
				System.out.println("한 신도가 큰 깨달음을 얻었습니다.");
				money += 4000;
				ethicality += 5;
			}else if(church[3]){
				System.out.println("신부가 신앙에 대해서 설명합니다.");
					money += 700;
					ethicality += 2;
				}
			}
				void weaponshop(){
					Random random = new Random(); 
					Boolean [] weaponshop = new Boolean[4];
					 for(int i=0; i<weaponshop.length; i++) {
						 weaponshop[i] = random.nextBoolean();
				             
				            if(weaponshop[i]) {
				                System.out.println("갑옷에 대해서 설명중.....");              
			}
			else System.out.println("무기에 대해 설명중......");
			    }
			if(weaponshop[0]){
				System.out.println("공주님이 도망갔습니다.");
				money -= 1000;
				strength += 1;
			}else if(weaponshop[1]){
				System.out.println("평범하게 일했습니다.");
				money += 2000;
				strength += 3;
			}else if(weaponshop[2]){
				System.out.println("매우 높은 강도의 검을 판매하였습니다.");
				money += 4000;
				strength += 5;
			}else if(weaponshop[3]){
				System.out.println("왕의 부름을 받은 기사단이 다녀갔습니다.");
					money += 1700;
					strength += 2;
				}
				if(strength > 10){
					
				}
			}
			void martial_arts(){
				Random random = new Random(); 
				Boolean [] martial_arts = new Boolean[3];
				 for(int i=0; i<martial_arts.length; i++) {
					 martial_arts[i] = random.nextBoolean();
			             
			            if(martial_arts[i]) {
			                System.out.println("검 휘두르는 중.....");              
		}
		else System.out.println("방패로 막는 중.....");
		    }
		if(martial_arts[0]){
			System.out.println("초급 과정");
			money -= 1000;
			strength += 1;
		}else if(martial_arts[1]){
			System.out.println("중급 과정");
			money -= 2000;
			strength += 3;
		}else if(martial_arts[2]){
			System.out.println("고급 과정");
				money -= 4000;
				strength += 5;
			}
		}
			void study(){
				Random random = new Random(); 
				Boolean [] study = new Boolean[3];
				 for(int i=0; i<study.length; i++) {
					 study[i] = random.nextBoolean();
			             
			            if(study[i]) {
			                System.out.println("행정학 배우는 중....");              
		}
		else System.out.println("경제학 배우는 중....");
		    }
		if(study[0]){
			System.out.println("초급 과정");
			money -= 1000;
			intellect += 1;
		}else if(study[1]){
			System.out.println("중급 과정");
			money -= 2000;
			intellect += 3;
		}else if(study[2]){
			System.out.println("고급 과정");
				money -= 4000;
				intellect += 5;
			}
		}
	
				void Court_etiquette(){
					Random random = new Random(); 
					Boolean [] Court_etiquette = new Boolean[3];
					 for(int i=0; i<Court_etiquette.length; i++) {
						 Court_etiquette[i] = random.nextBoolean();
				             
				            if(Court_etiquette[i]) {
				                System.out.println("궁중 예법 배우는 중....");              
			}
			else System.out.println("식사 예법 배우는 중....");
			    }
			if(Court_etiquette[0]){
				System.out.println("초급 과정");
				money -= 1000;
				grace += 1;
			}else if(Court_etiquette[1]){
				System.out.println("중급 과정");
				money -= 2000;
				grace += 3;
			}else if(Court_etiquette[2]){
				System.out.println("고급 과정");
					money -= 4000;
					grace += 5;
				}
			}
													
		void ending(){
			if(appraisal >= 500){
				System.out.println("엔딩 : 모든 것이 뛰어난 이 공주는 여왕이 되었습니다.");
				 System.exit(0);
			}else if(appraisal >= 500 && ethicality <= 150){
				System.out.println("엔딩 : 도덕성이 조금 결여되있었지만 재능은 있던 공주는 산적여왕이 되었습니다.");
			}else if(appraisal >= 500 && grace >= 150){
				System.out.println("엔딩 : 기품이  넘치는 공주는 외교관이 되어 만국의 평화에 이바지하였습니다.");
			}
		}
		void Free_action(){
			Random random = new Random(); 
			Boolean [] Free_action = new Boolean[3];
			 for(int i=0; i<Free_action.length; i++) {
				 Free_action[i] = random.nextBoolean();
		             
		            if(Free_action[i]) {
		                System.out.println("파르페 먹는 중.....");              
		            }
		            else System.out.println("신나게 노는 중....!");
			 }
			if(Free_action[0]){
				System.out.println("파르페 샵");
				money -= 1000;
				intellect += 1;
			}else if(Free_action[1]){
				System.out.println("놀이동산");
				money -= 2000;
				intellect += 3;
			}else if(Free_action[2]){
				System.out.println("명품 구매");
					money -= 4000;
					intellect += 5;
				}
												
				
		for(int i = 0; i < appraisal; i++){
			appraisal = strength + intellect + grace + charm + ethicality;
			return;
		}
	}
}

//Court etiquette 궁중 예법

