/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.network.controlledinputs;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class JLIst1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        //create JList and add it to a JScrollPane
        JScrollPane scrollPane=new JScrollPane();
        JList list+new JList(new String[]("a","b","c","a","b","c","a","b","c",));
        scrollPane g;
        
        Vector v=new Vetor();
        v.add(100);
        v.add(new object());
        JList list = new JList(v);
        list.setCellRenderer(new ListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                JLabel bt = new Jlabel();
                if (value instanceof String){
                    bt.setText('' + value);
                } else if (value instanceof Integer){
                    bt.setText("" + value);
                } else {
                    bt.setText(""+ value.hashCode());
                }
                if (isSelected) {
                    bt.setOpaque(true);
                    bt.setBackground(Color.red);
                }
                return bt;
            }
        });
        scrollPane,getViewport().add(list);
        //////////////////////////////////////////
        frame.add(scrollPane);
        
        frame.setVisible(true);
    }
    
}
