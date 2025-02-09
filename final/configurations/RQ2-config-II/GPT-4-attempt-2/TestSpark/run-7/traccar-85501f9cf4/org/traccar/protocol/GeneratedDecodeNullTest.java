package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedDecodeNullTest {

    @Test
    public void decodeNullTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        Assert.assertNull(decoder.decode(null, null, null));
    }

}