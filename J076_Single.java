package Java2;

public class J076_Single {
  private J076_Single() {	}
  
  private static J076_Single instance=null;
  public static J076_Single getInstance() {
	  if(instance==null) {
		  synchronized(J076_Single.class) {
			  if(instance==null) {
				  instance = new J076_Single();
			  }
		  }
	  }
	  return instance;
  }
}
