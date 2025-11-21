package CAP12;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.Graphics2D;

public class C12EX13 extends JFrame {

  JLabel ROTUL2;
  JLabel ROTUL3;

  JComboBox<String> LISTA;

  // image support
  JLabel IMAGEM;
  ImageIcon ICONE;
  private static final int FLAG_W = 300;
  private static final int FLAG_H = 200;

  String ESTADO[] = {
    "Acre", "Alagoas", "Amapá",
    "Amazonas", "Bahia", "Ceará",
    "Distrito Federal", "Espírito Santo", "Goiás",
    "Maranhão", "Mato Grosso", "Mato Grosso do Sul",
    "Minas Gerais", "Pará", "Paraíba",
    "Paraná", "Pernambuco", "Piauí",
    "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul",
    "Rondônia", "Roraima", "Santa Catarina",
    "São Paulo", "Sergipe", "Tocantins"
  };

  String UNIFED[] = {
    "AC", "AL", "AP",
    "AM", "BA", "CE",
    "DF", "ES", "GO",
    "MA", "MT", "MS",
    "MG", "PA", "PB",
    "PR", "PE", "PI",
    "RJ", "RN", "RS",
    "RO", "RR", "SC",
    "SP", "SE", "TO"
  };

  String CAPITAL[] = {
    "Rio Branco", "Maceió", "Macapá",
    "Manaus", "Salvador", "Fortaleza",
    "Brasília", "Vitória", "Goiânia",
    "São Luís", "Cuiabá", "Campo Grande",
    "Belo Horizonte", "Belém", "João Pessoa",
    "Curitiba", "Recife", "Teresina",
    "Rio de Janeiro", "Natal", "Porto Alegre",
    "Porto Velho", "Boa Vista", "Florianópolis",
    "São Paulo", "Aracaju", "Palmas"
  };

  public C12EX13() {

    super("Estados Brasileiros - v. 2.0");
    Container CONT = getContentPane();

    JLabel ROTUL1 = new JLabel("Selecione um Estado");
    JLabel ROTUL4 = new JLabel("Capital:");
    JLabel ROTUL5 = new JLabel("Unidade Federativa:");

    LISTA  = new JComboBox<>(ESTADO);

    ROTUL2 = new JLabel(CAPITAL[0]);
    ROTUL3 = new JLabel(UNIFED[0]);

    // load initial flag from classpath /CAP12/{CODE}.jpg
    ICONE = loadFlagIcon(UNIFED[0], FLAG_W, FLAG_H);
    IMAGEM = new JLabel(ICONE);

    ImageIcon BRASAO = loadFlagIcon("br-arma1", 32, 32);
    if (BRASAO != null) setIconImage(BRASAO.getImage());

    ROTUL2.setHorizontalAlignment(JLabel.RIGHT);
    ROTUL3.setHorizontalAlignment(JLabel.RIGHT);

    setLayout(null);
 
    CONT.add(ROTUL1);

    CONT.add(LISTA);

    CONT.add(ROTUL4);
    CONT.add(ROTUL5);
    CONT.add(ROTUL2);
    CONT.add(ROTUL3);

    // add image label
    CONT.add(IMAGEM);

    ROTUL1.setBounds(75,20,200,20);
    ROTUL4.setBounds(75,150,130,20);
    ROTUL5.setBounds(75,170,130,20);

    LISTA.setBounds(75,50,250,20);
    LISTA.setMaximumRowCount(4);

    ROTUL2.setBounds(195,150,130,20);
    ROTUL3.setBounds(195,170,130,20);

    // place image to the right
    IMAGEM.setBounds(350,20,FLAG_W,FLAG_H);

    LISTA.addItemListener(new EVENTO());
 
    setSize(820, 400);
    setLocationRelativeTo(null);
    setVisible(true);

  }

  // helper to load and scale an image from classpath (/CAP12/*.jpg)
  private ImageIcon loadFlagIcon(String name, int w, int h) {
    if (name == null) return null;
    String resourcePath = "/CAP12/" + name + ".jpg";
    try {
      URL url = getClass().getResource(resourcePath);
      if (url != null) {
        BufferedImage img = ImageIO.read(url);
        if (img != null) {
          Image scaled = img.getScaledInstance(w, h, Image.SCALE_SMOOTH);
          return new ImageIcon(scaled);
        }
      }
    } catch (Exception ex) {
      // ignore and return placeholder
    }

    BufferedImage placeholder = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g2 = placeholder.createGraphics();
    g2.setColor(Color.LIGHT_GRAY);
    g2.fillRect(0,0,w,h);
    g2.setColor(Color.DARK_GRAY);
    g2.drawRect(0,0,w-1,h-1);
    g2.setColor(Color.RED);
    g2.drawString("Imagem não encontrada", 10, h/2);
    g2.dispose();
    return new ImageIcon(placeholder);
  }

  private class EVENTO implements ItemListener {
    public void itemStateChanged (ItemEvent ie) {

      if (ie.getStateChange() != ItemEvent.SELECTED) return;

      int I = LISTA.getSelectedIndex();
      if (I < 0) return;

      String MOSTRACAP = CAPITAL[I];
      String MOSTRAUFE = UNIFED[I];

      ROTUL2.setText(MOSTRACAP);
      ROTUL3.setText(MOSTRAUFE);

      // update flag image
      ICONE = loadFlagIcon(MOSTRAUFE, FLAG_W, FLAG_H);
      IMAGEM.setIcon(ICONE);

    }
  } 

  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JFrame.setDefaultLookAndFeelDecorated(true);
          JDialog.setDefaultLookAndFeelDecorated(true);
          C12EX13 VISUAL = new C12EX13();
          VISUAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
      }
    );
  }  
}