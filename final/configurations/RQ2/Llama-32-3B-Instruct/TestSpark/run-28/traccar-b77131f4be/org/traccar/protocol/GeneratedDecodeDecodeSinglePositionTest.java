package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.model.Position;

import java.util.Date;

public class GeneratedDecodeDecodeSinglePositionTest {

    @Test
    public void decodeDecodeSinglePositionTest() throws Exception {
        // Arrange
        DeviceSession deviceSession = new DeviceSession();
        Protocol protocol = new Protocol("Galileo");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Object message = new Object();
        Channel channel = null;
        SocketAddress remoteAddress = null;

        byte[] messageBytes = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        message = Unpooled.copiedBuffer(messageBytes).wrap().byteSource().array();

        // Act
        Object decodedMessage = decoder.decode(channel, remoteAddress, message);

        // Assert
        assertTrue(decodedMessage instanceof Position);
    }

}