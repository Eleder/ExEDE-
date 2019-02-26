package interfaz;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.neodatis.odb.ODB;

public class Eiqueta {
	private JPanel contentPane;
	private JLabel lblResultado;
	private JButton btnDepar;
	private JButton btnEmple;
	private JButton btnEstadDepar;
	private JButton btnEstadEmple;
	private ODB odb;

	public Eiqueta(JButton btnDepar, JButton btnEmple, JButton btnEstadDepar, JButton btnEstadEmple, ODB odb) {
		this.btnDepar = btnDepar;
		this.btnEmple = btnEmple;
		this.btnEstadDepar = btnEstadDepar;
		this.btnEstadEmple = btnEstadEmple;
		this.odb = odb;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JLabel getLblResultado() {
		return lblResultado;
	}

	public void setLblResultado(JLabel lblResultado) {
		this.lblResultado = lblResultado;
	}

	public JButton getBtnDepar() {
		return btnDepar;
	}

	public void setBtnDepar(JButton btnDepar) {
		this.btnDepar = btnDepar;
	}

	public JButton getBtnEmple() {
		return btnEmple;
	}

	public void setBtnEmple(JButton btnEmple) {
		this.btnEmple = btnEmple;
	}

	public JButton getBtnEstadDepar() {
		return btnEstadDepar;
	}

	public void setBtnEstadDepar(JButton btnEstadDepar) {
		this.btnEstadDepar = btnEstadDepar;
	}

	public JButton getBtnEstadEmple() {
		return btnEstadEmple;
	}

	public void setBtnEstadEmple(JButton btnEstadEmple) {
		this.btnEstadEmple = btnEstadEmple;
	}

	public ODB getOdb() {
		return odb;
	}

	public void setOdb(ODB odb) {
		this.odb = odb;
	}
}