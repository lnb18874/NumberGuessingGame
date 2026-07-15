import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        int choice=0;
        int times=0;
        int targetNumber=(int)(Math.random()*100)+1;
        while(true){
            System.out.println("Please select the difficulty level:\n" +
                    "1. Easy (10 chances)\n" +
                    "2. Medium (5 chances)\n" +
                    "3. Hard (3 chances)\n");
            System.out.println("Please enter your choice: ");
            if(input.hasNextInt()){
                choice=input.nextInt();
                if(choice==1){
                    times=10;
                    break;
                }else if(choice==2){
                    times=5;
                    break;
                }else if(choice==3){
                    times=3;
                    break;
                }else{
                    System.out.println("Please enter a number between 1 and 3.");
                    continue;
                }
            }else{
                System.out.println("Please enter a number between 1 and 3.");
                input.next();
            }

        }
        System.out.println("You have "+times+" chances to guess the correct number.");
        System.out.println("Let's start the game!");
        int number=0;
        while(times!=0){
            number++;
            System.out.println("Please enter your guess: ");
            int guess=input.nextInt();
            if(guess==targetNumber){
                System.out.println("Congratulations! You guessed the correct number in "+number+" attempts.");
                break;
            }else if (guess>targetNumber){
                System.out.println("Incorrect! The number is less than "+guess+".");
            }else{
                System.out.println("Incorrect! The number is greater than "+guess+".");
            }
            times--;
        }
        if(times==0){
            System.out.println("You failed!");
        }
        input.close();
    }
}