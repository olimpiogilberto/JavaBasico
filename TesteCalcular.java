
public class TesteCalcular
{


	      public static void main(String args[])
	      {
	    	  if (args.length == 1)
	    	  {
	    		  int x;
	    		  x = Integer.parseInt(args[0]);
	    		  switch (x)
	    		  {
	    		  case 0: System.out.println("Adi��o      " ); break;
	    		  case 1: System.out.println("Subtra��o   " ); break;
	    		  case 2: System.out.println("Multiplica��o"); break;
	    		  case 3: System.out.println("Divis�o      "); break;
	    		  case 4: System.out.println("Potencia��o  "); break;
	    		  case 5: System.out.println("Tabuada      "); break;
	    		 default: System.out.println("Numero desconhecido");
	    		  }
	     	  }
	    	  else
	    	  {
	    		  System.out.println("Numero de argumentos invalidos.");
	    		  
	    	  }
	      }
		

	}


