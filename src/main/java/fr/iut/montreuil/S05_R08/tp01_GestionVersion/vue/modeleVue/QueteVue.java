package fr.iut.montreuil.S05_R08.tp01_GestionVersion.vue.modeleVue;

import fr.iut.montreuil.S05_R08.tp01_GestionVersion.modele.quetes.Quete;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class QueteVue {

    private Label questTitle;
    private Label or;
    private Label objet;
    private Text text;

    public QueteVue(Label questTitle, Text questDescription, Label recompenseOr, Label recompenseObjet) {
        this.questTitle = questTitle;
        this.or = recompenseOr;
        this.objet = recompenseObjet;
        this.text = questDescription;
    }

    public void displayQuest(Quete quete){
        questTitle.setText(quete.getTitre());
        or.setText("Or: "+quete.getRecompenseOr());
        text.setText(quete.getDescription());
        objet.setText(quete.getRecompenseObjet()+": x"+quete.getQuantiteObjet());
    }
}
