
public class TesteCondicional2 {

	public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 18;
        int quantidadePessoas = 1;
        boolean acompanhado = true; // s� pode ser colocado true assim n�o pode colocar entre aspas

        if (idade >= 18 && acompanhado) {
            
            System.out.println("Seja bem vindo");
        } else {
        	System.out.println("infelizmente voce nao pode entrar");
            }
        }
    }




//int idade = 68;
//boolean ehIdoso = idade >= 65;  resultado � true

//operadores l�gicos and && e or ||