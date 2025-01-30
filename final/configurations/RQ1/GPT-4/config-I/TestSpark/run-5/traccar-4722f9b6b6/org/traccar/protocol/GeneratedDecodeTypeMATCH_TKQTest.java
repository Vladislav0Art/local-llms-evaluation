package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.traccar.model.Position;
import org.mockito.runners.MockitoJUnitRunner;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTypeMATCH_TKQTest {

    @Test
    public void decodeTypeMATCH_TKQTest() throws Exception {
        Protocol protocol = new Protocol("watchProtocol");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = mock(Channel.class);
        ByteBuf msg = Unpooled.copiedBuffer("[3G*1111*0016*TKQ]", StandardCharsets.US_ASCII);

        when(channel.remoteAddress()).thenReturn(null);

        assertNull(decoder.decode(channel, null, msg));
    }

}