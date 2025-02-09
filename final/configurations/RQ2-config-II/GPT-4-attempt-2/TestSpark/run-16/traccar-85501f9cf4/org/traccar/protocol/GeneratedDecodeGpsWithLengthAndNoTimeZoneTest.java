package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsWithLengthAndNoTimeZoneTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void decodeGpsWithLengthAndNoTimeZoneTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("0F0202020F021212", StandardCharsets.ISO_8859_1);

        assertFalse(decoder.decodeGps(position, buf, true, null));
    }

}