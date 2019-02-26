package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import logica.Departamento;
import logica.Empleado;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

import interfaz.OperacionesEmple.ConsultarEmple;
import interfaz.OperacionesEmple.InsertarEmple;
import interfaz.OperacionesEmple.ModificarEmple;

@SuppressWarnings("serial")
public class OperacionesEmple extends JDialog {
	public static class BorrarEmple {
		private ConsultarEmple data;

		public BorrarEmple(ConsultarEmple data) {
			this.data = data;
		}

		public ConsultarEmple getData() {
			return data;
		}

		public void setData(ConsultarEmple data) {
			this.data = data;
		}
	}

	public static class ConsultarEmple {
		private InsertarEmple data;

		public ConsultarEmple(InsertarEmple data) {
			this.data = data;
		}

		public InsertarEmple getData() {
			return data;
		}

		public void setData(InsertarEmple data) {
			this.data = data;
		}
	}

	public static class InsertarEmple {
		private ModificarEmple data;

		public InsertarEmple(ModificarEmple data) {
			this.data = data;
		}

		public ModificarEmple getData() {
			return data;
		}

		public void setData(ModificarEmple data) {
			this.data = data;
		}
	}

	public static class ModificarEmple {
		private JPanel contentPane;
		private JTextField txNumEmple;
		private JTextField txNombre;
		private JTextField txPoblacion;
		private JTextField txOficio;
		private JTextField txSalario;
		private JTextField txNumDepart;
		private JLabel lblResultado;

		public ModificarEmple() {
		}

		public JPanel getContentPane() {
			return contentPane;
		}

		public void setContentPane(JPanel contentPane) {
			this.contentPane = contentPane;
		}

		public JTextField getTxNumEmple() {
			return txNumEmple;
		}

		public void setTxNumEmple(JTextField txNumEmple) {
			this.txNumEmple = txNumEmple;
		}

		public JTextField getTxNombre() {
			return txNombre;
		}

		public void setTxNombre(JTextField txNombre) {
			this.txNombre = txNombre;
		}

		public JTextField getTxPoblacion() {
			return txPoblacion;
		}

		public void setTxPoblacion(JTextField txPoblacion) {
			this.txPoblacion = txPoblacion;
		}

		public JTextField getTxOficio() {
			return txOficio;
		}

		public void setTxOficio(JTextField txOficio) {
			this.txOficio = txOficio;
		}

		public JTextField getTxSalario() {
			return txSalario;
		}

		public void setTxSalario(JTextField txSalario) {
			this.txSalario = txSalario;
		}

		public JTextField getTxNumDepart() {
			return txNumDepart;
		}

		public void setTxNumDepart(JTextField txNumDepart) {
			this.txNumDepart = txNumDepart;
		}

		public JLabel getLblResultado() {
			return lblResultado;
		}

		public void setLblResultado(JLabel lblResultado) {
			this.lblResultado = lblResultado;
		}
	}

	private static final String BBDD="Empleados.dat";
	private BorrarEmple data = new BorrarEmple(new ConsultarEmple(new InsertarEmple(new ModificarEmple())));

