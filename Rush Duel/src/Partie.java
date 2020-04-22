import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Partie {

	static GraphicsConfiguration gc;
	static JTextField textfield1, textfield2, textfield3;
	static JButton b=new JButton("Submit");
	
	public static void main(String[] args) {
		List<uneCarte> leDeck = new ArrayList();
		leDeck.add(new uneCarte("Polymerization","Invoquez par fusion un monstre","magie","normal"));
		leDeck.add(new uneCarte("Int�ruption Raigeki","Envoyer une carte au cimeti�re. D�truisez une carte sur le terrein","Piege","normal"));
		leDeck.add(new uneCarteMonstre("Per��me samourai supra-lourd","1-Le monstre �quip� fait des dommages per�ants.\n 2-Prennez un monstre samourai supralourd de votre deck � votre main",
				"Monstre","Normal","1-Vous pouvez �quiper cette carte � un monstre samourai supra-lourd"
						+ "\n 2-Doit �tre envoy� au cimeti�re","Terre","Machine", 4, 1200,0));
		leDeck.add(new uneCarteMonstre("Ninja furtif samourai supra-lourd","1-Cette carte peut attaquer en mode d�fense.\n 2-Cette carte peut attaquer directement votre adversaire",
				"Monstre","Synchro","1-En mode d�fense utilisez ses statistiques de d�fense comme statistique de combat."
						+ "\n 2-Divisez la d�fense de cette carte par deux","Terre","Machine", 7, 1200, 2800));
		uneCarteMonstre unSyntho = new uneCarteMonstre("Fl�tiste samourai supra-lourd","Aucun",
				"Monstre","Normal","Aucun","Terre","Machine", 4, 300, 600);
		unSyntho.setEffet();
		unSyntho.setSyntho();
		leDeck.add(unSyntho);
		
		Deck monDeck = new Deck(leDeck);
		Terrein unTerrein = new Terrein(monDeck);
		unTerrein.mainDebut();
		unTerrein.setCarte(unTerrein.getLaMain().get(2));
		//System.out.print(unTerrein.getZoneMagiePiege1().getNom());
		
//.........................................................................................		
		
		JFrame frame= new JFrame(gc);
		frame.setTitle("Welecome to JavaTutorial.net");
		frame.getContentPane().setLayout(new FlowLayout());
		
		for(int i = 0; i<unTerrein.getLaMain().size();i++) {
			textfield1 = new JTextField(unTerrein.getLaMain().get(i).getNom(),30);
			frame.add(textfield1);
		}
	    
	    frame.add(b);
	    frame.pack();
	    
		frame.setSize(600, 400);
		frame.setLocation(200, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textfield1.setText("");				
			}
		});
	}
}
