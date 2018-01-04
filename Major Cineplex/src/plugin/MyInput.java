/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plugin;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class MyInput {
    public static void inputInteger(KeyEvent evt){
        if(!Character.isDigit(evt.getKeyChar())){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }
    public static void inputInteger(KeyEvent evt,JTextField txt,int length){
        if(!Character.isDigit(evt.getKeyChar())){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }else{
            String st=txt.getText();
            if(st.length()>=length){
                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            }
        }
    }
    public static void inputFloating(KeyEvent evt,JTextField txt){
        if(evt.getKeyChar()==46){
            String st=txt.getText();
            if(st.indexOf(46)!=-1){
                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            }else{
                if(st.equals("")){
                    txt.setText("0.");
                    evt.consume();
                }
            }
        }else if(!Character.isDigit(evt.getKeyChar())){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }
    public static void inputFloating(KeyEvent evt,JTextField txt,int length){
        if(evt.getKeyChar()==46){
            String st=txt.getText();
            if(st.indexOf(46)!=-1){
                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            }else{
                if(st.equals("")){
                    txt.setText("0.");
                    evt.consume();
                }
            }
        }else if(!Character.isDigit(evt.getKeyChar())){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }else{
            String st=txt.getText();
            if(!st.equals("")){
                double number=Double.valueOf(st);
                st=""+((long)number);
                if(st.length()>=length){
                    Toolkit.getDefaultToolkit().beep();
                    evt.consume();
                }
            }
        }
    }
    public static void clearText(JTextField... txt){
        for(JTextField temp:txt)
            temp.setText("");
        txt[0].grabFocus();
    }
    public static boolean checkText(JTextField... txt){
        for(JTextField temp:txt){
            String st=temp.getText().trim();
            if(st.equals("")){
                Toolkit.getDefaultToolkit().beep();
                temp.grabFocus();
                return false;
            }
                
        }
        return true;
    }

    public static int inputInteger() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
