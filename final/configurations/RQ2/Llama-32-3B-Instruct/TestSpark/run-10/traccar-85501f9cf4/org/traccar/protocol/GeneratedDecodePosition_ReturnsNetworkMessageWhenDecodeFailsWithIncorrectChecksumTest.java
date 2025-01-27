package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDecodePosition_ReturnsNetworkMessageWhenDecodeFailsWithIncorrectChecksumTest {

    @Test
    public void decodePosition_ReturnsNetworkMessageWhenDecodeFailsWithIncorrectChecksumTest() {
        // Arrange
        Object msg = new NetworkMessage();
        Channel channel = null;
        SocketAddress remoteAddress = null;

        // Act and Assert
        assertEquals(null, Gt06ProtocolDecoder.decode(channel, remoteAddress, msg));
    }

}