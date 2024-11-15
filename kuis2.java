
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author cinn
 */
public class kuis2 extends javax.swing.JFrame {

    private Object statusLabel;

    /**
     * Creates new form kuis2
     */
    public kuis2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGrup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nikText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        alamatText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        memasakCheckBox = new javax.swing.JCheckBox();
        olahragaCheckBox = new javax.swing.JCheckBox();
        gameCheckBox = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        telpTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pendidikanComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        ipkFormattedTextField = new javax.swing.JFormattedTextField();
        daftarButton = new javax.swing.JButton();
        namaText = new javax.swing.JTextField();
        tanggalLahirFormattedTextField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("LENGKAPI BIODATAMU ");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("NIK");

        nikText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nikTextKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Alamat");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Jenis Kelamin");

        genderGrup.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRadioButton1.setText("Laki-laki");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        genderGrup.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRadioButton2.setText("Perempuan");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Hobby");

        memasakCheckBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        memasakCheckBox.setText("Memasak");
        memasakCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memasakCheckBoxActionPerformed(evt);
            }
        });

        olahragaCheckBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        olahragaCheckBox.setText("Olahraga");
        olahragaCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olahragaCheckBoxActionPerformed(evt);
            }
        });

        gameCheckBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        gameCheckBox.setText("Game ");
        gameCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameCheckBoxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("No. Telp");

        telpTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telpTextFieldKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Tanggal Lahir");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Pendidikan");

        pendidikanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SD", "SMP", "SMA", "D1", "D2", "D3", "D4/S1", "S2", "S3", " " }));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("IPK");

        ipkFormattedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ipkFormattedTextFieldKeyTyped(evt);
            }
        });

        daftarButton.setText("Daftar");
        daftarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarButtonActionPerformed(evt);
            }
        });

        tanggalLahirFormattedTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tanggalLahirFormattedTextFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nikText)
                                    .addComponent(alamatText)
                                    .addComponent(namaText, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(daftarButton)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(27, 27, 27)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ipkFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pendidikanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(tanggalLahirFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(memasakCheckBox)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(olahragaCheckBox)
                                                .addGap(18, 18, 18)
                                                .addComponent(gameCheckBox))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43)
                                                .addComponent(jRadioButton2))
                                            .addComponent(telpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nikText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(alamatText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(memasakCheckBox)
                    .addComponent(olahragaCheckBox)
                    .addComponent(gameCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(telpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tanggalLahirFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pendidikanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ipkFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(daftarButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void memasakCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memasakCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memasakCheckBoxActionPerformed

    private void gameCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gameCheckBoxActionPerformed

    private void olahragaCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olahragaCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_olahragaCheckBoxActionPerformed

    private void daftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButtonActionPerformed
        // TODO add your handling code here:
          // Ambil input nama dan alamat
    String nama = namaText.getText().trim();
    String alamat = alamatText.getText().trim();

    // Memeriksa apakah nama atau alamat kosong
    if (nama.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return; // Jangan lanjutkan jika nama kosong
    }
    
    if (alamat.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Alamat tidak boleh kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return; // Jangan lanjutkan jika alamat kosong
    }
    
    // Misalnya, setelah validasi berhasil:
    JOptionPane.showMessageDialog(null, "Anda berhasil mendaftar");
    }//GEN-LAST:event_daftarButtonActionPerformed

    private void telpTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telpTextFieldKeyTyped
        // TODO add your handling code here:
        char inputChar = evt.getKeyChar();
    
        // Cek jika karakter yang diinput bukan angka, maka batalkan input tersebut
       if (!Character.isDigit(inputChar)) {
             evt.consume(); // Batalkan karakter non-angka
        }
    }//GEN-LAST:event_telpTextFieldKeyTyped

    private void ipkFormattedTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ipkFormattedTextFieldKeyTyped
        // TODO add your handling code here:
         try {
        // Mendapatkan nilai IPK yang dimasukkan dari jFormattedTextField1
        String text = ipkFormattedTextField.getText().trim();
        
        // Mengubah string menjadi double untuk validasi IPK
        double ipk = Double.parseDouble(text);
        
        // Mendapatkan nilai pendidikan (misalnya dari JComboBox atau JTextField)
        String pendidikan = pendidikanComboBox.getSelectedItem().toString(); // Misalnya menggunakan JComboBox untuk memilih pendidikan

        // Mengecek apakah IPK berada dalam rentang 0,00 hingga 4,00
        if (ipk < 0.00 || ipk > 4.00) {
            JOptionPane.showMessageDialog(null, "IPK tidak valid");
        }
        // Mengecek apakah pendidikan minimal D1 dan IPK minimal 3,01
        else if (pendidikan.equalsIgnoreCase("D1") && ipk < 3.01) {
            JOptionPane.showMessageDialog(null, "IPK untuk pendidikan D1 harus minimal 3,01");
        } else {
            // Jika validasi IPK dan pendidikan sudah benar, lanjutkan ke proses berikutnya
            // Bisa menambahkan logika untuk melanjutkan pengisian formulir atau lainnya
        }
    } catch (NumberFormatException e) {
        // Jika terjadi kesalahan format (misalnya input bukan angka)
        JOptionPane.showMessageDialog(null, "IPK tidak valid");
    }
    }//GEN-LAST:event_ipkFormattedTextFieldKeyTyped

    private void nikTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nikTextKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar(); // Mendapatkan karakter yang diketikkan

    // Memeriksa apakah karakter yang dimasukkan adalah angka
    if (!Character.isDigit(c)) {
        evt.consume();  // Membatalkan input jika bukan angka
    }
    }//GEN-LAST:event_nikTextKeyTyped

    private void tanggalLahirFormattedTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tanggalLahirFormattedTextFieldFocusLost
        // TODO add your handling code here:
         try {
        // Mendapatkan tanggal lahir dari JFormattedTextField
        String tanggalLahirText = tanggalLahirFormattedTextField.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date tanggalLahir = sdf.parse(tanggalLahirText);
        
        // Mendapatkan tanggal saat ini
        Calendar today = Calendar.getInstance();
        
        // Menghitung usia berdasarkan tanggal lahir
        int age = today.get(Calendar.YEAR) - tanggalLahir.getYear() - 1900;
        if (today.get(Calendar.MONTH) < tanggalLahir.getMonth()) {
            age--;
        } else if (today.get(Calendar.MONTH) == tanggalLahir.getMonth() && today.get(Calendar.DATE) < tanggalLahir.getDate()) {
            age--;
        }
        
        // Jika usia lebih dari 18 tahun, lanjutkan proses
        if (age >= 18) {
            // Lanjutkan dengan proses form pengisian data lainnya
            // Misalnya: enable next input fields, atau biarkan form lanjut
        } else {
            // Tampilkan pesan jika usia kurang dari 18
            JOptionPane.showMessageDialog(null, "Anda belum cukup umur untuk melamar pekerjaan ini", 
                                          "Peringatan", JOptionPane.WARNING_MESSAGE);
            // Anda bisa menambahkan logika untuk mencegah melanjutkan form pengisian
        }
    } catch (ParseException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Format tanggal salah", 
                                      "Peringatan", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_tanggalLahirFormattedTextFieldFocusLost

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
            java.util.logging.Logger.getLogger(kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kuis2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatText;
    private javax.swing.JButton daftarButton;
    private javax.swing.JCheckBox gameCheckBox;
    private javax.swing.ButtonGroup genderGrup;
    private javax.swing.JFormattedTextField ipkFormattedTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JCheckBox memasakCheckBox;
    private javax.swing.JTextField namaText;
    private javax.swing.JTextField nikText;
    private javax.swing.JCheckBox olahragaCheckBox;
    private javax.swing.JComboBox<String> pendidikanComboBox;
    private javax.swing.JFormattedTextField tanggalLahirFormattedTextField;
    private javax.swing.JTextField telpTextField;
    // End of variables declaration//GEN-END:variables
}