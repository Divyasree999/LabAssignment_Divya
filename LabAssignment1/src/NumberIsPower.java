
public class NumberIsPower {
	public static int checkNumber(int n) {
        if(n == 0) 
        return 0; 
        while(n != 1) 
        {  
            if(n % 2 != 0) 
            return 0; 
            n = n / 2;      
        } 
        return 1; 
    }  
	public static void main(String[] args) {
		int n=8;
		if(checkNumber(n) == 1) 
         System.out.println(n + " is a power of 2"); 
        else
         System.out.println(n + " is not a power of 2");

	}
}
