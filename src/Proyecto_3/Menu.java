/*

    Kendall Andrey Calderón Burgos.

    Proyecto 3. Estructuras de Datos.

    Segundo Cuatrimestre 2024.

 */

//Menú Principal
package Proyecto_3;

//Imports.
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Menu extends javax.swing.JFrame {
    //Variables.
    private boolean mousePresionado = false; //Guarda cuando esta el mouse presionado.
    
    //Instancias.
    private static ArbolBinario impresoras; //Guarda las impresoras.
    private Point lastPoint = new Point();  //Guarda la última posición del point.
    private Estilos.BotonPersonalizado botonSeleccionado; //Guarda los botones seleccionados.

    //Constructor.
    public Menu() {
        //Inicializa los componentes.
        initComponents();
    
        //Para que no se vean los paneles laterales.
        panelLateralBuscar.setVisible(false);
        panelLateralEliminar.setVisible(false);
        panelLateralGrafico.setVisible(false);
        panelLateralInserccon.setVisible(false);
        panelLateralRecorrdidos.setVisible(false);
        
        //Inicializa el color del Background.
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        
        //Titulo.
        setTitle("Proyecto 3. Sistemas Operativos");
        
    }

    /* - - - - - - - - - - - - - - - - - - - - Métodos - - - - - - - - - - - - - - - - - - - - */
    //Método para cambiar opción.
    private void cambiarOpcion(JPanel opcion) {
        opcion.setSize(720, 518); //Establece el tamaño de la ventana.
        opcion.setLocation(0, 0); //Establece la posición de la ventana..
        panelConGradiente.removeAll(); //Elimina lo que se muestra en la ventana.
        panelConGradiente.add(opcion, BorderLayout.CENTER); //Agrega la ventana al Jframe.
        panelConGradiente.revalidate(); //Revalida el diseño despues de haber cargado cada componente.
        panelConGradiente.repaint(); //Se repinta la ventana despues de haberlo hecho.
    }
    
    //Méotodo para seleccionar el botón.
    private void seleccionarBoton(Estilos.BotonPersonalizado boton) {
        //Restaura el estado original del botón previamente seleccionado.
        if (botonSeleccionado != null) {
            if (botonSeleccionado != boton) {
                botonSeleccionado.setIcon(getIconoOriginal(botonSeleccionado));
                botonSeleccionado.setBtnSeleccionado(false);
            }
        }

        //Establece el nuevo botón seleccionado.
        botonSeleccionado = boton;
        botonSeleccionado.setBtnSeleccionado(true);
        botonSeleccionado.setIcon(getIconoHover(botonSeleccionado));
        
        //Actualiza la visibilidad de los paneles.
        actualizarPaneles(boton);
    }

    //Método para obtener el icono original según el botón.
    private ImageIcon getIconoOriginal(Estilos.BotonPersonalizado boton) {
        if (boton == Inserccion) {
            return new ImageIcon(getClass().getResource("/Iconos/iconoInsercion.png"));
        } else if (boton == Eliminar) {
            return new ImageIcon(getClass().getResource("/Iconos/iconoEliminar.png"));
        } else if (boton == Buscar) {
            return new ImageIcon(getClass().getResource("/Iconos/iconoBuscar.png"));
        } else if (boton == Recorridos) {
            return new ImageIcon(getClass().getResource("/Iconos/iconoRecorrido.png"));
        } else if (boton == Graficon) {
            return new ImageIcon(getClass().getResource("/Iconos/iconoGrafico.png"));
        }
        return null;
    }

    //Método para obtener el icono hover según el botón.
    private ImageIcon getIconoHover(Estilos.BotonPersonalizado boton) {
        if (boton == Inserccion) {
            return new ImageIcon(getClass().getResource("/Iconos/iconoInserccionHover.png"));
        } else if (boton == Eliminar) {
            return new ImageIcon(getClass().getResource("/Iconos/iconoEliminarHover.png"));
        } else if (boton == Buscar) {
            return new ImageIcon(getClass().getResource("/Iconos/iconoBuscarHover.png"));
        } else if (boton == Recorridos) {
            return new ImageIcon(getClass().getResource("/Iconos/iconoRecorridoHover.png"));
        } else if (boton == Graficon) {
            return new ImageIcon(getClass().getResource("/Iconos/iconoGraficoHover.png"));
        }
        return null;
    }
    
    //Método para actualizar la visibilidad de los paneles según el botón seleccionado.
    private void actualizarPaneles(Estilos.BotonPersonalizado boton) {
        //Oculta todos los paneles
        panelLateralBuscar.setVisible(false);
        panelLateralEliminar.setVisible(false);
        panelLateralGrafico.setVisible(false);
        panelLateralInserccon.setVisible(false);
        panelLateralRecorrdidos.setVisible(false);

        //Muestra el panel correspondiente al botón seleccionado
        if (boton == Inserccion) {
            panelLateralInserccon.setVisible(true);
        } else if (boton == Eliminar) {
            panelLateralEliminar.setVisible(true);
        } else if (boton == Buscar) {
            panelLateralBuscar.setVisible(true);
        } else if (boton == Recorridos) {
            panelLateralRecorrdidos.setVisible(true);
        } else if (boton == Graficon) {
            panelLateralGrafico.setVisible(true);
        }
    }
    
    //Design.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLateral = new Estilos.PanelRedondeado();
        panelTitulo = new Estilos.PanelRedondeado();
        Titulo = new javax.swing.JLabel();
        panelLateralInserccon = new Estilos.PanelRedondeado();
        Inserccion = new Estilos.BotonPersonalizado();
        panelLateralEliminar = new Estilos.PanelRedondeado();
        Eliminar = new Estilos.BotonPersonalizado();
        panelLateralBuscar = new Estilos.PanelRedondeado();
        Buscar = new Estilos.BotonPersonalizado();
        panelLateralRecorrdidos = new Estilos.PanelRedondeado();
        Recorridos = new Estilos.BotonPersonalizado();
        panelLateralGrafico = new Estilos.PanelRedondeado();
        Graficon = new Estilos.BotonPersonalizado();
        panelDatos = new Estilos.PanelRedondeado();
        datosTitulo = new javax.swing.JLabel();
        separadorDatos = new javax.swing.JSeparator();
        datosSubtitulo = new javax.swing.JLabel();
        panelConGradiente = new Estilos.PanelRedondeado();
        panelSuperior = new Estilos.PanelRedondeado();
        panelSalir = new Estilos.PanelRedondeado();
        btnSalir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(950, 550));
        setMinimumSize(new java.awt.Dimension(950, 550));
        setUndecorated(true);

        panelLateral.setBackground(new java.awt.Color(0, 0, 0));
        panelLateral.setEsquinaInfIzq(50);
        panelLateral.setEsquinaSupIzq(50);
        panelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitulo.setBackground(new java.awt.Color(0, 0, 0));
        panelTitulo.setEsquinaInfDer(20);
        panelTitulo.setEsquinaInfIzq(20);
        panelTitulo.setEsquinaSupDer(20);
        panelTitulo.setEsquinaSupIzq(20);
        panelTitulo.setLayout(new java.awt.BorderLayout());

        Titulo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(24, 208, 195));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Proyecto");
        panelTitulo.add(Titulo, java.awt.BorderLayout.CENTER);

        panelLateral.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 80));

        panelLateralInserccon.setBackground(new java.awt.Color(24, 208, 195));
        panelLateralInserccon.setEnabled(false);
        panelLateralInserccon.setEsquinaInfIzq(5);
        panelLateralInserccon.setEsquinaSupIzq(5);
        panelLateralInserccon.setPreferredSize(new java.awt.Dimension(100, 40));
        panelLateralInserccon.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panelLateralInsercconLayout = new javax.swing.GroupLayout(panelLateralInserccon);
        panelLateralInserccon.setLayout(panelLateralInsercconLayout);
        panelLateralInsercconLayout.setHorizontalGroup(
            panelLateralInsercconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelLateralInsercconLayout.setVerticalGroup(
            panelLateralInsercconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelLateral.add(panelLateralInserccon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 10, -1));

        Inserccion.setBackground(new java.awt.Color(0, 0, 0));
        Inserccion.setForeground(new java.awt.Color(231, 233, 234));
        Inserccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconoInsercion.png"))); // NOI18N
        Inserccion.setText("   Inserción                   ");
        Inserccion.setColorSeleccion(new java.awt.Color(30, 30, 30));
        Inserccion.setDefaultBackground(new java.awt.Color(0, 0, 0));
        Inserccion.setDefaultText(new java.awt.Color(231, 233, 234));
        Inserccion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Inserccion.setHoverBackground(new java.awt.Color(24, 24, 24));
        Inserccion.setHoverText(new java.awt.Color(231, 233, 234));
        Inserccion.setMostrarBorde(false);
        Inserccion.setSelected(true);
        Inserccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InserccionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InserccionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InserccionMouseExited(evt);
            }
        });
        panelLateral.add(Inserccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 210, 40));

        panelLateralEliminar.setBackground(new java.awt.Color(24, 208, 195));
        panelLateralEliminar.setEnabled(false);
        panelLateralEliminar.setEsquinaInfIzq(5);
        panelLateralEliminar.setEsquinaSupIzq(5);
        panelLateralEliminar.setPreferredSize(new java.awt.Dimension(100, 40));
        panelLateralEliminar.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panelLateralEliminarLayout = new javax.swing.GroupLayout(panelLateralEliminar);
        panelLateralEliminar.setLayout(panelLateralEliminarLayout);
        panelLateralEliminarLayout.setHorizontalGroup(
            panelLateralEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelLateralEliminarLayout.setVerticalGroup(
            panelLateralEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelLateral.add(panelLateralEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 10, -1));

        Eliminar.setBackground(new java.awt.Color(0, 0, 0));
        Eliminar.setForeground(new java.awt.Color(231, 233, 234));
        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconoEliminar.png"))); // NOI18N
        Eliminar.setText("   Eliminación              ");
        Eliminar.setColorSeleccion(new java.awt.Color(30, 30, 30));
        Eliminar.setDefaultBackground(new java.awt.Color(0, 0, 0));
        Eliminar.setDefaultText(new java.awt.Color(231, 233, 234));
        Eliminar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Eliminar.setHoverBackground(new java.awt.Color(24, 24, 24));
        Eliminar.setHoverText(new java.awt.Color(231, 233, 234));
        Eliminar.setMostrarBorde(false);
        Eliminar.setPreferredSize(new java.awt.Dimension(104, 42));
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminarMouseExited(evt);
            }
        });
        panelLateral.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 210, -1));

        panelLateralBuscar.setBackground(new java.awt.Color(24, 208, 195));
        panelLateralBuscar.setEnabled(false);
        panelLateralBuscar.setEsquinaInfIzq(5);
        panelLateralBuscar.setEsquinaSupIzq(5);
        panelLateralBuscar.setPreferredSize(new java.awt.Dimension(100, 40));
        panelLateralBuscar.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panelLateralBuscarLayout = new javax.swing.GroupLayout(panelLateralBuscar);
        panelLateralBuscar.setLayout(panelLateralBuscarLayout);
        panelLateralBuscarLayout.setHorizontalGroup(
            panelLateralBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelLateralBuscarLayout.setVerticalGroup(
            panelLateralBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelLateral.add(panelLateralBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 10, -1));

        Buscar.setBackground(new java.awt.Color(0, 0, 0));
        Buscar.setForeground(new java.awt.Color(231, 233, 234));
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconoBuscar.png"))); // NOI18N
        Buscar.setText("   Búsqueda                 ");
        Buscar.setColorSeleccion(new java.awt.Color(30, 30, 30));
        Buscar.setDefaultBackground(new java.awt.Color(0, 0, 0));
        Buscar.setDefaultText(new java.awt.Color(231, 233, 234));
        Buscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Buscar.setHoverBackground(new java.awt.Color(24, 24, 24));
        Buscar.setHoverText(new java.awt.Color(231, 233, 234));
        Buscar.setMostrarBorde(false);
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuscarMouseExited(evt);
            }
        });
        panelLateral.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 210, 40));

        panelLateralRecorrdidos.setBackground(new java.awt.Color(24, 208, 195));
        panelLateralRecorrdidos.setEnabled(false);
        panelLateralRecorrdidos.setEsquinaInfIzq(5);
        panelLateralRecorrdidos.setEsquinaSupIzq(5);
        panelLateralRecorrdidos.setPreferredSize(new java.awt.Dimension(100, 40));
        panelLateralRecorrdidos.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panelLateralRecorrdidosLayout = new javax.swing.GroupLayout(panelLateralRecorrdidos);
        panelLateralRecorrdidos.setLayout(panelLateralRecorrdidosLayout);
        panelLateralRecorrdidosLayout.setHorizontalGroup(
            panelLateralRecorrdidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelLateralRecorrdidosLayout.setVerticalGroup(
            panelLateralRecorrdidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelLateral.add(panelLateralRecorrdidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 10, -1));

        Recorridos.setBackground(new java.awt.Color(0, 0, 0));
        Recorridos.setForeground(new java.awt.Color(231, 233, 234));
        Recorridos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconoRecorrido.png"))); // NOI18N
        Recorridos.setText("   Recorridos                ");
        Recorridos.setColorSeleccion(new java.awt.Color(30, 30, 30));
        Recorridos.setDefaultBackground(new java.awt.Color(0, 0, 0));
        Recorridos.setDefaultText(new java.awt.Color(231, 233, 234));
        Recorridos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Recorridos.setHoverBackground(new java.awt.Color(24, 24, 24));
        Recorridos.setHoverText(new java.awt.Color(231, 233, 234));
        Recorridos.setMostrarBorde(false);
        Recorridos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecorridosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RecorridosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RecorridosMouseExited(evt);
            }
        });
        panelLateral.add(Recorridos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 210, 40));

        panelLateralGrafico.setBackground(new java.awt.Color(24, 208, 195));
        panelLateralGrafico.setEnabled(false);
        panelLateralGrafico.setEsquinaInfIzq(5);
        panelLateralGrafico.setEsquinaSupIzq(5);
        panelLateralGrafico.setPreferredSize(new java.awt.Dimension(100, 40));
        panelLateralGrafico.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panelLateralGraficoLayout = new javax.swing.GroupLayout(panelLateralGrafico);
        panelLateralGrafico.setLayout(panelLateralGraficoLayout);
        panelLateralGraficoLayout.setHorizontalGroup(
            panelLateralGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelLateralGraficoLayout.setVerticalGroup(
            panelLateralGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelLateral.add(panelLateralGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 10, -1));

        Graficon.setBackground(new java.awt.Color(0, 0, 0));
        Graficon.setForeground(new java.awt.Color(231, 233, 234));
        Graficon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconoGrafico.png"))); // NOI18N
        Graficon.setText("   Grafico                       ");
        Graficon.setColorSeleccion(new java.awt.Color(30, 30, 30));
        Graficon.setDefaultBackground(new java.awt.Color(0, 0, 0));
        Graficon.setDefaultText(new java.awt.Color(231, 233, 234));
        Graficon.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Graficon.setHoverBackground(new java.awt.Color(24, 24, 24));
        Graficon.setHoverText(new java.awt.Color(231, 233, 234));
        Graficon.setMaximumSize(new java.awt.Dimension(110, 42));
        Graficon.setMinimumSize(new java.awt.Dimension(110, 42));
        Graficon.setMostrarBorde(false);
        Graficon.setPreferredSize(new java.awt.Dimension(110, 42));
        Graficon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GraficonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GraficonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GraficonMouseExited(evt);
            }
        });
        panelLateral.add(Graficon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 210, 40));

        panelDatos.setBackground(new java.awt.Color(52, 52, 52));
        panelDatos.setEsquinaInfDer(20);
        panelDatos.setEsquinaInfIzq(20);
        panelDatos.setEsquinaSupDer(20);
        panelDatos.setEsquinaSupIzq(20);

        datosTitulo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        datosTitulo.setForeground(new java.awt.Color(231, 233, 234));
        datosTitulo.setText("Estructuras de Datos");

        separadorDatos.setBackground(new java.awt.Color(24, 208, 195));
        separadorDatos.setForeground(new java.awt.Color(24, 208, 195));

        datosSubtitulo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        datosSubtitulo.setForeground(new java.awt.Color(231, 233, 234));
        datosSubtitulo.setText("Proyecto 3");

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(datosTitulo))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(separadorDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(datosSubtitulo)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(datosTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separadorDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datosSubtitulo)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panelLateral.add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 210, 110));

        panelConGradiente.setBackground(new java.awt.Color(34, 34, 34));
        panelConGradiente.setEsquinaInfDer(50);

        javax.swing.GroupLayout panelConGradienteLayout = new javax.swing.GroupLayout(panelConGradiente);
        panelConGradiente.setLayout(panelConGradienteLayout);
        panelConGradienteLayout.setHorizontalGroup(
            panelConGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelConGradienteLayout.setVerticalGroup(
            panelConGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        panelSuperior.setBackground(new java.awt.Color(34, 34, 34));
        panelSuperior.setEsquinaSupDer(50);
        panelSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelSuperiorMouseDragged(evt);
            }
        });
        panelSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelSuperiorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelSuperiorMouseReleased(evt);
            }
        });
        panelSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSalir.setBackground(new java.awt.Color(34, 34, 34));
        panelSalir.setEsquinaInfIzq(20);
        panelSalir.setEsquinaSupDer(50);
        panelSalir.setMaximumSize(new java.awt.Dimension(50, 40));
        panelSalir.setMinimumSize(new java.awt.Dimension(50, 40));
        panelSalir.setPreferredSize(new java.awt.Dimension(50, 40));
        panelSalir.setLayout(new java.awt.BorderLayout());

        btnSalir.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(231, 233, 234));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalir.setText("X");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        panelSalir.add(btnSalir, java.awt.BorderLayout.CENTER);

        panelSuperior.add(panelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelConGradiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelConGradiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /* - - - - - - - - - - - - - - - - - - - - Diseños - - - - - - - - - - - - - - - - - - - - */
    //Diseño del botón Salir.
    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        panelSalir.setBackground(new Color(24, 24, 24));
        btnSalir.setForeground(new Color(24, 208, 195));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        panelSalir.setBackground(new Color(34, 34, 34));
        btnSalir.setForeground(new Color(231, 233, 234));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0); //Sirve para salir del programa.
    }//GEN-LAST:event_btnSalirMouseClicked

    //Acción para mover la ventana.
    private void panelSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMousePressed
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            //Marca como true el booleano de presionado.
            mousePresionado = true;

            //Guarda la ubicación del mouse en el formulario.
            lastPoint = evt.getPoint();
        }
    }//GEN-LAST:event_panelSuperiorMousePressed

    private void panelSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMouseDragged
       if (mousePresionado) {
            //Calcula el desplazamiento desde la última posición del mouse.
            int deltaX = evt.getX() - lastPoint.x;
            int deltaY = evt.getY() - lastPoint.y;

            //Mueve el formulario según el desplazamiento calculado.
            this.setLocation(this.getLocation().x + deltaX, this.getLocation().y + deltaY);
        }
    }//GEN-LAST:event_panelSuperiorMouseDragged

    private void panelSuperiorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMouseReleased
        //Marca como false el booleano de presionado.
        mousePresionado = false;
    }//GEN-LAST:event_panelSuperiorMouseReleased

    //Diseño del botón Insercción.
    private void InserccionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InserccionMouseEntered
        if (botonSeleccionado != Inserccion) {
            Inserccion.setIcon(new ImageIcon(getClass().getResource("/Iconos/iconoInserccionHover.png")));
            panelLateralInserccon.setVisible(true);
        }
    }//GEN-LAST:event_InserccionMouseEntered

    private void InserccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InserccionMouseExited
        if (botonSeleccionado != Inserccion) {
            Inserccion.setIcon(new ImageIcon(getClass().getResource("/Iconos/iconoInsercion.png")));
            panelLateralInserccon.setVisible(false);
        }
    }//GEN-LAST:event_InserccionMouseExited

    //Diseño del botón Eliminar.
    private void EliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseEntered
        if (botonSeleccionado != Eliminar) {
            Eliminar.setIcon(new ImageIcon(getClass().getResource("/Iconos/iconoEliminarHover.png")));
            panelLateralEliminar.setVisible(true);
        }
    }//GEN-LAST:event_EliminarMouseEntered

    private void EliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseExited
        if (botonSeleccionado != Eliminar) {
            Eliminar.setIcon(new ImageIcon(getClass().getResource("/Iconos/iconoEliminar.png")));
            panelLateralEliminar.setVisible(false);
        }
    }//GEN-LAST:event_EliminarMouseExited

    //Diseño del botón Buscar.
    private void BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseEntered
        if (botonSeleccionado != Buscar) {
            Buscar.setIcon(new ImageIcon(getClass().getResource("/Iconos/iconoBuscarHover.png")));
            panelLateralBuscar.setVisible(true);
        }
    }//GEN-LAST:event_BuscarMouseEntered

    private void BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseExited
        if (botonSeleccionado != Buscar) {
            Buscar.setIcon(new ImageIcon(getClass().getResource("/Iconos/iconoBuscar.png")));
            panelLateralBuscar.setVisible(false);
        }
    }//GEN-LAST:event_BuscarMouseExited

    //Diseño del botón Recorridos.
    private void RecorridosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecorridosMouseEntered
        if (botonSeleccionado != Recorridos) {
            Recorridos.setIcon(new ImageIcon(getClass().getResource("/Iconos/iconoRecorridoHover.png")));
            panelLateralRecorrdidos.setVisible(true);
        }
    }//GEN-LAST:event_RecorridosMouseEntered

    private void RecorridosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecorridosMouseExited
        if (botonSeleccionado != Recorridos) {
            Recorridos.setIcon(new ImageIcon(getClass().getResource("/Iconos/iconoRecorrido.png")));
            panelLateralRecorrdidos.setVisible(false);
        }
    }//GEN-LAST:event_RecorridosMouseExited

    //Diseño del botón Grafico.
    private void GraficonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraficonMouseEntered
        if (botonSeleccionado != Graficon) {
            Graficon.setIcon(new ImageIcon(getClass().getResource("/Iconos/iconoGraficoHover.png")));
            panelLateralGrafico.setVisible(true);
        }
    }//GEN-LAST:event_GraficonMouseEntered

    private void GraficonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraficonMouseExited
        if (botonSeleccionado != Graficon) {
            Graficon.setIcon(new ImageIcon(getClass().getResource("/Iconos/iconoGrafico.png")));
            panelLateralGrafico.setVisible(false);
        }
    }//GEN-LAST:event_GraficonMouseExited

    /* - - - - - - - - - - - - - - - - - - - - Métodos de los botones - - - - - - - - - - - - - - - - - - - - */
    //Método para ingresar al bóton Insercción.
    private void InserccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InserccionMouseClicked
        //Llama al metodo para seleccionar el botón.
        seleccionarBoton(Inserccion);

        //Instancia el form.
        Insercion opcion = new Insercion(impresoras);

        //Cambia la ventana.
        cambiarOpcion(opcion);
    }//GEN-LAST:event_InserccionMouseClicked

    //Acción para ingresar al botón Eliminar.
    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        //Llama al metodo para seleccionar el botón.
        seleccionarBoton(Eliminar);

        //Instancia el form.
        Eliminacion opcion = new Eliminacion(impresoras);

        //Cambia la ventana.
        cambiarOpcion(opcion);
    }//GEN-LAST:event_EliminarMouseClicked

    //Método para ingresar al bóton Buscar.
    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseClicked
        //Llama al metodo para seleccionar el botón.
        seleccionarBoton(Buscar);

        //Instancia el form.
        BusquedaPorID opcion = new BusquedaPorID(impresoras);

        //Cambia la ventana.
        cambiarOpcion(opcion);
    }//GEN-LAST:event_BuscarMouseClicked

    //Método para ingresar al bóton Recorridos.
    private void RecorridosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecorridosMouseClicked
        //Llama al metodo para seleccionar el botón.
        seleccionarBoton(Recorridos);

        //Instancia el form.
        Recorridos opcion = new Recorridos(impresoras);

        //Cambia la ventana.
        cambiarOpcion(opcion);
    }//GEN-LAST:event_RecorridosMouseClicked

    //Método para ingresar al bóton Grafico.
    private void GraficonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraficonMouseClicked
        //Llama al metodo para seleccionar el botón.
        seleccionarBoton(Graficon);

        //Instancia el form.
        Graficos opcion = new Graficos(impresoras);

        //Cambia la ventana.
        cambiarOpcion(opcion);
    }//GEN-LAST:event_GraficonMouseClicked

    //Main.
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //Se inicializa el árbol.
        impresoras = new ArbolBinario();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Estilos.BotonPersonalizado Buscar;
    private Estilos.BotonPersonalizado Eliminar;
    private Estilos.BotonPersonalizado Graficon;
    private Estilos.BotonPersonalizado Inserccion;
    private Estilos.BotonPersonalizado Recorridos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel datosSubtitulo;
    private javax.swing.JLabel datosTitulo;
    private Estilos.PanelRedondeado panelConGradiente;
    private Estilos.PanelRedondeado panelDatos;
    private Estilos.PanelRedondeado panelLateral;
    private Estilos.PanelRedondeado panelLateralBuscar;
    private Estilos.PanelRedondeado panelLateralEliminar;
    private Estilos.PanelRedondeado panelLateralGrafico;
    private Estilos.PanelRedondeado panelLateralInserccon;
    private Estilos.PanelRedondeado panelLateralRecorrdidos;
    private Estilos.PanelRedondeado panelSalir;
    private Estilos.PanelRedondeado panelSuperior;
    private Estilos.PanelRedondeado panelTitulo;
    private javax.swing.JSeparator separadorDatos;
    // End of variables declaration//GEN-END:variables
}
