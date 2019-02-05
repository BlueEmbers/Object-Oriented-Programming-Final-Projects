package college.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class StudentPane {
	private GridPane studentPane;

	private TextField firstNameField;
	private TextField middleInitialField;
	private TextField lastNameField;
	private TextField streetNumberField;
	private TextField streetNameField;
	private TextField cityField;
	private TextField stateField;
	private TextField zipField;
	private TextField idField;
	private TextField gpaField;

	private HBox buttonBox;
	private Button insertBtn;
	private Button searchBtn;
	private Button removeBtn;
	private Button updateBtn;

	private final int TEXTFIELD_WIDTH_SHORT = 50;
	private final int TEXTFIELD_WIDTH_LONG = 200;
	private final int TEXTFIELD_WIDTH_MEDIUM = 150;
	private final int BUTTON_WIDTH = 110;
	private final int HGAP = 10;
	private final int VGAP = 20;
	private final int INSETS_VALUE = 50;

	public StudentPane() {
		studentPane = new GridPane();
		studentPane.setGridLinesVisible(true);
		studentPane.setHgap(HGAP);
		studentPane.setVgap(VGAP);
		studentPane.setPadding(new Insets(INSETS_VALUE));

		firstNameField = new TextField();
		firstNameField.setPromptText("First Name");
		firstNameField.setPrefWidth(TEXTFIELD_WIDTH_MEDIUM);

		middleInitialField = new TextField();
		middleInitialField.setPromptText("Middle Initial");
		middleInitialField.setPrefWidth(TEXTFIELD_WIDTH_SHORT);

		lastNameField = new TextField();
		lastNameField.setPromptText("Last Name");
		lastNameField.setPrefWidth(TEXTFIELD_WIDTH_MEDIUM);

		streetNumberField = new TextField();
		streetNumberField.setPromptText("Street Number");
		streetNumberField.setPrefWidth(TEXTFIELD_WIDTH_SHORT);

		streetNameField = new TextField();
		streetNameField.setPromptText("Street Name");
		streetNameField.setPrefWidth(TEXTFIELD_WIDTH_LONG);

		cityField = new TextField();
		cityField.setPromptText("City");
		cityField.setPrefWidth(TEXTFIELD_WIDTH_MEDIUM);

		stateField = new TextField();
		stateField.setPromptText("State");
		stateField.setPrefWidth(TEXTFIELD_WIDTH_MEDIUM);

		zipField = new TextField();
		zipField.setPromptText("Zip");
		zipField.setPrefWidth(TEXTFIELD_WIDTH_MEDIUM);

		idField = new TextField();
		idField.setPromptText("ID");
		idField.setPrefWidth(TEXTFIELD_WIDTH_MEDIUM);

		gpaField = new TextField();
		gpaField.setPromptText("GPA");
		gpaField.setPrefWidth(TEXTFIELD_WIDTH_MEDIUM);

		int i = 0;
		int j = 0;
		studentPane.add(firstNameField, i, j, 4, 1);
		studentPane.add(middleInitialField, i + 4, j, 3, 1);
		studentPane.add(lastNameField, i + 4 + 3, j, 4, 1);

		j += 2;
		studentPane.add(streetNumberField, i, j, 4, 1);
		studentPane.add(streetNameField, i + 4, j, 7, 1);

		j++;
		studentPane.add(cityField, i, j, 6, 1);
		studentPane.add(stateField, i + 6, j, 3, 1);
		studentPane.add(zipField, i + 6 + 3, j, 2, 1);

		j += 2;
		studentPane.add(idField, i, j, 4, 1);

		studentPane.add(gpaField, 4, j, 4, 1);

		j += 4;
		buttonBox = new HBox(20);
		insertBtn = new Button("INSERT");
		insertBtn.setPrefWidth(BUTTON_WIDTH);
		searchBtn = new Button("SEARCH");
		searchBtn.setPrefWidth(BUTTON_WIDTH);
		removeBtn = new Button("REMOVE");
		removeBtn.setPrefWidth(BUTTON_WIDTH);
		updateBtn = new Button("UPDATE");
		updateBtn.setPrefWidth(BUTTON_WIDTH);

//		buttonBox.getChildren().addAll(insertBtn, searchBtn, removeBtn, updateBtn);
		buttonBox.setAlignment(Pos.CENTER);
		studentPane.add(buttonBox, 0, j, 10, 1);
	}

	public GridPane getStudentPane() {
		return studentPane;
	}

	public void setStudentPane(GridPane studentPane) {
		this.studentPane = studentPane;
	}

	public TextField getFirstNameField() {
		return firstNameField;
	}

	public void setFirstNameField(TextField firstNameField) {
		this.firstNameField = firstNameField;
	}

	public TextField getMiddleInitialField() {
		return middleInitialField;
	}

	public void setMiddleInitialField(TextField middleInitialField) {
		this.middleInitialField = middleInitialField;
	}

	public TextField getLastNameField() {
		return lastNameField;
	}

	public void setLastNameField(TextField lastNameField) {
		this.lastNameField = lastNameField;
	}

	public TextField getStreetNumberField() {
		return streetNumberField;
	}

	public void setStreetNumberField(TextField streetNumberField) {
		this.streetNumberField = streetNumberField;
	}

	public TextField getStreetNameField() {
		return streetNameField;
	}

	public void setStreetNameField(TextField streetNameField) {
		this.streetNameField = streetNameField;
	}

	public TextField getCityField() {
		return cityField;
	}

	public void setCityField(TextField cityField) {
		this.cityField = cityField;
	}

	public TextField getStateField() {
		return stateField;
	}

	public void setStateField(TextField stateField) {
		this.stateField = stateField;
	}

	public TextField getZipField() {
		return zipField;
	}

	public void setZipField(TextField zipField) {
		this.zipField = zipField;
	}

	public TextField getIdField() {
		return idField;
	}

	public void setIdField(TextField idField) {
		this.idField = idField;
	}

	public TextField getGpaField() {
		return gpaField;
	}

	public void setGpaField(TextField gpaField) {
		this.gpaField = gpaField;
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

	public HBox getButtonBox() {
		return buttonBox;
	}

	public void setButtonBox(HBox buttonBox) {
		this.buttonBox = buttonBox;
	}
	
	

}
