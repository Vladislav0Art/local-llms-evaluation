package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;

import static org.mockito.Mockito.mock;

public class GeneratedManufacturerTest {

    @Test
    public void manufacturerTest() {
        // Arrange
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(null);

        // Act
        String actual = watchProtocolDecoder.getManufacturer();

        // Assert
        Assert.assertNull(actual);
    }

}