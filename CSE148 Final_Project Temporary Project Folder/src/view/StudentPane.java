package view;
//class StudentPane
//class StudentPaneInsert
//class StudentPaneSearch
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class StudentPane {
	private GridPane studentPane;

	private Button insertBtn;
	private Button searchBtn;
	private Button removeBtn;
	private Button updateBtn;

	private Insets inset = new Insets(50);

	public StudentPane() {
		studentPane = new GridPane();
		studentPane.setGridLinesVisible(false);
		studentPane.setHgap(50);
		studentPane.setVgap(10);
		//studentPane.setPadding(inset);

		insertBtn = new Button();
		insertBtn.setText("Insert");
		insertBtn.setPrefWidth(200);

		searchBtn = new Button();
		searchBtn.setText("Search");
		searchBtn.setPrefWidth(200);

		removeBtn = new Button();
		removeBtn.setText("Remove");
		removeBtn.setPrefWidth(200);

		updateBtn = new Button();
		updateBtn.setText("Update");
		updateBtn.setPrefWidth(200);

		studentPane.add(insertBtn, 2, 2);
		studentPane.add(searchBtn, 2, 3);
		studentPane.add(removeBtn, 2, 4);
		studentPane.add(updateBtn, 2, 5);

		insertBtn.setOnAction(e -> {
			StudentPaneInsert insertPane = new StudentPaneInsert();
			Pane setInsertPane = insertPane.getStudentPaneInsert();
			studentPane.add(setInsertPane, 0, 0);
			studentPane.getChildren().remove(insertBtn);
			studentPane.getChildren().remove(searchBtn);
			studentPane.getChildren().remove(removeBtn);
			studentPane.getChildren().remove(updateBtn);
		});
		searchBtn.setOnAction(e -> {
			StudentPaneSearch searchPane = new StudentPaneSearch();
			Pane setSearchPane = searchPane.getStudentPaneSearch();
			studentPane.add(setSearchPane, 0, 0);
			studentPane.getChildren().remove(insertBtn);
			studentPane.getChildren().remove(searchBtn);
			studentPane.getChildren().remove(removeBtn);
			studentPane.getChildren().remove(updateBtn);
		});

		removeBtn.setOnAction(e -> {
			StudentPaneRemove removePane = new StudentPaneRemove();
			Pane setRemovePan = removePane.getStudentPaneRemove();
			studentPane.add(setRemovePan, 0, 0);
			studentPane.getChildren().remove(insertBtn);
			studentPane.getChildren().remove(searchBtn);
			studentPane.getChildren().remove(removeBtn);
			studentPane.getChildren().remove(updateBtn);
		});

//		updateBtn.setOnAction(e-> {
//			StudentPaneUpdate updatePane = new StudentPaneUpdate();
//			Pane setUpdatePane = updatePane.getStudentPaneUpdate();
//			studentPane.add(setUpdatePane, 0, 0);
//			studentPane.getChildren().remove(insertBtn);
//			studentPane.getChildren().remove(searchBtn);
//			studentPane.getChildren().remove(removeBtn);
//			studentPane.getChildren().remove(updateBtn);
//		});
	}

	public GridPane getStudentPane() {
		return studentPane;
	}

	public void setStudentPane(GridPane studentPane) {
		this.studentPane = studentPane;
	}

	public Button getInsertBtn() {
		return insertBtn;
	}

	public void setInsertBtn(Button insertBtn) {
		this.insertBtn = insertBtn;
	}

	public Button getSearchBtn() {
		return searchBtn;
	}

	public void setSearchBtn(Button searchBtn) {
		this.searchBtn = searchBtn;
	}

	public Button getRemoveBtn() {
		return removeBtn;
	}

	public void setRemoveBtn(Button removeBtn) {
		this.removeBtn = removeBtn;
	}

	public Button getUpdateBtn() {
		return updateBtn;
	}

	public void setUpdateBtn(Button updateBtn) {
		this.updateBtn = updateBtn;
	}

}

class StudentPaneInsert {
	private GridPane studentPaneInsert;

	private TextField firstNameTextField;
	private TextField lastNameTextField;
	private TextField streetNumberTextField;
	private TextField streetNameTextField;
	private TextField cityTextField;
	private TextField stateTextField;
	private TextField zipTextField;
	private TextField idTextField;
	private TextField gpaTextField;

	private Button confirmInsertBtn;
	private Button backStudentBtn;

