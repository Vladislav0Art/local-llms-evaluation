package org.traccar.protocol;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedGetManufacturerTest {

    @Test
    public void getManufacturerTest() {
        // Arrange
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(null);

        // Act
        String manufacturer = watchProtocolDecoder.getManufacturer();

        // Assert
        assertEquals("Watch", manufacturer);
    }

}