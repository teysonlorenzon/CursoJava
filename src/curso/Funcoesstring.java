package curso;

public class Funcoesstring {

	public static void main(String[] args) {
		
		
		String original = "abcde FGDHI ABC abc DEFG";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a','x');
		String s07 = original.replace("abc","xy");

	}

}
