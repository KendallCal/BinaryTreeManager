
//Busqueda Por ID.

package Proyecto_3;

//Imports.
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BusquedaPorID extends javax.swing.JPanel {
    //Instancias.
    private final ArbolBinario impresoras; //Lista para almacenar las impresoras.
    
    //Constructor.
    public BusquedaPorID(ArbolBinario impresoras) {
        //Inicializa los componentes.
        initComponents();
        
        //Inicializa el background.
        setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        
        //Inicializa el Arbol Binario.
        this.impresoras = impresoras;
    }

    // - - - - - - - - - - - - - - - - - Métodos - - - - - - - - - - - - - - - - - //
    //Método para validar la entrada del ID.
    private boolean validarID(String id) {
        //Valida que el campo no esté vacío.
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un ID.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        //Valida que el ID sea un número entero.
        if (!id.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un ID válido (número entero).", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }
    
    //Design.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new Estilos.PanelRedondeado();
        titulo = new javax.swing.JLabel();
        contenedorDatos = new javax.swing.JPanel();
        panelID = new javax.swing.JPanel();
        textoID = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        btnBuscar = new Estilos.BotonPersonalizado();
        tablaBusquedaScroll = new javax.swing.JScrollPane();
        tablaBusqueda = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(720, 518));
        setMinimumSize(new java.awt.Dimension(720, 518));

        panelPrincipal.setBackground(new java.awt.Color(34, 34, 34));
        panelPrincipal.setEsquinaInfDer(50);
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(24, 208, 195));
        titulo.setText("Busqueda de Impresoras");
        panelPrincipal.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorDatosLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(panelID, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        contenedorDatosLayout.setVerticalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelPrincipal.add(contenedorDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, 100));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscar.setHoverBackground(new java.awt.Color(24, 208, 195));
        btnBuscar.setHoverText(new java.awt.Color(0, 0, 0));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        panelPrincipal.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 120, 40));

        tablaBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        tablaBusqueda.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tablaBusqueda.setForeground(new java.awt.Color(0, 0, 0));
        tablaBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID de la Impresora", "Marca", "Tipo de Impresora", "Peso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaBusqueda.setRowHeight(25);
        tablaBusquedaScroll.setViewportView(tablaBusqueda);

        panelPrincipal.add(tablaBusquedaScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 610, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Acción del botón Buscar.
    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        //Captura el ID.
        String idString = id.getText();

        //Valida la entrada.
        if (validarID(idString)) {

            //Convierte el id a Entero.
            int idInt = Integer.parseInt(idString);

            //Busca el ID en el arbol binario.
            Impresora impresoraEncontrada = impresoras.buscarPorId(idInt);

            //Si lo encuentra lo imprime en la tabla.
            if (impresoraEncontrada != null) {
                //Limpia la tabla.
                DefaultTableModel model = (DefaultTableModel) tablaBusqueda.getModel();
                model.setRowCount(0);

                //Agrega la Impresora encontrado a la tabla.
                Object[] rowData = {impresoraEncontrada.getId(), impresoraEncontrada.getMarca(), impresoraEncontrada.getTipoImpresora(), impresoraEncontrada.getPeso()};
                model.addRow(rowData);
            } else {
                //Si no lo encuentra muestra mensaje.
                JOptionPane.showMessageDialog(null, "No se encontró ninguna Impresora con el ID " + idInt, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        //Limpia el campo.
        id.setText("");
    }//GEN-LAST:event_btnBuscarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Estilos.BotonPersonalizado btnBuscar;
    private javax.swing.JPanel contenedorDatos;
    private javax.swing.JTextField id;
    private javax.swing.JPanel panelID;
    private Estilos.PanelRedondeado panelPrincipal;
    private javax.swing.JTable tablaBusqueda;
    private javax.swing.JScrollPane tablaBusquedaScroll;
    private javax.swing.JLabel textoID;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
