/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm1104.labs;

/**
 *
 * @author 1812962
 */
public class CM1104Textbook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //6.1 Q1)
        int[] primes = {2,3,5,7,11};
        
        //6.1 Q2)
        for(int i = 0; i < 2; i++) {
            //changes first two elements to equal last two elements
            primes[4-i] = primes [i];            
        }
        
        //6.1 Q3)
        for(int i = 0; i<5; i++){
            //increases the value of each element by 1
            primes[i]++;
        }
        
        //6.1 Q4)
        int[] values = new int[10];
        values[0] = 10;
        values[values.length-1] = 10;
        
        //6.1 Q5)
        String[] words = new String[10];
        
        //6.1 Q6)
        String[] yesNo = { "Yes", "No" };
        
        //6.1 Q8)
        int counter = 0;
        //counts the number of 0 elements in the area        
        for(double element : values){
            if (element ==0){
                counter ++;
            }
        }
        
        //6.1 Q9)        
        for(double element : values){
            System.out.println(element);
        }
        
        //6.1 Q10)
        double[] factors = new double[10];
        double product = 1;
        for(double element : factors){
            product *= element;
        }
        
        //6.1 Q11)
        for (int i = 0; i < values.length; i++){
            values[i] = i*i;
        }
        /* the enhanced for loop can not substitue this loop
        because the enhanced loop does not have the index variable i
        */
        
        //6.1 Q13)
        int[] withZero = {0,5,6,7,0,2,3};
        int count = 0;
        //counts the zeros in an arry
        for(double element : withZero){
            if(element==0){
                count++;
            }
        }     
       
        
        
       
        
        
    }
    
}
