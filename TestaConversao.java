public class TestaConversao{

    public static void main(String[] args){

        float pontoFlutuante = 3.14f;

        double salario = 1270.50;
        int valor = (int) salario;
      //casting--> para ler o double no int para não mostrar a casa decimal .50(int)
        System.out.println(valor);
       

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
    }
    
}
    //long numeroGrande = 32432423523L;= guarda numero muito grande
    //short valorPequeno = 2131;
	//byte b = 127;