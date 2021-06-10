/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.strategy;

import java.util.Scanner;

/**
 *
 * @author Adunia
 */
public class Context {
    private final ISortStrategy strategy;
    
    public Context(ISortStrategy strategy)
    {
        this.strategy=strategy;
    }
    public void Sortuj(double[] input,int numer) 
    {
        System.out.println("Wybierz rodzaj sortowania: ");
        System.out.println("1 - sortowanie bąbelkowe");
        System.out.println("2 - sortowanie przez wstawianie");
        System.out.println("3 - sortowanie szybkie");
        System.out.println("4 - sortowanie przez wybór");

        
        switch(numer) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Podano zły numer");
        }
        strategy.Sortuj(input);
    }
    
}
