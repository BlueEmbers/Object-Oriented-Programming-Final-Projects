package backend;

public class BagCollege {
	private BagMasterCourse courseMasterBag;
	private BagPeople peopleBag;
	private BagTextBook textbookBag;
	
	public BagCollege() {
		super();
		courseMasterBag = new BagMasterCourse(50);
		peopleBag = new BagPeople(50);
		textbookBag = new BagTextBook(50);
		//load();
	}

	public BagMasterCourse getCourseMasterBag() {
		return courseMasterBag;
	}

	public void setCourseMasterBag(BagMasterCourse courseMasterBag) {
		this.courseMasterBag = courseMasterBag;
	}

	public BagPeople getPeopleBag() {
		return peopleBag;
	}

	public void setPeopleBag(BagPeople peopleBag) {
		this.peopleBag = peopleBag;
	}

	public BagTextBook getTextbookBag() {
		return textbookBag;
	}

	public void setTextbookBag(BagTextBook textbookBag) {
		this.textbookBag = textbookBag;
	}
	
	public void save() {
		courseMasterBag.save();
		peopleBag.save();
		textbookBag.save();
	}
	
	public void load(){
		courseMasterBag.load();
		peopleBag.load();
		textbookBag.load();
	}
	
}
