package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class GeneratedGetManufacturer_WatchProtocolManufacturer_ReturnsCorrectData {

    @Test
    public void getManufacturer_WatchProtocolManufacturer_ReturnsCorrectData() throws Exception {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        // Act and Assert
        assertEquals("Watch", decoder.getManufacturer());
    }

}