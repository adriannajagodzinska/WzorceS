/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.methods;

import sort.strategy.ISortStrategy;

/**
 *
 * @author LeopardProMK
 */
public class Insertionsort implements ISortStrategy
{

    @Override
    public void Sortuj(double[] tab) {
        int n = tab.length;
        for (int i = 1; i < n; ++i) {
            double key = tab[i];
            int j = i - 1;

            while (j >= 0 && tab[j] > key) {
                tab[j + 1] = tab[j];
                j = j - 1;
            }
        
            tab[j + 1] = key;   
        }
    }

    
}