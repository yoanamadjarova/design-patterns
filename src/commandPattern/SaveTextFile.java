package commandPattern;

public class SaveTextFile implements TextFileOperation {

	@Override
	public String execute() {
		
     return textFile.save();
		
	}

}
