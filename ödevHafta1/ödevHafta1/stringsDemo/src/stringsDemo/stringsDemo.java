package stringsDemo;

public class StringsDemo {

	public static void main(String[] args) {

		 String mesaj = "Bugün Hava Çok Güzel.";
		System.out.println(mesaj);
		/*
		System.out.println("Eleman sayısı:" + mesaj.length());
		System.out.println("5.Eleman:" + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj.startsWith("A")); // true ya da false değerini gösterir bize A ile başlıyorsa doğru değeri verecektir. case sensitive dikkat et!
		System.out.println(mesaj.endsWith(".")); // buda ne ile bittiğini belirtiyoruz bize sonuç true ya da false döndürüyor girdiğimiz karaktere göre.
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.lastIndexOf('e'));*/
		
		String yeniMesaj=	(mesaj.replace(' ' , '-') );// değiştirme. ilgili metindeki değerler değiştirilebiliyor. Burada boşluklar yerine çizgi ekleniyor.
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2));// mesajı 2.harfen sonra parçalıyor. Genel olarak parçalamaya yarıyor.
		System.out.println(mesaj.substring(2,5));// mesajı 2.harfen sonra 5. harfe kadar parçalıyor  Genel olarak parçalamaya yarıyor.
		
		for(String kelimeler:mesaj.split(" ")) { // burada boşluğa göre ayırmaya yarıyor.
			System.out.println(kelimeler);	
		}
		System.out.println(mesaj.toLowerCase());// Bütün harfleri küçük harfe çevirir.
		System.out.println(mesaj.toUpperCase());// Bütün harfleri büyük harfe çevirir.
		
		System.out.println(mesaj.trim());// Başta ve sonra boşluk varsa bu boşlukları kaldırmaya yarıyor.


	}

}
