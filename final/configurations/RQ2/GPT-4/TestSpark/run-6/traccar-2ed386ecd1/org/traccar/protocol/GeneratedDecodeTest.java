package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.util.TimeZone;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        byte[] bytes = {0x00, 0x00, 0x00};
        ByteBuf msg = Unpooled.wrappedBuffer(bytes);
        Assert.assertNull(decoder.decode(null, new InetSocketAddress("127.0.0.1", 80), msg));
    }

}