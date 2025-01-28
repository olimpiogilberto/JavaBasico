
class Exemplo0303
{
	public static void main (String args[])
	{
		try
		{
			int num1 = Integer.parseInt(args [0]);
			int num2 = Integer.parseInt(args [1]);
			System.out.println("Soma = " + (num1 + num2));
			System.out.println("Subtra��o = " + (num1 - num2));
			System.out.println("Multiplica��o = " + (num1 * num2));
			System.out.println("Divis�o = " + (num1 / num2));
		}
		catch (ArithmeticException erro)
		{
			System.out.println("Erro de divis�o por zero!");
		}
		catch (ArrayIndexOutOfBoundsException erro)
		{
			System.out.println("Numero de argumentos invalidos.");
		}
		catch (NumberFormatException erro)
		{
			System.out.println("Digite apenas numeros inteiros.");
		}
	}

}
