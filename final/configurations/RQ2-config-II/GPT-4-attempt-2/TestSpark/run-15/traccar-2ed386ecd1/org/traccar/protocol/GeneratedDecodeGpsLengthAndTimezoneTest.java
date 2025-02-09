package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedDecodeGpsLengthAndTimezoneTest {

    @Test
    public void decodeGpsLengthAndTimezoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("any raw bytes".getBytes(StandardCharsets.UTF_8));

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getTimeZone("UTC"));
        Assert.assertTrue(result);
    }

}