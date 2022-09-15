package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class ViewController implements Initializable {
			
	@FXML
	private MenuItem menuItemVendedor;
	
	@FXML
	private MenuItem menuItemDepartament;
	
	@FXML
	private MenuItem menuItemAbout;
	
	
	@FXML
	public void onMenuVedendorAcao() {
		System.out.println("menuv");
	}
	@FXML
	public void onMenuDepartamento() {
		System.out.println("menuv");
	}
	@FXML
	public void onMenuAbout() {
		System.out.println("menuv");
	}
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}
	

}
