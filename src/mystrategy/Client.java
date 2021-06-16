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
        
//        PYTANIA
//
//1. Proszę o podanie głównego celu zastosowania wzorca strategii.
// Odpowiedź: Głównym celem zastosowania wzorca strategii jest to, że minimalizuje się kod oraz fakt, że
//można dołożyć kolejny typ strategii bez konieczności zmiany całego kodu.
//
//2. Czy istnieje możliwość zmiany algorytmu w czasie działania programu?
// Odpowiedź: Tak w trakcie działania alogorytmu możliwa jest zmiana strategii. Np gdybyśmy posiadali aplikację okienkową, w której
// należy wybrać sposób strategii możliwa byłaby jej zmiana.
//3. W jaki sposób wzorzec enkapsuluje poszczególne algorytmy?
// Odpowiedź: Wzorzec enkapsulowano poprzez utworzenie interfejsu ISortStrategy, po którym metody sortowanai dziedziczą. Wobec tego najbardziej 
// zewnętrzny jest interfejs, a metody sortowanai są dostępne tylko dla niego.
//4. Kiedy stosować wzorzec strategii?
// Odpowiedź: Wzorzec strategii można stosować kiedy mamy kilka możliwych rozwiązań tego samego problemu - np. wywołując zdjęcie mamy możliwość
// wywołania go w kolorze (strategia pierwsza) lub wywołać go w monochromie (strategia druga).
        
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
