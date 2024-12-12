package com.sample;

import javax.swing.*;

public class Presenter {
	static
	{
		jFrame = new JFrame("CLASSIC_CARS");
	}
	
	private static JFrame jFrame;
	
	public static String ask(String question, String[] options) {
        JFrame frame = new JFrame("Choose your best classic car!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel label = new JLabel(question);
        JComboBox<String> comboBox = new JComboBox<>(options);

        panel.add(label);
        panel.add(comboBox);

        JOptionPane.showMessageDialog(frame, panel);

        return (String) comboBox.getSelectedItem();
    }
	
	public static void answer(String answer) {
		jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

		JOptionPane.showMessageDialog(jFrame, "The best car/cars for you:\n" + answer);
		jFrame.setVisible(false);
		jFrame.dispose();
	}
	
}
