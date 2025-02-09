package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
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
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("00001321", StandardCharsets.US_ASCII);
        Assert.assertFalse(decoder.decodeGps(position, buf, false, TimeZone.getDefault()));
    }

}