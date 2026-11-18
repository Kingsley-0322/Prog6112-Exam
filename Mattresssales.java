/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattresssales;

import java.util.Scanner;

/**
 *
 * @author Student
 */

public class Mattresssales {
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      
      String[] products = {"Cozy Nights Monarch", "Restonic Barbbados", "Sealy Phuket"};
      int [][] sales = new int[3][3];
      
      for (int i=0; i<3;i++){
          for (int j=0;j<3;i++){
              System.out.print("Enter the number of sales of month" + (j+1) + "for" + products[i]+ "mattress: ");
              sales[i][j]= sc.nextInt();
          }
      }
      Product product = new Product(products,sales);
      PrintProduct printer = new PrintProduct(product);
      printer.PrintReport();
      sc.close();
  }
}
  
  
