package view;

import backend.Student;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

// very first menu. holds Insert, remove, search, update buttons
// insert - Student, faculty, courses, textbooks
// remove - person, courses, textbooks
// search - person, courses, textbooks
// update - student, faculty, courses, textbooks
public class MenuPane {
	private BorderPane menuPane;

	private Button insertBtn;
	private Button removeBtn;
	private Button searchBtn;
	private Button updateBtn;

	public MenuPane(){
		menuPane = new BorderPane();
		GridPane buttonBox = new GridPane();
		buttonBox.setVgap(10);
		buttonBox.setHgap(50);
		//menuPane.setGridLinesVisible(false);
		//menuPane.setPadding(new Insets(50));

		insertBtn = new Button();
		insertBtn.setText("Insert");
		insertBtn.setPrefWidth(100);

		insertBtn.setOnAction(e -> {
			MenuPaneInsert insertPane = new MenuPaneInsert();
			Pane setInsertPane = insertPane.getMenuPaneInsert();
			menuPane.setCenter(setInsertPane);
			menuPane.getChildren().remove(insertBtn);
			menuPane.getChildren().remove(searchBtn);
			menuPane.getChildren().remove(removeBtn);
			menuPane.getChildren().remove(updateBtn);
		});

		removeBtn = new Button();
		removeBtn.setText("Remove");
		removeBtn.setPrefWidth(100);

		removeBtn.setOnAction(e -> {
			MenuPaneRemove removePane = new MenuPaneRemove();
			Pane setRemovePan = removePane.getMenuPaneRemove();
			menuPane.setCenter(setRemovePan);
			menuPane.getChildren().remove(insertBtn);
			menuPane.getChildren().remove(searchBtn);
			menuPane.getChildren().remove(removeBtn);
			menuPane.getChildren().remove(updateBtn);
		});

		searchBtn = new Button();
		searchBtn.setText("Search");
		searchBtn.setPrefWidth(100);

		searchBtn.setOnAction(e -> {
			MenuPaneSearch searchPane = new MenuPaneSearch();
			Pane setSearchPan = searchPane.getMenuPaneSearch();
			menuPane.setCenter(setSearchPan);
			menuPane.getChildren().remove(insertBtn);
			menuPane.getChildren().remove(searchBtn);
			menuPane.getChildren().remove(removeBtn);
			menuPane.getChildren().remove(updateBtn);
		});

		updateBtn = new Button();
		updateBtn.setText("Update");
		updateBtn.setPrefWidth(100);

		updateBtn.setOnAction(e -> {
			MenuPaneUpdate updatePane = new MenuPaneUpdate();
			Pane setUpdatePane = updatePane.getMenuPaneUpdate();
			menuPane.setCenter(setUpdatePane);
			menuPane.getChildren().remove(insertBtn);
			menuPane.getChildren().remove(searchBtn);
			menuPane.getChildren().remove(removeBtn);
			menuPane.getChildren().remove(updateBtn);
		});

		Label title = new Label("Main Menu");

		buttonBox.add(insertBtn, 0, 0);
		buttonBox.add(removeBtn, 1, 0);
		buttonBox.add(searchBtn, 0, 1);
		buttonBox.add(updateBtn, 1, 1);

		VBox vbox = new VBox(5);
		vbox.getChildren().addAll(title, buttonBox);

		buttonBox.setAlignment(Pos.CENTER);
		title.setAlignment(Pos.CENTER);
		vbox.setAlignment(Pos.CENTER);

		menuPane.setCenter(vbox);
	}

	public BorderPane getMenuPane() {
		return menuPane;
	}

	public void setMenuPane(BorderPane menuPane) {
		this.menuPane = menuPane;
	}

	public Button getInsertBtn() {
		return insertBtn;
	}

	public void setInsertBtn(Button insertBtn) {
		this.insertBtn = insertBtn;
	}

	public Button getRemoveBtn() {
		return removeBtn;
	}

	public void setRemoveBtn(Button removeBtn) {
		this.removeBtn = removeBtn;
	}

	public Button getSearchBtn() {
		return searchBtn;
	}

	public void setSearchBtn(Button searchBtn) {
		this.searchBtn = searchBtn;
	}

	public Button getUpdateBtn() {
		return updateBtn;
	}

