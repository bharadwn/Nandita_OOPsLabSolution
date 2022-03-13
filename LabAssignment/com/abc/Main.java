/***
 *a)	Generate an email with the following syntax
 * firstNamelastName@department.company.com
 *
 * b)	Determine the department (Technical, Admin, Human Resource, Legal)
 * c)	Generate a random password which will contain (number, capital letter, small letter & special character)
 * d)	Display the generated credentials
 * e)	Use parameterized constructor of class Employee, to pass firstName, lastName.
 * f)	Create a separate CredentialService which will have generatePassword, generateEmailAddress, & showCredentials method.
 *
 *
 * Sample output
 *
 *
 * -----------------------------------------------------------------
 * ABC Company
 * -----------------------------------------------------------------
 * Welcome to email ID and Password Generator.
 * Please enter your fist name:
 * Please enter your last name:
 *
 * Please choose your department,
 * *1 ->Technical
 * *2 ->Admin
 * *3 ->Human Resources
 * *4 ->Legal
 *
 * Dear Harshit, your generated credentials are as follows
 * Email        --->  harshitchoudary@tech.abc.com
 * Password ---> 181E@wFT
 */
package week2.LabAssignment.com.abc;

import week2.LabAssignment.com.abc.Employees.Email;
import week2.LabAssignment.com.abc.Employees.Employee;
import week2.LabAssignment.com.abc.Employees.Password;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Employee empCont = new Employee();

            System.out.println("-----------------------------------------------------------------");
            System.out.println("---------------------------ABC Company---------------------------");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Welcome to email ID and Password Generator.");
            Scanner sc = new Scanner(System.in);

            System.out.print("Please enter your fist name:");
            empCont.setFirstName(sc.next());
            System.out.print("Please enter your last name:");
            empCont.setLastName(sc.next());

            System.out.println("Please choose your department::");
            System.out.println("1 ->Technical");
            System.out.println("2 ->Admin");
            System.out.println("3 ->Human Resources");
            System.out.println("4 ->Legal");

            empCont.setDept(sc.nextInt());

            Email email = new Email(empCont);

            Password ps = new Password(empCont);
            //ps.generatePassword();
            System.out.println("Dear " + empCont.getFirstName() + ", your generated credentials are as follows");
            System.out.println("Email -->" + email.getEmail());
            System.out.println("Password -->" + ps.getPassw());
        }catch(Exception e){
            //e.printStackTrace();
            System.out.println("Please send a number from 1-4, you selected an invalid number.");
        }
    }
}
