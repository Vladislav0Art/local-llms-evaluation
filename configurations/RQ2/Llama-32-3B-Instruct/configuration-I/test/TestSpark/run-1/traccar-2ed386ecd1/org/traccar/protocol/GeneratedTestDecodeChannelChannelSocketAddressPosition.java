package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDecodeChannelChannelSocketAddressPosition {

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
    public void testDecodeChannelChannelSocketAddressPosition() {
        when(channel).thenReturn(null);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Position position = mock(Position.class);

        boolean result = Gt06ProtocolDecoder.decode(channel, remoteAddress, position);
        assertFalse(result);
    }
}

class Protocol {

    public int getProtocolType() {
        return 1;
    }

}

class Position {

}

class ByteBuf {

    public int length() {
        return 10;
    }

}

class TimeZone {

}

class Channel {
}

}