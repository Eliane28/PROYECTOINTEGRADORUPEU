/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package igu.compra_det;
import util.Config;
import modelo.Cliente;
import data.ClienteData;
import modelo.Producto;
import data.ProductoData;
import modelo.Compra;
import data.CompraData;
import data.CompraDetData;
import igu.compra.*;
import igu.producto.*;
import igu.cliente.*;
import java.awt.event.ItemEvent;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import modelo.CompraDet;


public class CompraDetPanel extends javax.swing.JPanel {
    
     private DefaultComboBoxModel comprasComboModel, productosComboModel;
     
    private List<Compra> compras;
    private List<Producto> productos;

    CompraDetTableModel mtdc;

    private boolean esActualizacion;
    
    private Producto productoSelected;
    private Compra compraSelected;

    

    public boolean isEsActualizacion() {
        return esActualizacion;
    }

    public Compra getCompraSelected() {
        return compraSelected;
    }
    public Producto getProductoSelected() {
        return productoSelected;
    }


    /** Creates new form ClientePanel */
    public CompraDetPanel() {
        initComponents();
         compras = CompraData.listCmb("");
        comprasComboModel = new DefaultComboBoxModel(compras.toArray());
        compraCombo.setModel(comprasComboModel);
        
        productos = ProductoData.listCmb("");
        productosComboModel= new DefaultComboBoxModel(productos.toArray());
        productoCombo.setModel(productosComboModel);

        mtdc = new CompraDetTableModel();
        detTable.setModel(mtdc);
        detTable.setEnabled(true);
        
        paintTable(mtdc);
    }
    
