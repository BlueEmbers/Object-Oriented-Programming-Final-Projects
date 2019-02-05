package college.view;

import javafx.application.Platform;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class RootPane {
	private BorderPane rootPane;
	private MenuBarPane menuBarPane;
	private MenuBar menuBar;

	public RootPane() {
		rootPane = new BorderPane();
		menuBarPane = new MenuBarPane();
		menuBar = menuBarPane.getMenuBar();
		rootPane.setTop(menuBar);
		buildMenuBarEventHandlers();

	}

	public void buildMenuBarEventHandlers() {
		buildFileMenuEventHandlers();
		buildStudentMenuEventHandlers();
		buildFacultyMenuEventHandlers();
		buildCourseMenuEventHandlers();
		buildClassroomMenuEventHandlers();
		buildTextbookMenuEventHandlers();
	}

	public void buildStudentMenuEventHandlers() {
		StudentPane studentPane = new StudentPane();
		Pane studentCenterPane = studentPane.getStudentPane();
		studentPane.getButtonBox().getChildren().removeAll();
		menuBarPane.getInsertStudentMenuItem().setOnAction(e -> {
			studentPane.getButtonBox().getChildren().add(studentPane.getInsertBtn());
			rootPane.setCenter(studentCenterPane);
		});

		menuBarPane.getSearchStudentMenuItem().setOnAction(e -> {
			studentPane.getButtonBox().getChildren().add(studentPane.getSearchBtn());
			rootPane.setCenter(studentCenterPane);
		});

		menuBarPane.getRemoveStudentMenuItem().setOnAction(e -> {
			studentPane.getButtonBox().getChildren().add(studentPane.getRemoveBtn());
			rootPane.setCenter(studentCenterPane);
		});

		menuBarPane.getUpdateStudentMenuItem().setOnAction(e -> {
			studentPane.getButtonBox().getChildren().add(studentPane.getUpdateBtn());
			rootPane.setCenter(studentCenterPane);
		});

	}

	public void buildFacultyMenuEventHandlers() {

		menuBarPane.getInsertFacultyMenuItem().setOnAction(e -> {
			FacultyPane facultyPane = new FacultyPane();
			Pane facultyCenterPane = facultyPane.getFacultyPane();
			facultyPane.getButtonBox().getChildren().removeAll();
			facultyPane.getButtonBox().getChildren().add(facultyPane.getInsertBtn());
			rootPane.setCenter(facultyCenterPane);
		});

		menuBarPane.getSearchFacultyMenuItem().setOnAction(e -> {
			FacultyPane facultyPane = new FacultyPane();
			Pane facultyCenterPane = facultyPane.getFacultyPane();
			facultyPane.getButtonBox().getChildren().removeAll();
			facultyPane.getButtonBox().getChildren().add(facultyPane.getSearchBtn());
			rootPane.setCenter(facultyCenterPane);
		});

		menuBarPane.getRemoveFacultyMenuItem().setOnAction(e -> {
			FacultyPane facultyPane = new FacultyPane();
			Pane facultyCenterPane = facultyPane.getFacultyPane();
			facultyPane.getButtonBox().getChildren().removeAll();
			facultyPane.getButtonBox().getChildren().add(facultyPane.getRemoveBtn());
			rootPane.setCenter(facultyCenterPane);
		});

		menuBarPane.getUpdateFacultyMenuItem().setOnAction(e -> {
			FacultyPane facultyPane = new FacultyPane();
			Pane facultyCenterPane = facultyPane.getFacultyPane();
			facultyPane.getButtonBox().getChildren().removeAll();
			facultyPane.getButtonBox().getChildren().add(facultyPane.getUpdateBtn());
			rootPane.setCenter(facultyCenterPane);
		});

	}

	public void buildCourseMenuEventHandlers() {
		menuBarPane.getInsertCourseMenuItem().setOnAction(e -> {
			CoursePane coursePane = new CoursePane();
			Pane courseCenterPane = coursePane.getCoursePane();
			coursePane.getButtonBox().getChildren().removeAll();
			coursePane.getButtonBox().getChildren().add(coursePane.getInsertBtn());
			rootPane.setCenter(courseCenterPane);
		});

		menuBarPane.getSearchCourseMenuItem().setOnAction(e -> {
			CoursePane coursePane = new CoursePane();
			Pane courseCenterPane = coursePane.getCoursePane();
			coursePane.getButtonBox().getChildren().removeAll();
			coursePane.getButtonBox().getChildren().add(coursePane.getSearchBtn());
			rootPane.setCenter(courseCenterPane);
		});

		menuBarPane.getRemoveCourseMenuItem().setOnAction(e -> {
			CoursePane coursePane = new CoursePane();
			Pane courseCenterPane = coursePane.getCoursePane();
			coursePane.getButtonBox().getChildren().removeAll();
			coursePane.getButtonBox().getChildren().add(coursePane.getRemoveBtn());
			rootPane.setCenter(courseCenterPane);
		});

		menuBarPane.getUpdateCourseMenuItem().setOnAction(e -> {
			CoursePane coursePane = new CoursePane();
			Pane courseCenterPane = coursePane.getCoursePane();
			coursePane.getButtonBox().getChildren().removeAll();
			coursePane.getButtonBox().getChildren().add(coursePane.getUpdateBtn());
			rootPane.setCenter(courseCenterPane);
		});

	}

	public void buildClassroomMenuEventHandlers() {
		menuBarPane.getInsertClassroomMenuItem().setOnAction(e -> {
			System.out.println("Insert classroom code");
		});

		menuBarPane.getSearchClassroomMenuItem().setOnAction(e -> {
			System.out.println("Search classroom code");
		});

		menuBarPane.getRemoveClassroomMenuItem().setOnAction(e -> {
			System.out.println("Remove classroom code");
		});

		menuBarPane.getUpdateClassroomMenuItem().setOnAction(e -> {
			System.out.println("Update classroom code");
		});
	}

	public void buildTextbookMenuEventHandlers() {
		menuBarPane.getInsertTextbookMenuItem().setOnAction(e -> {
			System.out.println("Insert textbook code");
		});

		menuBarPane.getSearchTextbookMenuItem().setOnAction(e -> {
			System.out.println("Search textbook code");
		});

		menuBarPane.getRemoveTextbookMenuItem().setOnAction(e -> {
			System.out.println("Remove textbook code");
		});

		menuBarPane.getUpdateTextbookMenuItem().setOnAction(e -> {
			System.out.println("Update textbook code");
		});

	}

	public void buildFileMenuEventHandlers() {
		buildExitMenuItemHandler();
		buildSaveMenuItemHandler();
		buildLoadMenuItemHandler();
		buildImportStudentMenuItemHandler();
		buildExportStudentMenuItemHandler();
		buildImportFacultyMenuItemHandler();
		buildExportFacultyMenuItemHandler();
		buildImportCourseMenuItemHandler();
		buildExportCourseMenuItemHandler();
		buildImportClassroomMenuItemHandler();
		buildExportClassroomMenuItemHandler();
		buildImportTextbookMenuItemHandler();
		buildExportTextbookMenuItemHandler();
	}

	public Pane getRootPane() {
		return rootPane;
	}

	public void buildExitMenuItemHandler() {
		menuBarPane.getExitMenuItem().setOnAction(e -> {
			Platform.exit();
			System.exit(0);
		});
	}

	public void buildSaveMenuItemHandler() {
		menuBarPane.getSaveMenuItem().setOnAction(e -> {
			System.out.println("save code here");
		});
	}

	public void buildLoadMenuItemHandler() {
		menuBarPane.getLoadMenuItem().setOnAction(e -> {
			System.out.println("load code here");
		});
	}

	public void buildImportStudentMenuItemHandler() {
		menuBarPane.getImportStudentMenuItem().setOnAction(e -> {
			System.out.println("import student text file code here");
		});
	}

	public void buildExportStudentMenuItemHandler() {
		menuBarPane.getExportStudentMenuItem().setOnAction(e -> {
			System.out.println("export student text file code here");
		});
	}

	public void buildImportFacultyMenuItemHandler() {
		menuBarPane.getImportFacultyMenuItem().setOnAction(e -> {
			System.out.println("import faculty text file code here");
		});
	}

	public void buildExportFacultyMenuItemHandler() {
		menuBarPane.getExportFacultyMenuItem().setOnAction(e -> {
			System.out.println("export faculty text file code here");
		});
	}

	public void buildImportCourseMenuItemHandler() {
		menuBarPane.getImportCourseMenuItem().setOnAction(e -> {
			System.out.println("import course text file code here");
		});
	}

	public void buildExportCourseMenuItemHandler() {
		menuBarPane.getExportCourseMenuItem().setOnAction(e -> {
			System.out.println("export course text file code here");
		});
	}

	public void buildImportClassroomMenuItemHandler() {
		menuBarPane.getImportClassroomMenuItem().setOnAction(e -> {
			System.out.println("import classroom text file code here");
		});
	}

	public void buildExportClassroomMenuItemHandler() {
		menuBarPane.getExportClassroomMenuItem().setOnAction(e -> {
			System.out.println("export classroom text file code here");
		});
	}

	public void buildImportTextbookMenuItemHandler() {
		menuBarPane.getImportTextbookMenuItem().setOnAction(e -> {
			System.out.println("import textbook text file code here");
		});
	}

	public void buildExportTextbookMenuItemHandler() {
		menuBarPane.getExportTextbookMenuItem().setOnAction(e -> {
			System.out.println("export textbook text file code here");
		});
	}

}
