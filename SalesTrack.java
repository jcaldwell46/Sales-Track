
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SalesTrack;

import java.util.Iterator;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;
/**
 *
 * @author sjmag
 */
public class SalesTrack
{
    public static void CreateReport(ArrayList<SalesPerson> SalesPerson){
        double CompanyTotal = 0.0;
        DecimalFormat fmt = new DecimalFormat("$#,#00.00");
        Iterator<SalesPerson> iterPerson = SalesPerson.iterator();
        while(iterPerson.hasNext()){
            SalesPerson s = iterPerson.next();
            double TotalSales = 0.0;
            double Sales = 0.0;
            double MinSales = 0.0;
            double MaxSales = 0.0;
            double AvgSales = 0.0;
            int count = 0;
            
            Iterator<Double> iterSales = s.iterSales();
            while(iterSales.hasNext()){
                Sales = iterSales.next();
                TotalSales += Sales;
                if(Sales < MinSales){
                    MinSales = Sales;
                }
            }
        }
    }
}

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    public Iterator<Double>IterSales()
    return IterSales.iterator();
        
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("What is the salesperson's name? ");
     String name = scanner.nextLine();
     System.out.println("What is the salesperson's title? ");
     String title = scanner.nextLine();
     System.out.println("What are the minumum sales figures? ");
     double MinSales = scanner.nextLine();
     System.out.println("What are the maximum sales figures? ");
     double MaxSales = scanner.nextLine();
     System.out.println("What are the average sales figurs? ")
     double TotalSales = scanner.nextLine();
    }

}
