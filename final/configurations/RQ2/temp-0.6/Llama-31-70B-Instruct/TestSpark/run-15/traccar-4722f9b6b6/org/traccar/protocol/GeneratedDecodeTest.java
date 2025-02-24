package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;

import static org.mockito.Mockito.mock;

public class GeneratedDecodeTest {

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

}