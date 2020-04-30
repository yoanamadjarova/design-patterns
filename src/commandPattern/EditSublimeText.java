package commandPattern;

public class EditSublimeText implements Command {

	private SublimeText sublimeText;
	 
	  public EditSublimeText( SublimeText sublimeText )
	  {
	    this.sublimeText = sublimeText;
	  }
	 
	  @Override
	  public void execute()
	  {
	    sublimeText.edit();
	  }
		
	}


