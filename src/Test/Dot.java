package Test;
import java.lang.System;
import java.util.Random;
import java.util.Scanner;
 
public class Dot {
     
 
    private Scanner scanner;
 
 
    public static void main(String[] args) {
    Dot my1 = new Dot();
    my1.userCmd();     
    }
     
    public void userCmd() {
        Dot my1 = new Dot();
        scanner = new Scanner(System.in);      
        System.out.println("강화 하시려면 1을 입력하세요.");
        int userInput = scanner .nextInt();            
        if(userInput == 1) my1.get_enchan();
        else{
            System.out.println("강화를 취소합니다.");          
        }      
    }  
     
         
        public void get_enchan() {
            Dot my1 = new Dot();
            Random random = new Random();          
            System.out.println("강화를 시작합니다.");
            Boolean [] enchant = new Boolean[3]; 
            for(int i=0; i<enchant.length; i++) {
                enchant[i] = random.nextBoolean();
                 
                if(enchant[i]) {
                    System.out.println("★★★★★★★★★★");              
                }
                else System.out.println("○○○○○○○○○○○○");
            }
 
            if(enchant[0]) {
                if(enchant[1]) {
                    if(enchant[2]) {
                        System.out.println("인챈트를 성공하였습니다.");
                    }   else {
                        System.out.println("인챈트가 실패하였습니다."); my1.userCmd();
                    }
                }   else {
                    System.out.println("인챈트가 실패하였습니다."); my1.userCmd();
                }
            }          
            else if(enchant[0] == false) {
                if(enchant[1] == false) {
                    if(enchant[2] == false) {
                        System.out.println("인챈트를 성공하였습니다.");
                    }   else {
                        System.out.println("인챈트가 실패하였습니다."); my1.userCmd();
                    }
                }   else {
                    System.out.println("인챈트가 실패하였습니다."); my1.userCmd();
                }
                 
            }   else {
                System.out.println("인챈트가 실패하였습니다."); my1.userCmd();
                 
            }
        }
}  


