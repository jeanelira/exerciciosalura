
public class TestaPontoFlutuante {
//o metodo MAIN � o ponto de partida para que o programa inicie!
	public static void main(String[] args) { 
		double salario = 1250.70;
		
		System.out.println("meu sal�rio � " + salario);
		
		int idade = 29;
		System.out.println("minha idade � " + idade);
		
		double divisao = 3.14/2;
		System.out.println("o valor da divis�o � " + divisao);
		
		int outraDivisao = 5/2;
		System.out.println(outraDivisao);
		
		double novaTentativa = 5.0/2;
		//um dos dois operadores tem que ter o pontozero, exemplo esse 5.0 para o programa entender que � um ponto flutuante para com�pilar corretamete e dar o resultado esperado = 2.5
		System.out.println(novaTentativa);
		// um int cabe em um double, mas um double n�o cabe em um int
	}

} 
