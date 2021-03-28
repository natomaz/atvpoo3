package classes;

import javax.swing.JOptionPane;

public class conversor {
    public double anos;
    
public void conversor(){
    double meses = 0, semanas = 0, dias = 0;   
meses = this.anos*12;
semanas = meses*4.345;
dias = semanas*7;

JOptionPane.showMessageDialog(null, "Anos: "+this.anos+
                                    "\nMeses: "+meses+
                                    "\nSemanas: "+semanas+
                                    "\nDias: "+dias);
}
}
