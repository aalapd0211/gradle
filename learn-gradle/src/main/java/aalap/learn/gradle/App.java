/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package aalap.learn.gradle;

import org.apache.log4j.Logger;

public class App {
	private static final Logger LOG = Logger.getLogger(App.class);
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
    	LOG.info("C:\\Users\\adesai\\AALAP-Learning-example\\gradle\\learn-gradle");
    	LOG.info(new App().getGreeting());
    }
}
