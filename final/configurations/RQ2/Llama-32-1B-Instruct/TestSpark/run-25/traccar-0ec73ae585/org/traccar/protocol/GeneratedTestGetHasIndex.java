package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestGetHasIndex {

    @Test
    public void testGetHasIndex() throws Exception {
        // Arrange
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        // Act
        boolean hasIndex = decoder.getHasIndex();

        // Assert
        assertTrue(hasIndex);
    }

}