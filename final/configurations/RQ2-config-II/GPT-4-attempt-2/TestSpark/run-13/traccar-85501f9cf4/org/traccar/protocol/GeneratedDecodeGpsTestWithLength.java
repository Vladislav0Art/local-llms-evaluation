package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;

import java.nio.charset.StandardCharsets;
import java.time.ZoneId;
import java.util.TimeZone;

import static org.mockito.Mockito.mock;

public class GeneratedDecodeGpsTestWithLength {

    private final Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Gt06Protocol());

    @Test
    public void decodeGpsTestWithLength() {
        Position position = new Position();
        byte[] bytes = "820000000000000000FF03393238063838706641573619443304102000000FF009BCB".getBytes(StandardCharsets.ISO_8859_1);
        ByteBuf buffer = Unpooled.wrappedBuffer(bytes);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buffer, true, TimeZone.getTimeZone(ZoneId.systemDefault()));
        Assert.assertTrue(result);
    }

}