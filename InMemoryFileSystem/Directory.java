
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Directory extends IFile  {
	List<IFile> allFiles;
	List<Directory> path;
	
	public Directory(String name) {
		super(new Date(), name);
		allFiles = new ArrayList<IFile>();
	}

	@Override
	boolean rename(String rename) {
		this.name = rename;
		return true;
	}
	@Override
	List<Directory> getPath() {
		return path;
	}
	boolean addFile(IFile ifile) {
		allFiles.add(ifile);
		return true;
	}
	
	IFile findFile(IFile file) {
		/*
		 * Match the name and get the File
		 */
		return null;
	}

}
