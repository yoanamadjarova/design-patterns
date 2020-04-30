package commandPattern;

public class CloseSublimeText implements Command {

	private SublimeText sublimeText;
	 
	  public CloseSublimeText( SublimeText sublimeText )
	  {
	    this.sublimeText = sublimeText;
	  }
	 
	  @Override
	  public void execute()
	  {
	    sublimeText.close();
	  }
	}
	


