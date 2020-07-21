
	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;

	public class task5
	{
		private static final Logger LOGGER=LogManager.getLogger(App.class);
		
		public float simpleinterest(int P,int T,int R) 
		{
			LOGGER.debug("Calculating Simple Interest for the given data");
			  return (P*T*R/100);
	    }
		  public float compoundinterest(float P,float  R,float n,float t)

		{
			  LOGGER.debug("Calculating Compound Interest for the given data");
			 return (float) (P*Math.pow((1+R/n),n*t));

		}
}
