package org.traccar.protocol;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void getHasIndexTest() {
        // Arrange
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(null);

        // Act
        boolean hasIndex = watchProtocolDecoder.getHasIndex();

        // Assert
        assertEquals(false, hasIndex);
    }

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