	public OperacionesEmple() {
		setTitle("Operaciones con Empleados");
		setModal(true);
		setBounds(100, 100, 470, 361);
		data.getData().getData().getData().setContentPane(new JPanel());
		data.getData().getData().getData().getContentPane().setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(data.getData().getData().getData().getContentPane());
		data.getData().getData().getData().getContentPane().setLayout(null);
		
		JLabel lblEmpleados = new JLabel("Operaciones EMPLEADOS");
		lblEmpleados.setForeground(Color.BLUE);
		lblEmpleados.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmpleados.setBounds(120, 11, 232, 35);
		data.getData().getData().getData().getContentPane().add(lblEmpleados);
		
		JLabel lblNumEmple = new JLabel("Numero empleado");
		lblNumEmple.setBounds(37, 74, 115, 14);
		data.getData().getData().getData().getContentPane().add(lblNumEmple);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(37, 101, 46, 14);
		data.getData().getData().getData().getContentPane().add(lblNombre);
		
		JLabel lblPoblacion = new JLabel("Población");
		lblPoblacion.setBounds(37, 126, 58, 14);
		data.getData().getData().getData().getContentPane().add(lblPoblacion);
		
		JLabel lblOficio = new JLabel("Oficio");
		lblOficio.setBounds(37, 151, 46, 14);
		data.getData().getData().getData().getContentPane().add(lblOficio);
		
		JLabel lblSalario = new JLabel("Salario");
		lblSalario.setBounds(37, 176, 46, 14);
		data.getData().getData().getData().getContentPane().add(lblSalario);
		
		JLabel lblNumDepart = new JLabel("Num Departamento");
		lblNumDepart.setBounds(37, 199, 115, 14);
		data.getData().getData().getData().getContentPane().add(lblNumDepart);
		
		data.getData().getData().getData().setTxNumEmple(new JTextField());
		data.getData().getData().getData().getTxNumEmple().setBounds(164, 71, 98, 20);
		data.getData().getData().getData().getContentPane().add(data.getData().getData().getData().getTxNumEmple());
		data.getData().getData().getData().getTxNumEmple().setColumns(10);
		
		data.getData().getData().getData().setTxNombre(new JTextField());
		data.getData().getData().getData().getTxNombre().setBounds(164, 96, 218, 20);
		data.getData().getData().getData().getContentPane().add(data.getData().getData().getData().getTxNombre());
		data.getData().getData().getData().getTxNombre().setColumns(10);
		
		data.getData().getData().getData().setTxPoblacion(new JTextField());
		data.getData().getData().getData().getTxPoblacion().setBounds(164, 121, 218, 20);
		data.getData().getData().getData().getContentPane().add(data.getData().getData().getData().getTxPoblacion());
		data.getData().getData().getData().getTxPoblacion().setColumns(10);
		
		data.getData().getData().getData().setTxOficio(new JTextField());
		data.getData().getData().getData().getTxOficio().setBounds(164, 146, 218, 20);
		data.getData().getData().getData().getContentPane().add(data.getData().getData().getData().getTxOficio());
		data.getData().getData().getData().getTxOficio().setColumns(10);
		
		data.getData().getData().getData().setTxSalario(new JTextField());
		data.getData().getData().getData().getTxSalario().setBounds(164, 171, 218, 20);
		data.getData().getData().getData().getContentPane().add(data.getData().getData().getData().getTxSalario());
		data.getData().getData().getData().getTxSalario().setColumns(10);
		
		data.getData().getData().getData().setTxNumDepart(new JTextField());
		data.getData().getData().getData().getTxNumDepart().setBounds(164, 196, 218, 20);
		data.getData().getData().getData().getContentPane().add(data.getData().getData().getData().getTxNumDepart());
		data.getData().getData().getData().getTxNumDepart().setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Dialog", Font.BOLD, 10));
		btnConsultar.setBounds(293, 70, 89, 23);
		data.getData().getData().getData().getContentPane().add(btnConsultar);
		
		data.getData().getData().getData().setLblResultado(new JLabel("---------------------------------------------------------------------"));
		data.getData().getData().getData().getLblResultado().setFont(new Font("Dialog", Font.BOLD, 14));
		data.getData().getData().getData().getLblResultado().setForeground(Color.RED);
		data.getData().getData().getData().getLblResultado().setBounds(37, 230, 345, 14);
		data.getData().getData().getData().getContentPane().add(data.getData().getData().getData().getLblResultado());
		
		JButton btnInsertar = new JButton("Insertar Empleado");
		btnInsertar.setFont(new Font("Dialog", Font.BOLD, 10));
		btnInsertar.setBounds(21, 274, 130, 26);
		data.getData().getData().getData().getContentPane().add(btnInsertar);
		
		JButton btnBorrar = new JButton("Borrar Empleado");
		btnBorrar.setFont(new Font("Dialog", Font.BOLD, 10));
		btnBorrar.setBounds(163, 274, 124, 26);
		data.getData().getData().getData().getContentPane().add(btnBorrar);
		
		JButton btnModificar = new JButton("Modifcar Empleado");
		btnModificar.setFont(new Font("Dialog", Font.BOLD, 10));
		btnModificar.setBounds(302, 274, 129, 26);
		data.getData().getData().getData().getContentPane().add(btnModificar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(21, 46, 398, 211);
		data.getData().getData().getData().getContentPane().add(panel);
		
		//Listeners botones
		//Accion boton insertar
		btnInsertar.addActionListener(new ActionListener() {
			// Insertar un registro a la BD
			public void actionPerformed(ActionEvent arg0) {
				int numEmple, numDepar;
				String nombre, oficio, pobla;
				double salario;
				ODB odb=ODBFactory.open(BBDD);
				
				try{
					numEmple=Integer.parseInt(data.getData().getData().getData().getTxNumEmple().getText());
					if(numEmple>0){
						IQuery query=new CriteriaQuery(Empleado.class, Where.equal("emp_no", numEmple));
						if(odb.getObjects(query).isEmpty()){
							if(!data.getData().getData().getData().getTxNombre().getText().isEmpty()){
								if(!data.getData().getData().getData().getTxPoblacion().getText().isEmpty()){
									if(!data.getData().getData().getData().getTxOficio().getText().isEmpty()){
										try{
											salario=Double.parseDouble(data.getData().getData().getData().getTxSalario().getText());
											if(salario>0){
												try{
													numDepar=Integer.parseInt(data.getData().getData().getData().getTxNumDepart().getText());
													query=new CriteriaQuery(Departamento.class, Where.equal("dept_no", numDepar));
													if(!odb.getObjects(query).isEmpty()){
														Departamento dep=(Departamento)odb.getObjects(query).getFirst();
														nombre=data.getData().getData().getData().getTxNombre().getText();
														pobla=data.getData().getData().getData().getTxPoblacion().getText();
														oficio=data.getData().getData().getData().getTxOficio().getText();
														odb.store(new Empleado(numEmple, nombre, pobla, oficio, salario, dep));
														data.getData().getData().getData().getLblResultado().setText("Empleado insertado correctamente");
													}
													else
														data.getData().getData().getData().getLblResultado().setText("Error, el departamento no existe");
												}
												catch(NumberFormatException e){
													data.getData().getData().getData().getLblResultado().setText("Error, numero de departamento erroneo");
												}
											}
											else
												data.getData().getData().getData().getLblResultado().setText("Error, el salario debe ser positivo");
										}
										catch(NumberFormatException e){
											data.getData().getData().getData().getLblResultado().setText("Error, salario erroneo");
										}
									}
									else
										data.getData().getData().getData().getLblResultado().setText("Error, oficio vacio");
								}
								else
									data.getData().getData().getData().getLblResultado().setText("Error, poblacion vacia");
							}
							else
								data.getData().getData().getData().getLblResultado().setText("Error, nombre vacio");
						}
						else
							data.getData().getData().getData().getLblResultado().setText("Error, numero de empleado duplicado");
					}
					else
						data.getData().getData().getData().getLblResultado().setText("Error, numero de empleado no permitido");
				}catch(NumberFormatException e){
				data.getData().getData().getData().getLblResultado().setText("Error, numero de empleado incorrecto");
				}
				finally{
					odb.close();
				}
			}
		});
		
		//Accion boton consultar
		btnConsultar.addActionListener(new ActionListener() {
			// Consultar un registro de la BD
			public void actionPerformed(ActionEvent arg0) {
				int numEmple;
				ODB odb=ODBFactory.open(BBDD);
				
				try{
					numEmple=Integer.parseInt(data.getData().getData().getData().getTxNumEmple().getText());
					IQuery query=new CriteriaQuery(Empleado.class, Where.equal("emp_no", numEmple));
					if(!odb.getObjects(query).isEmpty()){
						Empleado emple=(Empleado)odb.getObjects(query).getFirst();
						data.getData().getData().getData().getTxNombre().setText(emple.getNombre());
						data.getData().getData().getData().getTxPoblacion().setText(emple.getPobla());
						data.getData().getData().getData().getTxOficio().setText(emple.getOficio());
						data.getData().getData().getData().getTxSalario().setText(String.valueOf(emple.getSalario()));
						if(emple.getDept()!=null)
							data.getData().getData().getData().getTxNumDepart().setText(String.valueOf(emple.getDept().getDept_no()));
						else
							data.getData().getData().getData().getTxNumDepart().setText("No tiene deparamento asignado");
						data.getData().getData().getData().getLblResultado().setText("Consulta correcta");
					}
					else
						data.getData().getData().getData().getLblResultado().setText("Error, el empleado no existe");
				}catch(NumberFormatException e){
					data.getData().getData().getData().getLblResultado().setText("Error, numero de empleado incorrecto");
				}
				finally{
					odb.close();
				}
			}
		});
		
		//Accion boton borrar
		btnBorrar.addActionListener(new ActionListener() {
			 // Borrar registro de la BD
			public void actionPerformed(ActionEvent arg0) {
				int numEmple;
				ODB odb=ODBFactory.open(BBDD);
				
				try{
					numEmple=Integer.parseInt(data.getData().getData().getData().getTxNumEmple().getText());
					IQuery query=new CriteriaQuery(Empleado.class, Where.equal("emp_no", numEmple));
					if(!odb.getObjects(query).isEmpty()){
						Empleado emple=(Empleado)odb.getObjects(query).getFirst();
						odb.delete(emple);
						data.getData().getData().getData().getLblResultado().setText("Empleado borrado correctamente");
					}
					else
						data.getData().getData().getData().getLblResultado().setText("Error, el empleado no existe");
				}catch(NumberFormatException e){
					data.getData().getData().getData().getLblResultado().setText("Error, numero de empleado incorrecto");
				}
				finally{
					odb.close();
				}
			}
		});
		
		//Accion boton modificar
		btnModificar.addActionListener(new ActionListener() {
			// Modificar registro de la BD.
			public void actionPerformed(ActionEvent arg0) {
				int numEmple, numDepar;
				double salario;
				ODB odb=ODBFactory.open(BBDD);
				
				try{
					numEmple=Integer.parseInt(data.getData().getData().getData().getTxNumEmple().getText());
					IQuery query=new CriteriaQuery(Empleado.class, Where.equal("emp_no", numEmple));
					if(!odb.getObjects(query).isEmpty()){
						Empleado emple=(Empleado)odb.getObjects(query).getFirst();
						if(!data.getData().getData().getData().getTxNombre().getText().isEmpty()){
							if(!data.getData().getData().getData().getTxPoblacion().getText().isEmpty()){
								if(!data.getData().getData().getData().getTxOficio().getText().isEmpty()){
									try{
										salario=Double.parseDouble(data.getData().getData().getData().getTxSalario().getText());
										if(salario>0){
											try{
												numDepar=Integer.parseInt(data.getData().getData().getData().getTxNumDepart().getText());
												query=new CriteriaQuery(Departamento.class, Where.equal("dept_no", numDepar));
												if(!odb.getObjects(query).isEmpty()){
													Departamento dep=(Departamento)odb.getObjects(query).getFirst();
													emple.setNombre(data.getData().getData().getData().getTxNombre().getText());
													emple.setPobla(data.getData().getData().getData().getTxPoblacion().getText());
													emple.setOficio(data.getData().getData().getData().getTxOficio().getText());
													emple.setSalario(salario);
													emple.setDept(dep);
													odb.store(emple);
													data.getData().getData().getData().getLblResultado().setText("Empleado modificado correctamente");
												}
												else
													data.getData().getData().getData().getLblResultado().setText("Error, el departamento no existe");
											}
											catch(NumberFormatException e){
												data.getData().getData().getData().getLblResultado().setText("Error, numero de departamento erroneo");
											}
										}
										else
											data.getData().getData().getData().getLblResultado().setText("Error, el salario debe ser positivo");
									}
									catch(NumberFormatException e){
										data.getData().getData().getData().getLblResultado().setText("Error, salario erroneo");
									}
								}
								else
									data.getData().getData().getData().getLblResultado().setText("Error, oficio vacio");
							}
							else
								data.getData().getData().getData().getLblResultado().setText("Error, poblacion vacia");
						}
						else
							data.getData().getData().getData().getLblResultado().setText("Error, nombre vacio");
					}
					else
						data.getData().getData().getData().getLblResultado().setText("Error, el empleado no existe");
				}catch(NumberFormatException e){
				data.getData().getData().getData().getLblResultado().setText("Error, numero de empleado incorrecto");
				}
				finally{
					odb.close();
				}
			}
		});
	}
}
