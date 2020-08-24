/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import proyectotalf.Errores;
import proyectotalf.customListener;
import proyectotalf.simpleLexer;
import proyectotalf.simpleParser;

/**
 *
 * @author Kaisen
 */
public class IniciadorAntlr {

    public void Ejecutar(String codigo) {
     
        try {
            
            CharStream input = CharStreams.fromString(codigo);
            simpleLexer lexer = new simpleLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            simpleParser parser = new simpleParser(tokens);
            parser.addErrorListener(new Errores());
            ParseTree tree = parser.start();
            ParseTreeWalker mj = new ParseTreeWalker();
            mj.walk(new customListener(), tree);

        } catch (Exception e) {
            
            System.err.println(e);
        } 
        
    }

    public void MostrarArbol(String codigo) {
        CharStream input = CharStreams.fromString(codigo);
        simpleLexer lexer = new simpleLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        simpleParser parser = new simpleParser(tokens);
        ParseTree tree = parser.start();
        /*
        ParseTreeWalker mj = new ParseTreeWalker();
         mj.walk(new customListener(), tree);
         */
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.open();
        /*
        viewer.setScale(1.5);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
*/
    }
}
