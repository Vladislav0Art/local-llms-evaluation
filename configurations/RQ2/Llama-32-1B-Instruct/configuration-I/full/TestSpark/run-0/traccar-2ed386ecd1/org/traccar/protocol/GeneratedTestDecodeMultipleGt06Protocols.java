package org.traccar.protocol;

import org.junit.Before;
import org.junit.Test;

import java.nio.ByteBuffer;
import java.util.UUID;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedTestDecodeMultipleGt06Protocols {

    private BaseProtocolDecoder decoder;
    private Position position;
    private ByteBuf buf;
    private TimeZone timezone;
    private Channel channel;
    private SocketAddress remoteAddress;
    private Object msg;

    @Before
    public void setUp() {
        decoder = new Gt06ProtocolDecoder();
        position = new Position(new UUID(1, 2), 3.4);
        buf = ByteBuffer.allocate(10).order(ByteOrder.LITTLE_ENDIAN);
        timezone = TimeZone.getTimeZone("UTC");
        channel = mock(Channel.class);
        remoteAddress = new SocketAddress(UUID.randomUUID().orElse(null));
        msg = "Hello";
    }

    @Test
    public void testDecodeMultipleGt06Protocols() {
        when(decoder.decode(position, buf, false, true, false, timezone)).thenReturn(true);
        when(decoder.decode(position, buf, false, true, false, TimeZone.getTimeZone("America/New_York"))).thenReturn(false);

        Object result = decoder.decode(position, buf, false, true, false, timezone);
        assertTrue(result instanceof Boolean);
    }

}