	public void setUpdateBtn(Button updateBtn) {
		this.updateBtn = updateBtn;
	}


}

class MenuPaneInsert {
	//Faculty Pane
	private BorderPane menuPaneInsert;

	private Button studentInsertBtn;
	private Button facultyInsertBtn;
	private Button coursesInsertBtn;
	private Button txtbookInsertBtn;

	public MenuPaneInsert(){
		menuPaneInsert = new BorderPane();
		GridPane buttonBox = new GridPane();
		buttonBox.setVgap(10);
		buttonBox.setHgap(50);
		buttonBox.setAlignment(Pos.CENTER);

		studentInsertBtn = new Button();
		studentInsertBtn.setText("Student");
		studentInsertBtn.setPrefWidth(100);

		studentInsertBtn.setOnAction(e -> {
			StudentInsertPane insertPane = new StudentInsertPane();
			BorderPane setInsertPane = insertPane.getStudentInsertPane();
			menuPaneInsert.getChildren().clear();
			menuPaneInsert.setCenter(setInsertPane);
		});

		facultyInsertBtn = new Button();
		facultyInsertBtn.setText("Faculty");
		facultyInsertBtn.setPrefWidth(100);

		facultyInsertBtn.setOnAction(e -> {
			FacultyInsertPane insertPane = new FacultyInsertPane();
			BorderPane setInsertPane = insertPane.getFacultyInsertPane();
			menuPaneInsert.getChildren().clear();
			menuPaneInsert.setCenter(setInsertPane);
		});

		coursesInsertBtn = new Button();
		coursesInsertBtn.setText("Courses");
		coursesInsertBtn.setPrefWidth(100);

		txtbookInsertBtn = new Button();
		txtbookInsertBtn.setText("Textbooks");
		txtbookInsertBtn.setPrefWidth(100);

		Label title = new Label("Insert");
		//title.setAlignment(Pos.CENTER);

		buttonBox.add(studentInsertBtn, 0, 0);
		buttonBox.add(facultyInsertBtn, 1, 0);
		buttonBox.add(coursesInsertBtn, 0, 1);
		buttonBox.add(txtbookInsertBtn, 1, 1);

		VBox vbox = new VBox(5);
		vbox.getChildren().addAll(title, buttonBox);
		vbox.setAlignment(Pos.CENTER);

		menuPaneInsert.setCenter(vbox);
	}

	public BorderPane getMenuPaneInsert() {
		return menuPaneInsert;
	}

	public void setMenuPaneInsert(BorderPane menuPaneInsert) {
		this.menuPaneInsert = menuPaneInsert;
	}

	public Button getStudentInsertBtn() {
		return studentInsertBtn;
	}

	public void setStudentInsertBtn(Button studentInsertBtn) {
		this.studentInsertBtn = studentInsertBtn;
	}

	public Button getFacultyInsertBtn() {
		return facultyInsertBtn;
	}

	public void setFacultyInsertBtn(Button facultyInsertBtn) {
		this.facultyInsertBtn = facultyInsertBtn;
	}

	public Button getCoursesInsertBtn() {
		return coursesInsertBtn;
	}

	public void setCoursesInsertBtn(Button coursesInsertBtn) {
		this.coursesInsertBtn = coursesInsertBtn;
	}

	public Button getTxtbookInsertBtn() {
		return txtbookInsertBtn;
	}

	public void setTxtbookInsertBtn(Button txtbookInsertBtn) {
		this.txtbookInsertBtn = txtbookInsertBtn;
	}

	class StudentInsertPane {
		private BorderPane studentInsertPane;

		private TextField firstNameTextField;
		private TextField lastNameTextField;
		private TextField streetNumberTextField;
		private TextField streetNameTextField;
		private TextField cityTextField;
		private TextField stateTextField;
		private TextField zipTextField;
		private TextField phoneTextField;
		private TextField majorTextField;
		private TextField gpaTextField;

		private Button confirmInsertBtn;
		private Button backStudentBtn;

