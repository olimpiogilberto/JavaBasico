//Exemplo usando if, else if, else

import javax.swing.*;
class Testaif {
	public static void main(String[] args) {
		byte idade=Byte.parseByte(JOptionPane.showInputDialog("Digite sua idade!"));
		/*Verificando se a idade � maior que zero*/
		if(idade>0)
		{
			System.out.println("Voc� tem "+idade+" anos.");
		}
		else
		{
			System.out.println("Idade inv�lida!");
		}
		/*Verificando se a idade est� dentro de um determinado intervalo*/
		if(idade>0 && idade<2)
		{
			System.out.println("Voc� � um beb�.");
		}
		else if(idade>=2 && idade<14)
		{
			System.out.println("Voc� � uma crian�a.");
		}
		else if(idade>=14 && idade<18)
		{
			System.out.println("Voc� � um adolescente.");
		}
		else if(idade>=18 && idade<60)
		{
			System.out.println("Voc� � um adulto.");
		}
		else if(idade>=60 && idade<127)
		{
			System.out.println("Voc� � um idoso.");
		}
		else//todos anteriores falsos
		{
			System.out.println("Idade inv�lida!");
		}
		}
	}
