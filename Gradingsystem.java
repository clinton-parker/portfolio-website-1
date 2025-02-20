import java.util.Scanner;

public class Gradingsystem 
{
  public static void main(String[] args) throws Exception
  {
      try (Scanner scanner = new Scanner(System.in)) {
          System.out.println("Enter your ExamScore: ");
          double examScore = scanner.nextDouble();
          System.out.println("Enter your Assesment Score: ");
          double assessmentScore = scanner.nextDouble();
          if (examScore >= 2 && assessmentScore >=15)
          {
              System.out.println("You have passed");
          }
          else if (examScore < 25 || assessmentScore <15)
          {
              System.out.println("You have failed");
          }
          if (examScore + assessmentScore == 39)
          {
              System.out.println("You are condoned");
          }
          System.out.println("Enter Your Fees");
          double Fees = scanner.nextDouble();
          if(Fees  == 100 &&(examScore >=25 && assessmentScore >=15 || examScore + assessmentScore ==39))
          {
              System.out.println("You have a certificate");
          }
          else if (Fees < 100 && (examScore >=25 && assessmentScore >=15 || examScore + assessmentScore ==39))
          {
              System.out.println("You cannot get a Certificate");
          }
          else {
              System.out.println("You have been repeated");
          }
      }
  }
}