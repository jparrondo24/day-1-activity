// Initial commit

import java.util.Scanner;
import java.util.ArrayList;

public class activity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
    }
    public static int getRandomNumber(int start, int stop) {
        int randomNumber = (int) (Math.random() * (stop - start) + 1);
        return randomNumber;
    }
}