package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Gt06ProtocolDecoder decoder = Mockito.mock(Gt06ProtocolDecoder.class);
        Assert.assertNull(decoder.decode(null, null, "someMessage"));
    }

}