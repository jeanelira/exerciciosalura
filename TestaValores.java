
public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10; 
		
		// quanto vale o segundo?
		
		System.out.println(segundo);
		
		
		//O c�digo de Paulo para R�mulo possui algum problema? N�o a concatena��o pode ser feita sem problemas
		String saudacao = "Ol�, meu nome � ";
		String nome = "R�mulo ";
		String continuacao = "e minha idade � ";
		int idade = 100;
		System.out.println(saudacao+nome+continuacao+idade);
	}

}
