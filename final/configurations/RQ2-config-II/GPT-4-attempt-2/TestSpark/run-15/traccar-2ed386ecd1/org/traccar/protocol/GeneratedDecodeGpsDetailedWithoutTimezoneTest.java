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

public class GeneratedDecodeGpsDetailedWithoutTimezoneTest {

    @Test
    public void decodeGpsDetailedWithoutTimezoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("any raw bytes".getBytes(StandardCharsets.UTF_8));

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, false, null);
        Assert.assertTrue(result);
    }

}