		public StudentInsertPane() {
			studentInsertPane = new BorderPane();
			GridPane buttonBox = new GridPane();
			Label title = new Label("Insert Student Information");
			Label results = new Label("");
			buttonBox.setGridLinesVisible(false);
			buttonBox.setHgap(5);
			buttonBox.setVgap(10);
			buttonBox.setAlignment(Pos.CENTER);

			firstNameTextField = new TextField();
			firstNameTextField.setPromptText("First Name");
			firstNameTextField.setPrefWidth(150);

			lastNameTextField = new TextField();
			lastNameTextField.setPromptText("Last Name");

			streetNumberTextField = new TextField();
			streetNumberTextField.setPromptText("Street Number");

			streetNameTextField = new TextField();
			streetNameTextField.setPromptText("Street Name");

			cityTextField = new TextField();
			cityTextField.setPromptText("City");

			stateTextField = new TextField();
			stateTextField.setPromptText("State");

			zipTextField = new TextField();
			zipTextField.setPromptText("Zipcode");

			phoneTextField = new TextField();
			phoneTextField.setPromptText("Phone Number");

			majorTextField = new TextField();
			majorTextField.setPromptText("Major");

			gpaTextField = new TextField();
			gpaTextField.setPromptText("Grade Point Average");

			confirmInsertBtn = new Button();
			confirmInsertBtn.setText("Insert");
			confirmInsertBtn.setPrefWidth(150);
			confirmInsertBtn.setOnAction(e -> {
				results.setText("Student " + firstNameTextField.getText() + " " + lastNameTextField.getText() + " has been added.");
				//insert function

//				Student student = new Student();
//				Demo.getCollege().getPeopleBag().add(student);

				firstNameTextField.clear();
				lastNameTextField.clear();
				streetNumberTextField.clear();
				streetNameTextField.clear();
				cityTextField.clear();
				stateTextField.clear();
				zipTextField.clear();
				gpaTextField.clear();
			});

			backStudentBtn = new Button();
			backStudentBtn.setText("Back");
			backStudentBtn.setPrefWidth(150);
			backStudentBtn.setOnAction(e -> {
				MenuPane menuPane = new MenuPane();
				Pane setMenuPane = menuPane.getMenuPane();
				studentInsertPane.getChildren().clear();
				studentInsertPane.setCenter(setMenuPane);
			});

			buttonBox.add(firstNameTextField, 1, 1, 3, 1);
			buttonBox.add(lastNameTextField, 1, 2, 3, 1);
			buttonBox.add(streetNumberTextField, 1, 3);
			buttonBox.add(streetNameTextField, 2, 3);
			buttonBox.add(cityTextField, 1, 4);
			buttonBox.add(stateTextField, 2, 4);
			buttonBox.add(zipTextField, 3, 4);
			buttonBox.add(phoneTextField, 1, 5);
			buttonBox.add(majorTextField, 2, 5);
			buttonBox.add(gpaTextField, 3, 5);
			buttonBox.add(confirmInsertBtn, 1, 6);
			buttonBox.add(backStudentBtn, 3, 6);

			VBox container = new VBox(5);
			container.getChildren().addAll(title, buttonBox, results);
			container.setAlignment(Pos.CENTER);

			studentInsertPane.setCenter(container);
		}

		public BorderPane getStudentInsertPane() {
			return studentInsertPane;
		}

		public void setStudentPaneInsert(BorderPane studentInsertPane) {
			this.studentInsertPane = studentInsertPane;
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

		public TextField getGpaTextField() {
			return gpaTextField;
		}

		public void setGpaTextField(TextField gpaTextField) {
			this.gpaTextField = gpaTextField;
		}
	}

	class FacultyInsertPane {
		private BorderPane facultyInsertPane;

		private TextField firstNameTextField;
		private TextField lastNameTextField;
		private TextField streetNumberTextField;
		private TextField streetNameTextField;
		private TextField cityTextField;
		private TextField stateTextField;
		private TextField zipTextField;
		private TextField titleTextField;
		private TextField salaryTextField;

		private Button insertBtn;
		private Button backBtn;

