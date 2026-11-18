/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssales;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Student
 */
public class ProductTest {
    

    private Product getSampleProduct() {
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };
        return new Product(products, sales);
    }

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        Product p = getSampleProduct();
        assertEquals(153, p.GetTotalProductSales());
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        Product p = getSampleProduct();
        assertEquals(17.0, p.GetAverageProductSold(), 0.01);
    }
}

