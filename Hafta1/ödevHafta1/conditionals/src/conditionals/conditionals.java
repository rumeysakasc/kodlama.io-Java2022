package conditionals;

public class Conditionals {

	public static void main(String[] args) {
		//Şart blokları.
		int sayi=20;
		
		if(sayi<20) { // sayı 20'den küçükse bu kod bloğu çalışır.
			System.out.println("Bu sayı 20'den küçüktür.");
		}
		else if(sayi==20){ // sayı 20ye eşitse bu kod bloğu çalışır.
			System.out.println("Sayı 20ye eşittir.");
		}
		else { // sayı 20'den büyükse bu kod bloğu çalışır.
			System.out.println("Sayı 20'den büyüktür.");
		}

	}

}
