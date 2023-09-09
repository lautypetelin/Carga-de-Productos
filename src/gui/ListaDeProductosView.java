package gui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaDeProductosView extends javax.swing.JFrame {

    //Atributos
    private DefaultTableModel modelo;
    
    //Constructor
    public ListaDeProductosView() {
        
        initComponents();
        armarCabecera();
        
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jcbCategoriaProd = new javax.swing.JComboBox<>();
        jbAgregarProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductosAgregados = new javax.swing.JTable();
        jlTituloApp = new javax.swing.JLabel();
        jlCategoria = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jlPrecio = new javax.swing.JLabel();
        jtfPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Productos");

        jcbCategoriaProd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcbCategoriaProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimento", "Electronica", "Limpieza", "Ropa" }));

        jbAgregarProd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbAgregarProd.setText("Agregar");
        jbAgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarProdActionPerformed(evt);
            }
        });

        jtProductosAgregados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtProductosAgregados);

        jlTituloApp.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jlTituloApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTituloApp.setText("Carga de Productos");

        jlCategoria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlCategoria.setText("Categoria:");

        jlNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlNombre.setText("Nombre:");

        jlPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlPrecio.setText("Precio:");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTituloApp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addComponent(jlPrecio)
                                .addGap(18, 18, 18)
                                .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbAgregarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addComponent(jlNombre)
                                .addGap(18, 18, 18)
                                .addComponent(jtfNombre))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addComponent(jlCategoria)
                                .addGap(18, 18, 18)
                                .addComponent(jcbCategoriaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jlTituloApp)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCategoriaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCategoria))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPrecio)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAgregarProd))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarProdActionPerformed
        
        try{
            
            if(jtfNombre.getText().isEmpty() || jtfPrecio.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "No puede agregar un producto con campos vacíos.");
                return;
            }
            
            String nombre = jtfNombre.getText();
            double precio = Double.parseDouble(jtfPrecio.getText());
            
            if (precio < 0){
                JOptionPane.showMessageDialog(this, "Debe ingresar un precio mayor o igual a cero.");
                return;
            }
            
            String categoria = (String)jcbCategoriaProd.getSelectedItem();
        
            Producto producto = new Producto(nombre, precio, categoria);
            
            agregarFila(producto);
            
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Debe ingresar un valor númerico en el campo 'Precio'.");
        }
         
    }//GEN-LAST:event_jbAgregarProdActionPerformed

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
            java.util.logging.Logger.getLogger(ListaDeProductosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDeProductosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDeProductosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDeProductosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListaDeProductosView().setVisible(true);
            }
        });  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregarProd;
    private javax.swing.JComboBox<String> jcbCategoriaProd;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JLabel jlTituloApp;
    private javax.swing.JTable jtProductosAgregados;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPrecio;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
        
        modelo = new DefaultTableModel(){
    
            @Override
            public boolean isCellEditable(int f, int c){
                return false;
            }
        };
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Categoria");
        
        jtProductosAgregados.setModel(modelo);
    }
    
    private void agregarFila(Producto p){
    
        Object fila[] = {p.getNombre(), p.getPrecio(), p.getCategoria()};
        
        modelo.addRow(fila);
        
        limpiarCampos();
    }
    
    private void limpiarCampos(){
        jtfNombre.setText("");
        jtfPrecio.setText("");
    }
}