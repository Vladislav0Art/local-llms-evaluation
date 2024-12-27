package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @InjectMocks
    private Gt06ProtocolDecoder decoder;

    @Test
    public void decodeGps_ValidParams_ReturnTrue() {
        byte[] buf = new byte[10];
        when(protocol.getBuffer()).thenReturn(buf);
        boolean result = decoder.decodeGps(new Position(), buf, true, true, false, null);
        assertTrue(result);
    }

    @Test
    public void decodeGps_InvalidParams_ReturnFalse() {
        byte[] buf = new byte[0];
        when(protocol.getBuffer()).thenReturn(buf);
        assertFalse(decoder.decodeGps(new Position(), buf, true, true, false, null));
    }

    @Test
    public void decodeGps_LengthNotAvailable_ReturnFalse() {
        byte[] buf = Mockito.mock(byte[].class);
        when(protocol.getBuffer()).thenReturn(buf);
        assertFalse(decoder.decodeGps(new Position(), Mockito.mock(ByteBuf.class), false, true, false, null));
    }

    @Test
    public void decodeGps_SatellitesNotAvailable_ReturnFalse() {
        byte[] buf = new byte[10];
        when(protocol.getBuffer()).thenReturn(buf);
        assertFalse(decoder.decodeGps(new Position(), buf, true, false, false, null));
    }

    @Test
    public void decodeGps_SpeedNotAvailable_ReturnFalse() {
        byte[] buf = new byte[10];
        when(protocol.getBuffer()).thenReturn(buf);
        assertFalse(decoder.decodeGps(new Position(), buf, true, true, false, null));
    }

    @Test
    public void decodeGps_TimezoneNull_ReturnException() {
        byte[] buf = Mockito.mock(byte[].class);
        when(protocol.getBuffer()).thenReturn(buf);
        Exception exception = assertThrows(Exception.class, () -> decoder.decodeGps(new Position(), buf, true, true, false, null));
        assertNotNull(exception.getMessage());
    }

    @Test
    public void decode_InvalidMessage_ReturnException() {
        when(channel.getRemoteAddress()).thenReturn(Mockito.mock(SocketAddress.class));
        Exception exception = assertThrows(Exception.class, () -> decoder.decode(channel, Mockito.mock(SocketAddress.class), "invalid message"));
        assertNotNull(exception.getMessage());
    }

    @Test
    public void decode_ValidMessage_ReturnInstance() throws Exception {
        when(channel.getRemoteAddress()).thenReturn(Mockito.mock(SocketAddress.class));
        Object result = decoder.decode(channel, Mockito.mock(SocketAddress.class), new Object());
        assertNull(result);
    }

}