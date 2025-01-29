package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() throws Exception {
        // Arrange
        Protocol protocol = Mockito.mock(Protocol.class);
        DeviceSession device = Mockito.mock(DeviceSession.class);
        Mockito.when(device.getManufacturer()).thenReturn("TRACCAR");

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        // Act
        String manufacturer = decoder.getManufacturer();

        // Assert
        assertEquals("TRACCAR", manufacturer);
    }

}