package crud_parqueadero.interfaz;

import daos.DAOS;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel Alzate
 */
public class panelAuxiliar extends javax.swing.JPanel {

    /**
     * Creates new form panelAuxiliar
     * @param daos
     */
    public panelAuxiliar(DAOS daos) {
        initComponents();
        this.daos = daos;
    }

    private DAOS daos;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        btnVehiculo = new javax.swing.JPanel();
        vehiculo = new javax.swing.JLabel();
        btnCliente = new javax.swing.JPanel();
        cliente = new javax.swing.JLabel();
        btnTicket = new javax.swing.JPanel();
        ticket = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();

        principal.setBackground(new java.awt.Color(255, 255, 255));
        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVehiculo.setBackground(new java.awt.Color(0, 102, 255));
        btnVehiculo.setForeground(new java.awt.Color(0, 102, 255));
        btnVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVehiculoMousePressed(evt);
            }
        });

        vehiculo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        vehiculo.setForeground(new java.awt.Color(0, 0, 0));
        vehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/coche (1).png"))); // NOI18N
        vehiculo.setText("Vehiculo");

        javax.swing.GroupLayout btnVehiculoLayout = new javax.swing.GroupLayout(btnVehiculo);
        btnVehiculo.setLayout(btnVehiculoLayout);
        btnVehiculoLayout.setHorizontalGroup(
            btnVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        btnVehiculoLayout.setVerticalGroup(
            btnVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        principal.add(btnVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 170, 40));

        btnCliente.setBackground(new java.awt.Color(0, 102, 255));
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClienteMouseClicked(evt);
            }
        });

        cliente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cliente.setForeground(new java.awt.Color(0, 0, 0));
        cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        cliente.setText("Cliente");

        javax.swing.GroupLayout btnClienteLayout = new javax.swing.GroupLayout(btnCliente);
        btnCliente.setLayout(btnClienteLayout);
        btnClienteLayout.setHorizontalGroup(
            btnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        btnClienteLayout.setVerticalGroup(
            btnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        principal.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        btnTicket.setBackground(new java.awt.Color(0, 102, 255));
        btnTicket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTicketMouseClicked(evt);
            }
        });

        ticket.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        ticket.setForeground(new java.awt.Color(0, 0, 0));
        ticket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ticket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facturas-de-papel.png"))); // NOI18N
        ticket.setText("Ticket");

        javax.swing.GroupLayout btnTicketLayout = new javax.swing.GroupLayout(btnTicket);
        btnTicket.setLayout(btnTicketLayout);
        btnTicketLayout.setHorizontalGroup(
            btnTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ticket, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        btnTicketLayout.setVerticalGroup(
            btnTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ticket, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        principal.add(btnTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 170, 40));

        contenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        principal.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 510, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
        NuevoCliente c = new NuevoCliente(daos);
        c.setSize(510, 470);
        c.setLocation(0, 0);

        contenedor.removeAll();
        contenedor.add(c, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();

        btnVehiculo.setBackground(new Color(0, 102, 255));
        btnCliente.setBackground(new Color(102, 153, 255));
        btnTicket.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_btnClienteMouseClicked

    private void btnVehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVehiculoMousePressed
        
        NuevoVehiculo v;
        try {
            v = new NuevoVehiculo(daos);
            v.setSize(510, 470);
            v.setLocation(0, 0);

            contenedor.removeAll();
            contenedor.add(v, BorderLayout.CENTER);
            contenedor.revalidate();
            contenedor.repaint();

            btnVehiculo.setBackground(new Color(102, 153, 255));
            btnCliente.setBackground(new Color(0, 102, 255));
            btnTicket.setBackground(new Color(0, 102, 255));
        } catch (SQLException ex) {
            Logger.getLogger(panelAuxiliar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnVehiculoMousePressed

    private void btnTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicketMouseClicked
       
        NuevoTicket t;
        try {
            t = new NuevoTicket(daos);
            t.setSize(510, 470);
            t.setLocation(0, 0);

            contenedor.removeAll();
            contenedor.add(t, BorderLayout.CENTER);
            contenedor.revalidate();
            contenedor.repaint();

            btnVehiculo.setBackground(new Color(0, 102, 255));
            btnCliente.setBackground(new Color(0, 102, 255));
            btnTicket.setBackground(new Color(102, 153, 255));
        } catch (SQLException ex) {
            Logger.getLogger(panelAuxiliar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnTicketMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCliente;
    private javax.swing.JPanel btnTicket;
    private javax.swing.JPanel btnVehiculo;
    private javax.swing.JLabel cliente;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel principal;
    private javax.swing.JLabel ticket;
    private javax.swing.JLabel vehiculo;
    // End of variables declaration//GEN-END:variables
}
