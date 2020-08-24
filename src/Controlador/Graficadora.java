/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Kaisen
 */
public class Graficadora {

    public void GraficarMRU_Distancia(double posicion, double velocidad, double tiempo) {
        System.out.println("Generando Grafico...");
        XYSeries oSeries = new XYSeries("Velocidad (m/s)");
        int t = (int) tiempo + 1;
        double[] y = new double[t];

        for (int i = 0; i < t; i++) {
            y[i] = posicion + (velocidad * i);
        }

        for (int i = 0; i < t; i++) {
            oSeries.add(i, y[i]);
        }

        XYSeriesCollection oDataSet = new XYSeriesCollection();
        oDataSet.addSeries(oSeries);
        JFreeChart oChart = ChartFactory.createXYLineChart("Grafica MRU", "Tiempo (s)", "Distancia (m)", oDataSet, PlotOrientation.VERTICAL, true, false, false);

        ChartPanel oPanel = new ChartPanel(oChart);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(oPanel);
        //panel.validate();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void GraficarMRU_Velocidad(double posicion_ini, double posicion_fin, double tiempo) {
        System.out.println("Generando Grafico...");
        XYSeries oSeries = new XYSeries("Velocidad (m/s)");
        int t = (int) tiempo + 1;
        double[] y = new double[t];
        double velocidad = (posicion_fin - posicion_ini)/ tiempo;

        for (int i = 0; i < t; i++) {
            y[i] = velocidad;
        }

        for (int i = 0; i < t; i++) {
            oSeries.add(i, y[i]);
        }

        XYSeriesCollection oDataSet = new XYSeriesCollection();
        oDataSet.addSeries(oSeries);
        JFreeChart oChart = ChartFactory.createXYLineChart("Grafica MRU", "Tiempo (s)", "Velocidad (m/s)", oDataSet, PlotOrientation.VERTICAL, true, false, false);

        ChartPanel oPanel = new ChartPanel(oChart);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(oPanel);
        //panel.validate();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void GraficarMRUA_Distancia(double posicion, double velocidad, double aceleracion, double tiempo) {
        System.out.println("Generando Grafico...");
        XYSeries oSeries = new XYSeries("Velocidad (m/s)");
        int t = (int) tiempo + 1;
        double[] y = new double[t];

        for (int i = 0; i < t; i++) {
            y[i] = posicion + (velocidad * i) + (0.5 * aceleracion * Math.pow(i, 2));
        }

        for (int i = 0; i < t; i++) {
            oSeries.add(i, y[i]);
        }

        XYSeriesCollection oDataSet = new XYSeriesCollection();
        oDataSet.addSeries(oSeries);
        JFreeChart oChart = ChartFactory.createXYLineChart("Grafica MRUA", "Tiempo (s)", "Distancia (m)", oDataSet, PlotOrientation.VERTICAL, true, false, false);

        ChartPanel oPanel = new ChartPanel(oChart);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(oPanel);
        panel.validate();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void GraficarMRUA_Velocidad(double velocidad, double aceleracion, double tiempo) {
        System.out.println("Generando Grafico...");
        XYSeries oSeries = new XYSeries("Aceleracion (m/s^2)");
        int t = (int) tiempo + 1;
        double[] y = new double[t];

        for (int i = 0; i < t; i++) {
            y[i] = velocidad + (aceleracion * i);
        }

        for (int i = 0; i < t; i++) {
            oSeries.add(i, y[i]);
        }

        XYSeriesCollection oDataSet = new XYSeriesCollection();
        oDataSet.addSeries(oSeries);
        JFreeChart oChart = ChartFactory.createXYLineChart("Grafica MRUA", "Tiempo (s)", "Velocidad(m/s)", oDataSet, PlotOrientation.VERTICAL, true, false, false);

        ChartPanel oPanel = new ChartPanel(oChart);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(oPanel);
        panel.validate();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void GraficarMRUA_Aceleracion(double velocidad_ini, double velocidad_fin, double tiempo) {
        System.out.println("Generando Grafico...");
        XYSeries oSeries = new XYSeries("");
        int t = (int) tiempo + 1;
        double[] y = new double[t];
        double aceleracion = (velocidad_fin - velocidad_ini)/tiempo;

        for (int i = 0; i < t; i++) {
            y[i] = aceleracion;
        }

        for (int i = 0; i < t; i++) {
            oSeries.add(i, y[i]);
        }

        XYSeriesCollection oDataSet = new XYSeriesCollection();
        oDataSet.addSeries(oSeries);
        JFreeChart oChart = ChartFactory.createXYLineChart("Grafica MRUA", "Tiempo (s)", "Aceleracion (m/s^2)", oDataSet, PlotOrientation.VERTICAL, true, false, false);

        ChartPanel oPanel = new ChartPanel(oChart);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(oPanel);
        panel.validate();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void GraficarCaidaLibre_Distancia(double tiempo) {
        System.out.println("Generando Grafico...");
        XYSeries oSeries = new XYSeries("Velocidad (m/s)");
        int t = (int) tiempo + 1;
        double[] y = new double[t];

        for (int i = 0; i < t; i++) {
            y[i] = (0.5 * 9.8 * Math.pow(i, 2));
        }

        for (int i = 0; i < t; i++) {
            oSeries.add(i, y[i]);
        }

        XYSeriesCollection oDataSet = new XYSeriesCollection();
        oDataSet.addSeries(oSeries);
        JFreeChart oChart = ChartFactory.createXYLineChart("Grafica Caida Libre", "Tiempo (s)", "Distancia (m)", oDataSet, PlotOrientation.VERTICAL, true, false, false);

        ChartPanel oPanel = new ChartPanel(oChart);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(oPanel);
        panel.validate();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void GraficarCaidaLibre_Velocidad(double tiempo) {
        System.out.println("Generando Grafico...");
        XYSeries oSeries = new XYSeries("Aceleracion (m/s^2)");
        int t = (int) tiempo + 1;
        double[] y = new double[t];

        for (int i = 0; i < t; i++) {
            y[i] = (9.8 * i);
        }

        for (int i = 0; i < t; i++) {
            oSeries.add(i, y[i]);
        }

        XYSeriesCollection oDataSet = new XYSeriesCollection();
        oDataSet.addSeries(oSeries);
        JFreeChart oChart = ChartFactory.createXYLineChart("Grafica Caida Libre", "Tiempo (s)", "Velocidad(m/s)", oDataSet, PlotOrientation.VERTICAL, true, false, false);

        ChartPanel oPanel = new ChartPanel(oChart);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(oPanel);
        panel.validate();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void GraficarVerticalAbajo_Distancia(double posicion, double velocidad, double tiempo) {
        System.out.println("Generando Grafico...");
        XYSeries oSeries = new XYSeries("Velocidad (m/s)");
        int t = (int) tiempo + 1;
        double[] y = new double[t];

        for (int i = 0; i < t; i++) {
            y[i]  = posicion + (velocidad * i) + (0.5 * 9.8 * Math.pow(i, 2));
        }

        for (int i = 0; i < t; i++) {
            oSeries.add(i, y[i]);
        }

        XYSeriesCollection oDataSet = new XYSeriesCollection();
        oDataSet.addSeries(oSeries);
        JFreeChart oChart = ChartFactory.createXYLineChart("Grafica Lanzamiento Vertical hacia Abajo", "Tiempo (s)", "Distancia (m)", oDataSet, PlotOrientation.VERTICAL, true, false, false);

        ChartPanel oPanel = new ChartPanel(oChart);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(oPanel);
        panel.validate();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void GraficarVerticalAbajo_Velocidad(double velocidad, double tiempo) {
        System.out.println("Generando Grafico...");
        XYSeries oSeries = new XYSeries("Aceleracion (m/s^2)");
        int t = (int) tiempo + 1;
        double[] y = new double[t];

        for (int i = 0; i < t; i++) {
            y[i] = velocidad + (9.8 * i);
        }

        for (int i = 0; i < t; i++) {
            oSeries.add(i, y[i]);
        }

        XYSeriesCollection oDataSet = new XYSeriesCollection();
        oDataSet.addSeries(oSeries);
        JFreeChart oChart = ChartFactory.createXYLineChart("Grafica Lanzamiento Vertical hacia Abajo", "Tiempo (s)", "Velocidad(m/s)", oDataSet, PlotOrientation.VERTICAL, true, false, false);

        ChartPanel oPanel = new ChartPanel(oChart);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(oPanel);
        panel.validate();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void GraficarVerticalArriba_Distancia(double posicion, double velocidad, double tiempo) {
        System.out.println("Generando Grafico...");
        XYSeries oSeries = new XYSeries("Velocidad (m/s)");
        int t = (int) tiempo + 1;
        double[] y = new double[t];

        for (int i = 0; i < t; i++) {
            y[i]  = posicion + (velocidad * i) - (0.5 * (9.8) * Math.pow(i, 2));
        }

        for (int i = 0; i < t; i++) {
            oSeries.add(i, y[i]);
        }

        XYSeriesCollection oDataSet = new XYSeriesCollection();
        oDataSet.addSeries(oSeries);
        JFreeChart oChart = ChartFactory.createXYLineChart("Grafica Lanzamiento Vertical hacia Arriba", "Tiempo (s)", "Distancia (m)", oDataSet, PlotOrientation.VERTICAL, true, false, false);

        ChartPanel oPanel = new ChartPanel(oChart);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(oPanel);
        panel.validate();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void GraficarVerticalArriba_Velocidad(double velocidad, double tiempo) {
        System.out.println("Generando Grafico...");
        XYSeries oSeries = new XYSeries("Aceleracion (m/s^2)");
        int t = (int) tiempo + 1;
        double[] y = new double[t];

        for (int i = 0; i < t; i++) {
            y[i] = velocidad - (9.8 * i);
        }

        for (int i = 0; i < t; i++) {
            oSeries.add(i, y[i]);
        }

        XYSeriesCollection oDataSet = new XYSeriesCollection();
        oDataSet.addSeries(oSeries);
        JFreeChart oChart = ChartFactory.createXYLineChart("Grafica Lanzamiento Vertical hacia Arriba", "Tiempo (s)", "Velocidad(m/s)", oDataSet, PlotOrientation.VERTICAL, true, false, false);

        ChartPanel oPanel = new ChartPanel(oChart);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(oPanel);
        panel.validate();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
