/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numbers;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;


interface Iterator<S> {
    boolean hasNext();
    S next();
}

interface Aggregate<S> {
    Iterator<S> createIterator();
}
class Sales {

   
    
    private String name;
    private String title;
    private int salesFigure;
    private double MinSales;
    private double MaxSales;
    private double AvgSales;
    private double TotalSales;

    public Sales(String name, String title, int salesFigure, double MinSales, double MaxSales, double AvgSales, double TotalSales) {
        this.name = name;
        this.title =  title;
        this.salesFigure = salesFigure;
        this.MinSales = MinSales;
        this.MaxSales = MaxSales;
        this.AvgSales = AvgSales;
        this.TotalSales = TotalSales;
    }
         public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getSalesFigure() {
        return salesFigure;
    }

    public void setSalesFigure(int salesFigure) {
        this.salesFigure = salesFigure;
    }

    public double getMinSales() {
        return MinSales;
    }

    public void setMinSales(double MinSales) {
        this.MinSales = MinSales;
    }

    public double getMaxSales() {
        return MaxSales;
    }

    public void setMaxSales(double MaxSales) {
        this.MaxSales = MaxSales;
    }

    public double getAvgSales() {
        return AvgSales;
    }

    public void setAvgSales(double AvgSales) {
        this.AvgSales = AvgSales;
    }

    public double getTotalSales() {
        return TotalSales;
    }

    public void setTotalSales(double TotalSales) {
        this.TotalSales = TotalSales;
    
    }

    Iterator<Double> iterSales() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}

class IterSales implements Iterator<Sales> {
    private int SalesFigures = 0;
    private List<Sales> sales;
    
    public IterSales(List<Sales> sales) {
        this.sales = sales;
    }
    
    @Override 
    public boolean hasNext() {
        return SalesFigures < sales.size();
    }
    
    @Override
    public Sales next() {
        if(!hasNext()) {
            throw new NoSuchElementException();
        }
        return sales.get(SalesFigures++);
    }
}

class SalesGroup implements Aggregate<Sales> {
    private List<Sales> sales;
    
    public SalesGroup(List<Sales> sales){
        this.sales = sales;
    }
    
    @Override
    public Iterator<Sales> createIterator() {
        return new IterSales(sales);
    }

    Iterator<Double> iterSales() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
/**
 *
 * @author programmingtruckdriver
 */
public class Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Sales> sales = new ArrayList<>();
        System.out.println();
        sales.add(new Sales("Michelle Smith", "Sales Associate,", 4, 300.00, 1000.00, 650.00, 2400.00));
       sales.add(new Sales("Yasir Dana", "Sales Associate", 3, 2702.07, 2716.16, 1985.86, 8023.67 ));
       sales.add(new Sales("Tara May", "Sales Manager", 3, 8480.56, 54629.21, 29039.34, 103948.55));
        
       SalesGroup sg = new SalesGroup(sales);
       Iterator<Sales> iterator = sg.createIterator();
       
       System.out.println("Enter name: ");
       String name = scanner.nextLine();
       System.out.println("Enter title: ");
       String title = scanner.nextLine();
       double MinSales = 0.0;
       double MaxSales = 0.0;
       double AvgSales = 0.0;
       double TotalSales = 0.0;
        
 while(iterator.hasNext()) {
           MinSales = iterator.next().getMinSales();
       while(iterator.hasNext()) {
           MaxSales += iterator.next().getMaxSales();
       while(iterator.hasNext()) {
           AvgSales += iterator.next().getAvgSales();
       while(iterator.hasNext()) {
           TotalSales += iterator.next().getTotalSales();
       }     

       System.out.println(name + title + MinSales + MaxSales + AvgSales + TotalSales);
          
            }
    
       }
       }
 }
    }
