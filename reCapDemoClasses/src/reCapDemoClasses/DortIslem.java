package reCapDemoClasses;

public class DortIslem {
	public int Topla(int...sayilar) {
		int toplam = 0;
		for (int i : sayilar) {
			toplam += i;
		}
		return toplam;
	}
}
