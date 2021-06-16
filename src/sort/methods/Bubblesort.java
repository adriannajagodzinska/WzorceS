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
public class Bubblesort implements ISortStrategy
{

    @Override
    public void Sortuj(double[] tab) {
        
        int n = tab.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (tab[j] > tab[j+1])
                {
                    double temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
    }


    /* http://www.algorytm.org/algorytmy-sortowania/sortowanie-babelkowe-bubblesort.html */
}
