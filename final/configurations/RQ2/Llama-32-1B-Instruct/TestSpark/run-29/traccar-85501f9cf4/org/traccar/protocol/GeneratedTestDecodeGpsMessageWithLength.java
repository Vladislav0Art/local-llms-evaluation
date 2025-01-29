package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTestDecodeGpsMessageWithLength {

    public Gt06ProtocolDecoder decodeGps(Position position, ByteBuf buf, boolean hasLength, TimeZone timezone) {
        return new Gt06ProtocolDecoder(Protocol.GT06);
    }

    @Test
    public void testDecodeGpsMessageWithLength() throws Exception {
        Position position = new Position(42.1234567, 78.9012345);
        ByteBuf buf = Unpooled.buffer(40); // assume a message length of 40 bytes
        Mockito.when(buf.readBytes()).thenReturn(position.getBytes());
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        assertEquals(Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getDefault()), decoder.decode(channel, remoteAddress, null));
    }

}