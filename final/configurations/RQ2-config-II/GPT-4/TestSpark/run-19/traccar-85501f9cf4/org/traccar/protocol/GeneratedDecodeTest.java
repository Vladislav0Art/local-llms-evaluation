package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Channel channel = mock(Channel.class);
        byte[] bytes = "01020304".getBytes(StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        assertEquals(null, decoder.decode(channel, null, Unpooled.wrappedBuffer(bytes)));
    }

}