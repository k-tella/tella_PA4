import java.security.SecureRandom;

import java.util.Random;

import java.util.Scanner;



public class Main

{

    public static int askQ(){

        SecureRandom rand = new SecureRandom();

        int randNum1 = rand.nextInt(10);

        int randNum2 = rand.nextInt(10);



        System.out.println("How much is "+ randNum1 +  " times " + randNum2 +  "?");

        return randNum1*randNum2;

    }



    public static void main(String args[])

    {



        Scanner sc = new Scanner(System.in);

        int userNum,num;

        while(true){

            int count = 10;

            int numRight = 0, numWrong = 0;

            while(count > 0){

                num = askQ();

                count--;

                Random rand = new Random();

                int rand_int = rand.nextInt(4) + 1;

                userNum = sc.nextInt();

                if(userNum == num){

                    switch(rand_int){

                        case 1:

                            System.out.println("Very good!");

                            break;

                        case 2:

                            System.out.println("Excellent!");

                            break;

                        case 3:

                            System.out.println("Nice work!");

                            break;

                        case 4:

                            System.out.println("Keep up the good work!");

                            break;
                            }

                    numRight++;
                    num = askQ();


                }else{

                    switch(rand_int){

                        case 1:

                            System.out.println("No. Please try again.");

                            break;

                        case 2:

                            System.out.println("Wrong. Try once more.");

                            break;

                        case 3:

                            System.out.println("Don’t give up!");

                            break;

                        case 4:

                            System.out.println("No. Keep trying.");

                            break;

                    }

                    numWrong++;

                }

            }

            if((numRight/10.0) < 0.75){

                System.out.println("Please ask your teacher for extra help.");

                System.out.println("Correct: " + numRight);
                System.out.println("Incorrect: " + numWrong);

            }

            else{

                System.out.println("Congratulations, you are ready to go to the next level!");

                System.out.println("Correct: " + numRight);
                System.out.println("Incorrect: " + numWrong);

            }

        }



    }



}
