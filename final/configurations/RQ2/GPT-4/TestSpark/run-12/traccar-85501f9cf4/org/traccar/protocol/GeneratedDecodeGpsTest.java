package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.embedded.EmbeddedChannel;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsTest {

    private Protocol protocol = mock(Protocol.class);
    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);

    @Test
    public void decodeGpsTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("Test String", StandardCharsets.UTF_8);
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getDefault()));
    }

}