	public StudentPaneInsert() {
		//padding, gaps, and gridlines
		studentPaneInsert = new GridPane();

		studentPaneInsert.setGridLinesVisible(true);
		studentPaneInsert.setHgap(5); //gap between horizontal
		studentPaneInsert.setVgap(10); //gap between vertical
		//studentPaneInsert.setPadding(new Insets(50));

		//TextFields
		firstNameTextField = new TextField();
		firstNameTextField.setPromptText("First Name");
		firstNameTextField.setPrefWidth(150);

		lastNameTextField = new TextField();
		lastNameTextField.setPromptText("Last Name");
//		lastNameTextField.setPrefWidth(250);

		streetNumberTextField = new TextField();
		streetNumberTextField.setPromptText("Street Number");
//		streetNumberTextField.setPrefWidth(75);

		streetNameTextField = new TextField();
		streetNameTextField.setPromptText("Street Name");
//		streetNameTextField.setPrefWidth(number);

		cityTextField = new TextField();
		cityTextField.setPromptText("City");
//		cityTextField.setPrefWidth(number);

		stateTextField = new TextField();
		stateTextField.setPromptText("State");
//		stateTextField.setPrefWidth(number);

		zipTextField = new TextField();
		zipTextField.setPromptText("Zipcode");
//		zipTextField.setPrefHeight(number);

		idTextField = new TextField();
		idTextField.setPromptText("Identification Number");
//		idTextField.setPrefWidth(number);

		gpaTextField = new TextField();
		gpaTextField.setPromptText("Grade Point Average");
//		gpaTextField.setPrefWidth(number);

		confirmInsertBtn = new Button();
		confirmInsertBtn.setText("Insert");
		confirmInsertBtn.setPrefWidth(100);

		backStudentBtn = new Button();
		backStudentBtn.setText("Back");
		backStudentBtn.setPrefWidth(100);

		studentPaneInsert.add(firstNameTextField, 1, 1, 3, 1);
		studentPaneInsert.add(lastNameTextField, 1, 2, 3, 1);
		studentPaneInsert.add(streetNumberTextField, 1, 3);
		studentPaneInsert.add(streetNameTextField, 2, 3);
		studentPaneInsert.add(cityTextField, 1, 4);
		studentPaneInsert.add(stateTextField, 2, 4);
		studentPaneInsert.add(zipTextField, 3, 4);
		studentPaneInsert.add(idTextField, 2, 5, 2, 1);
		studentPaneInsert.add(gpaTextField, 1, 5);
		studentPaneInsert.add(confirmInsertBtn, 1, 6);
		studentPaneInsert.add(backStudentBtn, 3, 6);

		backStudentBtn.setOnAction(e -> {
			StudentPane studentPane = new StudentPane();
			Pane setStudentPane = studentPane.getStudentPane();
			studentPaneInsert.getChildren().remove(firstNameTextField);
			studentPaneInsert.getChildren().remove(lastNameTextField);
			studentPaneInsert.getChildren().remove(streetNumberTextField);
			studentPaneInsert.getChildren().remove(streetNameTextField);
			studentPaneInsert.getChildren().remove(cityTextField);
			studentPaneInsert.getChildren().remove(stateTextField);
			studentPaneInsert.getChildren().remove(zipTextField);
			studentPaneInsert.getChildren().remove(idTextField);
			studentPaneInsert.getChildren().remove(gpaTextField);
			studentPaneInsert.getChildren().remove(confirmInsertBtn);
			studentPaneInsert.getChildren().remove(backStudentBtn);
			studentPaneInsert.getChildren().remove(studentPaneInsert);

			studentPaneInsert.add(setStudentPane, 0, 0);
		});
	}

	public GridPane getStudentPaneInsert() {
		return studentPaneInsert;
	}

	public void setStudentPaneInsert(GridPane studentPaneInsert) {
		this.studentPaneInsert = studentPaneInsert;
	}

	public TextField getFirstNameTextField() {
		return firstNameTextField;
	}

	public void setFirstNameTextField(TextField firstNameTextField) {
		this.firstNameTextField = firstNameTextField;
	}

	public TextField getLastNameTextField() {
		return lastNameTextField;
	}

	public void setLastNameTextField(TextField lastNameTextField) {
		this.lastNameTextField = lastNameTextField;
	}

	public TextField getStreetNumberTextField() {
		return streetNumberTextField;
	}

	public void setStreetNumberTextField(TextField streetNumberTextField) {
		this.streetNumberTextField = streetNumberTextField;
	}

	public TextField getStreetNameTextField() {
		return streetNameTextField;
	}

	public void setStreetNameTextField(TextField streetNameTextField) {
		this.streetNameTextField = streetNameTextField;
	}

	public TextField getCityTextField() {
		return cityTextField;
	}

	public void setCityTextField(TextField cityTextField) {
		this.cityTextField = cityTextField;
	}

	public TextField getStateTextField() {
		return stateTextField;
	}

	public void setStateTextField(TextField stateTextField) {
		this.stateTextField = stateTextField;
	}

	public TextField getZipTextField() {
		return zipTextField;
	}

	public void setZipTextField(TextField zipTextField) {
		this.zipTextField = zipTextField;
	}

	public TextField getIdTextField() {
		return idTextField;
	}

	public void setIdTextField(TextField idTextField) {
		this.idTextField = idTextField;
	}

	public TextField getGpaTextField() {
		return gpaTextField;
	}

	public void setGpaTextField(TextField gpaTextField) {
		this.gpaTextField = gpaTextField;
	}

}

class StudentPaneSearch {
	private GridPane studentPaneSearch;

	private TextField studentSearchByIdTextField;
	private Button studentSearchBtn;
	private Button backStudentBtn;
	private Label studentSearchResultsLbl;

