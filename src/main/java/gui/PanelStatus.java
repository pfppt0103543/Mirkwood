package gui;

import java.util.Random;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.Direction;
import com.googlecode.lanterna.gui2.GridLayout;
import com.googlecode.lanterna.gui2.Label;
import com.googlecode.lanterna.gui2.LinearLayout;
import com.googlecode.lanterna.gui2.Panel;

public class PanelStatus extends Panel {

    private Panel pStatus;
    private Label lblHP,
            lblStamina,
            lblPower,
            lblCoins,
            lblKey;

    public PanelStatus() {
        super(new GridLayout(2));

        addComponent(new Label("HP"));
        addComponent(createLabel(lblHP, "HP"));

        addComponent(new Label("Stamina"));
        addComponent(createLabel(lblStamina, "Stamina"));

        addComponent(new Label("Power"));
        addComponent(createLabel(lblPower, "Power"));
        
        addComponent(new Label("Coins"));
        addComponent(createLabel(lblCoins, "Coins"));
        addComponent(new Label("Keys"));
        addComponent(createKeys(lblKey, "Keys"));
    }

    private Label createLabel(Label lblValue, String lbl) {
        lblValue = new Label(String.valueOf((new Random().nextInt(100))));
        lblValue.setBackgroundColor(TextColor.ANSI.BLACK);
        lblValue.setForegroundColor(TextColor.ANSI.YELLOW);
        return lblValue;
    }
        private Label createKeys(Label lblValue, String lbl) {
        lblValue = new Label(String.valueOf(0));
        lblValue.setBackgroundColor(TextColor.ANSI.BLACK);
        lblValue.setForegroundColor(TextColor.ANSI.YELLOW);
        return lblValue;
    }

    public Panel getpStatus() {
        return pStatus;
    }

    public void setpStatus(Panel pStatus) {
        this.pStatus = pStatus;
    }

    public Label getLblHP() {
        return lblHP;
    }

    public void setLblHP(Label lblHP) {
        this.lblHP = lblHP;
    }

    public Label getLblStamina() {
        return lblStamina;
    }

    public void setLblStamina(Label lblStamina) {
        this.lblStamina = lblStamina;
    }

    public Label getLblPower() {
        return lblPower;
    }

    public void setLblPower(Label lblPower) {
        this.lblPower = lblPower;
    }

    public Label getLblCoins() {
        return lblCoins;
    }

    public void setLblCoins(Label lblCoins) {
        this.lblCoins = lblCoins;
    }

    public Label getLblKey() {
        return lblKey;
    }

    public void setLblKey(Label lblKey) {
        this.lblKey = lblKey;
    }

}
