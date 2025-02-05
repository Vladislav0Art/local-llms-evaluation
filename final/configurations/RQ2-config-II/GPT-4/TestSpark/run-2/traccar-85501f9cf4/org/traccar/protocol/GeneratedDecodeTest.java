package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;
import java.time.ZoneId;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeTest {

    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));

    @Test
    public void decodeTest() throws Exception {
        Gt06ProtocolDecoder decoderSpy = Mockito.spy(decoder);
        ByteBuf buf = Unpooled.copiedBuffer("00030000000000058F".getBytes(StandardCharsets.UTF_8));
        Object result = decoderSpy.decode(null, null, buf);
        Mockito.verify(decoderSpy, Mockito.times(1)).decode(null, null, buf);
    }

}