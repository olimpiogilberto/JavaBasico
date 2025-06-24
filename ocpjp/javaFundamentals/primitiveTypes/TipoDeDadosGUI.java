package ocpjp.javaFundamentals.primitiveTypes;

import javax.swing.*;
import java.awt.*;
import java.math.BigInteger;

public class TipoDeDadosGUI extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField valorField;
    private JLabel resultadoLabel;

    public TipoDeDadosGUI() {
        setTitle("Teste de Tipos Primitivos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // Estilo moderno
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Campo de entrada no topo
        valorField = new JTextField();
        valorField.setPreferredSize(new Dimension(300, 30));
        add(valorField, BorderLayout.NORTH);

        // Painel com botões em um GridLayout
        JPanel botoesPanel = new JPanel(new GridLayout(4, 3, 10, 10));

        String[] tipos = { "byte", "short", "int", "long", "float", "double", "char", "boolean", "String", "Integer", "BigInteger" };

        for (String tipo : tipos) {
            JButton botao = new JButton(tipo);
            botao.addActionListener(e -> testarValor(tipo));
            botoesPanel.add(botao);
        }

        add(botoesPanel, BorderLayout.CENTER);

        // Resultado na parte inferior
        resultadoLabel = new JLabel("Resultado aparecerá aqui", SwingConstants.CENTER);
        resultadoLabel.setFont(new Font("Arial", Font.BOLD, 14));
        add(resultadoLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void testarValor(String tipo) {
        String entrada = valorField.getText();
        String resultado;

        try {
            switch (tipo) {
                case "byte":
                    byte b = Byte.parseByte(entrada);
                    resultado = "byte válido: " + b + " | Faixa: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE;
                    break;
                case "short":
                    short s = Short.parseShort(entrada);
                    resultado = "short válido: " + s + " | Faixa: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE;
                    break;
                case "int":
                    int i = Integer.parseInt(entrada);
                    resultado = "int válido: " + i + " | Faixa: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE;
                    break;
                case "long":
                    long l = Long.parseLong(entrada);
                    resultado = "long válido: " + l + " | Faixa: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE;
                    break;
                case "float":
                    float f = Float.parseFloat(entrada);
                    resultado = "float válido: " + f + " | Faixa: " + Float.MIN_VALUE + " a " + Float.MAX_VALUE;
                    break;
                case "double":
                    double d = Double.parseDouble(entrada);
                    resultado = "double válido: " + d + " | Faixa: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE;
                    break;
                case "char":
                    resultado = (entrada.length() == 1) ? "char válido: '" + entrada + "'" : "Char inválido: insira 1 caractere";
                    break;
                case "boolean":
                    resultado = "Interpretado como boolean: " + Boolean.parseBoolean(entrada);
                    break;
                case "String":
                    resultado = "Você digitou a String: \"" + entrada + "\"";
                    break;
                case "Integer":
                    Integer integer = Integer.valueOf(entrada);
                    resultado = "Integer válido: " + integer;
                    break;
                case "BigInteger":
                    BigInteger bigInteger = new BigInteger(entrada);
                    resultado = "BigInteger válido: " + bigInteger;
                    break;
                default:
                    resultado = "Tipo não reconhecido.";
            }
        } catch (NumberFormatException e) {
            resultado = "Valor inválido para tipo " + tipo;
        }

        resultadoLabel.setText(resultado);
        System.out.println("[" + tipo + "] " + resultado);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TipoDeDadosGUI());
    }
}
