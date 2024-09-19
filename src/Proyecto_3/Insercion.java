
//Insercción.

package Proyecto_3;

//Imports.
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Insercion extends javax.swing.JPanel {
    //Variables.
    private final ArbolBinario impresoras; //Lista para almacenar las impresoras.
    private final List<String> errores = new ArrayList<>(); //Lista para almacenar los errores.
    
    //Constructor.
    public Insercion(ArbolBinario impresoras) {
        //Inicializa los componentes.
        initComponents();
        
        //Inicializa el background.
        setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        
        //Inicializa el Arbol Binario.
        this.impresoras = impresoras;
    }

    // - - - - - - - - - - - - - - - - - - - - - Métodos - - - - - - - - - - - - - - - - - - - - - //
    //Método para validar todos los campos.
    private void validarCampos() {
        //Limpia la lista antes de verificar.
        errores.clear();

        verificarID(errores); //Valida el ID.
        verificarMarca(errores); //Valida la Marca.
        verificarPeso(errores); //Valida el Peso.

        //Muestra los errores.
        if (!errores.isEmpty()) {
            mostrarErrores(errores);
        }
    }

    //Método para mostrar los errores y resaltar bordes.
    private void mostrarErrores(List<String> errores) {
        //Crea un StringBuilder para mostrar todos los errores en un solo mensaje.
        StringBuilder mensajeError = new StringBuilder("Se encontraron los siguientes errores:\n");

        //Recorre el arreglo y muestra los errores.
        for (String error : errores) {
            mensajeError.append("- ").append(error).append("\n");
        }

        //Muestra el JOptionPanel de los errores.
        JOptionPane.showMessageDialog(this, mensajeError.toString(), "Errores de validación.", JOptionPane.ERROR_MESSAGE);
    }

    //Método para validar el ID.
    private boolean verificarID(List<String> errores) {
        //Captura el campo.
        String idText = id.getText().trim();

        //Verifica que el ID no este vacío.
        if (idText.isEmpty()) {
            errores.add("El ID no debe estar vacío.");
            resaltarBordeError(id);
            return false;
        }

        //Verifica que el ID solo tenga números.
        if (!idText.matches("[0-9]+")) {
            errores.add("El ID debe tener solo números.");
            resaltarBordeError(id);
            return false;
        }

        //Restaura el borde.
        restaurarBordeOriginal(id);
        return true;
    }

    //Método para validar la Marca.
    private boolean verificarMarca(List<String> errores) {
        //Captura el campo.
        String marcaText = marca.getText().trim();

        //Verifica que la Marca no este vacía.
        if (marcaText.isEmpty()) {
            errores.add("La Marca no debe estar vacía.");
            resaltarBordeError(marca);
            return false;
        }

        //Verifica que la Marca solo tenga letras.
        if (!marcaText.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ ]+")) {
            errores.add("La Marca debe tener solo letras.");
            resaltarBordeError(marca);
            return false;
        }

        //Restaura el borde.
        restaurarBordeOriginal(marca);
        return true;
    }

    //Método para validar el Peso.
    private boolean verificarPeso(List<String> errores) {
        //Captura el campo.
        String pesoText = peso.getText().trim();

        //Verifica que el peso no este vacía.
        if (pesoText.isEmpty()) {
            errores.add("El peso no debe estar vacío.");
            resaltarBordeError(peso);
            return false;
        }

        //Verifica que el peso sea un número decimal con hasta dos decimales (opcional).
        if (!pesoText.matches("\\d+(\\.\\d{1,2})?")) {
            errores.add("El peso debe ser un número decimal con hasta dos decimales.");
            resaltarBordeError(peso);
            return false;
        }

        //Restaura el borde.
        restaurarBordeOriginal(peso);
        return true;
    }
    
    //Método para limpiar campos.
    private void limpiarCampos() {
        id.setText("");
        marca.setText("");
        tipoImpresora.setSelectedIndex(0);
        peso.setText("");
    }

    //Método para resaltar los bordes del JTextField.
    private void resaltarBordeError(JTextField textField) {
        textField.setBorder(BorderFactory.createLineBorder(Color.RED));
    }

    //Método para restaurar los bordes del JTextField.
    private void restaurarBordeOriginal(JTextField textField) {
        textField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    
    //Design.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new Estilos.PanelRedondeado();
        titulo = new javax.swing.JLabel();
        contenedorDatos = new javax.swing.JPanel();
        panelPeso = new javax.swing.JPanel();
        textoPeso = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();
        panelTipoImpresora = new javax.swing.JPanel();
        textoTipoImpresora = new javax.swing.JLabel();
        tipoImpresora = new javax.swing.JComboBox<>();
        panelID = new javax.swing.JPanel();
        textoID = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        panelMarca = new javax.swing.JPanel();
        textoMarca = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        btnGuardar = new Estilos.BotonPersonalizado();

        setMaximumSize(new java.awt.Dimension(720, 518));
        setMinimumSize(new java.awt.Dimension(720, 518));

        panelPrincipal.setBackground(new java.awt.Color(34, 34, 34));
        panelPrincipal.setEsquinaInfDer(50);
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(24, 208, 195));
        titulo.setText("Insercción de Impresoras");
        panelPrincipal.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        contenedorDatos.setOpaque(false);

        panelPeso.setMaximumSize(new java.awt.Dimension(315, 43));
        panelPeso.setMinimumSize(new java.awt.Dimension(315, 43));
        panelPeso.setOpaque(false);
        panelPeso.setPreferredSize(new java.awt.Dimension(315, 43));
        panelPeso.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        textoPeso.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textoPeso.setForeground(new java.awt.Color(255, 255, 255));
        textoPeso.setText("Peso en KG");
        textoPeso.setPreferredSize(new java.awt.Dimension(150, 23));
        panelPeso.add(textoPeso);

        peso.setBackground(new java.awt.Color(255, 255, 255));
        peso.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        peso.setForeground(new java.awt.Color(0, 0, 0));
        peso.setMaximumSize(new java.awt.Dimension(150, 25));
        peso.setMinimumSize(new java.awt.Dimension(150, 25));
        peso.setPreferredSize(new java.awt.Dimension(150, 25));
        panelPeso.add(peso);

        panelTipoImpresora.setMaximumSize(new java.awt.Dimension(315, 43));
        panelTipoImpresora.setMinimumSize(new java.awt.Dimension(315, 43));
        panelTipoImpresora.setOpaque(false);
        panelTipoImpresora.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        textoTipoImpresora.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textoTipoImpresora.setForeground(new java.awt.Color(255, 255, 255));
        textoTipoImpresora.setText("Tipo de Impresora");
        textoTipoImpresora.setPreferredSize(new java.awt.Dimension(150, 23));
        panelTipoImpresora.add(textoTipoImpresora);

        tipoImpresora.setBackground(new java.awt.Color(255, 255, 255));
        tipoImpresora.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tipoImpresora.setForeground(new java.awt.Color(0, 0, 0));
        tipoImpresora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Láser ", "Inyección de tinta", "Matriz de puntos", "3D" }));
        tipoImpresora.setMaximumSize(new java.awt.Dimension(150, 25));
        tipoImpresora.setMinimumSize(new java.awt.Dimension(150, 25));
        tipoImpresora.setPreferredSize(new java.awt.Dimension(150, 25));
        panelTipoImpresora.add(tipoImpresora);

        panelID.setMaximumSize(new java.awt.Dimension(315, 43));
        panelID.setMinimumSize(new java.awt.Dimension(315, 43));
        panelID.setOpaque(false);
        panelID.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        textoID.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textoID.setForeground(new java.awt.Color(255, 255, 255));
        textoID.setText("ID de la Impresora");
        textoID.setPreferredSize(new java.awt.Dimension(150, 23));
        panelID.add(textoID);

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 0));
        id.setMaximumSize(new java.awt.Dimension(150, 25));
        id.setMinimumSize(new java.awt.Dimension(150, 25));
        id.setPreferredSize(new java.awt.Dimension(150, 25));
        panelID.add(id);

        panelMarca.setMaximumSize(new java.awt.Dimension(315, 43));
        panelMarca.setMinimumSize(new java.awt.Dimension(315, 43));
        panelMarca.setOpaque(false);
        panelMarca.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        textoMarca.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textoMarca.setForeground(new java.awt.Color(255, 255, 255));
        textoMarca.setText("Marca");
        textoMarca.setPreferredSize(new java.awt.Dimension(150, 23));
        panelMarca.add(textoMarca);

        marca.setBackground(new java.awt.Color(255, 255, 255));
        marca.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        marca.setForeground(new java.awt.Color(0, 0, 0));
        marca.setMaximumSize(new java.awt.Dimension(150, 25));
        marca.setMinimumSize(new java.awt.Dimension(150, 25));
        marca.setPreferredSize(new java.awt.Dimension(150, 25));
        panelMarca.add(marca);

        javax.swing.GroupLayout contenedorDatosLayout = new javax.swing.GroupLayout(contenedorDatos);
        contenedorDatos.setLayout(contenedorDatosLayout);
        contenedorDatosLayout.setHorizontalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosLayout.createSequentialGroup()
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorDatosLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(panelID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelTipoImpresora, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        contenedorDatosLayout.setVerticalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorDatosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTipoImpresora, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        panelPrincipal.add(contenedorDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 480, 250));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Guardar");
        btnGuardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnGuardar.setHoverBackground(new java.awt.Color(24, 208, 195));
        btnGuardar.setHoverText(new java.awt.Color(0, 0, 0));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        panelPrincipal.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Acción del botón Guardar.
    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        //Captura los datos.
        String idString = id.getText();
        String marcaString = marca.getText();
        String pesoString = peso.getText();

        //Valida los campos.
        validarCampos();

        //Si no hay errores guarda los datos.
        if (errores.isEmpty()) {
            try {
                //Convierte el ID y el peso a los tipos correctos después de la validación.
                int idInt = Integer.parseInt(idString);
                float pesoFloat = Float.parseFloat(pesoString);

                //Obtiene el tipo de impresora.
                String tipoImpresoraString = (String) tipoImpresora.getSelectedItem();

                //Busca el ID, si no lo encuentra, muestra error y si lo encuentra guarda la impersora.
                if (impresoras.buscarPorId(idInt) != null) {
                    JOptionPane.showMessageDialog(null, "El ID ya existe en el árbol. Por favor, ingresa un ID diferente.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    //Guarda la Impresora en un objeto.
                    Impresora nuevaImpresora = new Impresora(idInt, marcaString, tipoImpresoraString, pesoFloat);

                    //Se inserta la nueva impresora al arbol binario.
                    impresoras.insertar(nuevaImpresora);

                    //Muestra mensaje de que se ingreso con exito.
                    JOptionPane.showMessageDialog(null, "La impresora se ha insertado correctamente en el árbol.");

                    //Limpia los campos después de la inserción.
                    limpiarCampos();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error en los datos ingresados. Por favor, revisa los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Estilos.BotonPersonalizado btnGuardar;
    private javax.swing.JPanel contenedorDatos;
    private javax.swing.JTextField id;
    private javax.swing.JTextField marca;
    private javax.swing.JPanel panelID;
    private javax.swing.JPanel panelMarca;
    private javax.swing.JPanel panelPeso;
    private Estilos.PanelRedondeado panelPrincipal;
    private javax.swing.JPanel panelTipoImpresora;
    private javax.swing.JTextField peso;
    private javax.swing.JLabel textoID;
    private javax.swing.JLabel textoMarca;
    private javax.swing.JLabel textoPeso;
    private javax.swing.JLabel textoTipoImpresora;
    private javax.swing.JComboBox<String> tipoImpresora;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
