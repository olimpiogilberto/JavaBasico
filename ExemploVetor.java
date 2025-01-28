/*
 * Array ou vetor em Java.
 *  Em java vetores s�o objetos e em raz�o disto necessitam ser declarados e instanciados.
 *  Como nas demais linguagens um vetor � acessado pelo indice, sendo que em java o primeiro �ndice � ZERO e o �ltimo
 *length-1, onde o atributo length armazena a quantidade de elementos do vetor.
 *  Exemplos de declara��o
 *  int Vetor[];//tipoDado nomeVetor[];
 *  int Vetor[];//tipoDado nomeVetor[];
 *  Exemplos de instancia��o
 *  vetor=new int[qtd];//nomeVetor= new tipoDado[qtd];
 *  Declara��o e Instancia��o em uma instru��o
 *  byte vetor[]= new byte[qtd];//tipoDado nomeVetor= nw tipoDado[qtd]   */

class ExemploVetor 
{
	
		public static void main(String[]ar)
		{
			String nome[]=new String[3];
		
		       nome[0]="Marcos";
		       nome[1]="Paulo";
		       nome[2]="Simone";
		       for(int i=0;i<nome.length;i++)
		       {
		    	   System.out.println(nome[i]);
		    	  
		       }
	}
}
