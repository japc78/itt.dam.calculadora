package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import view.*;

/**
 * AppMouseListener
 */
public class AppMouseListener implements MouseListener {
	private AppInterface i;

	public AppMouseListener(AppInterface i) {
		this.i = i;
	}


	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {


	}

	@Override
	public void mouseEntered(MouseEvent e) {
		for (JButton btn : i.getPanelButtons().getBtns()) {
			if (e.getSource().equals(btn)) {
				btn.setContentAreaFilled(true);
			}
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		for (JButton btn : i.getPanelButtons().getBtns()) {
			if (e.getSource().equals(btn)) {
				btn.setContentAreaFilled(false);
			}
		}

	}


}