package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeGps_WithLengthFlagTrueTest {

    @Test
    public void decodeGps_WithLengthFlagTrueTest() {
        Position mockedPosition = mock(Position.class);
        ByteBuf buf = Unpooled.copiedBuffer("123456789", StandardCharsets.UTF_8);
        TimeZone timeZone = TimeZone.getDefault();

        assertFalse(Gt06ProtocolDecoder.decodeGps(mockedPosition, buf, true, timeZone));
    }

}