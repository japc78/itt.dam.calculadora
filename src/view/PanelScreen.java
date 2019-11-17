package view;

import java.awt.*;
import javax.swing.*;

/**
 * AppInterfaceTop
 */
public class PanelScreen extends JPanel {
	private GridBagConstraints grid;
	private JLabel history, screen;
	private double numberTmp;
	private String result;
	private char operation;
	private boolean newOperation, newNumber, login;

	/**
	 *
	 */
	private static final long serialVersionUID = 374177693461494474L;

	public PanelScreen() {
		result = "0";
		numberTmp = 0;
		operation = '0';
		newOperation = false;
		newNumber = true;
		login = false;
		// Se define un grid para el panel.
		setLayout(new GridBagLayout());
		grid = new GridBagConstraints();
		grid.weightx = 1;
		grid.weighty = 1;
		grid.fill = GridBagConstraints.BOTH;
		initComponents();
		setVisible(true);
	}

	public void initComponents() {
		AppStyles styles = new AppStyles();
		// Label donde se ven los resultados.
			history = new JLabel(" ");
			history.setFont(styles.getFontHistory());
			history.setHorizontalAlignment(JTextField.RIGHT);
			history.setBorder(BorderFactory.createCompoundBorder(history.getBorder(), styles.getEmpyBorder()));

			// Posición en el grid, eje x y.
			grid.gridx = 0;
			grid.gridy = 0;

			// Tamaño, cuantas celdas ocupara en el grid.
			grid.gridwidth = 4;
			grid.gridheight = 1;

			add(history, grid);

		// Label para la pantalla
			screen = new JLabel(result);
			screen.setFont(styles.getFontScreen());
			screen.setHorizontalAlignment(JTextField.RIGHT);
			screen.setBorder(BorderFactory.createCompoundBorder(screen.getBorder(), styles.getEmpyBorder()));

			// Posición en el grid, eje x y.
			grid.gridx = 0;
			grid.gridy = 1;

			// Para este elemento se le indica que su altura sera el doble.
			grid.weighty = 2;

			// Tamaño cuantas celdas ocupara en el grid.
			grid.gridwidth = 4;
			grid.gridheight = 2;
			add(screen, grid);
	}

	// Getteres
			/**
			 * @return the history
			 */
			public JLabel getHistory() {
				return history;
			}

			/**
			 * @param history the history to set
			 */
			public void setHistory(JLabel history) {
				this.history = history;
			}

			/**
			 * @return the screen
			 */
			public JLabel getScreen() {
				return screen;
			}

			/**
			 * @param screen the screen to set
			 */
			public void setScreen(JLabel screen) {
				this.screen = screen;
			}

			/**
			 * @return the numberTmp
			 */
			public double getNumberTmp() {
				return numberTmp;
			}

			/**
			 * @param numberTmp the numberTmp to set
			 */
			public void setNumberTmp(double numberTmp) {
				this.numberTmp = numberTmp;
			}

			/**
			 * @return the result
			 */
			public String getResult() {
				return result;
			}

			/**
			 * @param result the result to set
			 */
			public void setResult(String result) {
				this.result = result;
			}

			/**
			 * @return the operation
			 */
			public char getOperation() {
				return operation;
			}

			/**
			 * @param operation the operation to set
			 */
			public void setOperation(char operation) {
				this.operation = operation;
			}

			/**
			 * @return the newOperation
			 */
			public boolean isNewOperation() {
				return newOperation;
			}

			/**
			 * @param newOperation the newOperation to set
			 */
			public void setNewOperation(boolean newOperation) {
				this.newOperation = newOperation;
			}

			/**
			 * @return the newOperation
			 */
			public boolean isNewNumber() {
				return newNumber;
			}

			/**
			 * @param newOperation the newOperation to set
			 */
			public void setNewNumber(boolean newNumber) {
				this.newNumber = newNumber;
			}

			/**
			 * @return the login
			 */
			public boolean isLogin() {
				return login;
			}

			/**
			 * @param login the login to set
			 */
			public void setLogin(boolean login) {
				this.login = login;
			}
}