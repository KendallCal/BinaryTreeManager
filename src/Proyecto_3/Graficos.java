
//Grafico del Arbol Binario.

package Proyecto_3;

//Imports.
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class Graficos extends javax.swing.JPanel {

    //Instancias.
    private final ArbolBinario impresoras; //Lista para almacenar las impresoras.

    //Constructor.
    public Graficos(ArbolBinario impresoras) {
        //Inicializa los componentes.
        initComponents();

        //Inicializa el background.
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));

        //Inicializa el Arbol Binario.
        this.impresoras = impresoras;

        //Crea un panel para gráficos.
        GraficosPanel panelGrafico = new GraficosPanel(impresoras);

        //Configura el panel de gráficos.
        panelParaGrafico.setLayout(new java.awt.BorderLayout());
        panelParaGrafico.add(panelGrafico, java.awt.BorderLayout.CENTER);
    }

    //Panel interno para gráficos.
    private class GraficosPanel extends JPanel {
        //Instancia del árbol binario que se va a dibujar.
        private final ArbolBinario impresoras; 

        //Constructor que inicializa el panel con el árbol binario.
        public GraficosPanel(ArbolBinario impresoras) {
            this.impresoras = impresoras;
            
            //Establece el color de fondo del panel.
            setBackground(new Color(34, 34, 34));
        }

        //Método llamado automáticamente para dibujar el contenido del panel.
        @Override
        protected void paintComponent(Graphics g) {
            //Para que el panel dibuje correctamente.
            super.paintComponent(g);
            
            //Convierte el objeto Graphics a Graphics 2D.
            Graphics2D g2d = (Graphics2D) g;

            //Habilita la suavización de gráficos para un dibujo más suave.
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //Dibuja el árbol binario, comenzando desde la raíz.
            dibujarArbol(g2d, impresoras.getRaiz(), getWidth() / 2, 50, getWidth() / 4);
        }

        //Método recursivo para dibujar el árbol binario.
        private void dibujarArbol(Graphics2D g2d, Nodo nodo, int x, int y, int xOffset) {
            if (nodo != null) {
                //Calcula el punto central del nodo.
                int radius = 20; // Radio del círculo.
                int diameter = 2 * radius; // Diámetro del círculo.
                int xCenter = x; // Posición X del centro.
                int yCenter = y; // Posición Y del centro.

                //Dibuja el subárbol izquierdo.
                if (nodo.getIzquierda() != null) {
                    //Calcula la posición del nodo izquierdo.
                    int xLeft = x - xOffset;
                    int yLeft = y + 50;

                    //Dibuja la línea hacia el nodo izquierdo.
                    g2d.setColor(Color.WHITE); //Color de la línea.
                    g2d.drawLine(xCenter, yCenter, xLeft, yLeft); //Dibuja la línea.

                    //Llama recursivamente para dibujar el subárbol izquierdo.
                    dibujarArbol(g2d, nodo.getIzquierda(), xLeft, yLeft, xOffset / 2);
                }

                //Dibuja el subárbol derecho.
                if (nodo.getDerecha() != null) {
                    //Calcula la posición del nodo derecho.
                    int xRight = x + xOffset;
                    int yRight = y + 50;

                    //Dibuja la línea desde el nodo actual al nodo derecho.
                    g2d.setColor(Color.WHITE); //Color de la línea.
                    g2d.drawLine(xCenter, yCenter, xRight, yRight); //Dibuja la línea.

                    //Llama recursivamente para dibujar el subárbol derecho.
                    dibujarArbol(g2d, nodo.getDerecha(), xRight, yRight, xOffset / 2);
                }

                //Dibuja el nodo actual
                g2d.setColor(new Color(34, 34, 34)); //Color de fondo del nodo.
                g2d.fillOval(xCenter - radius, yCenter - radius, diameter, diameter); //Dibuja el fondo del nodo.
                g2d.setColor(new Color(24, 208, 195)); //Color del borde.
                g2d.setStroke(new java.awt.BasicStroke(2)); //Grosor del borde.
                g2d.drawOval(xCenter - radius, yCenter - radius, diameter, diameter); //Dibuja el borde del nodo.

                //Dibuja el número del nodo en blanco y centrado dentro del círculo.
                g2d.setColor(Color.WHITE);
                String id = String.valueOf(nodo.getImpresora().getId()); //Obtiene el ID del nodo.
                int stringWidth = g2d.getFontMetrics().stringWidth(id); //Ancho del texto.
                int stringHeight = g2d.getFontMetrics().getAscent(); //Altura del texto.
                g2d.drawString(id, xCenter - stringWidth / 2, yCenter + stringHeight / 2); //Dibuja el texto centrado.
            }
        }
    }

    //Design.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new Estilos.PanelRedondeado();
        titulo = new javax.swing.JLabel();
        panelParaGrafico = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(720, 518));
        setMinimumSize(new java.awt.Dimension(720, 518));

        panelPrincipal.setBackground(new java.awt.Color(34, 34, 34));
        panelPrincipal.setEsquinaInfDer(50);
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(24, 208, 195));
        titulo.setText("Grafico del Arbol Binario");
        panelPrincipal.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        panelParaGrafico.setBackground(new java.awt.Color(34, 34, 34));

        javax.swing.GroupLayout panelParaGraficoLayout = new javax.swing.GroupLayout(panelParaGrafico);
        panelParaGrafico.setLayout(panelParaGraficoLayout);
        panelParaGraficoLayout.setHorizontalGroup(
            panelParaGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        panelParaGraficoLayout.setVerticalGroup(
            panelParaGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        panelPrincipal.add(panelParaGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 490, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelParaGrafico;
    private Estilos.PanelRedondeado panelPrincipal;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
