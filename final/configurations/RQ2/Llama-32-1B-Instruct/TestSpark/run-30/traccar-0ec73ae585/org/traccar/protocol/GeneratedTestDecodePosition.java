package org.traccar.protocol;

import org.junit.Before;
import org.junit.Test;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.buffer.Unpooled;
import io.netty.util.CharsetUtil;

import java.nio.charset.StandardCharsets;

public class GeneratedTestDecodePosition {

    private WatchProtocolDecoder decoder;

    @Before
    public void setup() {
        decoder = new WatchProtocolDecoder(new Protocol("1.0"));
    }

    @Test
    public void testDecodePosition() throws Exception {
        Channel channel = Unpooled.buffer(100).setByteBuf(new ByteBuf(100));
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);
        channel.writeAndFlush(position);
        String decodedMessage = decoder.decode(channel, null);
        assertNotNull(decodedMessage);
        assertEquals("1.0", decodedMessage);
    }

}