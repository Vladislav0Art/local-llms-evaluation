package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDecodeGpsWithLength {

    @Mock
    private Protocol protocol;

    @Mock
    private Position position;

    @Mock
    private byte[] buf;

    @Mock
    private TimeZone timezone;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    public Object createChannel(SocketAddress remoteAddress, Object msg) {
        return null;
    }

    public boolean decodeGps(Position position, int length, TimeZone timezone) {
        return false;
    }

    public boolean decode(Channel channel, SocketAddress remoteAddress, Position position) {
        return false;
    }

    @Test
    public void testDecodeGpsWithLength() {
        when(protocol.getProtocolType()).thenReturn(1);
        when(buf.length).thenReturn(10);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf.length, timezone);
        assertTrue(result);
    }

}