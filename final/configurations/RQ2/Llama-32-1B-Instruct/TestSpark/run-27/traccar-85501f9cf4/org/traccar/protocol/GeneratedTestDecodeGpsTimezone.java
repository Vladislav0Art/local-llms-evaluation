package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecodeGpsTimezone {

    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
    private Protocol protocol = new Protocol();
    private Channel channel;
    private SocketAddress remoteAddress;
    @Mock
    private Position position;
    @Mock
    private ByteBuf buf;
    @Mock
    private boolean hasLength;
    @Mock
    private boolean hasSatellites;
    @Mock
    private boolean hasSpeed;
    @Mock
    private TimeZone timezone;

    @Test
    public void testDecodeGpsTimezone() throws Exception {
        Mockito.when(decoder.decode(channel, remoteAddress, position, timezone)).thenReturn(true);
        decoder = new Gt06ProtocolDecoder(protocol);
        channel = new Channel();
        remoteAddress = new SocketAddress("127.0.0.1", 1234);
        position = new Position(37.7749, -122.4194);
        buf = Mockito.mock(ByteBuf.class);
        hasLength = true;
        hasSatellites = false;
        hasSpeed = false;
        timezone = TimeZone.getInstance("GMT");
        Mockito.when(buf.readLong()).thenReturn(0x12L);
        Mockito.when(buf.readInt8()).thenReturn(0x23);

        boolean actual = decoder.decode(channel, remoteAddress, position, buf, hasLength, hasSatellites, hasSpeed, timezone);
        verify(decoder).decode(channel, remoteAddress, position, buf, hasLength, hasSatellites, hasSpeed, timezone);
    }

}