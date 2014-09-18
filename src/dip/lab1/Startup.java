package dip.lab1;

import java.text.NumberFormat;

/**
 * Just a start and test class for this program. You may modify this class
 * in any way you see fit.
 *
 * @author jlombardo
 */
public class Startup {

    public static void main(String[] args) {
   
        Employee employee1 = new HourlyEmployee(13, 2000);
        Employee employee2 = new SalariedEmployee(60000, 5000);
        
        HRService hr = new HRService();
        
        System.out.println("Employee 1 Annual Compensation: " + hr.getAnnualCompensationForEmployee(employee1));
        System.out.println("Employee 2 Annual Compensation: " + hr.getAnnualCompensationForEmployee(employee2));
        
    }

}
