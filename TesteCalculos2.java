import javax.swing.*;
class TesteCalculos2
{
	 public static void main(String args[])
     {
     System.out.println("\n\n(1)Adi��o\n(2)Subtra��o\n(3)Multiplica��o\n(4)Divis�o\n(5)Potencia��o\n(6)Tabuada\n(7)sair");

	     
	    	  int opcao = 0;
	    		while (opcao != 6)
	    		{
	    		opcao = Integer.parseInt(JOptionPane.showInputDialog(" Qual opera��o vc quer fazer? "));
	    		if ((opcao > 6)||(opcao <1)) continue;  /* Opcao invalida: volta ao inicio do loop */ 
	    		{
	    		  switch (opcao)
	    		 
	    		  
	    		  {
	    		  case 1: System.out.println("Adi��o      " ); break;
	    		
	    		  case 2: System.out.println("Subtra��o   " ); break;
	    		  
	    		  case 3: System.out.println("Multiplica��o"); break;
	    		
	    		  case 4: System.out.println("Divis�o      "); break;
	    	
	    		  case 5: System.out.println("Potencia��o  "); break;
	    		
	    		  case 6: System.out.println("Tabuada      "); break;
	    	
	    		 default: System.out.println("Sair");
	    		  }
	     	  }
	    		return;
	    		}
	      }
}
	    	
	     
		




