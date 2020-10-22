
public class SumofNaturalNumbers {
	int n=3,i,sum=0;
	public void calculateSum() {
		for(i=0;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			} 
		}
		System.out.println("The sum is "+ sum);
	}
	public static void main(String[] args) {
		SumofNaturalNumbers obj=new SumofNaturalNumbers();
		obj.calculateSum();
	}

}
