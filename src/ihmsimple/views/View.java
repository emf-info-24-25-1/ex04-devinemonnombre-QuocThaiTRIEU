package ihmsimple.views;

import ihmsimple.ctrl.Controller;
import ihmsimple.services.ServiceDevine;
import java.awt.Color;

/**
 * Classe représentant l'ihm de l'application MVC "IhmSimple".
 *
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 29.10.2023
 * @version 1.0.0
 */
public class View extends javax.swing.JFrame {

    /**
     * ATTENTION : ces attributs de l'ihm ne doivent pas être modifiés car
     * automatiquement modifiés et regénérés par l'éditeur.
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeviner;
    private javax.swing.JButton jButtonNouveauJeu;
    private javax.swing.JLabel jLabelEtat;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelProposition;
    private javax.swing.JTextField jTextFieldProposition;
    // End of variables declaration//GEN-END:variables

    /**
     * La référence au contrôleur de l'application.
     */
    private Controller refCtrl;

    /**
     * Constructeur de l'ihm.
     */
    public View() {
    }

    /**
     * Affiche un nouveau status de l'application dans la couleur de fond souhaitée.
     *
     * @param texte           le nouveau texte de status
     * @param backgroundColor la couleur de fond de ce nouveau status
     */
    public void afficherStatus(String texte, Color backgroundColor) {
        if (jLabelEtat != null) {
            jLabelEtat.setText(texte);
            jLabelEtat.setBackground(backgroundColor);
        }
    }

    /**
     * Prépare l'ihm et ses composants puis rends l'ihm visible à l'écran.
     */
    public void ihmStart() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Retourne la valeur entière correspondant à ce qui a été saisi par
     * l'utilisateur dans le champ "proposition".
     *
     * @return la valeur entière correspondante ou NOMBRE_INVALIDE si ce qui a été
     *         saisi par l'utilisateur n'est pas
     *         convertible en un entier
     */
    public int lireValeurProposee() {

        String contenu = jTextFieldProposition.getText();
        int valeur = ServiceDevine.NOMBRE_INVALIDE;

        try {
            valeur = Integer.valueOf(contenu);
        } catch (Exception e) {
        }

        return valeur;
    }

    /**
     * Setter de la référence au contrôleur de l'application.
     *
     * @param refCtrl la nouvelle référence au contrôleur de l'application
     */
    public void setRefCtrl(Controller refCtrl) {
        this.refCtrl = refCtrl;
    }

    /**
     * Getter de la référence au contrôleur de l'application.
     *
     * @return la référence au contrôleur de l'application
     */
    public Controller getRefCtrl(Controller refCtrl) {
        return refCtrl;
    }

    /**
     * ATTENTION : cette méthode est appelée afin d'initialiser les composants de la
     * vue et ne doit pas être modifiée car
     * son contenu est automatiquement modifié et regénéré par l'éditeur.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonNouveauJeu = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelProposition = new javax.swing.JLabel();
        jTextFieldProposition = new javax.swing.JTextField();
        jButtonDeviner = new javax.swing.JButton();
        jLabelEtat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonNouveauJeu.setText("Ordinateur - Pense à un nouveau nombre");
        jButtonNouveauJeu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNouveauJeuActionPerformed(evt);
            }
        });

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ihmsimple/views/pingouin.png"))); // NOI18N

        jLabelProposition.setText("Votre proposition : ");

        jTextFieldProposition.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonDeviner.setText("Vérifier");
        jButtonDeviner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevinerActionPerformed(evt);
            }
        });

        jLabelEtat.setBackground(new java.awt.Color(153, 153, 255));
        jLabelEtat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEtat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEtat.setText("Jeu terminé !");
        jLabelEtat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelEtat.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelLogo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonNouveauJeu, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonDeviner, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelEtat, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelProposition)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldProposition)))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonNouveauJeu)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelProposition)
                                                        .addComponent(jTextFieldProposition,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonDeviner)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelEtat, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelLogo)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Méthode événement appelée lors de la pression du bouton jButtonDeviner.
     *
     * @param evt l'événement clic suite à la pression du bouton jButtonDeviner
     */
    private void jButtonDevinerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonDevinerActionPerformed
        refCtrl.actionDeviner();
    }// GEN-LAST:event_jButtonDevinerActionPerformed

    /**
     * Méthode événement appelée lors de la pression du bouton jButtonNouveauJeu.
     *
     * @param evt l'événement clic suite à la pression du bouton jButtonNouveauJeu
     */
    private void jButtonNouveauJeuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonNouveauJeuActionPerformed
        refCtrl.actionDemarrerNouveauJeu();
    }// GEN-LAST:event_jButtonNouveauJeuActionPerformed

}
