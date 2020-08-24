/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Kaisen
 */
public class RedirectAppOutputStream2 {
    
    private class GuiOutputStream extends OutputStream {
        JTextArea textArea;

        public GuiOutputStream(JTextArea textArea) {
            this.textArea = textArea;
        }

        @Override
        public void write(int data) throws IOException {
            textArea.append(new String(new byte[] { (byte) data }));
        }
    }

    public void guiConsoleTest(JTextArea textArea) {

        // Remember old output stream (optional)
        PrintStream stdout = System.out;
        PrintStream stderr = System.err;
        // Stream for output to gui
        GuiOutputStream rawout = new GuiOutputStream(textArea);
        
        // Set new stream for System.out
        System.setErr(new PrintStream(rawout, true));
        textArea.setForeground(Color.red);
        
        System.setOut(new PrintStream(rawout, true));
        
        
 

 
       
    }
}
