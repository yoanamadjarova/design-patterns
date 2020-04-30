package commandPattern;

public class CommandMain {
	   
		public static void main( String[] args )
		  {
			SublimeText sublimeText = new SublimeText();
		    Command openSublimeText = new OpenSublimeText(sublimeText);
		    Command editSublimeText = new EditSublimeText(sublimeText);
		    Command saveSublimeText = SaveSublimeText(sublimeText);
		    Command closeSublimeText = new CloseSublimeText(sublimeText);
		    Options option = new Options(openSublimeText,editSublimeText, saveSublimeText,closeSublimeText);
		    option.pressOpen();
		    option.pressEdit();
		    option.pressSave();
		    option.pressClose();
		  }
}
