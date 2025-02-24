package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testGetHasIndex() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);

        // Act
        boolean hasIndex = decoder.getHasIndex();

        // Assert
        assertTrue(hasIndex);
    }

    @Test
    public void testGetManufacturer() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);

        // Act
        String manufacturer = decoder.getManufacturer();

        // Assert
        assertEquals("Watch", manufacturer);
    }

    @Test
    public void testDecode() throws Exception {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        // Act
        Object decoded = decoder.decode(channel, remoteAddress, msg);

        // Assert
        assertNull(decoded);
    }

}