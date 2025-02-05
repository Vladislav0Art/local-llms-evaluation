package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        ByteBuf buf = Unpooled.copiedBuffer("1,2,3,4".getBytes(StandardCharsets.UTF_8));
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        Channel channel = mock(Channel.class);

        assertFalse(decoder.decode(channel, null, buf) instanceof Position);
    }

}