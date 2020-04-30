package commandPattern;

import java.awt.List;
import java.util.ArrayList;

public class TextFileOperationExecutor {
	
	private final List<TextFileOperation> textFileOperations = new ArrayList<>();
	public String executeOperation(TextFileOperation textFileOperation) {
        textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
        
        TextFileOperationExecutor textFileOperationExecutor
        = new TextFileOperationExecutor();
       textFileOperationExecutor.executeOperation(() -> "Opening file file1.txt");
       textFileOperationExecutor.executeOperation(() -> "Saving file file1.txt");
        
	
}
}
