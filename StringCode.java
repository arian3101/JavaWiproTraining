import java.io.*;
import  java.util.*;
class StringCode
{
public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
	System.out.println("Enter a string");
	String str=sc.nextLine();
        String[] words = str.split(" ");
        StringBuffer output = new StringBuffer();

        for (String word : words) {
            int sum = 0;
            for (int i = 0; i < (word.length() / 2); i++) {
                int j = word.length() - i - 1;
                int larger;
                int smaller;
                if (letterToNo(word.charAt(i)) > letterToNo(word.charAt(j))) {
                    larger = letterToNo(word.charAt(i));
                    smaller = letterToNo(word.charAt(j));
                } else {
                    larger = letterToNo(word.charAt(j));
                    smaller = letterToNo(word.charAt(i));
                }
                sum += larger - smaller;
            }
            if (word.length() % 2 == 1) {
                sum += letterToNo(word.charAt(word.length() / 2));
            }
            output.append(sum);
        }
       
	System.out.println(output);
    }

    public static int letterToNo(char ch) {
        if (ch >= 65 && ch <= 90)
            return ch - 64;
        if (ch >= 97 && ch <= 122)
            return ch - 96;
        return 0;
    }
}
