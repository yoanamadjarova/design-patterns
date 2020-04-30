package commandPattern;

public class CommandMain {

	    public static void main(String[] args) {
	    TextFileOperationExecutor textFileOperationExecutor
	      = new TextFileOperationExecutor();
	    textFileOperationExecutor.executeOperation(new OpenTextFile());
	    textFileOperationExecutor.executeOperation(new SaveTextFile());
}
}
