package lesson29;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginDemo {
	private static final Logger log = LogManager.getLogger(LoginDemo.class);

	public static void main(String[] args) {
		log.debug("Starting the application");

		log.info("Running the for loop");

		for (int i = 0; i < 10; i++) {
			log.error("iteration: " + i);

		}
		log.debug("Finished for loop");

		log.debug("Closing the application successfully  ");

	}

}
