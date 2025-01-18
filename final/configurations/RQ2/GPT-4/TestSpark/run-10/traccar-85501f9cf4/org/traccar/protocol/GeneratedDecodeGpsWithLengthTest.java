package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedDecodeGpsWithLengthTest {

    @Test
    public void decodeGpsWithLengthTest() {
        Position position = new Position();
        byte[] data = "gpsdatalong".getBytes(StandardCharsets.UTF_8);
        ByteBuf buffer = Unpooled.copiedBuffer(data);

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buffer, true, TimeZone.getDefault());

        Assert.assertTrue(result);
    }

}