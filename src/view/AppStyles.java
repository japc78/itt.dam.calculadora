package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

/**
 * AppInterfaceFont
 */
public class AppStyles {
	private Font font, fontButtom, fontScreen, fontHistory;
	private Color color1, colorTxt;
	private Border border1, borderPadding, empyBorder;
	private Image imgBtnRobot;


	public AppStyles() {
		// Archivos externos
		try {
			font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("../resources/Quantico-Italic.ttf"));
			imgBtnRobot = new ImageIcon("src/resources/avatar.png").getImage();
		} catch (FontFormatException | IOException e)  {
			e.printStackTrace();
		}

		// Fuente
		fontButtom = font.deriveFont(Font.PLAIN, 24);
		fontScreen = font.deriveFont(Font.PLAIN, 42);
		fontHistory = font.deriveFont(Font.PLAIN, 16);

		// Colores
		colorTxt = new Color(0, 0, 0);
		color1 = new Color(75, 215, 200);

		// Borders
		border1 = BorderFactory.createLineBorder(Color.BLACK, 3);
		borderPadding = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		empyBorder = BorderFactory.createEmptyBorder(2, 2, 2, 2);
	}

	// Getters

	/**
	 * @return the fontButtom
	 */
	public Font getFontButtom() {
		return fontButtom;
	}

	/**
	 * @return the fontScreen
	 */
	public Font getFontScreen() {
		return fontScreen;
	}

	/**
	 * @return the fontHistory
	 */
	public Font getFontHistory() {
		return fontHistory;
	}

	/**
	 * @return the color1
	 */
	public Color getColor1() {
		return color1;
	}

	/**
	 * @return the colorTxt
	 */
	public Color getColorTxt() {
		return colorTxt;
	}

	/**
	 * @return the border1
	 */
	public Border getBorder1() {
		return border1;
	}

	/**
	 * @return the borderPadding
	 */
	public Border getBorderPadding() {
		return borderPadding;
	}

	/**
	 * @return the empyBorder
	 */
	public Border getEmpyBorder() {
		return empyBorder;
	}

	/**
	 * @return the imgBtnRobot
	 */
	public Image getImgBtnRobot() {
		return imgBtnRobot;
	}

}