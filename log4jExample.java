import org.apache.log4j.Logger;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class log4jExample{

   /* Get actual class name to be printed on */
   static Logger log = Logger.getLogger(log4jExample.class);
   
   public static void main(String[] args)throws IOException,SQLException{
      while(true)
      {
	try 
	{
	    Thread.sleep(1000);                 //1000 milliseconds is one second.
	} 
	catch(InterruptedException ex) 
	{
	    Thread.currentThread().interrupt();
	}
      	log.debug("Hello this is a debug message");
	log.info("Hello this is an info message");
      	log.fatal("Hello this is an fatal message");
      }
   }
}
