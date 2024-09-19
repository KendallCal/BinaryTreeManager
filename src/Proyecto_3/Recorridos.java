
//Recorridos.

package Proyecto_3;

//Imports.
import java.awt.Color;

public class Recorridos extends javax.swing.JPanel {
    //Instancias.
    private Estilos.BotonPersonalizado botonSeleccionado; //Guarda el botón seleccionado.
    private final ArbolBinario impresoras; //Lista para almacenar las impresoras.

    //Constructor.
    public Recorridos(ArbolBinario impresoras) {
        //Inicializa los componentes.
        initComponents();
        
        //Inicializa el background.
        setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        
        //Inicializa el Arbol Binario.
        this.impresoras = impresoras;
    }

    // - - - - - - - - - - - - - - - - - - - - - Métodos - - - - - - - - - - - - - - - - - - - - - //
    //Método para botones no seleccionados.
    private void setBotonesNoSeleccionados() {
        if (botonSeleccionado != null) {
            botonSeleccionado.setBtnSeleccionado(false);
        }
    }

    //Método para botones seleccionados.
    private void setBotonSeleccionado(Estilos.BotonPersonalizado boton) {
        //Llama al método para desmarcar el botón previamente seleccionado.
        setBotonesNoSeleccionados();
        
        //Marca el botón actual como seleccionado.
        boton.setBtnSeleccionado(true);
        
        //Actualiza la referencia al botón seleccionado.
        botonSeleccionado = boton;
    }
    
    //Método para el recorrido pre-orden y obtener los IDs separados por guiones.
    private String obtenerIdsPreOrden() {
        //Crea un StringBuilder para almacenar los IDs.
        StringBuilder ids = new StringBuilder();
        
        //Inicia el recorrido pre-orden desde la raíz del árbol.
        obtenerIdsPreOrden(impresoras.getRaiz(), ids);
        
        //Retorna la cadena de IDs.
        return ids.toString();
    }
    
    //Método recursivo para el recorrido pre-orden y agregar los IDs al StringBuilder.
    private void obtenerIdsPreOrden(Nodo nodo, StringBuilder ids) {
        if (nodo != null) {
            //Agrega el ID del nodo actual al StringBuilder.
            if (ids.length() > 0) {
                ids.append("-");
            }
            ids.append(nodo.getImpresora().getId());
            
            //Recorre el subárbol izquierdo.
            obtenerIdsPreOrden(nodo.getIzquierda(), ids);
            
            //Recorre el subárbol derecho.
            obtenerIdsPreOrden(nodo.getDerecha(), ids);
        }
    }

    //Método para el recorrido post-orden y obtener los IDs separados por guiones.
    private String obtenerIdsPostOrden() {
        //Crea un StringBuilder para almacenar los IDs.
        StringBuilder ids = new StringBuilder();
        
        //Inicia el recorrido post-orden desde la raíz del árbol.
        obtenerIdsPostOrden(impresoras.getRaiz(), ids);
        
        //Retorna la cadena de IDs.
        return ids.toString();
    }
    
    //Método recursivo para el recorrido post-orden y agregar los IDs al StringBuilder.
    private void obtenerIdsPostOrden(Nodo nodo, StringBuilder ids) {
        if (nodo != null) {
            //Recorre el subárbol izquierdo.
            obtenerIdsPostOrden(nodo.getIzquierda(), ids);
            
            //Recorre el subárbol derecho.
            obtenerIdsPostOrden(nodo.getDerecha(), ids);
            
            //Agrega el ID del nodo actual al StringBuilder.
            if (ids.length() > 0) {
                ids.append("-");
            }
            ids.append(nodo.getImpresora().getId());
        }
    }

    //Método para el recorrido in-orden y obtener los IDs separados por guiones.
    private String obtenerIdsInOrden() {
        //Crea un StringBuilder para almacenar los IDs.
        StringBuilder ids = new StringBuilder();
        
        //Inicia el recorrido in-orden desde la raíz del árbol.
        obtenerIdsInOrden(impresoras.getRaiz(), ids);
        
        //Retorna la cadena de IDs.
        return ids.toString();
    }
    
    //Método recursivo para el recorrido in-orden y agregar los IDs al StringBuilder.
    private void obtenerIdsInOrden(Nodo nodo, StringBuilder ids) {
        if (nodo != null) {
            //Recorre el subárbol izquierdo.
            obtenerIdsInOrden(nodo.getIzquierda(), ids);
            
            //Agrega el ID del nodo actual al StringBuilder.
            if (ids.length() > 0) {
                ids.append("-");
            }
            ids.append(nodo.getImpresora().getId());
            
            //Recorre el subárbol derecho.
            obtenerIdsInOrden(nodo.getDerecha(), ids);
        }
    }
    
