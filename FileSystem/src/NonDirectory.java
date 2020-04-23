import java.util.Date;

public class NonDirectory extends IFile {
	public NonDirectory(Date date, String name) {
		super(date, name);
		// TODO Auto-generated constructor stub
	}
	@Override
	boolean rename(String rename) {
		this.name = rename;
		return false;
	}

}