    public void paintTable(CompraDetTableModel tableModel) {
        this.mtdc = tableModel;
        detTable.setModel(mtdc);
        detTable.getColumnModel().getColumn(0).setMaxWidth(35);

        
       

    }

    

   

   

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formClientePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        iniciarCompraButton = new javax.swing.JButton();
        agregarCompraDetButton = new javax.swing.JButton();
        eliminarClienteButton = new javax.swing.JButton();
        compraCombo = new javax.swing.JComboBox<>();
        nomCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        productoCombo = new javax.swing.JComboBox<>();
        cantidadField = new javax.swing.JTextField();
        endButton = new javax.swing.JButton();
        clienteTitlePanel = new javax.swing.JPanel();
        productoTitle = new javax.swing.JLabel();
        clienteTablePanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 255, 102));
        setMinimumSize(new java.awt.Dimension(944, 371));
        setPreferredSize(new java.awt.Dimension(944, 371));

        jLabel2.setText("Compra");

        iniciarCompraButton.setText("Calcular");
        iniciarCompraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarCompraButtonActionPerformed(evt);
            }
        });

        agregarCompraDetButton.setText("Agregar");
        agregarCompraDetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCompraDetButtonActionPerformed(evt);
            }
        });

        eliminarClienteButton.setText("Eliminar");
        eliminarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarClienteButtonActionPerformed(evt);
            }
        });

        compraCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione cliente", " ", " ", " " }));
        compraCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                compraComboItemStateChanged(evt);
            }
        });

        nomCliente.setText("Cantidad");

        jLabel3.setText("Producto");

        productoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione producto", " " }));
        productoCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                productoComboItemStateChanged(evt);
            }
        });

        endButton.setText("Terminar");
        endButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formClientePanelLayout = new javax.swing.GroupLayout(formClientePanel);
        formClientePanel.setLayout(formClientePanelLayout);
        formClientePanelLayout.setHorizontalGroup(
            formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formClientePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iniciarCompraButton)
                    .addGroup(formClientePanelLayout.createSequentialGroup()
                        .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(nomCliente)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(compraCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formClientePanelLayout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endButton)
                    .addGroup(formClientePanelLayout.createSequentialGroup()
                        .addComponent(agregarCompraDetButton)
                        .addGap(45, 45, 45)
                        .addComponent(eliminarClienteButton)))
                .addGap(43, 43, 43))
        );
        formClientePanelLayout.setVerticalGroup(
            formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formClientePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compraCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarClienteButton)
                    .addComponent(agregarCompraDetButton)
                    .addComponent(iniciarCompraButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(endButton)
                .addGap(31, 31, 31))
        );

        productoTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        productoTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productoTitle.setText("Detalle Compra");

        javax.swing.GroupLayout clienteTitlePanelLayout = new javax.swing.GroupLayout(clienteTitlePanel);
        clienteTitlePanel.setLayout(clienteTitlePanelLayout);
        clienteTitlePanelLayout.setHorizontalGroup(
            clienteTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clienteTitlePanelLayout.createSequentialGroup()
                .addComponent(productoTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        clienteTitlePanelLayout.setVerticalGroup(
            clienteTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productoTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        detTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(detTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout clienteTablePanelLayout = new javax.swing.GroupLayout(clienteTablePanel);
        clienteTablePanel.setLayout(clienteTablePanelLayout);
        clienteTablePanelLayout.setHorizontalGroup(
            clienteTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        clienteTablePanelLayout.setVerticalGroup(
            clienteTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(formClientePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clienteTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(clienteTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clienteTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clienteTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(formClientePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(137, 137, 137))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarCompraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarCompraButtonActionPerformed
        // TODO add your handling code here:
        
            
            /*if (compr != null) {
                paintTable(new CompraDetTableModel(compraSelected));
                MsgPanel.success("venta id:" + ventaSelected.getId() + "  existente de " + ventaSelected.getClie_nom() + " idcli:" + clienteSelected.getId());

            } else {
                ventaSelected = null;
                Venta d = new Venta();
                d.setClie_id(clienteSelected.getId());
                d.setClie_nom(clienteSelected.getNombres());
                int ventaId = VentaData.create(d);

                if (ventaId > 0) {
                    ventaSelected = VentaData.getByPId(ventaId);
                    MsgPanel.success("venta id:" + ventaSelected.getId() + " creado para " + ventaSelected.getClie_nom() + " idcli:" + clienteSelected.getId());

                    paintTable(new VentaLineasTableModel(ventaSelected));

                } else {

                    ventaSelected = null;
                    MsgPanel.error("No se pudo crear la venta para idcli:" + clienteSelected.getId(), true);
                }

            }

            //new
            if (ventaSelected != null) {
                System.out.printf("ventaSelected \n");
                double sal = sumRow(this.mtdc, 4); //CompraDetData.getSaldosByCompId(compraSelected.getId());
                total.setText(new DecimalFormat(Config.DEFAULT_DECIMAL_STRING_FORMAT).format(sal));
            } else {
                System.out.printf("venta no Selected \n");
                total.setText("0");

            }*/

        
    }//GEN-LAST:event_iniciarCompraButtonActionPerformed

    private void compraComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_compraComboItemStateChanged
        // TODO add your handling code here:
        /* if (evt.getStateChange() == ItemEvent.SELECTED) {
            compraSelected = (Compra) clienteCombo.getSelectedItem();
            int id = compraSelected.getIdCompra();
            if (id > 0) {
                List<Compra> comprasDelCliente = CompraData.listActivesByCliente(compraSelected.getIdCompra());
                if (comprasDelCliente.size() > 0) {
                    int compraId = comprasDelCliente.get(0).getIdCompra();// coge el primero
                    compraSelected = CompraData.getByPId(compraId);
                    
                } else {
                    
                    compraSelected = null;
                   
                }
                detTable.setEnabled(true);
                esActualizacion = true;
                // cmbProveedor.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1));
                // MsgPanel.error("");
                paintTable(new CompraDetTableModel());

            } else {
               
                compraSelected = null;
                detTable.setEnabled(false);
                paintTable(new CompraDetTableModel());

            }
        }*/
        
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            compraSelected = (Compra) compraCombo.getSelectedItem();
            int id = compraSelected.getIdCompra();
            if (id > 0) {
                System.out.println("tttts");
                System.out.println(compraSelected.getIdCompra());
                List<CompraDet> comprasDelCliente = CompraDetData.listCompraDetbyCompra(compraSelected.getIdCompra());
                if (comprasDelCliente.size() > 0) {
                    int compraId = comprasDelCliente.get(0).getIdCompra();// coge el primero
                    
                } else {
                    
                }
                /*if (comprasDelCliente.size() > 0) {
                    int compraId = comprasDelCliente.get(0).getIdCompra();// coge el primero
                    compraSelected = CompraData.getByPId(compraId);
                    
                } else {
                    
                    compraSelected = null;
                   
                }*/
                detTable.setEnabled(true);
                esActualizacion = true;
                // cmbProveedor.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1));
                // MsgPanel.error("");
                paintTable(new CompraDetTableModel());

            } else {
               
                productoSelected = null;
                detTable.setEnabled(false);
                paintTable(new CompraDetTableModel());

            }
        }
        
    }//GEN-LAST:event_compraComboItemStateChanged

    private void endButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endButtonActionPerformed
        // TODO add your handling code here:
        if (compraSelected != null) {
            int opc = JOptionPane.showConfirmDialog(null, "¿Realmente desea terminar la venta? Una vez cerrada ya no podrá modificar esta venta", "TERMINAR COMPRA", JOptionPane.YES_NO_OPTION);
            if (opc == JOptionPane.OK_OPTION) {
                //compraSelected.setActivo(2);
                int op = CompraData.update(compraSelected);

                if (op > 0) {
                   
                } else {
                    
                }
            }
           
        }
    }//GEN-LAST:event_endButtonActionPerformed

    private void productoComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_productoComboItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            productoSelected = (Producto) productoCombo.getSelectedItem();
            int id = productoSelected.getIdProducto();
            if (id > 0) {
                System.out.println("asdfasdfaf");
                System.out.println(productoSelected.getIdProducto());
                List<CompraDet> pDelCliente = CompraDetData.listCompraDetbyProducto(productoSelected.getIdTipo());
                if (pDelCliente.size() > 0) {
                    int compraId = pDelCliente.get(0).getIdProducto();// coge el primero
                    
                } else {
                    
                }
                /*if (comprasDelCliente.size() > 0) {
                    int compraId = comprasDelCliente.get(0).getIdCompra();// coge el primero
                    compraSelected = CompraData.getByPId(compraId);
                    
                } else {
                    
                    compraSelected = null;
                   
                }*/
                detTable.setEnabled(true);
                esActualizacion = true;
                // cmbProveedor.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1));
                // MsgPanel.error("");
                paintTable(new CompraDetTableModel());

            } else {
               
                productoSelected = null;
                detTable.setEnabled(false);
                paintTable(new CompraDetTableModel());

            }
        }
    }//GEN-LAST:event_productoComboItemStateChanged

    private void agregarCompraDetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCompraDetButtonActionPerformed
        // TODO add your handling code here:
        
            

       
            CompraDet s = new CompraDet();
            
            s.setIdCompra(compraSelected.getIdCompra());
            
            s.setIdProducto(productoSelected.getIdProducto());
            s.setNomProducto(productoSelected.getNombreProd());
            s.setCantidad(Integer.parseInt(cantidadField.getText()));
            s.setPrecio(productoSelected.getPrecio());
            s.setParcial(productoSelected.getPrecio()*Integer.parseInt(cantidadField.getText()));
            
            
            CompraDetData.create(s);
            int[]listaid=new int[detTable.getRowCount()+1];
            for (int i=0 ;i<detTable.getRowCount()+1;i++){
                listaid[i]=s.getIdCompra();
            }
            paintTable(new CompraDetTableModel());
            System.out.println("qqqqqq");
          
            /*if (detTable.getSelectedRow() != -1) {// ha seleccionado, update
                try {
                    Producto fila = (Producto) mtdc.getRow(detTable.getSelectedRow());
                    s.setIdProducto(fila.getIdProducto());
                    System.out.println("id:" + s.getIdProducto());
                    if (s.getIdProducto()> 0) {
                        int returnId = CompraDetData.create(s);
                        if (returnId != 0) {
                            paintTable(new CompraDetTableModel());
                            //resetForm();
                            
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No se puede editar: " + ex.getMessage());
                }
            } else { // sin seleccionar, insert
                try {
                    int returnId = CompraDetData.create(s);
                    if (returnId != 0) {
                        paintTable(new CompraDetTableModel());
                        // s.setId(returnId);//necesitamos subir el id, ya no
                        //tablaClienteModel.addRow(s);
                        //resetForm();
                        
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No se puede insertar: " + ex.getMessage());
                }
            }*/
        
    }//GEN-LAST:event_agregarCompraDetButtonActionPerformed

    private void eliminarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarClienteButtonActionPerformed
        // TODO add your handling code here:
        if (detTable.getSelectedRow() != -1) {
            try {
                int opc = JOptionPane.showConfirmDialog(this, "¿Realmente desea eliminar?", "Quitar", JOptionPane.YES_NO_OPTION);
                if (opc == JOptionPane.OK_OPTION) {
                    CompraDet fila = (CompraDet) mtdc.getRow(detTable.getSelectedRow());
                    System.out.printf("eliminarButtonActionPerformed getId:%d getSelectedRow:%d \n", fila.getIdCompraDet(), detTable.getSelectedRow());

                    int opcion = CompraDetData.delete(fila.getIdCompraDet());
                    if (opcion != 0) {
                        //tablaClienteModel.removeRow(detTable.getSelectedRow());
                        paintTable(new CompraDetTableModel());
                        //resetForm();
                        
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registo de la tabla");
        }
    }//GEN-LAST:event_eliminarClienteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarCompraDetButton;
    private javax.swing.JTextField cantidadField;
    private javax.swing.JPanel clienteTablePanel;
    private javax.swing.JPanel clienteTitlePanel;
    private javax.swing.JComboBox<String> compraCombo;
    private javax.swing.JTable detTable;
    private javax.swing.JButton eliminarClienteButton;
    private javax.swing.JButton endButton;
    private javax.swing.JPanel formClientePanel;
    private javax.swing.JButton iniciarCompraButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomCliente;
    private javax.swing.JComboBox<String> productoCombo;
    private javax.swing.JLabel productoTitle;
    // End of variables declaration//GEN-END:variables

}