package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class FacultyPane {
	private GridPane facultyPane;

	private Button insertPaneBtn;
	private Button searchPaneBtn;
	private Button removePaneBtn;
	private Button updatePaneBtn;

	public FacultyPane() {
		facultyPane = new GridPane();
		facultyPane.setHgap(10);
		facultyPane.setVgap(50);

		insertPaneBtn = new Button();
		insertPaneBtn.setText("Insert");

		searchPaneBtn = new Button();
		searchPaneBtn.setText("Search");

		removePaneBtn = new Button();
		removePaneBtn.setText("Remove");

		updatePaneBtn = new Button();
		updatePaneBtn.setText("Update");

		facultyPane.add(insertPaneBtn, 0, 0);
		facultyPane.add(searchPaneBtn, 0, 1);
		facultyPane.add(removePaneBtn, 0, 2);
		facultyPane.add(updatePaneBtn, 0, 3);

		insertPaneBtn.setOnAction(e -> {
			FacultyPaneInsert facultyPaneInsert = new FacultyPaneInsert();
		});
	}
}

class FacultyPaneInsert {
	private GridPane facultyPaneInsert;

	private TextField firstNameTextField;
	private TextField middleInitialTextField;
	private TextField lastNameTextField;
	private TextField streetNumberTextField;
	private TextField streetNameTextField;
	private TextField cityTextField;
	private TextField stateTextField;
	private TextField zipTextField;
	private TextField titleTextField;
	private TextField salaryTextField;
}

class FacultyPaneSearch {
	private GridPane facultyPaneSearch;

	private TextField searchByIdTextField;
	private Button searchBtn;
	private Button backFacultyBtn;
	private Label searchResultsLbl;

}

class FacultyPaneRemove {
	private GridPane facultyPaneRemove;

	private TextField removeByIdTextField;
	private Button removeBtn;
	private Button backFacultyBtn;
	private Label removeResultsLbl;
}

class FacultyPaneUpdate {

}


