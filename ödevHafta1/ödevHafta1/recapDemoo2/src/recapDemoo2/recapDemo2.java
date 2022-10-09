package recapDemoo2;

public class RecapDemo2 {

	public static void main(String[] args) {
		double [] myList = {1.2,1.3,4.3,5.6};
		double total = 0;
		double max = myList[0];
		
		for(double number:myList) {
			System.out.println(number);
			if(max<number) {
				max=number;
			}
			total = total+number;
			
		}
		System.out.println("Sayıların toplamı:"+total);
		System.out.println("En Büyük Sayı:"+max);
		
		
	}

}
