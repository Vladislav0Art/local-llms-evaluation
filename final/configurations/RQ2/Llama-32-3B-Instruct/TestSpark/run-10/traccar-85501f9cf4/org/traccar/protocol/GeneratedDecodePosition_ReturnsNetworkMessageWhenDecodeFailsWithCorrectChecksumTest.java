package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDecodePosition_ReturnsNetworkMessageWhenDecodeFailsWithCorrectChecksumTest {

    @Test
    public void decodePosition_ReturnsNetworkMessageWhenDecodeFailsWithCorrectChecksumTest() {
        // Arrange
        Object msg = new NetworkMessage();
        Channel channel = null;
        SocketAddress remoteAddress = null;

        // Act and Assert
        NetworkMessage expected = new NetworkMessage(0, "message", 100);
        assertEquals(expected, Gt06ProtocolDecoder.decode(channel, remoteAddress, msg));
    }

}