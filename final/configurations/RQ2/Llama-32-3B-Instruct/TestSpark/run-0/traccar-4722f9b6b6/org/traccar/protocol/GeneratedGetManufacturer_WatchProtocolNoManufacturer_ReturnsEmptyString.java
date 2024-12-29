package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class GeneratedGetManufacturer_WatchProtocolNoManufacturer_ReturnsEmptyString {

    @Test
    public void getManufacturer_WatchProtocolNoManufacturer_ReturnsEmptyString() throws Exception {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.NO_MANUFACTURER);

        // Act and Assert
        assertEquals("", decoder.getManufacturer());
    }

}