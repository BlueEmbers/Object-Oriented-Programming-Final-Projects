package college.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class CoursePane {
	private GridPane coursePane;
	private TextField courseNumberField;
	private TextField courseTitleField;
	private TextArea courseDescriptionArea;
	private TextField numberOfCreditsField;
	
	private HBox buttonBox;
	private Button insertBtn;
	private Button searchBtn;
	private Button removeBtn;
	private Button updateBtn;

	private final int TEXTFIELD_WIDTH = 200;
	private final int BUTTON_WIDTH = 200;

	public CoursePane() {
		coursePane = new GridPane();
		coursePane.setGridLinesVisible(true);
		coursePane.setHgap(20);
		coursePane.setVgap(20);
		coursePane.setPadding(new Insets(50));
		courseNumberField = new TextField();
		courseNumberField.setPromptText("Course Number");
		courseNumberField.setPrefWidth(TEXTFIELD_WIDTH);
		courseTitleField = new TextField();
		courseTitleField.setPromptText("Course Title");
		courseTitleField.setPrefWidth(TEXTFIELD_WIDTH);
		courseDescriptionArea = new TextArea();
		courseDescriptionArea.setPromptText("Course Description");
		courseDescriptionArea.setPrefWidth(TEXTFIELD_WIDTH);
		numberOfCreditsField = new TextField();
		numberOfCreditsField.setPromptText("Number Of Credits");
		numberOfCreditsField.setPrefWidth(TEXTFIELD_WIDTH);

		coursePane.add(courseNumberField, 0, 0);
		coursePane.add(courseTitleField, 3, 0);
		coursePane.add(numberOfCreditsField, 6, 0);
		coursePane.add(courseDescriptionArea, 1, 2, 6, 4);
		
		buttonBox = new HBox(20);
		buttonBox.setAlignment(Pos.CENTER);
		insertBtn = new Button("INSERT");
		insertBtn.setPrefWidth(BUTTON_WIDTH);
		searchBtn = new Button("SEARCH");
		searchBtn.setPrefWidth(BUTTON_WIDTH);
		removeBtn = new Button("REMOVE");
		removeBtn.setPrefWidth(BUTTON_WIDTH);
		updateBtn = new Button("UPDATE");
		updateBtn.setPrefWidth(BUTTON_WIDTH);
		
		coursePane.add(buttonBox, 0, 8, 10, 1);
	}

	public GridPane getCoursePane() {
		return coursePane;
	}

	public void setCoursePane(GridPane coursePane) {
		this.coursePane = coursePane;
	}

	public TextField getCourseNumberField() {
		return courseNumberField;
	}

	public void setCourseNumberField(TextField courseNumberField) {
		this.courseNumberField = courseNumberField;
	}

	public TextField getCourseTitleField() {
		return courseTitleField;
	}

	public void setCourseTitleField(TextField courseTitleField) {
		this.courseTitleField = courseTitleField;
	}

	public TextArea getCourseDescriptionArea() {
		return courseDescriptionArea;
	}

	public void setCourseDescriptionArea(TextArea courseDescriptionArea) {
		this.courseDescriptionArea = courseDescriptionArea;
	}

	public TextField getNumberOfCreditsField() {
		return numberOfCreditsField;
	}

	public void setNumberOfCreditsField(TextField numberOfCreditsField) {
		this.numberOfCreditsField = numberOfCreditsField;
	}

	public HBox getButtonBox() {
		return buttonBox;
	}

	public void setButtonBox(HBox buttonBox) {
		this.buttonBox = buttonBox;
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
