package org.traccar.protocol;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedGetHasIndexTest {

    @Test
    public void getHasIndexTest() {
        // Arrange
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(null);

        // Act
        boolean hasIndex = watchProtocolDecoder.getHasIndex();

        // Assert
        assertEquals(false, hasIndex);
    }

}