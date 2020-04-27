package Conditional_statement;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aa = scanner.nextInt();
        int rev=Integer.parseInt(String.valueOf(new StringBuilder(aa+"").reverse()));
        System.out.println(rev);


        /*int number = scanner.nextInt(),last_num,sum=0;
        while(number>0){
            last_num=number%10; // this will give 8989%10=9
            number/=10;     // now we have 9 in last and now num/ by 10= 898
            sum=sum*10+last_num; //  sum=0*10+9=9;
        }
        // last_num=9.   number= 898. sum=9
        // last_num=8.   number =89.  sum=9*10+8= 98
        // last_num=9.   number=8.    sum=98*10+9=989
        // last_num=8.   number=0.    sum=989*10+8=9898
        // hence completed
        System.out.println("Reverse is "+sum);*/
    }
}
