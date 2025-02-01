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

public class GeneratedDecodeInvalidDataTest {

    @Test
    public void decodeInvalidDataTest() throws Exception {
        Channel channel = mock(Channel.class);
        when(channel.remoteAddress()).thenReturn(null);

        ByteBuf byteBuf = Unpooled.copiedBuffer("[2b*ch3333333333*UD140001151445A-122.30149\n",
                StandardCharsets.US_ASCII);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol(""));
        assertNull(decoder.decode(channel, null, byteBuf));
    }

}