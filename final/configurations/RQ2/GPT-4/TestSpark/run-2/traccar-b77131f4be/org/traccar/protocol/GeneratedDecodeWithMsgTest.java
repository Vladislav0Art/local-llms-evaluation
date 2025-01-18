package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;

import java.net.SocketAddress;

import static org.junit.Assert.assertNotNull;

public class GeneratedDecodeWithMsgTest {

    @Test
    public void decodeWithMsgTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());
        Object result = decoder.decode(null, null, Unpooled.copiedBuffer("1234567890".getBytes()));
        assertNotNull(result);
    }

}