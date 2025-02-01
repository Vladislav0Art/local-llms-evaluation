package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Channel channel = mock(Channel.class);
        when(channel.remoteAddress()).thenReturn(null);

        ByteBuf byteBuf = Unpooled.copiedBuffer("[2b*ch3333333333*UD140001151445A-122.301499N122.301499S100.00,0.00,-0.1,0,0,0,0,0,0,00000000,0]\n",
                StandardCharsets.US_ASCII);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol(""));
        Position position = (Position) decoder.decode(channel, null, byteBuf);
        assertTrue(position.getValid());
        assertEquals(0, position.getLatitude(), 0.1);
        assertEquals(0, position.getLongitude(), 0.1);
    }

}