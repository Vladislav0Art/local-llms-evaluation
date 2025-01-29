package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGetLoggerInstance {

    @Test
    public void testGetLoggerInstance() {
        LoggerFactory loggerFactory = LoggerFactory.getLogger(Main.class);
        assertNotNull(loggerFactory.getLogger());
    }

}