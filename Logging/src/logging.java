import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;



public class logging {

	

	Logger logger = Logger.getLogger("test");
	FileHandler fh = null;

	

	public logging(){

		

	try {

	    fh = new FileHandler("C:\\Users\\Ross\\Desktop\\mylog.txt");

	    

	}catch(Exception e){System.out.println(e); }

	

	

		// Send logger output to our FileHandler.

        logger.addHandler(fh);

        // Request that every detail gets logged.

        logger.setLevel(Level.ALL);

        // Log a simple INFO message.

        logger.info("Processing Log");

        try {

           

        	//
	

        } catch (Error ex) {

            logger.log(Level.WARNING, "trouble sneezing", ex);

        }

        

        logger.fine("done");

            

	}

	

	public static void main(String[]args){

		new logging();

	}

}

