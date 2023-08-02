
public class Exemplo1 {

	public static void main(String[] args) {
	String s = "hoje tem aula";
			System.out.println(s.charAt(s.length()-1));
			s = s.toUpperCase();
			System.out.println(s);
			
			s = s.replace(' ', '*');
			System.out.println(s);
	}

}
