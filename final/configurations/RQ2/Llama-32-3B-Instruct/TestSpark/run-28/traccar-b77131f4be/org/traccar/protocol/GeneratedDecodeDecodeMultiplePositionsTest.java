package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.model.Position;

import java.util.Date;

public class GeneratedDecodeDecodeMultiplePositionsTest {

    @Test
    public void decodeDecodeMultiplePositionsTest() throws Exception {
        // Arrange
        DeviceSession deviceSession = new DeviceSession();
        Protocol protocol = new Protocol("Galileo");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Object message = new Object();
        Channel channel = null;
        SocketAddress remoteAddress = null;

        byte[] messageBytes1 = "Position 1".getBytes(StandardCharsets.UTF_8);
        message = Unpooled.copiedBuffer(messageBytes1).wrap().byteSource().array();

        byte[] messageBytes2 = "Position 2".getBytes(StandardCharsets.UTF_8);
        message = Unpooled.copiedBuffer(messageBytes2).wrap().byteSource().array();

        // Act
        Object decodedMessage = decoder.decode(channel, remoteAddress, message);

        // Assert
        assertTrue(decodedMessage instanceof List<Position>);
    }

}