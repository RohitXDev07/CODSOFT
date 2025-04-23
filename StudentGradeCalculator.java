import java.util.Scanner;
class StudentGradeCalculator{

public static void main(String [] args){

System.out.println("-----Student Grade Calculator @RS-----");

System.out.println("Enter the Number of Subjects:");

Scanner sc = new Scanner(System.in);

int sub = sc.nextInt();
System.out.println("Enter the MArks Obtain in Each Subjects:");
int i;
double TotalMarks=0;
for( i = 1; i<= sub;i++)
{
   int marks = sc.nextInt();
  
   if(marks<0 || marks>100){
   
   System.out.println(marks+" : This is not valid marks please enter Valid Marks");

   }

  System.out.println( "Subject :"+i+" = marks is :"+marks);
  TotalMarks += marks;
}

double Average = TotalMarks/sub;

if( Average<=100 && Average>=90)
{
  System.out.println("Congragulation You Got  Grade : A");
}
else if(Average<=90 && Average>=80){
System.out.println("Congragulation You Got  Grade : B");
}
else if(Average<=80 && Average>=70)
{
System.out.println("Congragulation You Got  Grade : C");
}
else if(Average<=70 && Average>=60)
{
System.out.println("Congragulation You Got  Grade : D");
}
else if(Average<=60 && Average>=50)
{
System.out.println("Congragulation You Got  Grade :E ");
}
else{
System.out.println("You are Fail Best Luck For Next Time");
}

System.out.println("__Total Information__");

System.out.println("Total Marks are:" +TotalMarks);
System.out.println("Percentage :" +Average);



sc.close();
}
}


