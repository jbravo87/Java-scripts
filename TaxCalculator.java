import java.util.Scanner;
/**
 * Will calculate income tax
 * J. Bravo
 * Tues, June 18, 2019
 * Lab 7
 */
public class TaxCalculator{
    public static void main(String[] args)
    {
        double income;
        int dependents;
        boolean single;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter your income");
        income = keyboard.nextDouble();
        
        System.out.println("Enter number of dependents");
        dependents = keyboard.nextInt();
        
        //need extra nextLine to read and discard
        //ENTER key in the keyboard buffer
        keyboard.nextLine();
        
        System.out.println("Enter single or married?");
        String reply = keyboard.nextLine();
        
        //convert user input to true or false
        if (reply.equalsIgnoreCase("single"))
        {
            single = true;
        } else {
            single = false;
        }
    
        System.out.printf("Income $%.2f \n", income);
        System.out.printf("Dependents %d \n", dependents);
        if (single)
        {
            System.out.println("marital status: single");
        } else {
            System.out.println("marital status: married");
        }
    //calculate taxable income
    double taxableIncome;
    if (single)
    {
        taxableIncome = income - 3800*dependents - 5950;
    } else {
        taxableIncome = income - 3800*dependents - 11900;
    }
    //IF statement to determine the taxRate based on previous table,
    //the taxableIncome and marital status

    System.out.printf("Taxable Income $%.2f \n", taxableIncome);
    
    double taxRate;
    if(single)
    {
        if(taxableIncome < 8700){
            taxRate = 0.10;
        } else if (taxableIncome <= 35350){
            taxRate = 0.15;
        } else if (taxableIncome <= 85650){
            taxRate = 0.25;
        } else if (taxableIncome <= 178650){
            taxRate = 0.28;
        } else if (taxableIncome <= 388350){
            taxRate = 0.33;
        } else {
            taxRate = 0.35;
        }
    }
    
    else if (taxableIncome < 17400){
        taxRate = 0.10;
    } else if (taxableIncome <= 70700){
        taxRate = 0.15;
    } else if (taxableIncome <= 142700){
        taxRate = 0.25;
    } else if (taxableIncome <= 217450){
        taxRate = 0.28;
    } else if (taxableIncome <= 388350){
        taxRate = 0.33;
    } else {
        taxRate = 0.35;
    }
    
    //Last statement to calculate tax
    double tax = taxableIncome*taxRate;
    System.out.printf("Tax $%.2f \n", tax);
    
    
    if (taxableIncome < 0)
    {
        taxableIncome = 0;
    }
    
    }
    
    
}