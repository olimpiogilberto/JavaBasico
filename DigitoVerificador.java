    /*01*/ import javax.swing.JOptionPane;/*utiliza��o para caixa de dialogo*/
	/*02*/ public class DigitoVerificador //inico do corpo da classe digitoverificador
	/*03*/ {
	/*04*/            public static void main(String args[])//m�todo necess�rio para que a classe seja executada
	/*05*/            {//inicio m�todo main
	/*06*/    	String strOriginal = JOptionPane.showInputDialog("Digite o n�mero:");//
	/*07*/                  String num = strOriginal;
	/*08*/                  int tamanho = num.length();//o m�todo length retorna o n�mero de caracters da string
	/*09*/                  int soma = 0;//
	/*10*/                  if (tamanho==1) soma = Integer.parseInt(num);//    
	/*11*/                  while (tamanho >1)
	/*12*/                 {
	/*13*/                         soma = 0;
	/*14*/                         for (int i = 0; i< tamanho; i++)
	/*15*/                        {
	/*16*/                              soma+= Integer.parseInt(num.substring(i,i+1));//o m�todo substring retorna o caracter na posi��o indicada ou os caracteres na proxima ou do inicio at� seu final
	/*17*/                        }
	/*18*/                        num = Integer.toString(soma);//convers�o de inteiro para string
	/*19*/                        tamanho = num.length();
	/*20*/                 }	  
	/*21*/                 String resultado = strOriginal+ "-" + soma;
	/*22*/                 JOptionPane.showMessageDialog(null,"O n�mero com seu d�gito "+
	/*23*/                           "verificador �: "+ resultado);
	/*24*/            }
	/*25*/ }
	
