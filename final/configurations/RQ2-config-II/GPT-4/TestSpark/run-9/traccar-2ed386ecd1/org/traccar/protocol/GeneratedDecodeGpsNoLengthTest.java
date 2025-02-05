package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsNoLengthTest {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));

    @Test
    public void decodeGpsNoLengthTest() {
        ByteBuf buf = Unpooled.copiedBuffer("THIS IS TEST BUFFER".getBytes(StandardCharsets.UTF_8));
        Position position = new Position();
        Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getDefault());
    }

}