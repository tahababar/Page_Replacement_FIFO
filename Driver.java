import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class Driver{
    
    public static void main(String[] args){

        System.out.println("Welcome to the simulator! We are using the FIFO algorithm.");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("How many virtual pages are in the process: ");
        int vp = sc.nextInt();
        System.out.println("How many frames are allocated to the process: ");
        int f = sc.nextInt();
        System.out.println("How many page references would you like to simulate: ");
        int pr = sc.nextInt();
        sc.close();
        
        int[] pages = new int[f];
        int[] pageRef = new int[pr];
        for(int i = 0; i < pr; i++){
            pageRef[i] = r.nextInt(vp) + 1;   
        }
 
        int pageFaultCount = 0;
        int i = 0;
        int j = 0;
 
        while (1 > 0){ 


                if (contains(pages, pageRef[i]) == false){
                    pages[j] = pageRef[i];
                    pageFaultCount++;
                    j++;
                }
                i++;
                if(i == pr){
                    break;
                }
                
                if (j == f){
                    j = 0;
                }
                //System.out.println(Arrays.toString(pageRef));
                //System.out.println(Arrays.toString(pages));
                
            }
            double p = pageFaultCount*100;
            double per = p/pr;
            System.out.println("The algorithm produced " + pageFaultCount + " page faults, or " + per + "%.");
            //System.out.println(Arrays.toString(pageRef));
            //System.out.println(Arrays.toString(pages));
        


        



    }
    public static boolean contains(int[] array, int v) {

        boolean result = false;

        for(int i = 0; i < array.length; i++){
            if(array[i] == v){
                result = true;
                break;
            }
        }

        return result;
    }
}