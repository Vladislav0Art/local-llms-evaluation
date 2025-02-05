package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.session.DeviceSession;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private static final String DEVICE_ID = "123456789012345";
    private Channel channel;
    private Gt06ProtocolDecoder decoder;

    @Test
    public void decodeGpsWithNoDataTest() {
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(0), false, TimeZone.getDefault());
        assertFalse(result);
        assertNull(position.getDeviceId());
    }

    @Test
    public void decodeGpsWithInvalidDataLengthTest() {
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(1), true, TimeZone.getDefault());
        assertFalse(result);
        assertNull(position.getDeviceId());
    }

    @Test
    public void decodeGpsWithoutLengthTest() {
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(12), false, TimeZone.getDefault());
        assertFalse(result);
    }

    @Test
    public void decodeGpsWithLengthTest() {
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(16), true, TimeZone.getDefault());
        assertTrue(result);
        assertNotNull(position);
    }

    @Test
    public void decodeTest() throws Exception {
        channel = mock(Channel.class);
        decoder = new Gt06ProtocolDecoder(new Protocol());
        Object result = decoder.decode(channel, new InetSocketAddress(80), Unpooled.copiedBuffer(DEVICE_ID.getBytes()));
        assertTrue(result instanceof Position);
        Position p = (Position) result;
        assertEquals(DEVICE_ID, p.getDeviceId());
    }

}