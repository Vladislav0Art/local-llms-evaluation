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
public class GeneratedDecodeTypeMATCH_TKTest {

    @Test
    public void decodeTypeMATCH_TKTest() throws Exception {
        Protocol protocol = new Protocol("watchProtocol");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = null;
        ByteBuf msg = Unpooled.copiedBuffer("[3G*1111*0016*TK,AAAAMjAxODEyMTQxNzU1NTksfg==]", StandardCharsets.US_ASCII);

        Position result = decoder.decode(channel, null, msg);
        assertNotNull(result);
        assertEquals(result.getProtocol(), protocol.getName());
    }

}