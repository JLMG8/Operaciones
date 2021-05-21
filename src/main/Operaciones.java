
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
            int[] nums = new int[b-a];
            for (int i=a; i<b; i++){
                    nums[i]=i;
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
            for (int i=a; i<b; i++){
                    sum+=i;
            }
            return sum;
    }
    
    /**
     * Método que recibe un parámetro entero y retorna un booleano luego de comprobar si el parámetro era par o impar.
     * (True == Par || False == Impar)
     * @param a valor entero.
     * @return Boolean
     */
    public boolean isPar(int a){
            if(a%2==0){
                    return true;
            }
            return false;
    }

    /**
     * Método que recibe un array de enteros como parámetro y retorna otro array de enteros solo con los números positivos que habia en el primero.
     * @param nums Array de enteros.
     * @return int[] Array de enteros.
     */
    public int[] extraerPositivos(int []nums){

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