		public FacultyInsertPane() {
			facultyInsertPane = new BorderPane();
			GridPane buttonBox = new GridPane();
			Label title = new Label("Insert Faculty Information");
			Label results = new Label("");
			buttonBox.setHgap(5);
			buttonBox.setVgap(10);
//			buttonBox.setGridLinesVisible(true);
			buttonBox.setAlignment(Pos.CENTER);

			firstNameTextField = new TextField();
			firstNameTextField.setPromptText("First Name");

			lastNameTextField = new TextField();
			lastNameTextField.setPromptText("Last Name");

			streetNumberTextField = new TextField();
			streetNumberTextField.setPromptText("Street Number");

			streetNameTextField = new TextField();
			streetNameTextField.setPromptText("Street Name");

			cityTextField = new TextField();
			cityTextField.setPromptText("City");

			stateTextField = new TextField();
			stateTextField.setPromptText("State");

			zipTextField = new TextField();
			zipTextField.setPromptText("Zip Code");

			titleTextField = new TextField();
			titleTextField.setPromptText("Title");

			salaryTextField = new TextField();
			salaryTextField.setPromptText("Salary");

			insertBtn = new Button();
			insertBtn.setText("Insert");
			insertBtn.setPrefWidth(150);
			insertBtn.setOnAction(e -> {
				results.setText(titleTextField.getText() + " " + firstNameTextField.getText() + " " +
								lastNameTextField.getText() + " has been added.");
				firstNameTextField.clear();
				lastNameTextField.clear();
				streetNumberTextField.clear();
				streetNameTextField.clear();
				cityTextField.clear();
				stateTextField.clear();
				zipTextField.clear();
				titleTextField.clear();
				salaryTextField.clear();
			});

			backBtn = new Button();
			backBtn.setText("Back");
			backBtn.setPrefWidth(150);
			backBtn.setOnAction(e -> {
				MenuPane menuPane = new MenuPane();
				Pane insertPane = menuPane.getMenuPane();
				facultyInsertPane.getChildren().clear();
				facultyInsertPane.setCenter(insertPane);
			});

			buttonBox.add(firstNameTextField, 0, 0, 3, 1);
			buttonBox.add(lastNameTextField, 0, 1, 3, 1);
			buttonBox.add(streetNumberTextField, 0, 2);
			buttonBox.add(streetNameTextField, 1, 2);
			buttonBox.add(cityTextField, 2, 2);
			buttonBox.add(stateTextField, 0, 3);
			buttonBox.add(zipTextField, 1, 3);
			buttonBox.add(titleTextField, 2, 3);
			buttonBox.add(salaryTextField, 0, 4);
			buttonBox.add(insertBtn, 1, 4);
			buttonBox.add(backBtn, 2, 4);

			VBox container = new VBox(5);
			container.setAlignment(Pos.CENTER);
			container.getChildren().addAll(title, buttonBox, results);

			facultyInsertPane.setCenter(container);
		}

		public BorderPane getFacultyInsertPane() {
			return facultyInsertPane;
		}

		public void setFacultyInsertPane(BorderPane facultyInsertPane) {
			this.facultyInsertPane = facultyInsertPane;
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

		public TextField getTitleTextField() {
			return titleTextField;
		}

		public void setTitleTextField(TextField titleTextField) {
			this.titleTextField = titleTextField;
		}

		public TextField getSalaryTextField() {
			return salaryTextField;
		}

		public void setSalaryTextField(TextField salaryTextField) {
			this.salaryTextField = salaryTextField;
		}


	}

	class CoursesInsertPane {

	}

	class TextbookInsertPane {

	}
}

class MenuPaneSearch {
	private BorderPane menuPaneSearch;

	private Button personSearchBtn;
	private Button coursesSearchBtn;
	private Button txtbookSearchBtn;

