module workshopJavafxJdbc {
	requires javafx.controls;

	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
 
	//no meu caso eu não tinha adicionado essa linha
        opens gui to javafx.graphics, javafx.fxml;
	
}
