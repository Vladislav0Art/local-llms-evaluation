package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.socket.SocketAddress;

import java.net.TimeZone;

public class GeneratedTestDecodeGps {

    private Gt06ProtocolDecoder gt06ProtocolDecoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));

    @Test
    public void testDecodeGps() {
        Position position = Mockito.mock(Position.class);
        ByteBuf buf = Unpooled.buffer();
        boolean hasLength = true;
        TimeZone timezone = TimeZone.getDefault();

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, timezone);

        assertTrue(result);
    }

}