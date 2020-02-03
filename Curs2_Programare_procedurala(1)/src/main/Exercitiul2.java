package main;

public class Exercitiul2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double d=2.95;
	      int i=4;
	      System.out.println(++d>i?d:i);
	}

}

/* d=2.95, ++d=3.95, se afiseaza valoarea 4 deoarece daca "d" este mai mare decat "i" atunci s-ar fi afisat valoarea lui "d",
 * insa in acest caz "d" este mai mic decat "i" si valoarea afisata este valoarea lui "i" adica 4;
 * 
 * ++d>i?d:i este (o expresie logica ADEVARAT/FALS)?(o valoare):(alta valoare);
 */
