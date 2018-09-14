import java.util.Scanner;

public class Magic_8_ball_project {

    public static void main(String[]args){
        //10 choices with 1-100 using boolean
        //declare
        Scanner keyboard;
        int testing;
        String question;
        String name;
        String pet;


        //initialization
        keyboard = new Scanner(System.in);


        System.out.println("Hello, I am the magic eight ball. I am going to ask you some questions. First, tell me your name.");
        name = keyboard.nextLine();
        System.out.println("Hello "+name+". Next, tell me if you have any pets, and if you do, what's their name.");
        pet = keyboard.nextLine();









    }
}
