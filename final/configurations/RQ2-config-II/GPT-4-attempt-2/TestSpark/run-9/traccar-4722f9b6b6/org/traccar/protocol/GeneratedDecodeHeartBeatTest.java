package org.traccar.protocol;

import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.Protocol;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;
import org.mockito.Mockito;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeHeartBeatTest {

    @Test
    public void decodeHeartBeatTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        ByteBuf buf = Unpooled.copiedBuffer("[3G*1234567890*0002*LK]", StandardCharsets.US_ASCII);
        Channel channel = Mockito.mock(Channel.class);

        Position position = (Position) decoder.decode(channel, null, buf);

        assertNull(position);
    }

}