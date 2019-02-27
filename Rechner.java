import sas.*;
import sasio.*;
import java.awt.Color;
public class Rechner {
    View view;
    Textfield txtfldZahl1;
    Textfield txtfldZahl2;
    Button btnPlus;
    Button btnMinus;
    Button btnMal;
    Button btnGeteilt;
    Label lblErgebnis;
    Label lblGleich;

    public Rechner() {
        //Fenster erzeugen
        view = new View(250, 170, "Rechner");
        //Textfeld für den ersten Operanden erzeugen
        txtfldZahl1 = new Textfield(10, 60, 40, 30, "", view);
        //Textfeld für den zweiten Operanden erzeugen
        txtfldZahl2 = new Textfield(90, 60, 40, 30, "", view);
        //Plus-Button erzeugen
        btnPlus = new Button(60, 20, 20, 20, "+", Color.YELLOW);
        //Minus-Button erzeugen
        btnMinus = new Button(60, 50, 20, 20, "-", Color.YELLOW);
        //Mal-Button erzeugen
        btnMal = new Button(60, 80, 20, 20, "*", Color.YELLOW);
        //Geteilt-Button erzeugen
        btnGeteilt = new Button(60, 110, 20, 20, "/", Color.YELLOW);
        //Textausgabe für lblGleichheitszeichen erzeugen
        lblGleich = new Label(140, 60, 20, 30, "=", Color.WHITE, true, false);
        //Textausgabe für das lblErgebnis erzeugen
        lblErgebnis = new Label(160, 60, 80, 30, "", Color.LIGHT_GRAY, false, false);
    }

    public void txtfldZahl1Aktion() {
        txtfldZahl1.setActivated(true);
        txtfldZahl2.setActivated(false);
    }

    public void txtfldZahl2Aktion() {
        txtfldZahl2.setActivated(true);
        txtfldZahl1.setActivated(false);
    }

    public void btnPlusAktion() {
        int zahl1 = Tools.stringToInt(txtfldZahl1.getText());
        int zahl2 = Tools.stringToInt(txtfldZahl2.getText());
        int ergebnis = zahl1 + zahl2;
        lblErgebnis.setLabelText(""+ergebnis);
    }

    public void btnMinusAktion() {
        int zahl1 = Tools.stringToInt(txtfldZahl1.getText());
        int zahl2 = Tools.stringToInt(txtfldZahl2.getText());
        int ergebnis = zahl1 - zahl2;
        lblErgebnis.setLabelText(""+ergebnis);
    }

    public void btnMalAktion() {
        int zahl1 = Tools.stringToInt(txtfldZahl1.getText());
        int zahl2 = Tools.stringToInt(txtfldZahl2.getText());
        int ergebnis = zahl1 * zahl2;
        lblErgebnis.setLabelText(""+ergebnis);
    }

    public void btnGeteiltAktion() {
        int zahl1 = Tools.stringToInt(txtfldZahl1.getText());
        int zahl2 = Tools.stringToInt(txtfldZahl2.getText());
        int ergebnis = zahl1 / zahl2;
        lblErgebnis.setLabelText(""+ergebnis);
    }

    public void fuehreAus() {
        while(true) {
            if  (txtfldZahl1.clicked()) {
                txtfldZahl1Aktion();
            }
            if (txtfldZahl2.clicked()) {
                txtfldZahl2Aktion();
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