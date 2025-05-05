package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
    	System.out.println("Operator Code:\n1 = +\n2 = -\n3 = x\n4 = %");
    	
        while(true){
            start();
        }
        
    }
	
	
    static void start(){
    	
        System.out.print("\nEnter Operator Code: ");
        
        try{
            int op=sc.nextInt();
            
            if(op==0){
                System.out.println("\nExited From Calculator");
                System.exit(0);
            }else{
                operation(op);
            }
        }catch(InputMismatchException i){
            System.out.println("\nInvalid Input");
            sc.next();
        }
    }
    
    
    static void operation(int op){
    	
        if(op>4){
            System.out.println("Invalid Input");
            start();
        }
        
        System.out.print("\nEnter Number of Input: ");
        
        try{
            int n=sc.nextInt();
            
            if(n==0){
                start();
            }else if(n<2){
            	System.out.println("Provide "+(n<1?"positive number":"more then one number"));
            }else {
            	int[] arr = new int[n];
                for(int i=0;i<n;i++){
                	try {
                		System.out.print("Enter Input("+(i+1)+"): ");
                    	int t=sc.nextInt();
                    		arr[i]=t;
                	}catch(InputMismatchException e){
                		System.out.print("Invalid Input\n");
                		i--;
                        sc.next();
                    }
                }
                
                int val=arr[0];
                float div=arr[0];
                
                switch(op){
                        case 1:
                        	for(int i=1;i<arr.length;i++){
                                val+=arr[i];
                            }
                            break;
                        case 2:
                        	for(int i=1;i<arr.length;i++){
                                val-=arr[i];
                            }
                            break;
                        case 3:
                        	for(int i=1;i<arr.length;i++){
                                val*=arr[i];
                            }
                            break;
                        case 4:
                        	for(int i=1;i<arr.length;i++){
                                if(arr[i]!=0){
                                    div/=arr[i];
                                }else {
                                    throw new ArithmeticException("Number Divided by zero");
                                }
                            }
                            break;
                    }
                if (op == 4) {
                    System.out.println("\nOutput: " + div);
                } else {
                    System.out.println("\nOutput: " + val);
                }

         }
         
        }catch(ArithmeticException a){
            System.out.println(a.getMessage());
        }catch(InputMismatchException e){
            System.out.println("\nInvalid Input");
            sc.next();
        }
            
    }
}
