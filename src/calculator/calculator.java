/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;

/**
 *
 * @author Lahiru priyadarshana
 */
public class calculator extends javax.swing.JFrame {

    /**
     * Creates new form calculator
     */
    
    double NumEnter1;
    double NumEnter2;
    double Result;
    String op;
    public calculator() {
        initComponents();
    }

 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtResult = new javax.swing.JTextField();
        jBtnplusminus = new javax.swing.JButton();
        jBtnclear = new javax.swing.JButton();
        jBtnclearall = new javax.swing.JButton();
        jBtnbackspace = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtnplus = new javax.swing.JButton();
        jBtnminus = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtnmultiple = new javax.swing.JButton();
        jbtndivide = new javax.swing.JButton();
        jBtnequal = new javax.swing.JButton();
        jBtndecimal = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtResult.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtResultActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 350, 50));

        jBtnplusminus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnplusminus.setText("+/-");
        jBtnplusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnplusminusActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnplusminus, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 60, 40));

        jBtnclear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnclear.setText("C");
        jBtnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnclearActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 60, 40));

        jBtnclearall.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnclearall.setText("CE");
        jBtnclearall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnclearallActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnclearall, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 60, 40));

        jBtnbackspace.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnbackspace.setText("<");
        jBtnbackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnbackspaceActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnbackspace, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, 40));

        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 60, 40));

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 60, 40));

        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 60, 40));

        jBtnplus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnplus.setText("+");
        jBtnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnplusActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnplus, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 60, 40));

        jBtnminus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnminus.setText("-");
        jBtnminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnminusActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnminus, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 60, 40));

        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 60, 40));

        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 60, 40));

        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 60, 40));

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 60, 40));

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 60, 40));

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 60, 40));

        jBtnmultiple.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnmultiple.setText("*");
        jBtnmultiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnmultipleActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnmultiple, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 60, 40));

        jbtndivide.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtndivide.setText("/");
        jbtndivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndivideActionPerformed(evt);
            }
        });
        getContentPane().add(jbtndivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 60, 40));

        jBtnequal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnequal.setText("=");
        jBtnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnequalActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnequal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 60, 40));

        jBtndecimal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtndecimal.setText(".");
        jBtndecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtndecimalActionPerformed(evt);
            }
        });
        getContentPane().add(jBtndecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 60, 40));

        jBtn0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn0.setText("0");
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 60, 40));

        jLabel1.setText("My Calculator");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void EnterNumbers(String q)
{
    String Nums =jtxtResult.getText() +q;
    jtxtResult.setText(Nums);
}
    private void jtxtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtResultActionPerformed

    private void jBtnbackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnbackspaceActionPerformed
       String backsp=null;
       
       if (jtxtResult.getText().length()>0);
           StringBuilder sb = new StringBuilder(jtxtResult.getText());
           sb.deleteCharAt (jtxtResult.getText().length()-1);
                   backsp = sb .toString();
                   jtxtResult.setText(backsp);
                           
    }//GEN-LAST:event_jBtnbackspaceActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        EnterNumbers("9");
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
              EnterNumbers("8");
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed

            EnterNumbers("3");
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
            EnterNumbers("7");       
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        EnterNumbers("4");
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        EnterNumbers("5");
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        EnterNumbers("6");
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        EnterNumbers("1");
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        EnterNumbers("2");
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
       EnterNumbers("0");
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jbtndivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndivideActionPerformed
       NumEnter1= Double.parseDouble(jtxtResult.getText());
       jtxtResult.setText("");
       op="/";
    }//GEN-LAST:event_jbtndivideActionPerformed

    private void jBtnmultipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnmultipleActionPerformed
        NumEnter1= Double.parseDouble(jtxtResult.getText());
       jtxtResult.setText("");
       op="*";
    }//GEN-LAST:event_jBtnmultipleActionPerformed

    private void jBtnminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnminusActionPerformed
        NumEnter1= Double.parseDouble(jtxtResult.getText());
       jtxtResult.setText("");
       op="-";
    }//GEN-LAST:event_jBtnminusActionPerformed

    private void jBtnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnplusActionPerformed
        NumEnter1= Double.parseDouble(jtxtResult.getText());
       jtxtResult.setText("");
       op="+";
    }//GEN-LAST:event_jBtnplusActionPerformed

    private void jBtnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnclearActionPerformed
        jtxtResult.setText("");
    }//GEN-LAST:event_jBtnclearActionPerformed

    private void jBtnclearallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnclearallActionPerformed
       jtxtResult.setText("");
       String Fn,Sn;
       Fn=String.valueOf(NumEnter1);
       Sn=String.valueOf(NumEnter2);
       Fn="";
       Sn="";
    }//GEN-LAST:event_jBtnclearallActionPerformed

    private void jBtnplusminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnplusminusActionPerformed
        double nums=Double.parseDouble(String.valueOf(jtxtResult.getText()));
        nums=nums*(-1);
        jtxtResult.setText(String.valueOf(nums));
    }//GEN-LAST:event_jBtnplusminusActionPerformed

    private void jBtndecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtndecimalActionPerformed
        if (! jtxtResult.getText().contains (".")){
            jtxtResult.setText(jtxtResult.getText()+jBtndecimal.getText()); 
        }
    }//GEN-LAST:event_jBtndecimalActionPerformed

    private void jBtnequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnequalActionPerformed
        NumEnter2= Double.parseDouble(jtxtResult.getText());
        if (op == "+")
        {
        Result=NumEnter1+NumEnter2;
        jtxtResult.setText(String.valueOf(Result));
        }
        else if (op.equals("-"))
            {
                Result=NumEnter1-NumEnter2;
                jtxtResult.setText(String.valueOf(Result));
             
            }
         else if (op.equals("*"))
            {
                Result=NumEnter1*NumEnter2;
                jtxtResult.setText(String.valueOf(Result));
                        
            }
         else if(op.equals("/"))
                {
                Result=NumEnter1/NumEnter2;
                jtxtResult.setText(String.valueOf(Result));
                }   
            
    }//GEN-LAST:event_jBtnequalActionPerformed

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnbackspace;
    private javax.swing.JButton jBtnclear;
    private javax.swing.JButton jBtnclearall;
    private javax.swing.JButton jBtndecimal;
    private javax.swing.JButton jBtnequal;
    private javax.swing.JButton jBtnminus;
    private javax.swing.JButton jBtnmultiple;
    private javax.swing.JButton jBtnplus;
    private javax.swing.JButton jBtnplusminus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtndivide;
    private javax.swing.JTextField jtxtResult;
    // End of variables declaration//GEN-END:variables
}
