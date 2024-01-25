package lesson29;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggıngWıthLog4j2 {

	private static final Logger log = LogManager.getLogger(LoggıngWıthLog4j2.class);

	public static void main(String[] args) {

		// error levels Trace < Debug < Info < Warn < Error < Fatal
		log.trace("Trace message!");
		log.debug("Debug meddage!");
		log.info("Info meddage!");
		log.warn("Warn meddage!");
		log.error("Error message!");
		log.fatal("Fatal meddage!");

	}

}
