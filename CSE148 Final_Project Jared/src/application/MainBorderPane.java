package application;

import java.io.File;
import java.util.ArrayList;

import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class MainBorderPane extends BorderPane {
	private MenuBar menuBar = new MenuBar();
	private BorderPane bpViewBox = new BorderPane();

	
	public MainBorderPane(){
		this.setPrefSize(400, 400);
		createMenuBar();
		this.setStyle("-fx-background-color: #484544;");
		bpViewBox.setPadding(new Insets(5,5,5,5));
	//	bpViewBox.setStyle("-fx-background-color: #0F1B4F");
		
		
		this.setTop(menuBar);
		this.setCenter(bpViewBox);
		
	}
	
	private Node SaveButton(){
		HBox hbox = new HBox();
		Button buttonSave = new Button("Save");
		buttonSave.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
		buttonSave.setPrefWidth(120);
		
		hbox.setPadding(new Insets(5,5,5,5));
		hbox.getChildren().addAll(buttonSave);
		hbox.setAlignment(Pos.BOTTOM_RIGHT);
		
		return hbox;
	}
	
	private void createMenuBar()
	{
		Menu menuFile = new Menu("File");
		Menu menuInsert = new Menu("Insert");
		Menu menuSearch = new Menu("Search");
		Menu menuUpdate = new Menu("Update");
		Menu menuDelete = new Menu("Delete");

		MenuItem menuFile_IMPORT = new MenuItem("Import");
		MenuItem menuFile_EXPORT = new MenuItem("Export");
		MenuItem menuFile_SAVE = new MenuItem("Save");
		MenuItem menuFile_LOAD = new MenuItem("Load");
		
		menuFile_IMPORT.setOnAction(event ->{
			bpViewBox.setCenter(importFiles());
		});
		menuFile_EXPORT.setOnAction(event ->{
			bpViewBox.setCenter(exportFiles());
		});
		menuFile_SAVE.setOnAction(event ->{
			Main.bodybag.update();
			Main.bookbag.update();
			Main.mastercoursebag.update();
		});
		menuFile_LOAD.setOnAction(event ->{
			Main.bodybag.load();
			Main.bookbag.load();
			Main.mastercoursebag.load();
		});
		
		
		menuFile.getItems().addAll(menuFile_IMPORT, menuFile_EXPORT, menuFile_SAVE, menuFile_LOAD);
		
		Menu menuInsert_ADD = new Menu("Add");
		MenuItem menuADD_Student = new MenuItem("Student");
		MenuItem menuADD_Faculty = new MenuItem("Faculty");
		MenuItem menuADD_Textbook = new MenuItem("Textbook");
		MenuItem menuADD_Course = new MenuItem("Course");
		
		
		menuADD_Student.setOnAction(event -> {
			bpViewBox.setCenter(nodeNewStudent());
		});
		
		menuADD_Faculty.setOnAction(event ->{
			bpViewBox.setCenter(nodeNewFaculty());
		});
		menuADD_Textbook.setOnAction(event ->{
			bpViewBox.setCenter(nodeNewTextbook());
		});
		menuADD_Course.setOnAction(event ->{
			bpViewBox.setCenter(nodeNewCourse());
		});
		
		
		menuInsert_ADD.getItems().addAll(menuADD_Student,menuADD_Faculty,menuADD_Textbook, menuADD_Course);
		
		
		MenuItem menuSearch_ID = new MenuItem("Search ID");
		MenuItem menuSearch_Course = new MenuItem("Search Course");
		MenuItem menuSearch_Textbook = new MenuItem("Search ISBN");
		
		menuSearch_ID.setOnAction(event ->{
			bpViewBox.setTop(searchID());
		});
		menuSearch_Course.setOnAction(event ->{
			bpViewBox.setTop(searchCourse());
		});
		menuSearch_Textbook.setOnAction(event -> {
			bpViewBox.setTop(searchTextbook());
		});
		
		menuSearch.getItems().addAll(menuSearch_ID, menuSearch_Course, menuSearch_Textbook);
		
		
		
		menuInsert.getItems().addAll(menuInsert_ADD);
		
		
		
		
		MenuItem menuUpdate_Student = new MenuItem("Student");
		MenuItem menuUpdate_Faculty = new MenuItem("Faculty");
		MenuItem menuUpdate_BookBag = new MenuItem("BookBag");
		MenuItem menuUpdate_CourseBag = new MenuItem("CourseBag");
		
		menuUpdate.getItems().addAll(menuUpdate_Student, menuUpdate_Faculty, menuUpdate_BookBag, menuUpdate_CourseBag);
		
		MenuItem menuDelete_Student = new MenuItem("Student");
		MenuItem menuDelete_Faculty = new MenuItem("Faculty");
		MenuItem menuDelete_Textbook = new MenuItem("Textbook");
		MenuItem menuDelete_Course = new MenuItem("Course");
		
		
		menuDelete_Student.setOnAction(event ->{
			bpViewBox.setTop(deletePerson());
		});
		menuDelete_Faculty.setOnAction(event -> {
			bpViewBox.setTop(deletePerson());
		});
		menuDelete_Textbook.setOnAction(event ->{
			bpViewBox.setTop(deleteTextbook());
		});
		menuDelete_Course.setOnAction(event ->{
			bpViewBox.setTop(deleteCourse());
		});
		
		
		menuDelete.getItems().addAll(menuDelete_Student,menuDelete_Faculty,menuDelete_Textbook, menuDelete_Course);
		
		
		menuBar.getMenus().addAll(menuFile, menuInsert, menuSearch, menuUpdate, menuDelete);
	}
	
	private Node searchID(){
		HBox hbID = new HBox();
		hbID.setSpacing(5);
		
		Label lblID = new Label("Enter ID");
		//lblID.setTextFill(Color.WHITE);
		
		TextField tfID = new TextField();
		
		Button buttonSearch = new Button("Search");
		buttonSearch.setOnAction(event -> {
			if (tfID.getText() != null){
				if (Main.bodybag.searchById(tfID.getText()) != null){
					if(Main.bodybag.searchById(tfID.getText()) instanceof Student){
						bpViewBox.setCenter(showStudent());
					}
					
				}
			}
			
        });
		
		hbID.getChildren().addAll(lblID, tfID , buttonSearch);
		
		hbID.setAlignment(Pos.BASELINE_CENTER);
		
		return hbID;
	}

	
	private Node showStudent() {
		VBox VBox = new VBox();
		
		
		return VBox;
	}

	private Node searchCourse(){
		HBox hbSearch = new HBox();
		hbSearch.setSpacing(5);
		
		Label lblCourseNumber= new Label("Enter Course Number");
		//lblID.setTextFill(Color.WHITE);
		
		TextField tfISBN= new TextField();
		
		Button buttonSearch = new Button("Search");
		buttonSearch.setOnAction(event -> {
			if ((tfISBN.getText()) != null){
				if(Main.mastercoursebag.searchByCourseNumber(tfISBN.getText()) != null){
					bpViewBox.setCenter(showCourse(Main.mastercoursebag.searchByCourseNumber(tfISBN.getText())));
				}
				else{
					tfISBN.setText("Invalid Course Number and/or Course not in database.");
				}
			}
        });
		
		hbSearch.getChildren().addAll(lblCourseNumber, tfISBN , buttonSearch);
		
		hbSearch.setAlignment(Pos.BASELINE_CENTER);
		
		return hbSearch;
	}
	private Node showCourse(Course C){
		BorderPane node = new BorderPane();
		//public Course(String courseNumber, String courseTitle, String courseDescription, Double courseCredits,
		//ArrayList<String> textbooks) {
		
		Label lblCourseNumber = new Label("Course Number: " + C.getCourseNumber());
		Label lblCourseTitle = new Label("Course Title: " + C.getCourseTitle());
		Label lblCourseDecription = new Label("Description: " +  C.getCourseDescription());
		Label lblCredits = new Label("Credits: " + C.getCourseCredits());
		Label lblTextbooks = new Label("Textbooks: " + C.getTextbooks().toString().substring(1, C.getTextbooks().toString().length()-2));
		
		
		VBox VBox = new VBox();
		VBox.getChildren().addAll(lblCourseNumber, lblCourseTitle, lblCourseDecription, lblCredits, lblTextbooks);
		
		node.setCenter(VBox);
		
		
		return node;
	}
	
	
	private Node nodeNewStudent(){
		ScrollPane Pane = new ScrollPane();
		Pane.setFitToWidth(true);
		VBox VBox = new VBox();
		
		TextField tfFirstName = new TextField();
		tfFirstName.setPrefWidth(120);
		TextField tfLastName = new TextField();
		tfLastName.setPrefWidth(120);
		Label lblFirstName = new Label("First:");
	//	lblFirstName.setTextFill(Color.WHITE);
		Label lblLastName = new Label("Last:");
	//	lblLastName.setTextFill(Color.WHITE);
		
		Label lblNewStudent = new Label("New Student");
	//	lblNewStudent.setTextFill(Color.WHITE);
		lblNewStudent.setFont(new Font ("Calibri" , 30));
		
		HBox hbName = new HBox();
		hbName.setSpacing(5);
		hbName.setPadding(new Insets(0,10,0,10));
		
		////////////////////////////////////
		Label lbladdCourse = new Label("Add Course taking:");
		final ComboBox<String> cbCourses = new ComboBox<String>(Main.mastercoursebag.getCourses());
		ArrayList<String> c = new ArrayList<String>();
		
		Label lblCoursesTaking = new Label();
		
		Button addCourseTaking = new Button("Add");
		addCourseTaking.setOnAction(event ->{
			c.add(cbCourses.getValue());
			if(c.size() == 1){
				lblCoursesTaking.setText(cbCourses.getValue());
			}
			else{
				lblCoursesTaking.setText(lblCoursesTaking.getText() + ", " + cbCourses.getValue() );
			}	
		});
		
		HBox hbCoursesTaking = new HBox();
		hbCoursesTaking.setSpacing(5);
		hbCoursesTaking.setAlignment(Pos.CENTER);
		hbCoursesTaking.getChildren().addAll(lbladdCourse, cbCourses, addCourseTaking);
		//////////////////////////////////////
		
		////////////////////////////////////
		Label lbladdcoursetook = new Label("Add Course took:");
		final ComboBox<String> cbCoursesTook = new ComboBox<String>(Main.mastercoursebag.getCourses());
		ArrayList<String> took = new ArrayList<String>();
		
		Label lblCoursesTook = new Label();
		
		Button addCourseTook = new Button("Add");
		addCourseTook.setOnAction(event ->{
			took.add(cbCourses.getValue());
			if(took.size() == 1){
				lblCoursesTook.setText(cbCoursesTook.getValue());
			}
			else{
				lblCoursesTook.setText(lblCoursesTook.getText() + ", " + cbCoursesTook.getValue() );
			}	
		});
		
		HBox hbCoursesTook = new HBox();
		hbCoursesTook.setSpacing(5);
		hbCoursesTook.setAlignment(Pos.CENTER);
		hbCoursesTook.getChildren().addAll(lbladdcoursetook, cbCoursesTook, addCourseTook);
		//////////////////////////////////
		
		////////////////////////////////////
		Label lbladdcourseNeed = new Label("Add Course took:");
		final ComboBox<String> cbCoursesNeed = new ComboBox<String>(Main.mastercoursebag.getCourses());
		ArrayList<String> need = new ArrayList<String>();

		Label lblCoursesNeed = new Label();

		Button addCourseNeed = new Button("Add");
		addCourseNeed.setOnAction(event ->{
			need.add(cbCourses.getValue());
			if(need.size() == 1){
				lblCoursesNeed.setText(cbCoursesNeed.getValue());
			}
			else{
				lblCoursesNeed.setText(lblCoursesNeed.getText() + ", " + cbCoursesNeed.getValue() );
			}	
		});

		HBox hbCourseNeed = new HBox();
		hbCourseNeed.setSpacing(5);
		hbCourseNeed.setAlignment(Pos.CENTER);
		hbCourseNeed.getChildren().addAll(lbladdcourseNeed, cbCoursesNeed, addCourseNeed);
		//////////////////////////////////
		
		
		
		
		//////////////////////////////////Creates Address GridPane
		GridPane gpAddress = new GridPane();
		
		Label lblADDRESS = new Label("Address");
		lblADDRESS.setFont(new Font ("Calibri" , 30));
		
		Label lblStreetNumber = new Label("Street Number:");
		TextField tfStreetNumber = new TextField();

		
		Label lblStreet = new Label("Street:");
		TextField tfStreet = new TextField();

		
		Label lblTown = new Label("Town:");
		TextField tfTown = new TextField();
		
		Label lblState = new Label("State:");
		TextField tfState = new TextField();
		
		Label lblZip = new Label("Zip:");
		TextField tfZip = new TextField();
		
		
		gpAddress.add(lblStreetNumber, 0, 0);
		gpAddress.add(tfStreetNumber, 1, 0);
		gpAddress.add(lblStreet, 0, 1);
		gpAddress.add(tfStreet, 1, 1);
		gpAddress.add(lblTown, 0, 2);
		gpAddress.add(tfTown, 1, 2);
		gpAddress.add(lblState, 0, 3);
		gpAddress.add(tfState, 1, 3);
		gpAddress.add(lblZip, 0, 4);
		gpAddress.add(tfZip, 1, 4);
		
		gpAddress.setVgap(5);
		gpAddress.setHgap(10);
		gpAddress.setPadding(new Insets(5,5,5,5));
		
		HBox hbAddress = new HBox();
		hbAddress.getChildren().add(gpAddress);
		hbAddress.setAlignment(Pos.CENTER);
		
		Address address = new Address(tfStreetNumber.getText(), tfStreet.getText(), tfTown.getText(), tfState.getText(), tfZip.getText());
		
		///////////////////////////////////Address GridPane
		
		
		Button btnSave = new Button("Save");
		btnSave.setOnAction(event ->{
			Student s = new Student(tfFirstName.getText(), tfLastName.getText());
			s.setAddress(address);
			s.setCoursesTaking(c);
			s.setCoursesTook(took);
			s.setCoursesNeeded(need);
			
			Main.bodybag.insert(s);
			System.out.println("Inserted Student: " + s.getLastName() + " " + s.getId());
			
			
		});
		
		
		
		hbName.getChildren().addAll(lblFirstName, tfFirstName, lblLastName, tfLastName);
		
		
		VBox.getChildren().addAll(lblNewStudent,hbName, hbCoursesTaking, lblCoursesTaking, hbCoursesTook, lblCoursesTook, hbCourseNeed
				, lblCoursesNeed, lblADDRESS, hbAddress, btnSave);
		VBox.setAlignment(Pos.CENTER);
		VBox.setSpacing(5);
		
		BorderPane.setAlignment(lblNewStudent, Pos.CENTER);
		BorderPane.setAlignment(lblADDRESS, Pos.CENTER);
		BorderPane.setAlignment(gpAddress, Pos.CENTER);
		
		Pane.setStyle("-fx-background-color:transparent;");
		Pane.setContent(VBox);
		return Pane;
	}
	
	private Node nodeNewFaculty(){
		ScrollPane Pane = new ScrollPane();
		Pane.setFitToWidth(true);
		VBox VBox = new VBox();

		TextField tfFirstName = new TextField();
		tfFirstName.setPrefWidth(120);
		TextField tfLastName = new TextField();
		tfLastName.setPrefWidth(120);
		Label lblFirstName = new Label("First Name:");
		//	lblFirstName.setTextFill(Color.WHITE);
		Label lblLastName = new Label("Last Name:");
		//	lblLastName.setTextFill(Color.WHITE);

		Label lblNewFaculty = new Label("New Faculty");
		//	lblNewStudent.setTextFill(Color.WHITE);
		lblNewFaculty.setFont(new Font ("Calibri" , 30));

		HBox hbName = new HBox();
		hbName.setSpacing(5);
		hbName.setPadding(new Insets(0,10,0,10));

		////////////////////////////////////
		Label lbladdCourse = new Label("Add Course teaching:");
		final ComboBox<String> cbCourses = new ComboBox<String>(Main.mastercoursebag.getCourses());
		ArrayList<String> c = new ArrayList<String>();

		Label lblCoursesTaking = new Label();

		Button addCourseTaking = new Button("Add");
		addCourseTaking.setOnAction(event ->{
			c.add(cbCourses.getValue());
			if(c.size() == 1){
				lblCoursesTaking.setText(cbCourses.getValue());
			}
			else{
				lblCoursesTaking.setText(lblCoursesTaking.getText() + ", " + cbCourses.getValue() );
			}	
		});

		HBox hbCoursesTaking = new HBox();
		hbCoursesTaking.setSpacing(5);
		hbCoursesTaking.setAlignment(Pos.CENTER);
		hbCoursesTaking.getChildren().addAll(lbladdCourse, cbCourses, addCourseTaking);
		//////////////////////////////////////



		//////////////////////////////////Creates Address GridPane
		GridPane gpAddress = new GridPane();

		Label lblADDRESS = new Label("Address");
		lblADDRESS.setFont(new Font ("Calibri" , 30));

		Label lblStreetNumber = new Label("Street Number:");
		TextField tfStreetNumber = new TextField();


		Label lblStreet = new Label("Street:");
		TextField tfStreet = new TextField();


		Label lblTown = new Label("Town:");
		TextField tfTown = new TextField();

		Label lblState = new Label("State:");
		TextField tfState = new TextField();

		Label lblZip = new Label("Zip:");
		TextField tfZip = new TextField();


		gpAddress.add(lblStreetNumber, 0, 0);
		gpAddress.add(tfStreetNumber, 1, 0);
		gpAddress.add(lblStreet, 0, 1);
		gpAddress.add(tfStreet, 1, 1);
		gpAddress.add(lblTown, 0, 2);
		gpAddress.add(tfTown, 1, 2);
		gpAddress.add(lblState, 0, 3);
		gpAddress.add(tfState, 1, 3);
		gpAddress.add(lblZip, 0, 4);
		gpAddress.add(tfZip, 1, 4);

		gpAddress.setVgap(5);
		gpAddress.setHgap(10);
		gpAddress.setPadding(new Insets(5,5,5,5));

		HBox hbAddress = new HBox();
		hbAddress.getChildren().add(gpAddress);
		hbAddress.setAlignment(Pos.CENTER);

		Address address = new Address(tfStreetNumber.getText(), tfStreet.getText(), tfTown.getText(), tfState.getText(), tfZip.getText());

		///////////////////////////////////Address GridPane


		Button btnSave = new Button("Save");
		btnSave.setOnAction(event ->{
			Faculty f = new Faculty(tfFirstName.getText(), tfLastName.getText());
			f.setAddress(address);
			f.setCoursesTeaching(c);
			Main.bodybag.insert(f);
			System.out.println("Inserted Faculty: " + f.getLastName() + " " + f.getId());


		});



		hbName.getChildren().addAll(lblFirstName, tfFirstName, lblLastName, tfLastName);


		VBox.getChildren().addAll(lblNewFaculty,hbName, hbCoursesTaking, lblCoursesTaking, lblADDRESS, hbAddress, btnSave);
		VBox.setAlignment(Pos.CENTER);
		VBox.setSpacing(5);

		BorderPane.setAlignment(lblNewFaculty, Pos.CENTER);
		BorderPane.setAlignment(lblADDRESS, Pos.CENTER);
		BorderPane.setAlignment(gpAddress, Pos.CENTER);

		Pane.setStyle("-fx-background-color:transparent;");
		Pane.setContent(VBox);
		return Pane;
	}
	
	private Node nodeNewTextbook(){
		BorderPane Pane = new BorderPane();
		
		VBox VBox = new VBox();
		//public Textbook(String bookISBN, String bookTitle, ArrayList<String> bookAuthors, double bookPrice) {
		
		Label lblbookISBN = new Label("ISBN:");
		TextField tfbookISBN = new TextField();
		HBox hbbookISBN = new HBox();
		hbbookISBN.setSpacing(5);
		hbbookISBN.getChildren().addAll(lblbookISBN, tfbookISBN);
		hbbookISBN.setAlignment(Pos.CENTER);
		
		Label lblbooktitile = new Label("Titile:");
		TextField tfbooktitle = new TextField();
		HBox hbbooktitle = new HBox();
		hbbooktitle.setSpacing(5);
		hbbooktitle.getChildren().addAll(lblbooktitile, tfbooktitle);
		hbbooktitle.setAlignment(Pos.CENTER);
		
		Label lblauthor = new Label("Authors:");
		TextField tfauthor = new TextField();
		HBox hbauthor = new HBox();
		hbauthor.setSpacing(5);
		hbauthor.getChildren().addAll(lblauthor, tfauthor);
		hbauthor.setAlignment(Pos.CENTER);
		
		Label lblprice = new Label("Price:");
		TextField tfprice = new TextField();
		HBox hbprice = new HBox();
		hbprice.setSpacing(5);
		hbprice.getChildren().addAll(lblprice, tfprice);
		hbprice.setAlignment(Pos.CENTER);
		
		Button btnSave = new Button("Save");
		
		ArrayList<String> s = new ArrayList<String>();
	
		VBox.getChildren().addAll(hbbookISBN,hbbooktitle,hbauthor,hbprice);
		
		
		
		btnSave.setOnAction(event ->{
			String[] authors = tfauthor.getText().split(",");
			for(String h: authors){
				s.add(h);
			}
			try {
				Double.parseDouble(tfprice.getText());
				Textbook t = new Textbook(tfbookISBN.getText(), tfbooktitle.getText(), s, Double.parseDouble(tfprice.getText()));
				System.out.println("Inserted new Textbook: " + t.getBookISBN() + ": by " + t.getBookAuthors().toString());
				Main.bookbag.add(t);
			} catch (NumberFormatException e) {
				System.out.println("Price format incorrect: " + e);
			}
			
		});
		
		Pane.setCenter(VBox);
		
		BorderPane.setAlignment(btnSave, Pos.BASELINE_RIGHT);
		Pane.setBottom(btnSave);
		
		return Pane;
		
		
	}

	private Node nodeNewCourse(){
		BorderPane Pane = new BorderPane();
		VBox vbox = new VBox();
		GridPane GP = new GridPane();
		GP.setHgap(5);
		GP.setVgap(5);
		
		
		Label lblcourseNumber = new Label("Course Number:");
		TextField tfcourseNumber = new TextField();
		Label lblcourseTitle = new Label("Course Title:");
		TextField tfcourseTitle= new TextField();
		Label lblDescription = new Label("Course Description:");
		TextArea txtarea = new TextArea();
		Label lblcredits = new Label("Credits");
		TextField tfcredits = new TextField();
		Label lbltextbook = new Label("TextBooks:");
		TextField tftextbook = new TextField();
		
		GP.add(lblcourseNumber, 0, 0);
		GP.add(tfcourseNumber, 1, 0);
		GP.add(lblcourseTitle, 0, 1);
		GP.add(tfcourseTitle, 1, 1);
		GP.add(lblcredits, 0, 2);
		GP.add(tfcredits, 1, 2);
		GP.add(lbltextbook, 0, 3);
		GP.add(tftextbook, 1, 3);
		GP.add(lblDescription, 0, 4);
		
		
		Button btnSave = new Button("Save");
		btnSave.setOnAction(event ->{
			ArrayList<String> T = new ArrayList<String>();
			String[] textbooks = tftextbook.getText().split(",");

			try {
				if(Double.parseDouble(tfcredits.getText()) > 4.0 || Double.parseDouble(tfcredits.getText()) < 0.0){
					tfcredits.setText("Number Invalid");
				}
				else{
					for(String h: textbooks){
						T.add(h);
					}
					Course c = new Course(tfcourseNumber.getText(), tfcourseTitle.getText(), txtarea.getText(), Double.parseDouble(tfcredits.getText()), T);
					System.out.println("Inserted Course: \t" + c.getCourseNumber());
					Main.mastercoursebag.insert(c);
					
				}
			} catch (NumberFormatException e) {
				System.out.println("Credits invalid number: ");
			} 
			
			
			
			
		});
		
		vbox.getChildren().addAll(GP,txtarea);
		
		Pane.setCenter(vbox);
		Pane.setBottom(btnSave);
		BorderPane.setAlignment(btnSave, Pos.BOTTOM_RIGHT);
		return Pane;
	}
	
	
	private Node deletePerson(){
		HBox hbID = new HBox();
		hbID.setSpacing(5);
		
		Label lblID = new Label("Enter ID");
		//lblID.setTextFill(Color.WHITE);
		
		TextField tfID = new TextField();
		
		Button buttonSearch = new Button("Delete");
		buttonSearch.setOnAction(event -> {
			if (tfID.getText() != null){
				if (Main.bodybag.searchById(tfID.getText()) != null){
					Main.bodybag.delete(Main.bodybag.selectPerson(tfID.getText()));
				}else{
					System.out.println("Person not in bodybag.");
				}
			}
			
        });
		
		hbID.getChildren().addAll(lblID, tfID , buttonSearch);
		
		hbID.setAlignment(Pos.BASELINE_CENTER);
		
		return hbID;
	}
	
	private Node updatePerson(){
		HBox hbID = new HBox();
		hbID.setSpacing(5);
		
		Label lblID = new Label("Enter ID");
		//lblID.setTextFill(Color.WHITE);
		
		TextField tfID = new TextField();
		
		Button buttonSearch = new Button("Delete");
		buttonSearch.setOnAction(event -> {
			if (tfID.getText() != null){
				if (Main.bodybag.searchById(tfID.getText()) != null){
					Main.bodybag.delete(Main.bodybag.selectPerson(tfID.getText()));
				}else{
					System.out.println("Person not in bodybag.");
				}
			}
			
        });
		
		hbID.getChildren().addAll(lblID, tfID , buttonSearch);
		
		hbID.setAlignment(Pos.BASELINE_CENTER);
		
		return hbID;
	}

	private Node deleteCourse(){
		HBox hbID = new HBox();
		hbID.setSpacing(5);
		
		Label lblID = new Label("Enter Course Number");
		//lblID.setTextFill(Color.WHITE);
		
		TextField tfID = new TextField();
		
		Button buttonSearch = new Button("Delete");
		buttonSearch.setOnAction(event -> {
			if (tfID.getText() != null){
				if (Main.mastercoursebag.searchByCourseNumber(tfID.getText()) != null){
					Main.mastercoursebag.delete(Main.mastercoursebag.searchByCourseNumber(tfID.getText()));
				}else{
					System.out.println("Course not in Coursebag.");
				}
			}
			
        });
		
		hbID.getChildren().addAll(lblID, tfID , buttonSearch);
		
		hbID.setAlignment(Pos.BASELINE_CENTER);
		
		return hbID;
	}

	private Node deleteTextbook(){
		HBox hbID = new HBox();
		hbID.setSpacing(5);
		
		Label lblID = new Label("Enter Textbook ISBN");
		//lblID.setTextFill(Color.WHITE);
		
		TextField tfID = new TextField();
		
		Button buttonSearch = new Button("Delete");
		buttonSearch.setOnAction(event -> {
			if (tfID.getText() != null){
				if (Main.bookbag.searchByBookISBN(tfID.getText()) != null){
					Main.bookbag.delete(Main.bookbag.searchByBookISBN(tfID.getText()));
				}else{
					System.out.println("Textbook not in BookBag.");
				}
			}
			
        });
		
		hbID.getChildren().addAll(lblID, tfID , buttonSearch);
		
		hbID.setAlignment(Pos.BASELINE_CENTER);
		
		return hbID;
	}
	
	
	
	
	
	private Node searchTextbook(){
		HBox hbSearch = new HBox();
		hbSearch.setSpacing(5);
		
		Label lblISBN = new Label("Enter ISBN");
		//lblID.setTextFill(Color.WHITE);
		
		TextField tfISBN= new TextField();
		
		Button buttonSearch = new Button("Search");
		buttonSearch.setOnAction(event -> {
			if ((tfISBN.getText()) != null){
				if(Main.bookbag.searchByBookISBN(tfISBN.getText()) != null){
					bpViewBox.setCenter(showTextbook(Main.bookbag.searchByBookISBN(tfISBN.getText())));
				}
				else{
					tfISBN.setText("Invalid ISBN and/or ISBN not in database.");
				}
			}
        });
		
		hbSearch.getChildren().addAll(lblISBN, tfISBN , buttonSearch);
		
		hbSearch.setAlignment(Pos.BASELINE_CENTER);
		
		return hbSearch;
	}
	private Node showTextbook(Textbook T){
		BorderPane node = new BorderPane();
		node.setPadding(new Insets(5,5,5,5));
		//Textbook(String bookISBN, String bookTitle, ArrayList<String> bookAuthors, double bookPrice)
		Label lblCourseNumber = new Label("ISBN: " + T.getBookISBN());
		Label lblTitle = new Label("Title: " + T.getBookTitle());
		Label lblAuthors = new Label("Authors: " + T.getBookAuthors().toString().substring(1,T.getBookAuthors().toString().length()-2));
		Label lblPrice = new Label("Price: " + T.getBookPrice());
		
		VBox VBox = new VBox();
		VBox.getChildren().addAll(lblCourseNumber,lblTitle, lblAuthors, lblPrice);
		
		
		node.setCenter(VBox);
		
		
		return node;
		
	}
	
	
	private Node importFiles(){
		GridPane Pane = new GridPane();
		Pane.setVgap(5);
		Pane.setHgap(5);
		
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Resource File");
		
		Label lblimportStudent = new Label("Import Student File");
		Label lblimportFaculty = new Label("Import Faculty File");
		Label lblimportTextbook = new Label("Import Textbook File");
		Label lblimportCourse = new Label("Import Course File");
		
		TextField tfimportStudent = new TextField();
		tfimportStudent.setDisable(true);
		TextField tfimportFaculty = new TextField();
		tfimportFaculty.setDisable(true);
		TextField tfimportTextbook = new TextField();
		tfimportTextbook.setDisable(true);
		TextField tfimportCourse = new TextField();
		tfimportCourse.setDisable(true);
		
		Button btnstudent = new Button("Select");
		Button btnfaculty = new Button("Select");
		Button btntextbook = new Button("Select");;
		Button btncourse = new Button("Select");
		
		Button btnstudent_Import = new Button("Import");
		Button btnfaculty_Import = new Button("Import");
		Button btntextbook_Import = new Button("Import");
		Button btncourse_Import = new Button("Import");
		
		btnstudent.setOnAction(event ->{
			File file = fileChooser.showOpenDialog(null);
			if(file != null){
				tfimportStudent.setText(file.getAbsolutePath());
			}
		});
		btnfaculty.setOnAction(event ->{
			File file = fileChooser.showOpenDialog(null);
			if(file != null){
				tfimportFaculty.setText(file.getAbsolutePath());
			}
		});
		btntextbook.setOnAction(event ->{
			File file = fileChooser.showOpenDialog(null);
			if(file != null){
				tfimportTextbook.setText(file.getAbsolutePath());
			}
		});
		btncourse.setOnAction(event ->{
			File file = fileChooser.showOpenDialog(null);
			if(file != null){
				tfimportCourse.setText(file.getAbsolutePath());
			}
		});
		
		
		btnstudent_Import.setOnAction(event ->{
			Main.bodybag.importStudentFile(tfimportStudent.getText());
		});
		btnfaculty_Import.setOnAction(event ->{
			Main.bodybag.importFacultyFile(tfimportFaculty.getText());
		});
		btntextbook_Import.setOnAction(event ->{
			Main.bookbag.importBodyBag(tfimportTextbook.getText());
		});
		btncourse_Import.setOnAction(event ->{
			Main.mastercoursebag.importCourseBag(tfimportCourse.getText());
		});
		
		
		Pane.add(lblimportStudent, 0, 0);
		Pane.add(tfimportStudent, 1, 0);
		Pane.add(btnstudent, 2, 0);
		Pane.add(btnstudent_Import, 3, 0);
		
		Pane.add(lblimportFaculty, 0, 1);
		Pane.add(tfimportFaculty, 1, 1);
		Pane.add(btnfaculty, 2, 1);
		Pane.add(btnfaculty_Import, 3, 1);
		
		Pane.add(lblimportTextbook, 0, 2);
		Pane.add(tfimportTextbook, 1, 2);
		Pane.add(btntextbook, 2, 2);
		Pane.add(btntextbook_Import, 3, 2);
		
		Pane.add(lblimportCourse, 0, 3);
		Pane.add(tfimportCourse, 1, 3);
		Pane.add(btncourse, 2, 3);
		Pane.add(btncourse_Import, 3, 3);
		
		
		bpViewBox.setCenter(Pane);
		return Pane;
	}
	
	private Node exportFiles(){
		GridPane Pane = new GridPane();
		Pane.setVgap(5);
		Pane.setHgap(5);
		
		
		FileChooser fileChooser = new FileChooser();			
		fileChooser.setTitle("Open Resource File");
		
		Label lblexportStudent = new Label("Export Student File");
		Label lblexportFaculty = new Label("Export Faculty File");
		Label lblexportTextbook = new Label("Export Textbook File");
		Label lblexportCourse = new Label("Export Course File");
		
		TextField tfexportStudent = new TextField();
		tfexportStudent.setDisable(true);
		TextField tfexportFaculty = new TextField();
		tfexportFaculty.setDisable(true);
		TextField tfexportTextbook = new TextField();
		tfexportTextbook.setDisable(true);
		TextField tfexportCourse = new TextField();
		tfexportCourse.setDisable(true);
		
		Button btnstudent_export = new Button("Export");
		Button btnfaculty_export = new Button("Export");
		Button btntextbook_export = new Button("Export");
		Button btncourse_export = new Button("Export");
		
		btnstudent_export.setOnAction(event ->{
			File file = fileChooser.showSaveDialog(null);
			if(file != null){
				Main.bodybag.exportStudentFile(file.getAbsolutePath() + ".txt");
			}
		});
		btnfaculty_export.setOnAction(event ->{
			File file = fileChooser.showSaveDialog(null);
			if(file != null){
				//******
			}
		});
		btntextbook_export.setOnAction(event ->{
			File file = fileChooser.showSaveDialog(null);
			if(file != null){
				Main.bookbag.exportBookBag(file.getAbsolutePath() + ".txt");;
			}
		});
		btncourse_export.setOnAction(event ->{
			File file = fileChooser.showSaveDialog(null);
			if(file != null){
				Main.mastercoursebag.exportCourseBag(file.getAbsolutePath() + ".txt");
			}
		});
		
		
		Pane.add(lblexportStudent, 0, 0);
		Pane.add(tfexportStudent, 1, 0);
		Pane.add(btnstudent_export, 2, 0);
		
		Pane.add(lblexportFaculty, 0, 1);
		Pane.add(tfexportFaculty, 1, 1);
		Pane.add(btnfaculty_export, 2, 1);
		
		Pane.add(lblexportTextbook, 0, 2);
		Pane.add(tfexportTextbook, 1, 2);
		Pane.add(btntextbook_export, 2, 2);
		
		Pane.add(lblexportCourse, 0, 3);
		Pane.add(tfexportCourse, 1, 3);
		Pane.add(btncourse_export, 2, 3);
		
		
		bpViewBox.setCenter(Pane);
		return Pane;
	}
	
}
