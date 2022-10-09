package loopDemo;

public class LoopDemo {

	public static void main(String[] args) {
		//FOR
		for(int i=0;i<=10;i+=2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		
		
		//WHILE  for döngüsü gibi fakar burada bir sayaç durumu söz konusu. Bu sayacıda yazdırma işleminden sonra ekliyoruz.
		int i=1;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("while Döngüsü Bitti");
		
		//DO WHILE  : while döngüsü ile aynı farkı ise şart sağlanmasa bile ekrana bir kere çıktı verir.
		int j=100;
		do {
			System.out.println(j);
			j+=2;
		}
		while(j<10);
		
		System.out.println("Do While Döngüsü Bitti");
	}
	

}
