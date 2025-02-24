package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);

        // Act
        String manufacturer = decoder.getManufacturer();

        // Assert
        assertEquals("Watch", manufacturer);
    }

}