package view;

import javax.swing.JOptionPane;

import controller.controllerString;

public class Main {

	public static void main(String[] args) {
		controllerString inverter = new controllerString();
		String string = JOptionPane.showInputDialog(null, "Put your string here: ");
		
		String backwards = inverter.stringInverter(string, string.length());
		System.out.println(backwards);
	}

}
