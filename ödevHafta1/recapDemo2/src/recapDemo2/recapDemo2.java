package recapDemo2;

public class RecapDemo2 {

	public static void main(String[] args) {

		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel!: Geçtiniz.");
			break;
		case 'B': // İki farklı casein çıktısı aynı olsun istiyorsak bu şekilde yazabiliriz.
		case 'C':
			System.out.println("İyi: Geçtiniz.");
			break;
		case 'D':
			System.out.println("Fena Değil: Geçtiniz.");
			break;
		case 'F':
			System.out.println("Maalesef: Kaldınız.");
			break;

		default:
			System.out.println("Geçersiz Bir Not Girdiniz.");
		}
	}

}
