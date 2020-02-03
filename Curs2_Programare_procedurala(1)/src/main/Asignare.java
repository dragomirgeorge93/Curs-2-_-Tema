package main;

public class Asignare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=(a=2)*a; // b=2*2
		int c=b*(b=5); // se ia valoarea de la b-ul superior(b=4) si se inmulteste cu noua valoarea atribuita lui b(b=5)
		
			System.out.println("a=" + a + ",b=" + b + ",c=" + c);
	}

}

/* a=2,b=5,c=20,  valorile sunt variabile si se pot schimba pe toata durata programului, 
 * a este initial egal cu 3 apoi valoarea este schimbata si a ia valoarea 2;
 * la fel si pentru b care initial este egal cu 4 apoi valoarea este schimbata si b=5;
 *  pentru calculul lui c=4*5=20;
 */
 