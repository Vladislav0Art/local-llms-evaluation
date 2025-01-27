package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedGetManufacturer_WatchMessageValidReturnsString {

    @Test
    public void getManufacturer_WatchMessageValidReturnsString() throws Exception {
        // Given:
        WatchMessage watchMessage = new WatchMessage();
        String manufacturer = "test";

        // When:
        watchMessage.setManufacturer(manufacturer);
        String result = WatchProtocolDecoder.getManufacturer();

        // Then:
        assertEquals(manufacturer, result);
    }

}