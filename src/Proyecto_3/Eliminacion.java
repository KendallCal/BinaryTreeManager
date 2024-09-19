
//Eliminación.

package Proyecto_3;

//Imports.
import java.awt.Color;
import javax.swing.JOptionPane;

public class Eliminacion extends javax.swing.JPanel {
    //Instancias.
    private final ArbolBinario impresoras; //Lista para almacenar las impresoras.
    
    //Constructor.
    public Eliminacion(ArbolBinario impresoras) {
        //Inicializa los componentes.
        initComponents();
        
        //Inicializa el background.
        setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        
        //Inicializa el Arbol Binario.
        this.impresoras = impresoras;
    }

    // - - - - - - - - - - - - - - - - - Métodos - - - - - - - - - - - - - - - - - //
    //Método para validar el campo del ID.
    private boolean validarID(String id) {
        //Valida que el campo no esté vacío.
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un ID.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        //Valida que el ID sea un número entero.
        if (!id.matches("\\d+")) {
            JOptionPane.showMessageDialog(null,  "Por favor ingrese un ID válido (número entero).", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }
    
    //Desgin.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new Estilos.PanelRedondeado();
        titulo = new javax.swing.JLabel();
        contenedorDatos = new javax.swing.JPanel();
        panelID = new javax.swing.JPanel();
        textoID = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        btnEliminar = new Estilos.BotonPersonalizado();

        setMaximumSize(new java.awt.Dimension(720, 518));
        setMinimumSize(new java.awt.Dimension(720, 518));

        panelPrincipal.setBackground(new java.awt.Color(34, 34, 34));
        panelPrincipal.setEsquinaInfDer(50);
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(24, 208, 195));
        titulo.setText("Eliminación de Impresoras");
        panelPrincipal.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        contenedorDatos.setOpaque(false);

        panelID.setMaximumSize(new java.awt.Dimension(315, 43));
        panelID.setMinimumSize(new java.awt.Dimension(315, 43));
        panelID.setOpaque(false);
        panelID.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        textoID.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textoID.setForeground(new java.awt.Color(255, 255, 255));
        textoID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoID.setText("ID de la Impresora");
        textoID.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        textoID.setPreferredSize(new java.awt.Dimension(150, 23));
        panelID.add(textoID);

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 0));
        id.setMaximumSize(new java.awt.Dimension(150, 25));
        id.setMinimumSize(new java.awt.Dimension(150, 25));
        id.setPreferredSize(new java.awt.Dimension(150, 25));
        panelID.add(id);

        javax.swing.GroupLayout contenedorDatosLayout = new javax.swing.GroupLayout(contenedorDatos);
        contenedorDatos.setLayout(contenedorDatosLayout);
        contenedorDatosLayout.setHorizontalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelID, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        contenedorDatosLayout.setVerticalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorDatosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        panelPrincipal.add(contenedorDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, 130));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setHoverBackground(new java.awt.Color(24, 208, 195));
        btnEliminar.setHoverText(new java.awt.Color(0, 0, 0));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        panelPrincipal.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    //Acción del botón Eliminar.
    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        //Captura el ID.
        String idString = id.getText();

        //Valida la entrada y verifica que no esté vacío.
        if (validarID(idString)) {
            try {
                //Convierte el ID a entero.
                int idInt = Integer.parseInt(idString);

                //Llama al método para eliminarlo.
                boolean eliminado = impresoras.eliminarPorId(idInt);

                //Si se elimino muestra mensaje.
                if (eliminado) {
                    JOptionPane.showMessageDialog(null, "La impresora con ID " + idInt + " ha sido eliminado correctamente.");
                } else {
                    //Si no se elimo muestra este mensaje.
                    JOptionPane.showMessageDialog(null,  "No se encontró ninguna impresora con el ID " + idInt + " para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                //Si la entrada no es un número entero, muestra un mensaje de error.
                JOptionPane.showMessageDialog(null,  "El ID debe ser un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        //Limpia el campo.
        id.setText("");
    }//GEN-LAST:event_btnEliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Estilos.BotonPersonalizado btnEliminar;
    private javax.swing.JPanel contenedorDatos;
    private javax.swing.JTextField id;
    private javax.swing.JPanel panelID;
    private Estilos.PanelRedondeado panelPrincipal;
    private javax.swing.JLabel textoID;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