	public MenuPaneSearch() {
		menuPaneSearch = new BorderPane();
		GridPane buttonBox = new GridPane();
		buttonBox.setVgap(10);
		buttonBox.setHgap(50);
		Label title = new Label("Search");

		personSearchBtn = new Button();
		personSearchBtn.setText("Person");
		personSearchBtn.setPrefWidth(250);

		personSearchBtn.setOnAction( e -> {
			PersonSearchPane personSearch = new PersonSearchPane();
			Pane setPersonSearchPane = personSearch.getPersonPaneSearch();
			menuPaneSearch.getChildren().clear();
			menuPaneSearch.setCenter(setPersonSearchPane);
		});

		coursesSearchBtn = new Button();
		coursesSearchBtn.setText("Courses");
		coursesSearchBtn.setPrefWidth(100);

		coursesSearchBtn.setOnAction(e -> {
			CoursesSearchPane coursesSearch = new CoursesSearchPane();
			Pane setCoursesSearchPane = coursesSearch.getCoursesSearchPane();
			menuPaneSearch.getChildren().clear();
			menuPaneSearch.setCenter(setCoursesSearchPane);
		});

		txtbookSearchBtn = new Button();
		txtbookSearchBtn.setText("Textbooks");
		txtbookSearchBtn.setPrefWidth(100);

		txtbookSearchBtn.setOnAction(e -> {
			TextbookSearchPane txtbookSearch = new TextbookSearchPane();
			Pane setTxtbookSearchPane = txtbookSearch.getTxtbookSearchPane();
			menuPaneSearch.getChildren().clear();
			menuPaneSearch.setCenter(setTxtbookSearchPane);
		});


		buttonBox.add(personSearchBtn, 0, 0, 2, 1);
		buttonBox.add(coursesSearchBtn, 0, 1);
		buttonBox.add(txtbookSearchBtn, 1, 1);
		buttonBox.setAlignment(Pos.CENTER);

		VBox vbox = new VBox(5);
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(title, buttonBox);
		menuPaneSearch.setCenter(vbox);
	}

	public BorderPane getMenuPaneSearch() {
		return menuPaneSearch;
	}

	public void setMenuPaneSearch(BorderPane menuPaneSearch) {
		this.menuPaneSearch = menuPaneSearch;
	}

	public Button getPersonSearchBtn() {
		return personSearchBtn;
	}

	public void setPersonSearchBtn(Button personSearchBtn) {
		this.personSearchBtn = personSearchBtn;
	}

	public Button getCoursesSearchBtn() {
		return coursesSearchBtn;
	}

	public void setCoursesSearchBtn(Button coursesSearchBtn) {
		this.coursesSearchBtn = coursesSearchBtn;
	}

	public Button getTxtbookSearchBtn() {
		return txtbookSearchBtn;
	}

	public void setTxtbookSearchBtn(Button txtbookSearchBtn) {
		this.txtbookSearchBtn = txtbookSearchBtn;
	}

	class PersonSearchPane {
		private BorderPane personPaneSearch;

		private TextField searchByIdTextField;
		private Button searchBtn;
		private Button backBtn;
		private Label searchResultsLbl;

		public PersonSearchPane(){
			personPaneSearch = new BorderPane();

			GridPane buttonBox = new GridPane();
			buttonBox.setGridLinesVisible(false);
			buttonBox.setHgap(5);
			buttonBox.setVgap(10);

			searchByIdTextField = new TextField();
			searchByIdTextField.setPromptText("Enter ID Number");
			searchByIdTextField.setPrefWidth(200);

			searchBtn = new Button();
			searchBtn.setText("Search");

			backBtn = new Button();
			backBtn.setText("Back");

			searchResultsLbl = new Label();

			buttonBox.add(searchByIdTextField, 1, 1);
			buttonBox.add(searchBtn, 2, 1);
			buttonBox.add(searchResultsLbl, 1, 2);
			buttonBox.add(backBtn, 3, 1);

			buttonBox.setAlignment(Pos.CENTER);
			personPaneSearch.setCenter(buttonBox);

			searchBtn.setOnAction(e ->{
				searchResultsLbl.setText(searchByIdTextField.getText() + " was entered.");
				searchByIdTextField.clear();
				// then add search functionality
			});

			backBtn.setOnAction(e -> {
				MenuPane menuPane = new MenuPane();
				Pane setMenuPane = menuPane.getMenuPane();
				personPaneSearch.getChildren().remove(searchByIdTextField);
				personPaneSearch.getChildren().remove(searchBtn);
				personPaneSearch.getChildren().remove(searchResultsLbl);
				personPaneSearch.getChildren().remove(backBtn);
				personPaneSearch.setCenter(setMenuPane);
			});
		}

		public BorderPane getPersonPaneSearch() {
			return personPaneSearch;
		}

		public void setPersonPaneSearch(BorderPane personPaneSearch) {
			this.personPaneSearch = personPaneSearch;
		}

		public TextField getSearchByIdTextField() {
			return searchByIdTextField;
		}

		public void setSearchByIdTextField(TextField searchByIdTextField) {
			this.searchByIdTextField = searchByIdTextField;
		}

		public Button getSearchBtn() {
			return searchBtn;
		}

