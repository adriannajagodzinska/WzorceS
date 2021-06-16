/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystrategy;

import data.DataGenerator;
import java.util.Scanner;
import sort.methods.Bubblesort;
import sort.methods.Insertionsort;
import sort.methods.Quicksort;
import sort.methods.Selectionsort;
import sort.strategy.Context;
import sort.strategy.ISortStrategy;

/**
 *
 * @author LeopardProMK
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Algorytmy sortowania */
        // http://www.algorytm.org/algorytmy-sortowania/
        
        double[] dataNonSort = DataGenerator.generate(100000);
        
        Context bubblesort = new Context(new Bubblesort());
        long bubblestart = System.currentTimeMillis();
	bubblesort.Sort(dataNonSort);
	long bubblestop = System.currentTimeMillis();
	System.out.println("Bubblesort: " + (bubblestop - bubblestart) + " ms");
        
        Context insertionsort = new Context(new Insertionsort());
        long insertstart = System.currentTimeMillis();
	insertionsort.Sort(dataNonSort);
	long insertstop = System.currentTimeMillis();
	System.out.println("Insertionsort: " + (insertstop - insertstart) + " ms");
        
        Context quicksort = new Context(new Quicksort());
        long quickstart = System.currentTimeMillis();
	quicksort.Sort(dataNonSort);
	long quickstop = System.currentTimeMillis();
	System.out.println("Quicksort: " + (quickstop - quickstart) + " ms");
        
        Context selectionsort = new Context(new Selectionsort());
        long selectionstart = System.currentTimeMillis();
	selectionsort.Sort(dataNonSort);
	long selectionstop = System.currentTimeMillis();
	System.out.println("Selectionsort: " + (selectionstop - selectionstart) + " ms");
   
    }
}
