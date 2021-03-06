
package main;

/**
 * Clase que contiene las operaciones propuestas en el ejercicio. 
 * 
 * @author JLMG8
 * @author sonix
 * 
 */

public class Operaciones{
    /**
     * Método que recibe dos parámetros enteros y retorna un array con los valores comprendidos entre los dos parámetros.
     * El array retornado incluye los dos parámetros.
     * @param a valor entero.
     * @param b valor entero.
     * @return int[] retorna un array de enteros. 
     */
    public int[] rango (int a, int b){       
        int size = 0;
        
        if (b>a){
            size = (b-a)+1;
        } else {
            size = (a-b)+1;
            a=b;
        }
        
        int[] nums = new int[size];
        
        for (int i=0; i<size; i++){
            nums[i]=a;
            a += 1;
        }
        return nums;
    }
    
    /**
     * Método que recibe dos parámetros enteros y retorna un valor entero con la suma de todos los valores que hay entre ambos parámetros.
     * suma tambien los parámetros.
     * @param a valor entero.
     * @param b valor entero.
     * @return int retorna un entero.
     */
    public int sumRango(int a, int b){
            int sum = 0;
            
            if (a>b){
                int aux = b;
                b = a;
                a = aux;
            }
            
            for (int i=a; i<=b; i++){
                    sum+=i;
            }
            return sum;
    }
    
    /**
     * Método que recibe un parámetro entero y retorna un booleano luego de comprobar si el parámetro era par o impar.
     * (True == Par || False == Impar)
     * @param a valor entero.
     * @return Boolean
     * @throws IllegalArgumentException se genera esta excepción en caso de que el parametro sea menor o igual a 0.
     */
    public boolean isPar(int a) throws IllegalArgumentException{
        if (a <= 0){
            throw new IllegalArgumentException();
        }
        
        if(a%2==0){
                return true;
        }
        return false;
    }
    
    /**
     * Método que recibe un array de enteros como parámetro y retorna otro array de enteros solo con los números positivos que habia en el primero.
     * @param nums Array de enteros.
     * @return int[] Array de enteros.
     * @throws IllegalArgumentException se genera esta excepción en caso de que el parametro pasado sea null.
     */
    public int[] extraerPositivos(int []nums) throws IllegalArgumentException{
        
        if (nums == null){
            throw new IllegalArgumentException();
        }
        
        int n=0;
        for (int i=0; i<nums.length; i++){
            if(nums[i]>0){
                n++;
            }
        }

        int []positivos = new int[n];
        int j=0;
        for (int i=0; i<nums.length; i++){
            if(nums[i]>0){
                positivos[j]=nums[i];
                j++;
            }
        }
        return positivos;
    }    
}
