 
// figura 14.15: buttonframe.java
// criando Jbuttons.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame
{
   private JButton plainJButton;// botão apenas com texto
   private final JButton fancyJButton;// botão com icones
   
   //ButtonFrame adiciona JButtons ao JFrame
   public ButtonFrame(ImageIcon Iconbug1)
   {
        super("lesting Buttons");
        setLayout(new FlowLayout() );// configurar o layout de frame
 
        plainJButton = new JButton ("Plain Button");// botão com texto
        add( plainJButton );//ADcional plainJButton nao JFrame
         
        Icon bug1 = new ImageIcon(getClass().getResource( "bugl.gif" ));
        Icon bug2 = new ImageIcon(getClass().getResource( "bug2.gif" ));
        fancyJButton = new JButton( "Fancy Button", bug1 ); //confira imagem
        fancyJButton.setRolloverIcon(bug2);// configura imagem de rollover
        add( fancyJButton );//adiciona francyJbutton ao Jframe
     
        //cria novo ButtonHandler Para Tratamento de evento dxe  botão
        ButtonHandler handler = new  ButtonHandler();
        fancyJButton.addActionListener( handler );
        plainJButton.addActionListener( handler);
   } // fim do construtor ButtonFrame
      
   //classe interna para tratamento de eventos de botão
   private class ButtonHandler implements ActionListener
     {
     //trata evento de botão
      public void actionPerformed (ActionEvent event)
      {
       JOptionPane.showMessageDialog (ButtonFrame.this,String.format(
               "youpressed;%s", event.getActionCommand() ));
      }//fim do método actionperformed
     } // fim da classe ButtonHandler Private interna
}// fim da classe ButtonFrame
   
   