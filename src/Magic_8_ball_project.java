import java.util.Scanner;

public class Magic_8_ball_project {

    public static void main(String[]args){
        //10 choices with 1-100 using boolean
        //declare
        Scanner keyboard;
        int testing;
        String name;
        String pet;
        int birthdayThing;
        String weirdObject;
        String question;
        int total;



        //initialization
        keyboard = new Scanner(System.in);


        System.out.println("Hello, I am the magic eight ball. I am going to ask you some questions. First, tell me your name.");
        name = keyboard.nextLine();
        System.out.println("Hello "+name+". Next, tell me if you have any pets, and if you do, what's their name.");
        pet = keyboard.nextLine();
        System.out.println("Okay, that's cool. Now, take all the numbers of your birthday, and add them all up, what do you get?");
        birthdayThing = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Alright, final question. What is the weirdest thing you have have ever seen in the store?");
        weirdObject = keyboard.nextLine();
        System.out.println("Really? That is weird. Okay now, ask me your question.");
        question = keyboard.nextLine();
        System.out.println("Okay, your fortune is....");

            if(birthdayThing*2>10){
                System.out.println("Oof, your future is not looking bright.");
            }
            if(birthdayThing*2>20){
                System.out.println("Well, I could say that your outlook isn't looking BAD.");
            }
            if(birthdayThing*2>30){
                System.out.println("Oh. Uh. best you not do what you're thinking about doing. Yeah.");
            }
            if(birthdayThing*2>40){
                System.out.println("You're doing great. keep going.");
            }
            if(birthdayThing*2>50){
                System.out.println("Oh no, stop. Just. Stop right there.");
            }
            if(birthdayThing*2>60){
                System.out.println("Sure. You could do that, I suppose.");
            }
            if(birthdayThing*2>70){
                System.out.println("No.");
            }
            if(birthdayThing*2>80){
                System.out.println("Yeah! Go for it!");
            }
            if(birthdayThing*2>90){
                System.out.println("Oho, no you don't.");
            }
            if(birthdayThing*2>100){
                System.out.println("Do it. I dare you.");
               }

    }
}
