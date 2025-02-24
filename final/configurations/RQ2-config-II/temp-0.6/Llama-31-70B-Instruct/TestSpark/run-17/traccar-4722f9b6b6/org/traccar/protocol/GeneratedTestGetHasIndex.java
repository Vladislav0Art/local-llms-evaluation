package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;

import java.net.SocketAddress;

public class GeneratedTestGetHasIndex {

    @Test
    public void testGetHasIndex() {
        // Arrange
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol());

        // Act
        boolean hasIndex = watchProtocolDecoder.getHasIndex();

        // Assert
        assertEquals(true, hasIndex);
    }

}