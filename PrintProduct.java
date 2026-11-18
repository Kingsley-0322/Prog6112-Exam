/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssales;

/**
 *
 * @author Student
 */
public class PrintProduct {
    private Product product;
    
    public PrintProduct(Product product){
        this.product = product;
    }
    public void PrintTotal(){
        System.out.println("TOTAL PRODUCT SALES: " + product.GetAverageProductSold());
    }
    public void PrintAverage(){
        System.out.println("AVERAGE PRODUCT SALES: " + (int) product.GetAverageProductSold());
    }
    public  void PrintMostPopular() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
    public void PrintReport(){
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("***********************");
        PrintTotal();
        PrintAverage();
        PrintMostPopular();
    }
}
