package main;

public class Exercitiul3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		if(++a<4)
			if(a++<4)
				System.out.println(a);
			else
				System.out.println(a);
	}

}

/* ++a=4 deoarece intai se incrementeaza apoi se afiseaza si prin urmare o sa fie:
if(4<4)FALSE, blocurile urmatoare de if si else nu se mai executa;
*/