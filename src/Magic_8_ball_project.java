import java.util.Scanner;

public class Magic_8_ball_project {

    public static void main(String[] args) {
        //10 choices with 1-100 using boolean
        //declare
        Scanner keyboard;
        int pickedNumber;
        String name;
        String correct;
        String question;

        int total;
        String confirmation;
        pickedNumber = (int) (Math.random() * 100);
        boolean value = true;
        //initialization
        keyboard = new Scanner(System.in);

        System.out.println(pickedNumber);
        System.out.println("Hello, I am the magic eight ball. First things first, who are you?");
        name = keyboard.nextLine();
        System.out.println("Hello " + name + ". I am guessing you are here for my absolutely amazing advice and wisdom, correct?");
        correct = keyboard.nextLine();
        System.out.println("Well whatever, we are here for you, not me.");
        System.out.println("Ask A Question, Any Question-\nFor the Magic Eight Ball Knows All.");

        while (value) {

            question = keyboard.nextLine();
            System.out.println(question);
            System.out.println("Okay, your fortune is....");
            pickedNumber = (int) (Math.random() * 100);

            if (pickedNumber < 10) {
                System.out.println("Oof, your future is not looking bright.");
            } else if (pickedNumber < 20) {
                System.out.println("Well, I could say that your outlook isn't looking BAD.");
            } else if (pickedNumber < 30) {
                System.out.println("Oh. Uh. Best you not do what you're thinking about doing. Yeah.");
            } else if (pickedNumber < 40) {
                System.out.println("You're doing great. Keep going.");
            } else if (pickedNumber < 50) {
                System.out.println("Oh no, stop. Just. Stop right there.");
            } else if (pickedNumber < 60) {
                System.out.println("Sure. You could do that, I suppose.");
            } else if (pickedNumber < 70) {
                System.out.println("No.");
            } else if (pickedNumber < 80) {
                System.out.println("Yeah! Go for it!");
            } else if (pickedNumber < 90) {
                System.out.println("Oho, no you don't.");
            } else if (pickedNumber < 100) {
                System.out.println("Do it. I dare you.");
            }
            System.out.println("You do want to ask another question? (yes or no).");
            confirmation= keyboard.nextLine();
            if(confirmation.equals("yes")){

                System.out.println("Ask A Question, Any Question-\nFor the Magic Eight Ball Knows All.");
            }
            else if(confirmation.equals("no")){
                System.out.println("Boo you loser.");
                break;
            }
        }
    }
}
