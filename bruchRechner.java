import sas.Tools;
import sas.View;
import sasio.Label;
import sasio.Textfield;
import sasio.Button;

import java.awt.*;

public class bruchRechner {

    View view;
    Textfield txtfldZ1,txtfldZ2,txtfldN1,txtfldN2;
    Button btnPlus,btnMinus,btnMal,btnGeteilt;
    Label lblErgebnis1,lblErgebnis2,lblGleich;

    public bruchRechner() {


        view = new View(250, 170, "Rechner");
        txtfldZ1 = new Textfield(10, 60, 40, 30, "", view);
        txtfldZ2 = new Textfield(90, 60, 40, 30, "", view);
        txtfldN1 = new Textfield(10, 90, 40, 30, "", view);
        txtfldN2 = new Textfield(90, 90, 40, 30, "", view);
        btnPlus = new Button(60, 20, 20, 20, "+", Color.YELLOW);
        btnMinus = new Button(60, 50, 20, 20, "-", Color.YELLOW);
        btnMal = new Button(60, 80, 20, 20, "*", Color.YELLOW);
        btnGeteilt = new Button(60, 110, 20, 20, "/", Color.YELLOW);
        lblGleich = new Label(140, 60, 20, 30, "=", Color.WHITE, true, false);
        lblErgebnis1 = new Label(160, 60, 80, 30, "", Color.LIGHT_GRAY, false, false);
        lblErgebnis2 = new Label(160, 90, 80, 30, "", Color.LIGHT_GRAY, false, false);
    }

    public void txtfldZ1Aktion() {
        txtfldZ1.setActivated(true);
        txtfldZ2.setActivated(false);
        txtfldN1.setActivated(false);
        txtfldN2.setActivated(false);
    }

    public void txtfldZ2Aktion() {
        txtfldZ2.setActivated(true);
        txtfldZ1.setActivated(false);
        txtfldN1.setActivated(false);
        txtfldN2.setActivated(false);
    }
    public void txtfldN1Aktion() {
        txtfldN1.setActivated(true);
        txtfldN2.setActivated(false);
        txtfldZ1.setActivated(false);
        txtfldZ2.setActivated(false);
    }

    public void txtfldN2Aktion() {
        txtfldN2.setActivated(true);
        txtfldN1.setActivated(false);
        txtfldZ1.setActivated(false);
        txtfldZ2.setActivated(false);
    }

    public void btnPlusAktion() {
        int zahl1 = Tools.stringToInt(txtfldBruch1.getText());
        int zahl2 = Tools.stringToInt(txtfldBruch2.getText());
        int ergebnis = zahl1 + zahl2;
        lblErgebnis1.setLabelText(""+ergebnis);
    }

    public void btnMinusAktion() {
        int zahl1 = Tools.stringToInt(txtfldBruch1.getText());
        int zahl2 = Tools.stringToInt(txtfldBruch2.getText());
        int ergebnis = zahl1 - zahl2;
        lblErgebnis1.setLabelText(""+ergebnis);
    }

    public void btnMalAktion() {
        int zahl1 = Tools.stringToInt(txtfldBruch1.getText());
        int zahl2 = Tools.stringToInt(txtfldBruch2.getText());
        int zahl3 = Tools.stringToInt(txtfldBruch3.getText());
        int ergebnis = zahl1 * zahl2;
        lblErgebnis1.setLabelText(""+ergebnis);
    }

    public void btnGeteiltAktion() {
        int zahl1 = Tools.stringToInt(txtfldBruch1.getText());
        int zahl2 = Tools.stringToInt(txtfldBruch2.getText());
        int ergebnis = zahl1 / zahl2;
        lblErgebnis1.setLabelText(""+ergebnis);
    }

    public void fuehreAus() {
        while(true) {
            if  (txtfldZ1.clicked()) {
                txtfldZ1Aktion();
            }
            if (txtfldZ2.clicked()) {
                txtfldZ2Aktion();
            }
            if  (txtfldN1.clicked()) {
                txtfldN1Aktion();
            }
            if (txtfldN2.clicked()) {
                txtfldN2Aktion();
            }
            if (btnPlus.clicked()) {
                btnPlusAktion();
            }
            if (btnMinus.clicked()) {
                btnMinusAktion();
            }
            if (btnMal.clicked()) {
                btnMalAktion();
            }
            if (btnGeteilt.clicked()) {
                btnGeteiltAktion();
            }
        }
    }

}
