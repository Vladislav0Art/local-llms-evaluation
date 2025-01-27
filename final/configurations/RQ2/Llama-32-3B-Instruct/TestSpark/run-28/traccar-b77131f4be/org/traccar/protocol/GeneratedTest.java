package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.model.Position;

import java.util.Date;

public class GeneratedTest {

    @Test
    public void decodeBasicTest() throws Exception {
        // Arrange
        DeviceSession deviceSession = new DeviceSession();
        Protocol protocol = new Protocol("Galileo");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Object message = new Object();
        Channel channel = null;
        SocketAddress remoteAddress = null;

        // Act
        Object decodedMessage = decoder.decode(channel, remoteAddress, message);

        // Assert
        assertNull(decodedMessage);
    }

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

    @Test
    public void decodeDecodeSingleTimeTest() throws Exception {
        // Arrange
        DeviceSession deviceSession = new DeviceSession();
        Protocol protocol = new Protocol("Galileo");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Object message = new Object();
        Channel channel = null;
        SocketAddress remoteAddress = null;

        byte[] messageBytes1 = "Time".getBytes(StandardCharsets.UTF_8);
        message = Unpooled.copiedBuffer(messageBytes1).wrap().byteSource().array();

        // Act
        Date decodedTime = (Date) decoder.decode(channel, remoteAddress, message);

        // Assert
        assertNotNull(decodedTime);
    }

    @Test
    public void decodeDecodeMultipleTimesTest() throws Exception {
        // Arrange
        DeviceSession deviceSession = new DeviceSession();
        Protocol protocol = new Protocol("Galileo");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Object message = new Object();
        Channel channel = null;
        SocketAddress remoteAddress = null;

        byte[] messageBytes1 = "Time 1".getBytes(StandardCharsets.UTF_8);
        message = Unpooled.copiedBuffer(messageBytes1).wrap().byteSource().array();

        byte[] messageBytes2 = "Time 2".getBytes(StandardCharsets.UTF_8);
        message = Unpooled.copiedBuffer(messageBytes2).wrap().byteSource().array();

        // Act
        List<Date> decodedTimes = (List<Date>) decoder.decode(channel, remoteAddress, message);

        // Assert
        assertTrue(decodedTimes.size() == 2);
    }

    @Test
    public void decodeDecodeDeviceInfoTest() throws Exception {
        // Arrange
        DeviceSession deviceSession = new DeviceSession();
        Protocol protocol = new Protocol("Galileo");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Object message = new Object();
        Channel channel = null;
        SocketAddress remoteAddress = null;

        byte[] messageBytes1 = "Device Info".getBytes(StandardCharsets.UTF_8);
        message = Unpooled.copiedBuffer(messageBytes1).wrap().byteSource().array();

        // Act
        Map<String, String> decodedDeviceInfo = (Map<String, String>) decoder.decode(channel, remoteAddress, message);

        // Assert
        assertTrue(decodedDeviceInfo.size() > 0);
    }

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