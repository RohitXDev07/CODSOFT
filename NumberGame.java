
import java.util.Random;
import java.util.Scanner;
class NumberGame{

public static void main(String [] args){

Random r = new Random();

int TargetValue = r.nextInt(100)+1;

Scanner sc = new Scanner(System.in);
int guess;

int attempt = 0;

System.out.println("Welcome to My Number Guess Game !!");

System.out.println(" Please Try to enter numbers between 1 to 100");


while(true){

System.out.println("Enter the Number:");

guess = sc.nextInt();

attempt++;

if(guess<1 || guess>100){
        System.out.println("Number is Out of Boundry ! Pls Enter valid Number.");

}

else if(guess<TargetValue){
   System.out.println("Low Number! Try again");
}

else if(guess>TargetValue){
      System.out.println("High Number! Try agian");
}

else{
  System.out.println("Congragulation You Won in Attempt : "+attempt);
break;
}
}


sc.close();
}
}


