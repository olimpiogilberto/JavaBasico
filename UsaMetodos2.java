

import javax.swing.*;

public class UsaMetodos2
{ 
	private static short res;

	public static void main (String args[])
	{//mensagem de boas vindas
		JOptionPane.showMessageDialog(null, "Seja Bem Vindo", "Programa de Calculos", JOptionPane.INFORMATION_MESSAGE );
		for(int opcao=0; opcao==0;){
		byte escolha = Byte.parseByte(JOptionPane.showInputDialog("Escolha: \n 1-Soma \n 2-Subtra��o \n 3-Multiplica��o \n 4-Divis�o \n 5-potencia��o\n 6-tabuada\n 7-fatorial\n 8-numero perfeito\n 9-IMC"));
		if(escolha == 1){
			float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
			float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo n�mero"));
			          JOptionPane.showMessageDialog(null, n1 +"+" + n2 + "=" + Calculos.soma(n1, n2));	
		} 
		else if(escolha == 2){
			float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
			float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo n�mero"));
			          JOptionPane.showMessageDialog(null, n1 +"-" + n2 + "=" + Calculos.subtra��o(n1, n2));	
		}
		else if(escolha == 3){
			float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
			float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo n�mero"));
			          JOptionPane.showMessageDialog(null, n1 +"*" + n2 + "=" + Calculos.multiplica��o(n1, n2));	
		}
		else if(escolha == 4){
			float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
			float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo n�mero"));
			          JOptionPane.showMessageDialog(null, n1 +"/" + n2 + "=" + Calculos.divis�o(n1, n2));	
		}
		else if(escolha == 5){
			byte base = Byte.parseByte(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
			byte expoente = Byte.parseByte(JOptionPane.showInputDialog("Digite o segundo n�mero"));
			          JOptionPane.showMessageDialog(null, base +"�" + expoente + "=" + Calculos.potencia(base , expoente));	
		}
		else if(escolha == 6){
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
			int k = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
			          JOptionPane.showMessageDialog(null, num +"�" + k + "=" + Calculos.tabuada(num , k));	
		}
		else if(escolha == 7){
			short num = Short.parseShort(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
			
			          JOptionPane.showMessageDialog(null, num +"�=" + Calculos.fatorial(res));	
		}
		else if(escolha == 8){
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
			
			          JOptionPane.showMessageDialog(null, n1 +"�" + n2 + "=" + Calculos.perfeito(b , exnte));	
		}
		else if(escolha == 9){
			float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
			float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo n�mero"));
			          JOptionPane.showMessageDialog(null, n1 +"�" + n2 + "=" + Calculos.imc(b , e));	
		}
		opcao=JOptionPane.showConfirmDialog(null, "Deseja continuar", "programa Calculos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);}
	
	}
	
}
