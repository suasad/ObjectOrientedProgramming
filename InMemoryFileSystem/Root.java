import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Root<E> extends IFile{
	Directory rootdir;
	private static Root root;
	private Root(Date date, String name) {
		super(date, name);
	}
	Root getInstance() {
		if(this.root == null) {
			this.root = new Root(new Date(), "root");
			this.fileType = FileTypes.ROOT;
			this.rootdir = new Directory("root");
		}
		return root;
	}
	@Override
	boolean rename(String rename) {
		System.out.println("Renaming root is not Possible");
		return false;
	}
	
	boolean createDirectory(List<Directory> directoryPath, String name) {
		Directory curr = rootdir;
		ListIterator<Directory> iter =  directoryPath.listIterator();
		while(iter.hasNext()) {
			curr = (Directory) curr.findFile(iter.next());
			if(curr == null) {
				/*
				 * If File not found
				 */
				return false;
			}
		}
		curr.addFile(new Directory(name));
		return true;
	}
	
	boolean moveFile(List<Directory> oldPath, List<Directory> newPath, IFile ifile) {
		/*
		 * This api move files
		 */
		return true;
	}
	
	boolean deleteFile(List<Directory> path, IFile file) {
		return true;
	}

}
