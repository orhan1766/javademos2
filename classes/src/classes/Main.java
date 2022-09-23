package classes;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//Value type = Değişkenler değer tiplidir verdiğimiz değeri tutarlar.
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2); //Bence sayı 10 olur çünkü değerini değiştirmeden önce atama yaptık.
		
		//Referance type = Diziler referance tiplidir değer yerine adres tutarlar.
		int[] sayilar1 = {1,2,3};
		int[] sayilar2 = {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]); 
		
		
	}
}
