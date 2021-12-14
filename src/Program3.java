// Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60.
// Display proper error messages.
// The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
// (Hint : Create a user defined exception class for handling errors.)

import java.util.Scanner;

public class Program3
{
    public static void main(String[] args)
    {
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Name : ");
        name = sc.nextLine();
        System.out.print("Age : ");
        try
        {
            age = sc.nextInt();
            if (age >= 18 && age < 60)
            {
                System.out.println("Entered age is valid.");
            }
            else
            {
                throw new InvalidAgeException();
            }
        }
        catch (InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
class InvalidAgeException extends Exception
{
    @Override
    public String getMessage()
    {
        return "Person's age must be in the range of 18-60.";
    }
}