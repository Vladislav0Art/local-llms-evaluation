package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;
import org.traccar.Protocol;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedDecodeTest {

    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));

    @Test
    public void decodeTest() throws Exception {
        Object result = decoder.decode(null, null, "0000000000000000");
        Assert.assertEquals(null, result);
    }

}