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

public class GeneratedDecodeGpsWithPartialParamsTest {

    @Test
    public void decodeGpsWithPartialParamsTest() {
        ByteBuf buf = Unpooled.copiedBuffer("0804030210e000", StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        Position position = new Position();

        Assert.assertFalse(decoder.decodeGps(position, buf, true, false, false, TimeZone.getDefault()));
    }

}