		public void setSearchBtn(Button searchBtn) {
			this.searchBtn = searchBtn;
		}

		public Button getBackBtn() {
			return backBtn;
		}

		public void setBackBtn(Button backBtn) {
			this.backBtn = backBtn;
		}

		public Label getSearchResultsLbl() {
			return searchResultsLbl;
		}

		public void setSearchResultsLbl(Label searchResultsLbl) {
			this.searchResultsLbl = searchResultsLbl;
		}
	}

	class CoursesSearchPane {
		private BorderPane coursesSearchPane;

		private TextField searchByCourseNumber;
		private Button searchBtn;
		private Button backBtn;
		private Label searchResultsLbl;

		public CoursesSearchPane() {
			coursesSearchPane = new BorderPane();
			GridPane buttonBox = new GridPane();
			buttonBox.setHgap(5);
			buttonBox.setVgap(10);
			buttonBox.setAlignment(Pos.CENTER);

			searchByCourseNumber = new TextField();
			searchByCourseNumber.setPromptText("Enter Course Number");
			searchByCourseNumber.setPrefWidth(200);

			searchBtn = new Button();
			searchBtn.setText("Search");

			searchBtn.setOnAction(e -> {
				searchResultsLbl.setText(searchByCourseNumber.getText() + " was entered");
				searchByCourseNumber.clear();
				//add search func
			});

			backBtn = new Button();
			backBtn.setText("Back");

			backBtn.setOnAction(e -> {
				MenuPane menuPane = new MenuPane();
				Pane setMenuPane = menuPane.getMenuPane();
				buttonBox.getChildren().clear();
				coursesSearchPane.setCenter(setMenuPane);
			});

			searchResultsLbl = new Label("");

			buttonBox.add(searchByCourseNumber, 1, 1);
			buttonBox.add(searchBtn, 2, 1);
			buttonBox.add(searchResultsLbl, 1, 2);
			buttonBox.add(backBtn, 3, 1);

			coursesSearchPane.setCenter(buttonBox);
		}

		public BorderPane getCoursesSearchPane() {
			return coursesSearchPane;
		}

		public void setCoursesSearchPane(BorderPane coursesSearchPane) {
			this.coursesSearchPane = coursesSearchPane;
		}

		public TextField getSearchByCourseNumber() {
			return searchByCourseNumber;
		}

		public void setSearchByCourseNumber(TextField searchByCourseNumber) {
			this.searchByCourseNumber = searchByCourseNumber;
		}

		public Button getSearchBtn() {
			return searchBtn;
		}

		public void setSearchBtn(Button searchBtn) {
			this.searchBtn = searchBtn;
		}

		public Button getBackBtn() {
			return backBtn;
		}

		public void setBackBtn(Button backBtn) {
			this.backBtn = backBtn;
		}

		public Label getSearchResultsLbl() {
			return searchResultsLbl;
		}

		public void setSearchResultsLbl(Label searchResultsLbl) {
			this.searchResultsLbl = searchResultsLbl;
		}
	}

	class TextbookSearchPane {
		private BorderPane txtbookSearchPane;

		private TextField searchByIsbn;
		private Button searchBtn;
		private Button backBtn;
		private Label searchResultsLbl;

		public TextbookSearchPane() {
			txtbookSearchPane = new BorderPane();
			GridPane buttonBox = new GridPane();
			buttonBox.setHgap(5);
			buttonBox.setVgap(10);
			buttonBox.setAlignment(Pos.CENTER);

			searchByIsbn = new TextField();
			searchByIsbn.setPromptText("Enter ISBN");
			searchByIsbn.setPrefWidth(200);

			searchBtn = new Button();
			searchBtn.setText("Search");
			searchBtn.setOnAction(e -> {
				searchResultsLbl.setText(searchByIsbn.getText() + " was written");
				searchByIsbn.clear();
				// search func
			});

			backBtn = new Button();
			backBtn.setText("Back");
			backBtn.setOnAction(e -> {
				MenuPane menuPane = new MenuPane();
				Pane setMenuPane = menuPane.getMenuPane();
				txtbookSearchPane.getChildren().clear();
				txtbookSearchPane.setCenter(setMenuPane);
			});

			searchResultsLbl = new Label("");

			buttonBox.add(searchByIsbn, 1, 1);
			buttonBox.add(searchBtn, 2, 1);
			buttonBox.add(searchResultsLbl, 1, 2);
			buttonBox.add(backBtn, 3, 1);

			txtbookSearchPane.setCenter(buttonBox);
		}

