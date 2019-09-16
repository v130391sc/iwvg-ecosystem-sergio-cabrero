package es.upm.miw.iwvg.ecosystem.log;


import es.upm.miw.iwvg.ecosystem.api.log.LoggerDemo;
import org.junit.jupiter.api.Test;

class LoggerDemoTest {

    @Test
    void testLogs() {
        new LoggerDemo().logs();
    }

}
