/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SalesTrack;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author sjmag
 */
public class SalesPerson
{
public ArrayList<String>list = new ArrayList<String>();


    
    
    private String name;
    private String title;
    private double sales;
    private double MinSales;
    private double MaxSales;
    private double AvgSales;
    private double TotalSales;
    
    public SalesPerson()
    {
            
    name = "Unknown";
    title = "Unknown";
    sales = 0.0;
    MinSales = 0.0;
    MaxSales = 0.0;
    AvgSales = 0.0;
    TotalSales = 0.0;
    }
    
    public SalesPerson(String name, String title, double sales, double MinSales, double MaxSales, double AvgSales, double TotalSales)
    {
        this.name = name;
        this.title = title;
        this.sales = sales;
        this.MinSales = MinSales;
        this.MaxSales = MaxSales;
        this.AvgSales = AvgSales;
        this.TotalSales = TotalSales;  
    }
    
       @Override
    public String toString()
    {       
        return name; //Only show SalesPerson's name
    }
    
    public String getDetails()
    {
     DecimalFormat fmt = new DecimalFormat( "$#,##0.00" );
     String output = name + "\n";
     output += title + "\n";
     output += "Sales: " + sales + "\n";
     output += "Minimum Sales Figures: " + MinSales + "\n";
     output += "Maximum Sales Figures: " + MaxSales + "\n";
     output += "Average Sales Figures: " + AvgSales + "\n";
     output += "Total Sales Figures: " + fmt.format(TotalSales); //currency
   
    return output;
    }
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public double getSales()
    {
        return sales;
    }

    public void setSales(double sales)
    {
        this.sales = sales;
    }

    public double getMinSales()
    {
        return MinSales;
    }

    public void setMinSales(double MinSales)
    {
        this.MinSales = MinSales;
    }

    public double getMaxSales()
    {
        return MaxSales;
    }

    public void setMaxSales(double MaxSales)
    {
        this.MaxSales = MaxSales;
    }

    public double getAvgSales()
    {
        return AvgSales;
    }

    public void setAvgSales(double AvgSales)
    {
        this.AvgSales = AvgSales;
    }

    public double getTotalSales()
    {
        return TotalSales;
    }

    public void setTotalSales(double TotalSales)
    {
        this.TotalSales = TotalSales;
    }
    
  
}           