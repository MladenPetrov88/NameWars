import java.util.Scanner;

public class NameWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int maxSum = Integer.MIN_VALUE;
        String winnerName = "";
        while (!name.equals("STOP")) {
            int asciiSum = 0;
            for (int position = 0; position < name.length(); position++) {
                char currentLetter = name.charAt(position);
                asciiSum += (int)currentLetter;
            }
            if (asciiSum >= maxSum){
                maxSum = asciiSum;
                winnerName = name;
            }
            name = scanner.nextLine();
        }
        System.out.printf("Winner is %s - %d!", winnerName, maxSum);
    }
}