		public BorderPane getTxtbookSearchPane() {
			return txtbookSearchPane;
		}

		public void setTxtbookSearchPane(BorderPane txtbookSearchPane) {
			this.txtbookSearchPane = txtbookSearchPane;
		}

		public TextField getSearchByIsbn() {
			return searchByIsbn;
		}

		public void setSearchByIsbn(TextField searchByIsbn) {
			this.searchByIsbn = searchByIsbn;
		}

		public Button getSearchBtn() {
			return searchBtn;
		}

		public void setSearchBtn(Button searchBtn) {
			this.searchBtn = searchBtn;
		}

		public Button getBackBtn() {
			return backBtn;
		}

		public void setBackBtn(Button backBtn) {
			this.backBtn = backBtn;
		}

		public Label getSearchResultsLbl() {
			return searchResultsLbl;
		}

		public void setSearchResultsLbl(Label searchResultsLbl) {
			this.searchResultsLbl = searchResultsLbl;
		}


	}
}

class MenuPaneRemove {
	private BorderPane menuPaneRemove;

	private TextField personTextField;
	private Button personRemoveBtn;
	private TextField coursesTextField;
	private Button coursesRemoveBtn;
	private TextField txtbookTextField;
	private Button txtbookRemoveBtn;
	private Button backBtn;

	public MenuPaneRemove(){
		menuPaneRemove = new BorderPane();
		GridPane buttonBox = new GridPane();
		Label title = new Label("Remove");
		Label results = new Label("");
		buttonBox.setVgap(5);
		buttonBox.setHgap(10);

		personTextField = new TextField();
		personTextField.setPromptText("Enter Person's ID");

		personRemoveBtn = new Button();
		personRemoveBtn.setText("Remove Person");
		personRemoveBtn.setPrefWidth(100);
		personRemoveBtn.setOnAction(e -> {
			results.setText(personTextField.getText() + " has been removed.");
			// convert from ID to name
			personTextField.clear();
		});


		coursesTextField = new TextField();
		coursesTextField.setPromptText("Enter Course Number");

		coursesRemoveBtn = new Button();
		coursesRemoveBtn.setText("Remove Course");
		coursesRemoveBtn.setPrefWidth(100);
		coursesRemoveBtn.setOnAction(e -> {
			results.setText(coursesTextField.getText() + " has been removed.");
			// convert from Course Number to name
			coursesTextField.clear();
		});

		txtbookTextField = new TextField();
		txtbookTextField.setPromptText("Enter ISBN");

		txtbookRemoveBtn = new Button();
		txtbookRemoveBtn.setText("Remove Book");
		txtbookRemoveBtn.setPrefWidth(100);
		txtbookRemoveBtn.setOnAction(e -> {
			results.setText(txtbookTextField.getText() + " has been removed.");
			txtbookTextField.clear();
		});

		backBtn = new Button();
		backBtn.setText("Back");
		backBtn.setOnAction(e -> {
			MenuPane menuPane = new MenuPane();
			Pane setMenuPane = menuPane.getMenuPane();
			menuPaneRemove.getChildren().clear();
			menuPaneRemove.setCenter(setMenuPane);
		});

		buttonBox.add(personTextField, 0, 0);
		buttonBox.add(personRemoveBtn, 1, 0);
		buttonBox.add(coursesTextField, 0, 1);
		buttonBox.add(coursesRemoveBtn, 1, 1);
		buttonBox.add(txtbookTextField, 0, 2);
		buttonBox.add(txtbookRemoveBtn, 1, 2);
		buttonBox.add(backBtn, 0, 3);
		buttonBox.setAlignment(Pos.CENTER);

		VBox vbox = new VBox(5);
		vbox.getChildren().addAll(title, buttonBox, results);
		vbox.setAlignment(Pos.CENTER);

		menuPaneRemove.setCenter(vbox);
	}

	public TextField getPersonTextField() {
		return personTextField;
	}

	public void setPersonTextField(TextField personTextField) {
		this.personTextField = personTextField;
	}

	public TextField getCoursesTextField() {
		return coursesTextField;
	}