    //Design.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new Estilos.PanelRedondeado();
        titulo = new javax.swing.JLabel();
        btnPostOrden = new Estilos.BotonPersonalizado();
        btnPreOrden = new Estilos.BotonPersonalizado();
        btnInOrden = new Estilos.BotonPersonalizado();
        tituloRecorrido = new javax.swing.JLabel();
        mostrarRecorrido = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(720, 518));
        setMinimumSize(new java.awt.Dimension(720, 518));

        panelPrincipal.setBackground(new java.awt.Color(34, 34, 34));
        panelPrincipal.setEsquinaInfDer(50);
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(24, 208, 195));
        titulo.setText("Recorridos de las Impresoras");
        panelPrincipal.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        btnPostOrden.setBackground(new java.awt.Color(255, 255, 255));
        btnPostOrden.setForeground(new java.awt.Color(0, 0, 0));
        btnPostOrden.setText("Post - Orden");
        btnPostOrden.setColorSeleccion(new java.awt.Color(24, 208, 195));
        btnPostOrden.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnPostOrden.setHoverBackground(new java.awt.Color(24, 208, 195));
        btnPostOrden.setHoverText(new java.awt.Color(0, 0, 0));
        btnPostOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPostOrdenMouseClicked(evt);
            }
        });
        panelPrincipal.add(btnPostOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 170, 40));

        btnPreOrden.setBackground(new java.awt.Color(255, 255, 255));
        btnPreOrden.setForeground(new java.awt.Color(0, 0, 0));
        btnPreOrden.setText("Pre - Orden");
        btnPreOrden.setColorSeleccion(new java.awt.Color(24, 208, 195));
        btnPreOrden.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnPreOrden.setHoverBackground(new java.awt.Color(24, 208, 195));
        btnPreOrden.setHoverText(new java.awt.Color(0, 0, 0));
        btnPreOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPreOrdenMouseClicked(evt);
            }
        });
        panelPrincipal.add(btnPreOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 170, 40));

        btnInOrden.setBackground(new java.awt.Color(255, 255, 255));
        btnInOrden.setForeground(new java.awt.Color(0, 0, 0));
        btnInOrden.setText("In - Orden");
        btnInOrden.setColorSeleccion(new java.awt.Color(24, 208, 195));
        btnInOrden.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnInOrden.setHoverBackground(new java.awt.Color(24, 208, 195));
        btnInOrden.setHoverText(new java.awt.Color(0, 0, 0));
        btnInOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInOrdenMouseClicked(evt);
            }
        });
        panelPrincipal.add(btnInOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 170, 40));

        tituloRecorrido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tituloRecorrido.setForeground(new java.awt.Color(255, 255, 255));
        tituloRecorrido.setText("Recorrido");
        panelPrincipal.add(tituloRecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        mostrarRecorrido.setBackground(new java.awt.Color(255, 255, 255));
        mostrarRecorrido.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        mostrarRecorrido.setForeground(new java.awt.Color(0, 0, 0));
        mostrarRecorrido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelPrincipal.add(mostrarRecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 530, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    //Acción del botón Pre - Orden.
    private void btnPreOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPreOrdenMouseClicked
        //Selecciona el botón Pre - Orden.
        setBotonSeleccionado(btnPreOrden);
        
        //Realiza el recorrido pre-orden y mostrar los resultados en la tabla.
        String ids = obtenerIdsPreOrden(); 
        
        //Actualiza la tabla.
        mostrarRecorrido.setText(ids);
    }//GEN-LAST:event_btnPreOrdenMouseClicked

    //Acción del botón Post - Orden.
    private void btnPostOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPostOrdenMouseClicked
        //Selecciona el botón Post - Orden.
        setBotonSeleccionado(btnPostOrden);

        //Realiza el recorrido pos-orden y mostrar los resultados en la tabla.
        String ids = obtenerIdsPostOrden();
        
        //Actualiza la tabla.
        mostrarRecorrido.setText(ids);
    }//GEN-LAST:event_btnPostOrdenMouseClicked

    //Acción del botón In - Orden.
    private void btnInOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInOrdenMouseClicked
        //Selecciona el botón In - Orden.
        setBotonSeleccionado(btnInOrden);
        
        //Realiza el recorrido in-orden y mostrar los resultados en la tabla.
        String ids = obtenerIdsInOrden(); 
        
        //Actualiza la tabla.
        mostrarRecorrido.setText(ids);
    }//GEN-LAST:event_btnInOrdenMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Estilos.BotonPersonalizado btnInOrden;
    private Estilos.BotonPersonalizado btnPostOrden;
    private Estilos.BotonPersonalizado btnPreOrden;
    private javax.swing.JTextField mostrarRecorrido;
    private Estilos.PanelRedondeado panelPrincipal;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloRecorrido;
    // End of variables declaration//GEN-END:variables
}
