package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;

import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void decodeTest() throws Exception {
        // Arrange
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(null);
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = null;

        // Act
        Object actual = watchProtocolDecoder.decode(channel, remoteAddress, msg);

        // Assert
        Assert.assertNull(actual);
    }

    @Test
    public void hasIndexTest() {
        // Arrange
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(null);

        // Act
        boolean actual = watchProtocolDecoder.getHasIndex();

        // Assert
        Assert.assertFalse(actual);
    }

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