	public void setCoursesTextField(TextField coursesTextField) {
		this.coursesTextField = coursesTextField;
	}

	public TextField getTxtbookTextField() {
		return txtbookTextField;
	}

	public void setTxtbookTextField(TextField txtbookTextField) {
		this.txtbookTextField = txtbookTextField;
	}

	public Button getBackBtn() {
		return backBtn;
	}

	public void setBackBtn(Button backBtn) {
		this.backBtn = backBtn;
	}

	public BorderPane getMenuPaneRemove() {
		return menuPaneRemove;
	}

	public void setMenuPaneRemove(BorderPane menuPaneRemove) {
		this.menuPaneRemove = menuPaneRemove;
	}

	public Button getPersonRemoveBtn() {
		return personRemoveBtn;
	}

	public void setPersonRemoveBtn(Button personRemoveBtn) {
		this.personRemoveBtn = personRemoveBtn;
	}

	public Button getCoursesRemoveBtn() {
		return coursesRemoveBtn;
	}

	public void setCoursesRemoveBtn(Button coursesRemoveBtn) {
		this.coursesRemoveBtn = coursesRemoveBtn;
	}

	public Button getTxtbookRemoveBtn() {
		return txtbookRemoveBtn;
	}

	public void setTxtbookRemoveBtn(Button txtbookRemoveBtn) {
		this.txtbookRemoveBtn = txtbookRemoveBtn;
	}
}

class MenuPaneUpdate {
	private BorderPane menuPaneUpdate;

	private Button studentUpdateBtn;
	private Button facultyUpdateBtn;
	private Button coursesUpdateBtn;
	private Button txtbookRemoveBtn;

	public MenuPaneUpdate(){
		menuPaneUpdate = new BorderPane();
		GridPane buttonBox = new GridPane();
		buttonBox.setVgap(10);
		buttonBox.setHgap(50);
		buttonBox.setAlignment(Pos.CENTER);

		studentUpdateBtn = new Button();
		studentUpdateBtn.setText("Student");
		studentUpdateBtn.setPrefWidth(100);

		facultyUpdateBtn = new Button();
		facultyUpdateBtn.setText("Faculty");
		facultyUpdateBtn.setPrefWidth(100);

		coursesUpdateBtn = new Button();
		coursesUpdateBtn.setText("Courses");
		coursesUpdateBtn.setPrefWidth(100);

		txtbookRemoveBtn = new Button();
		txtbookRemoveBtn.setText("Textbooks");
		txtbookRemoveBtn.setPrefWidth(100);

		Label title = new Label("Update");

		buttonBox.add(studentUpdateBtn, 0, 0);
		buttonBox.add(facultyUpdateBtn, 1, 0);
		buttonBox.add(coursesUpdateBtn, 0, 1);
		buttonBox.add(txtbookRemoveBtn, 1, 1);

		VBox vbox = new VBox(5);
		vbox.getChildren().addAll(title, buttonBox);
		vbox.setAlignment(Pos.CENTER);
		menuPaneUpdate.setCenter(vbox);
	}

	public BorderPane getMenuPaneUpdate() {
		return menuPaneUpdate;
	}

	public void setMenuPaneUpdate(BorderPane menuPaneUpdate) {
		this.menuPaneUpdate = menuPaneUpdate;
	}

	public Button getStudentUpdateBtn() {
		return studentUpdateBtn;
	}

	public void setStudentUpdateBtn(Button studentUpdateBtn) {
		this.studentUpdateBtn = studentUpdateBtn;
	}

	public Button getFacultyUpdateBtn() {
		return facultyUpdateBtn;
	}

	public void setFacultyUpdateBtn(Button facultyUpdateBtn) {
		this.facultyUpdateBtn = facultyUpdateBtn;
	}

	public Button getCoursesUpdateBtn() {
		return coursesUpdateBtn;
	}

	public void setCoursesUpdateBtn(Button coursesUpdateBtn) {
		this.coursesUpdateBtn = coursesUpdateBtn;
	}

	public Button getTxtbookRemoveBtn() {
		return txtbookRemoveBtn;
	}

	public void setTxtbookRemoveBtn(Button txtbookRemoveBtn) {
		this.txtbookRemoveBtn = txtbookRemoveBtn;
	}
}