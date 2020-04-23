import java.util.Date;
import java.util.List;

public abstract class IFile {
	String name;
	private Date date;
	FileTypes fileType;
	 List<Directory> path;
	public IFile(Date date, String name) {
		this.name = name;
		this.date = date;
	}
	String getName() {
		return this.name;
	}
	abstract boolean rename(String rename);
	List<Directory> getPath() {
		return path;
	}
}
