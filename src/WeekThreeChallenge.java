import java.util.Scanner;
import java.util.ArrayList;

public class WeekThreeChallenge {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> skills = new ArrayList<String>();

        String name;
        String emailaddress;
        String university1;
        String degree1;
        String job1, job2;
        String jobskill1a, jobskill2a;
        String jobskill1b, jobskill2b;
        String jobskill1c, jobskill2c;

        System.out.println("Please enter your name: ");
        name = keyboard.nextLine();

        System.out.println("Please enter your email address: ");
        emailaddress = keyboard.nextLine();

        System.out.println("Please enter your university, and graduation year: ");
        university1 = keyboard.nextLine();

        System.out.println("Please enter your degree type (Associate's, Bachelor's, Master's, PhD, etc.), and major: ");
        degree1 = keyboard.nextLine();

        System.out.println("Please enter job title 1, company, start date, end date, and job description: ");
        job1 = keyboard.nextLine();

        System.out.println("Please enter job skill 1 name, rating/proficiency: ");
        jobskill1a = keyboard.nextLine();

        System.out.println("Please enter job skill 2 name, rating/proficiency: ");
        jobskill1b = keyboard.nextLine();

        System.out.println("Please enter job skill 3 name, rating/proficiency: ");
        jobskill1c = keyboard.nextLine();

        /*System.out.println("Please enter next job title, company, start date, end date, and job description: ");
        job2 = keyboard.nextLine();

        System.out.println("Please enter next job skill  name, rating/proficiency: ");
        jobskill2a = keyboard.nextLine();

        System.out.println("Please enter next job skill name, rating/proficiency: ");
        jobskill2b = keyboard.nextLine();

        System.out.println("Please enter next job skill name, rating/proficiency: ");
        jobskill2c = keyboard.nextLine();
*/
        System.out.println("--------------------------");
        System.out.println("" + name);
        System.out.println("" + emailaddress);
        System.out.println("\n");
        System.out.println("" + university1);
        System.out.println("" + degree1);
        System.out.println("\n");
        System.out.println("Work Experience: ");
        System.out.println("\n");
        System.out.println("Job Title, Company, Start-end date, job description: " + job1 + "\n Skills & proficiency: " + jobskill1a + "\n" + jobskill1b + "\n" + jobskill1c);
        //System.out.println("Job Title: " + job2 + "\n Skills & proficiency: " + jobskill2a + "\t" + jobskill2b + "\t" + jobskill2c);
        //System.out.println("Job Title: " + job3 + "\n Skills: " + jobskill3a + "\t" + jobskill3b + "\t" + jobskill3c);

    }

}


/*Requirements
Write a program that will allow a user to enter in:

a name,
an email address,
at least 1 educational achievement:
degree type (Associate's, Bachelor's, Master's, PhD, etc.),
major,
university name,
graduation year
at least 1 work experience:
job title,
company,
start date,
end date,
at least 1 job description
at least 3 skills:
skill name,
rating/proficiency
Functionalities
Choose to build as a console application or as an Object-Oriented Program
The main method of the program should handle all user interaction.
The data must be kept in a type of collection (i.e. Arrays, or ArrayList).
Ensure that users have met the minimum amount of items requirements
Make the resume look pretty!
Expected Output
=============================================================
John Smith Doe
jsdoe@gmail.com

Education
BS in Psychology,
University of Maryland, 2002

MS in Software Engineering,
Johns Hopkins U, 2005

Experience
Software Developer II
Amtrak, June 2015 - Present
- Duty 1, The work experience description goes here
- Duty 2, The work experience description goes here

Software Developer I
Amtrak, June 2014 - June 2015
- Duty 1, The work experience description goes here
- Duty 2, The work experience description goes here

Business Analyst
DCPS, August 2005 - May 2014
- Duty 1, The work experience description goes here
- Duty 2, The work experience description goes here

Skills
Java, Proficient
HTML/CSS, Proficient
SQL Database, Familiar
Previous Next
*/