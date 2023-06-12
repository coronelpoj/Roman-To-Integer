

import java.util.Scanner;

public class roman {
    public static int romanToInteger(String s){
        int integer = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'M':
                if(count >= 1){
                    if(s.charAt(i-1) == 'C'){
                        integer = integer + 800;
                        
                        count++;
                        break;
                    }
                }
                integer = integer + 1000;
                count++;
                break;
                case 'D':
                if(count >= 1){
                    if(s.charAt(i-1) == 'C'){
                        integer = integer + 300;
                        
                        count++;
                        break;
                    }
                }
                integer = integer + 500;
                count++;
                break;
                case 'C':
                if(count >= 1){
                    if(s.charAt(i-1) == 'X'){
                        integer = integer + 80;
                        
                        count++;
                        break;
                    }
                }
                integer = integer + 100;
                count++;
                break;
                case 'L':
                if(count >= 1){
                    if(s.charAt(i-1) == 'X'){
                        integer = integer + 30;
                        
                        count++;
                        break;
                    }
                }
                integer = integer + 50;
                count++;
                break;
                case 'X':
                if(count >= 1){
                    if(s.charAt(i-1) == 'I'){
                        integer = integer + 8;
                        
                        count++;
                        break;
                    }
                }
                integer = integer + 10;
                count++;
                break;
                case 'V':
                if(count >= 1){
                    if(s.charAt(i-1) == 'I'){
                        integer = integer + 3;
                        
                        count++;
                        break;
                    }
                }
                integer = integer + 5;
                count++;
                break;
                case 'I':
                integer = integer + 1;
                count++;
                break;
                default:
                
            }
        }
        return integer;
    }


    public static void main(String[] args) {
        String roman = "";
        System.out.println("Roman numeral to integer");
        System.out.println("Only Characters I, V, X, L, C, D and M are allowed");
        System.out.print("Enter the Roman numerals: ");
        Scanner sc = new Scanner(System.in);
        roman = sc.nextLine();
        System.out.println("The number of the roman numural is: " + romanToInteger(roman));;
        sc.close();
    }
}
