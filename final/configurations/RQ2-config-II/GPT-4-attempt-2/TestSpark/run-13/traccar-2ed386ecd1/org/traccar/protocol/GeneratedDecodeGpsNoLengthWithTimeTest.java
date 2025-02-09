package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;

import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodeGpsNoLengthWithTimeTest {

    @Test
    public void decodeGpsNoLengthWithTimeTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        buf.writeInt(0);
        buf.writeByte((byte) 1);
        buf.writeByte((byte) 1);
        buf.writeByte((byte) 1);
        buf.writeByte((byte) 0);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getTimeZone("GMT"));
        assertTrue(result);
    }

}