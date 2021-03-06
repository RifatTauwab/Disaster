
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import net.proteanit.sql.DbUtils;
import oracle.jdbc.OracleTypes;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tauwab Uz Zahir
 */
public class Chart extends javax.swing.JFrame {

    /**
     * Creates new form Chart
     */
    public Chart() {
        initComponents();
    }
CallableStatement stored_pro = null;
    Statement statement1 = null; 
    ResultSet rs = null;
    Connection conn = null;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Show");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "All year" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("disaster Prone");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("foreign help");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "All year" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Economic Loss");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Show");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("months");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Human Died");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Disaster Prone Months");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        conn = ConnectDB.connectDb();
    }//GEN-LAST:event_formWindowActivated

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
           try{
       stored_pro = conn.prepareCall("{call HumanLossAllYear(?)}");
      
     
      stored_pro.registerOutParameter(1, OracleTypes.CURSOR);
      stored_pro.execute();
      
      rs = (ResultSet)stored_pro.getObject(1);
            
       DefaultCategoryDataset barChartData = new DefaultCategoryDataset();     
           
            while(rs.next())
            {
                
                int human = rs.getInt("humanlife");
                String time = rs.getString("year_found");
                System.out.println(human);
                System.out.println(time);
                  
                  barChartData.setValue(human, "human loss", time);
                   
                  
            }
              JFreeChart barChart = ChartFactory.createBarChart("human loss","year", "Human Loss", barChartData, PlotOrientation.VERTICAL, false, true, false);
                    CategoryPlot barChrt = barChart.getCategoryPlot();
                    barChrt.setRangeGridlinePaint(Color.black);
                    ChartPanel barChartPanel = new ChartPanel(barChart);
                    jPanel2.removeAll();
                    jPanel2.add(barChartPanel,BorderLayout.CENTER);
                    jPanel2.validate();
        }catch(Exception e)
        {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String year = jComboBox1.getSelectedItem().toString().trim();
        System.out.println(year);
        try{
            if(year != "All year"){
            stored_pro = conn.prepareCall("{call DisasterProneByYear(?,?)}");
            stored_pro.setString(1, year);

            stored_pro.registerOutParameter(2, OracleTypes.CURSOR);
            stored_pro.execute();

            rs = (ResultSet)stored_pro.getObject(2);
            }
            else{
                
                        stored_pro = conn.prepareCall("{call DisProneAllYear(?)}");
            

            stored_pro.registerOutParameter(1, OracleTypes.CURSOR);
            stored_pro.execute();

            rs = (ResultSet)stored_pro.getObject(1);
            }
            DefaultCategoryDataset barChartData = new DefaultCategoryDataset();

            while(rs.next())
            {

                String place = rs.getString("place");
                int time = Integer.parseInt(rs.getString("total"));
                System.out.println(place);
                System.out.println(time);

                barChartData.setValue(time, "disaster prone area", place);

            }
            JFreeChart barChart = ChartFactory.createBarChart("disaster prone area "+year,"area", "disaster number", barChartData, PlotOrientation.VERTICAL, false, true, false);
            CategoryPlot barChrt = barChart.getCategoryPlot();
            barChrt.setRangeGridlinePaint(Color.black);
            ChartPanel barChartPanel = new ChartPanel(barChart);
            jPanel2.removeAll();
            jPanel2.add(barChartPanel,BorderLayout.CENTER);
            jPanel2.validate();
            
        }catch(Exception e)
        {
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        String year = jComboBox2.getSelectedItem().toString().trim();
       try{
       stored_pro = conn.prepareCall("{call MostForeignHelp(?,?)}");
      
     stored_pro.setString(1, year);
      stored_pro.registerOutParameter(2, OracleTypes.CURSOR);
      stored_pro.execute();
      
      rs = (ResultSet)stored_pro.getObject(2);
            
       DefaultCategoryDataset barChartData = new DefaultCategoryDataset();     
           
            while(rs.next())
            {
                
                Double fund = Double.valueOf(rs.getString(2));
                String country = rs.getString(1);
                System.out.println(fund);
                System.out.println(country);
                  
                  barChartData.setValue(fund, "foreign help", country);
                   
                  
            }
              JFreeChart barChart = ChartFactory.createBarChart("foreign help","country/Institute", "fund (million USD)", barChartData, PlotOrientation.HORIZONTAL, false, true, false);
                    CategoryPlot barChrt = barChart.getCategoryPlot();
                    barChrt.setRangeGridlinePaint(Color.black);
                    ChartPanel barChartPanel = new ChartPanel(barChart);
                    jPanel2.removeAll();
                    jPanel2.add(barChartPanel,BorderLayout.CENTER);
                    jPanel2.validate();
        }catch(Exception e)
        {
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
           try{
       stored_pro = conn.prepareCall("{call EconomicLossAllYear(?)}");
      
     
      stored_pro.registerOutParameter(1, OracleTypes.CURSOR);
      stored_pro.execute();
      
      rs = (ResultSet)stored_pro.getObject(1);
            
       DefaultCategoryDataset barChartData = new DefaultCategoryDataset();     
           
            while(rs.next())
            {
                
                int economic = rs.getInt("economic");
                String time = rs.getString("year_found");
                System.out.println(economic);
                System.out.println(time);
                  
                  barChartData.setValue(economic, "economical loss", time);
                   
                  
            }
              JFreeChart barChart = ChartFactory.createBarChart("Economical loss For All year","year", "Economic Loss(million USD)", barChartData, PlotOrientation.VERTICAL, false, true, false);
                    CategoryPlot barChrt = barChart.getCategoryPlot();
                    barChrt.setRangeGridlinePaint(Color.black);
                    ChartPanel barChartPanel = new ChartPanel(barChart);
                    jPanel2.removeAll();
                    jPanel2.add(barChartPanel,BorderLayout.CENTER);
                    jPanel2.validate();
        }catch(Exception e)
        {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String months ="";
            try{
       stored_pro = conn.prepareCall("{call disProneMonth(?)}");
      
     
      stored_pro.registerOutParameter(1, OracleTypes.CURSOR);
      stored_pro.execute();
      
      rs = (ResultSet)stored_pro.getObject(1);
            
       DefaultCategoryDataset barChartData = new DefaultCategoryDataset();     
           
            while(rs.next())
            {
                
                int total = rs.getInt("total");
                int month = rs.getInt("months");
                
                System.out.println(total);
                System.out.println(month);
                 if(month==1)
                    months = "January";
                 else if(month==2)
                    months = "February";
                 else if(month==3)
                    months = "March";
                 else if(month==4)
                    months = "April";
                 else if(month==5)
                    months = "May";
                 else if(month==6)
                    months = "June";
                 else if(month==7)
                    months = "July";
                 else if(month==8)
                    months = "August";
                 else if(month==9)
                    months = "September";
                 else if(month==10)
                    months = "October";
                 else if(month==11)
                    months = "November";
                 else if(month==12)
                    months = "December";
                 
                  barChartData.setValue(total, "months", months);
                   
                  
            }
              JFreeChart barChart = ChartFactory.createBarChart("Disaster Prone Months","Months", "number", barChartData, PlotOrientation.VERTICAL, false, true, false);
                    CategoryPlot barChrt = barChart.getCategoryPlot();
                    barChrt.setRangeGridlinePaint(Color.black);
                    ChartPanel barChartPanel = new ChartPanel(barChart);
                    jPanel2.removeAll();
                    jPanel2.add(barChartPanel,BorderLayout.CENTER);
                    jPanel2.validate();
        }catch(Exception e)
        {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Chart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
