import javax.swing.JOptionPane;
class Media 
{
	public static void main(String[]a)
	{
		float n1,n2;
		n1=Float.parseFloat(JOptionPane.showInputDialog("Digite o 1� numero"));
		n2=Float.parseFloat(JOptionPane.showInputDialog("Digite o 2� numero"));
		Media num1 = new Media();//cria��o do objeto n1 da classe media
		JOptionPane.showMessageDialog(null,/*null significa que a caixa de dialogo aparecera no centro da tela */
				"A m�dia = "+ num1.calcularMedia(n1,n2));//exibe mensagem para o usu�rio
	}
	public float calcularMedia(float num1 ,float num2 )
	{
		return((num1 + num2)/2);
		
	}//fim do calcular media
	
	
}//fim da classe