	public StudentPaneSearch(){
		studentPaneSearch = new GridPane();

		studentPaneSearch.setGridLinesVisible(true);
		studentPaneSearch.setHgap(5); //gap between horizontal
		studentPaneSearch.setVgap(10); //gap between vertical
		//studentPaneSearch.setPadding(new Insets(50));

		TextField studentSearchByIdTextField = new TextField();
		studentSearchByIdTextField.setPromptText("Enter ID Number");
		studentSearchByIdTextField.setPrefWidth(200);

		Button studentSearchBtn = new Button();
		studentSearchBtn.setText("Search");

		Button backStudentBtn = new Button();
		backStudentBtn.setText("Back");

		Label studentSearchResultsLbl = new Label();

		studentPaneSearch.add(studentSearchByIdTextField, 1, 1);
		studentPaneSearch.add(studentSearchBtn, 2, 1);
		studentPaneSearch.add(studentSearchResultsLbl, 1, 2);
		studentPaneSearch.add(backStudentBtn, 3, 1);

		studentSearchBtn.setOnAction(e ->{
			studentSearchResultsLbl.setText(studentSearchByIdTextField.getText() + " was entered.");
			studentSearchByIdTextField.clear();
			// the add search functionality
		});

		backStudentBtn.setOnAction(e -> {
			StudentPane studentPane = new StudentPane();
			Pane setStudentPane = studentPane.getStudentPane();
			studentPaneSearch.getChildren().remove(studentSearchByIdTextField);
			studentPaneSearch.getChildren().remove(studentSearchBtn);
			studentPaneSearch.getChildren().remove(studentSearchResultsLbl);
			studentPaneSearch.getChildren().remove(backStudentBtn);

			studentPaneSearch.add(setStudentPane, 0, 0);
		});
	}

	public GridPane getStudentPaneSearch() {
		return studentPaneSearch;
	}

	public void setStudentPaneSearch(GridPane studentPaneSearch) {
		this.studentPaneSearch = studentPaneSearch;
	}

	public TextField getStudentSearchByIdTextField() {
		return studentSearchByIdTextField;
	}

	public void setStudentSearchByIdTextField(TextField studentSearchByIdTextField) {
		this.studentSearchByIdTextField = studentSearchByIdTextField;
	}

	public Button getStudentSearchBtn() {
		return studentSearchBtn;
	}

	public void setStudentSearchBtn(Button studentSearchBtn) {
		this.studentSearchBtn = studentSearchBtn;
	}

	public Label getStudentSearchResultsLbl() {
		return studentSearchResultsLbl;
	}

	public void setStudentSearchResultsLbl(Label studentSearchResultsLbl) {
		this.studentSearchResultsLbl = studentSearchResultsLbl;
	}

}

class StudentPaneRemove {
	private GridPane studentPaneRemove;
	private TextField studentRemoveByIdTextField;
	private Button studentRemoveButton;
	private Label studentRemoveResultsLbl;

	public StudentPaneRemove() {
		studentPaneRemove = new GridPane();
		studentPaneRemove.setGridLinesVisible(true);
		studentPaneRemove.setHgap(5); //gap between horizontal
		studentPaneRemove.setVgap(10); //gap between vertical
		studentPaneRemove.setPadding(new Insets(50));

		studentRemoveByIdTextField = new TextField();
		studentRemoveByIdTextField.setPromptText("Enter ID Number");

		studentRemoveButton = new Button();
		studentRemoveButton.setText("Remove");

		studentRemoveResultsLbl = new Label();

		studentPaneRemove.add(studentRemoveByIdTextField, 0, 0);
		studentPaneRemove.add(studentRemoveButton, 1, 0);
		studentPaneRemove.add(studentRemoveResultsLbl, 0, 1);

		studentRemoveButton.setOnAction(e -> {
			studentRemoveResultsLbl.setText(studentRemoveByIdTextField.getText() + " was removed.");
			studentRemoveByIdTextField.clear();
			// then add removing student functionality
		});
	}

	public GridPane getStudentPaneRemove() {
		return studentPaneRemove;
	}

	public void setStudentPaneSearch(GridPane studentPaneRemove) {
		this.studentPaneRemove = studentPaneRemove;
	}

	public TextField getStudentRemoveByIdTextField() {
		return studentRemoveByIdTextField;
	}

	public void setStudentRemoveByIdTextField(TextField studentRemoveByIdTextField) {
		this.studentRemoveByIdTextField = studentRemoveByIdTextField;
	}

	public Button getStudentRemoveButton() {
		return studentRemoveButton;
	}

	public void setStudentRemoveButton(Button studentRemoveButton) {
		this.studentRemoveButton = studentRemoveButton;
	}

	public Label getStudentRemoveResultsLbl() {
		return studentRemoveResultsLbl;
	}

	public void setStudentRemoveResultsLbl(Label studentRemoveResultsLbl) {
		this.studentRemoveResultsLbl = studentRemoveResultsLbl;
	}


}

class StudentPaneUpdate {

}