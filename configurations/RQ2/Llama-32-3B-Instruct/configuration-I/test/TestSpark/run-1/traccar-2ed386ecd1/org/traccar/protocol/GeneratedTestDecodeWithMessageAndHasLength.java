package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDecodeWithMessageAndHasLength {

    @Mock
    private Protocol protocol;

    @Mock
    private Position position;

    @Mock
    private ByteBuf buf;

    @Mock
    private TimeZone timezone;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    public Object createChannel(SocketAddress remoteAddress, Object msg) {
        return null;
    }

    public void testDecodeGpsNoParameters() {
        when(protocol.getProtocolType()).thenReturn(1);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, timezone);
        assertTrue(result);
    }

    public void testDecodeGpsWithLength() {
        when(protocol.getProtocolType()).thenReturn(1);
        when(buf.hasRemaining()).thenReturn(true);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, timezone);
        assertTrue(result);
    }

    public void testDecodeGpsWithoutLength() {
        when(protocol.getProtocolType()).thenReturn(1);
        when(buf.hasRemaining()).thenReturn(false);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, timezone);
        assertFalse(result);
    }

    public void testDecodeGpsHasSatellites() {
        when(protocol.getProtocolType()).thenReturn(1);
        when(buf.hasRemaining()).thenReturn(true);
        boolean result = Gt06ProtocolDecoder.decodeGps(
                position, buf, true, true, false, timezone);
        assertTrue(result);
    }

    public void testDecodeGpsHasSpeed() {
        when(protocol.getProtocolType()).thenReturn(1);
        when(buf.hasRemaining()).thenReturn(true);
        boolean result = Gt06ProtocolDecoder.decodeGps(
                position, buf, true, true, true, timezone);
        assertTrue(result);
    }

    public void testDecodeGpsNoMessage() {
        Object msg = null;
        when(channel.sendMessage(msg)).thenThrow(new Exception());
        try {
            Gt06ProtocolDecoder.decode(
                    createChannel(remoteAddress, null), remoteAddress, msg);
            fail("Expected exception");
        } catch (Exception e) {
            // expected
        }
    }

    public void testDecodeGpsMultipleMessage() {
        Object msg = null;
        when(channel.sendMessage(msg)).thenThrow(new Exception());
        try {
            Gt06ProtocolDecoder.decode(
                    createChannel(remoteAddress, position), remoteAddress, null);
            fail("Expected exception");
        } catch (Exception e) {
            // expected
        }
    }

    public void testDecodeGpsZeroLength() {
        Object msg = null;
        when(protocol.getProtocolType()).thenReturn(1);
        boolean result = Gt06ProtocolDecoder.decode(
                createChannel(remoteAddress, position), remoteAddress, msg);
        assertFalse(result);
    }

    @Test
    public void testDecodeWithMessageAndHasLength() {
        Object msg = 0;
        when(channel.sendMessage(msg)).thenReturn(true);
        boolean result = Gt06ProtocolDecoder.decode(
                channel, remoteAddress, position);
        assertTrue(result);
    }

}