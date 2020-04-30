package commandPattern;

public class OpenTextFile implements TextFileOperation {

	private TextFile textFile;
	@Override
	public String execute() {
		
		return textFile.open();
	}

}
