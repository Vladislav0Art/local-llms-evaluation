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

public class GeneratedDecodeGpsNoLengthNoTimeTest {

    @Test
    public void decodeGpsNoLengthNoTimeTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getDefault());
        assertFalse(result);
    }

}