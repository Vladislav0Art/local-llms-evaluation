package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;

import static org.mockito.Mockito.mock;

public class GeneratedHasIndexTest {

    @Test
    public void hasIndexTest() {
        // Arrange
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(null);

        // Act
        boolean actual = watchProtocolDecoder.getHasIndex();

        // Assert
        Assert.assertFalse(actual);
    }

}