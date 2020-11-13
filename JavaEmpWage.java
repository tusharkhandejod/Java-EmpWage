//calculating employee wage for different companies by taking inputs from user
import java.util.Scanner;
public class UC8EmpWageDiffCompanies {
	final static int isabsent = 0; 
	final static int isFullTime = 1;
     final static int isPartTime = 2;
    
     public static void calculate(){
	     Scanner s=new Scanner(System.in);
    	 System.out.println("Enter your company name =");
    	 String company_name=s.next();
    	 System.out.println("Enter your companys's employee rate per hour =");
    	 int empRatePerHour=s.nextInt();
    	 System.out.println("Enter total working days =");
    	 int totalDays=s.nextInt();
    	 System.out.println("Enter total monthly working Hours =");
    	 int totalHours=s.nextInt();
    	 System.out.println("                             ");
    	 System.out.println("Employee's status= ");
    	 System.out.println("Day   Attendance    DailyWage  TotalWorkingHours TotalMonthlySallery");
    	 int hours = 0;
	     int days = 0;
	     int empHours;
	     int totalSalary = 0;
	     String status;
	     while(hours <=totalHours && days<totalDays){
	    	     int salary = 0;
	    	     int check = (int)(Math.floor(Math.random()*10)%3);
	             switch(check){
	             case isPartTime:
	                     empHours = 4;
	                     status="HalfTime";
	                     break;
	             case isFullTime:
	                     empHours = 8;
	                     status="FullTime";
	                     break;
	             default :
	                     empHours = 0;
	                     status="Absent**";
	             }
	             salary = empRatePerHour*empHours;
                 totalSalary = totalSalary+salary;
                 System.out.println((days+1)+"\t"+status+"\t"+salary+"\t\t"+hours+"\t\t"+totalSalary);
                 hours += empHours;
	             days += 1;
	     }
	     int totalEmpWage=hours*empRatePerHour;
	     System.out.println("                             ");
	     System.out.println("Total Monthly Salary of the employee in the "+company_name+" company is: "+totalEmpWage);
     }
     public static void main(String args[]){
    		System.out.println("                             ");
    		System.out.println("Welcome to the Employee Wage problem using java");
    		System.out.println("                             ");
    	 calculate();
     }

}
