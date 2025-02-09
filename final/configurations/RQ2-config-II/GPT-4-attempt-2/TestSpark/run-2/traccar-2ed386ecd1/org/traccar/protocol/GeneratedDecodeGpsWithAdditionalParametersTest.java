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

public class GeneratedDecodeGpsWithAdditionalParametersTest {

    @Test
    public void decodeGpsWithAdditionalParametersTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("0000132116", StandardCharsets.US_ASCII);
        Assert.assertTrue(decoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault()));
    }

}