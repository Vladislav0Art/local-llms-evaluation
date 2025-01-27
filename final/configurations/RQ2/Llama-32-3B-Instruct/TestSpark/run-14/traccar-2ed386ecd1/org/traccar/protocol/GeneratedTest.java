package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ByteBuf buf;

    @Mock
    private Channel channel;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private NetworkMessage networkMessage;

    @Test
    public void decodeGpsPositionTest() {
        byte[] bytes = { /* valid data */};
        int length = 10;
        boolean hasSatellites = true;
        boolean hasSpeed = false;
        TimeZone timezone = TimeZone.getTimeZone("UTC");
        Position position = new Position(1, 2, 3);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, bytes, length, timezone);
        assertTrue(result);
    }

    @Test
    public void decodeGpsPositionWithSatellitesTest() {
        byte[] bytes = { /* valid data */};
        int length = 10;
        boolean hasSatellites = true;
        boolean hasSpeed = false;
        TimeZone timezone = TimeZone.getTimeZone("UTC");
        Position position = new Position(1, 2, 3);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, bytes, length, hasSatellites, timezone);
        assertTrue(result);
    }

    @Test
    public void decodeGpsPositionWithSpeedTest() {
        byte[] bytes = { /* valid data */};
        int length = 10;
        boolean hasLength = true;
        boolean hasSatellites = false;
        boolean hasSpeed = true;
        TimeZone timezone = TimeZone.getTimeZone("UTC");
        Position position = new Position(1, 2, 3);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, bytes, length, hasSatellites, hasSpeed, timezone);
        assertTrue(result);
    }

    @Test
    public void decodePositionTest() throws Exception {
        Object msg = new NetworkMessage(networkMessage);
        Object result = Gt06ProtocolDecoder.decode(channel, deviceSession, msg);
        assertNotNull(result);
    }

    @Test
    public void decodeNetworkTest() throws Exception {
        Object msg = new NetworkMessage(deviceSession);
        Object result = Gt06ProtocolDecoder.decode(channel, deviceSession, msg);
        assertNotNull(result);
    }

    @Test
    public void decodeInvalidDataTest() {
        byte[] bytes = { /* invalid data */};
        int length = 10;
        boolean hasLength = true;
        TimeZone timezone = TimeZone.getTimeZone("UTC");
        Position position = new Position(1, 2, 3);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, bytes, length, timezone);
        assertFalse(result);
    }

    @Test
    public void decodeNullBufTest() {
        byte[] bytes = { /* valid data */};
        int length = 10;
        boolean hasLength = true;
        TimeZone timezone = TimeZone.getTimeZone("UTC");
        Position position = new Position(1, 2, 3);
        assertThrows(Exception.class, () -> Gt06ProtocolDecoder.decodeGps(position, null, length, timezone));
    }

}