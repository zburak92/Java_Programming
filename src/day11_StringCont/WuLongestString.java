

package day11_StringCont;

import java.util.Scanner;

public class WuLongestString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String result;
        System.out.println("Enter 1st String");
        String w1 = input.nextLine();

        System.out.println("Enter 2nd String");
        String w2 = input.nextLine();
        input.close();

        if(w2.length() > w1.length()){
            result = "2nd String is longer";
        }else if(w1.length() > w2.length()){
            result = "1st String is longer";
        }else{
            result = "They're the same length";
        }

        System.out.println(result);


    }
}
