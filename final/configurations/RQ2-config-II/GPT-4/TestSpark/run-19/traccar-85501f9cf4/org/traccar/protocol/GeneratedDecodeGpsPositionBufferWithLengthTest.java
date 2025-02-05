package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeGpsPositionBufferWithLengthTest {

    @Test
    public void decodeGpsPositionBufferWithLengthTest() {
        Position position = new Position();
        byte[] bytes = "01020304".getBytes(StandardCharsets.UTF_8);
        Gt06ProtocolDecoder.decodeGps(
                position, Unpooled.copiedBuffer(bytes), true, TimeZone.getTimeZone("GMT"));
        assertEquals(position, bytes);
    }

}