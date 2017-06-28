import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String userName = " ";
        char input1 = '-';
        char firstQuestion = '-';
        char secondQuestion = '-';
        char thirdQuestion = '-';

        System.out.println("Welcome! What is your name? ");
        userName = scnr.nextLine();

        System.out.println(userName + " , " + "Would you like to play a game? (y/n) ");
        input1 = scnr.next().charAt(0);


        if (input1 == 'y' ) {
            System.out.println("Great! Let's play!");

            System.out.println("You are in the middle of the apocalypse, a walker comes up to you and your group. " +
                    userName + " , " + "you either : A: grab a knife and prepare to fight or B: Run away as fast as you can");

            firstQuestion = scnr.next().charAt(0);

            if (firstQuestion == 'a'){
                System.out.println("Whew that was close call  but nice job fighting off the zombies!");

                System.out.println("You and your group decide to enter an abandon house for much needed supplies. One of your group" +
                        "members gets caught in a web of zombies. You either: A: leave them and protect yourself and other group " +
                        "members or B: try to fight off the zombies and end up getting hurt");

                secondQuestion = scnr.next().charAt(0);

                if (secondQuestion == 'a'){
                    System.out.println("You made the right choice. There were too many zombies there to help out your friend. ");

                    System.out.println("You are now down one person, you and your group decide to go down a path never taken" +
                            "before and realize you find a compound with food and shelter. You either: A: join their community " +
                            "and live there and work for a living or B: decide to continue your journey alone because everyone" +
                            "else wants to join" );
                    thirdQuestion = scnr.next().charAt(0);

                    if (thirdQuestion =='a') {
                        System.out.println("Nice! " + userName + " You will live a long life at your new home!");
                    }
                else {
                        System.out.println("I'm sorry, " + userName + " Zombies attacked you right after you left and you are no longer alive");

                    }
                }
                else {
                    System.out.println("You are now not alive. I'm sorry, there were just too many zombies.");
                }

            } else {
                    System.out.println("You left your group and now alone, " + userName + "."  );
                }


            } else {
                System.out.println("Too bad you didn't want to play. Goodbye!");

            }
        }

    }

