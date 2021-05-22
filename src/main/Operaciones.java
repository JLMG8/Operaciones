
package main;

class Operaciones{
    
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

    public int sumRango(int a, int b){
            int sum = 0;
            for (int i=a; i<b; i++){
                    sum+=i;
            }
            return sum;
    }

    public boolean isPar(int a){
            if(a%2==0){
                    return true;
            }
            return false;
    }

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
