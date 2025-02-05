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

public class GeneratedDecodeGpsNoLengthTest {

    @Test
    public void decodeGpsNoLengthTest() {
        ByteBuf buf = Unpooled.copiedBuffer("12345678", StandardCharsets.UTF_8);
        Position position = new Position();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));

        boolean result = decoder.decodeGps(position, buf, false,
                TimeZone.getTimeZone("Europe/Paris"));
        Assert.assertTrue(result);
    }

}