package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestGetHasIndex {

    @Test
    public void testGetHasIndex() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);

        // Act
        boolean hasIndex = decoder.getHasIndex();

        // Assert
        assertTrue(hasIndex);
    }

}