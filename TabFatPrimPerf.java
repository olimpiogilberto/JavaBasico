import javax.swing.*;
public class TabFatPrimPerf 
{
	public static void main(String[] ar)
	{
		int ops = 0 ;
		ops = Integer.parseInt(JOptionPane.showInputDialog("Informe que tipo de opera��o deseja realizar."+"\n"+"1 perfeito, 2 fatorial, 3 primo, 4 tabuada."));

		switch(ops)
		{
		case 1:
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero pra saber se ele � perfeito."));

			TabFatPrimPerf Per = new TabFatPrimPerf();
			int resp = Per.per(num);
			if(resp == 1)
			{
				JOptionPane.showMessageDialog(null,"O n�mero "+num+" � perfeito.");
			}
			else if(resp == 2)
			{
				JOptionPane.showMessageDialog(null,"O n�mero "+num+" n�o � perfeito.");
			}
			break;
		case 2:
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero pra fazer o seu fatorial."));
			TabFatPrimPerf Fat = new TabFatPrimPerf();
			JOptionPane.showMessageDialog(null,"O fatorial � "+Fat.fat(num));
			break;
		case 3:
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero pra saber se ele � primo."));		
			TabFatPrimPerf Pri = new TabFatPrimPerf();
			resp = Pri.pri(num);
			if(resp == 1)
			{
				JOptionPane.showMessageDialog(null,"O n�mero � primo");
			}
			else if(resp == 2)
			{
				JOptionPane.showMessageDialog(null,"O n�mero n�o � primo");
			}

			break;
		case 4:
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para c�lculo da tabuada."));		
			TabFatPrimPerf Tab = new TabFatPrimPerf();
			String chana = "";
			for(int i = 0;i <= 10; i++)
			{
				chana += "\n"+ i +" x "+num+" = "+Tab.tab(num,i);
			}
			JOptionPane.showMessageDialog(null,chana);
			break;
		default:
			JOptionPane.showMessageDialog(null,"Dado incorreto");
		}
	}
	public int per(int num)
	{
		int numero = num;
		int k=1,soma=0;
		for(int i=1;i < numero;i++)
		{
			if(numero % k == 0)
			{
				soma += k;
			}
			++k;
		}
		if(numero == soma)
		{			
			return 1;
		}
		else
		{
			return 2;
		}
	}

	public int fat(int num)
	{
		int i,resul=0;
		for(i = num;i>=0;i--)
		{
			resul += num*(num-1);
		}
		return resul;
	}

	public int pri(int num)
	{
		int r = 0;
		for(int i=2;i<num;i++)
		{
			int resu = num % i;
			if(resu == 0)
			{
				r = 1;
				break;
			}
		}

		if(r == 0)
		{
			return 1;
		}
		else
		{
			return 2;
		}		
	}

	public int tab(int num, int k)
	{
		return (num * k);
	}	
}



