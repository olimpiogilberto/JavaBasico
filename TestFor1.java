import javax.swing.JOptionPane;

/* Estrutura for Sintaxe: for(declara��o;condi��o;incrementa��o /decrementa��o)
 * {
 * Comandos at� que condi��o verdadeira
 * }
 * Exemplos*/
class TestFor1 
{
	public static void main(String ar[])
	  {
		for(int i=0;i<2;i++)
		{
			String nome=JOptionPane.showInputDialog("Digite o nome");
			  int idade=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		}
		}

}
