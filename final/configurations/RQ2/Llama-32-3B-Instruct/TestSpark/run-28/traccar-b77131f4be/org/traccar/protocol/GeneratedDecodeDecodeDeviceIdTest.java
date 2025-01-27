package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.model.Position;

import java.util.Date;

public class GeneratedDecodeDecodeDeviceIdTest {

    @Test
    public void decodeDecodeDeviceIdTest() throws Exception {
        // Arrange
        DeviceSession deviceSession = new DeviceSession();
        Protocol protocol = new Protocol("Galileo");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Object message = new Object();
        Channel channel = null;
        SocketAddress remoteAddress = null;

        byte[] messageBytes1 = "Device Id".getBytes(StandardCharsets.UTF_8);
        message = Unpooled.copiedBuffer(messageBytes1).wrap().byteSource().array();

        // Act
        String decodedDeviceId = (String) decoder.decode(channel, remoteAddress, message);

        // Assert
        assertNotNull(decodedDeviceId);
    }

}