package org.traccar.protocol;

import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTest {

    @Test
    public void testDecode_GalileoVersion() {
        // Arrange
        Protocol protocol = new Protocol();
        DeviceSession deviceSession = new DeviceSession("device1", "device2");
        SocketAddress remoteAddress = new SocketAddress("192.168.1.100:8080");

        // Act
        Object result = GalileoProtocolDecoder.decode(deviceSession, remoteAddress, null);

        // Assert
        assertEquals(1234, (int) result);
    }

    @Test
    public void testDecode_GalileoPosition() {
        // Arrange
        Position position = new Position("latitude", "longitude");
        SocketAddress remoteAddress = new SocketAddress("192.168.1.100:8080");

        // Act
        Object result = GalileoProtocolDecoder.decode(position, remoteAddress, null);

        // Assert
        assertEquals(1234, (int) result);
    }

    @Test
    public void testDecode_GalileoDeviceList() {
        // Arrange
        List<SocketAddress> deviceAddresses = new LinkedList<>();
        deviceAddresses.add(new SocketAddress("192.168.1.100:8080"));
        SocketAddress remoteAddress = new SocketAddress("192.168.1.101:8080");

        // Act
        Object result = GalileoProtocolDecoder.decode(deviceAddresses, remoteAddress, null);

        // Assert
        assertTrue(result instanceof List);
    }

    @Test
    public void testDecode_GalileoDeviceAddress() {
        // Arrange
        SocketAddress deviceAddress = new SocketAddress("192.168.1.100");

        // Act
        Object result = GalileoProtocolDecoder.decode(deviceAddress, null, null);

        // Assert
        assertTrue(result instanceof String);
    }

    @Test
    public void testDecode_GalileoTime() {
        // Arrange
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT"));

        // Act
        Object result = GalileoProtocolDecoder.decode(null, null, new ProtocolTimeRequest(calendar));

        // Assert
        assertTrue(result instanceof int);
    }

    @Test
    public void testDecode_GalileoTimeRange() {
        // Arrange
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        calendar.add(Calendar.YEAR, 1);

        // Act
        Object result = GalileoProtocolDecoder.decode(null, null, new ProtocolTimeRequest(calendar));

        // Assert
        assertTrue(result instanceof int);
    }

    @Test
    public void testDecode_GalileoTimestamp() {
        // Arrange
        Date date = new Date();

        // Act
        Object result = GalileoProtocolDecoder.decode(null, null, new ProtocolTimestampRequest(date));

        // Assert
        assertTrue(result instanceof long);
    }

}