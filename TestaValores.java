
public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10; 
		
		// quanto vale o segundo?
		
		System.out.println(segundo);
		
		
		//O código de Paulo para Rômulo possui algum problema? Não a concatenação pode ser feita sem problemas
		String saudacao = "Olá, meu nome é ";
		String nome = "Rômulo ";
		String continuacao = "e minha idade é ";
		int idade = 100;
		System.out.println(saudacao+nome+continuacao+idade);
	}

}
