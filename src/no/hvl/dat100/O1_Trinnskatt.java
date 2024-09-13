package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1_Trinnskatt {

	public static void main(String[] args) {

		String Inntekt = showInputDialog("Skriv inn din inntekt: ");
		int ekteInntekt = Integer.parseInt(Inntekt);
		
		if (ekteInntekt < 208050) {
			showMessageDialog(null, "Du skal ikke betale trinnskatt");
		} else if (ekteInntekt > 208051 && ekteInntekt < 292850) {
			showMessageDialog(null, "Du skal betale 1,7% i trinnskatt, som er: " + (ekteInntekt / 100) * 1.7 + " kr.");
		} else if (ekteInntekt > 292851 && ekteInntekt < 670000) {
			showMessageDialog(null, "Du skal betale 4,0% i trinnskatt, som er: " + (ekteInntekt / 100) * 4.0 + " kr.");
		} else if (ekteInntekt > 670001 && ekteInntekt < 937900) {
			showMessageDialog(null, "Du skal betale 13,6% i trinnskatt, som er: " + (ekteInntekt / 100) * 13.6 + " kr.");
		} else if (ekteInntekt > 937901 && ekteInntekt < 1350000) {
			showMessageDialog(null, "Du skal betale 16,6% i trinnskatt, som er: " + (ekteInntekt / 100) * 16.6 + " kr.");
		} else if (ekteInntekt > 1350001) {
			showMessageDialog(null, "Du skal betale 17,6% i trinnskatt, som er: " + (ekteInntekt / 100) * 17.6 + " kr.");	
		}
	}

}
