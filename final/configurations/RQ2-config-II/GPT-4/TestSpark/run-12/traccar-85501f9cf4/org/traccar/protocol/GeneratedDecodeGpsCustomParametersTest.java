package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedDecodeGpsCustomParametersTest {

    @Test
    public void decodeGpsCustomParametersTest() {
        Position position = new Position();
        String data = "010101010101010101010101";
        ByteBuf buf = Unpooled.wrappedBuffer(data.getBytes(StandardCharsets.UTF_8));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");

        Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, timeZone));
    }

}