package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.model.Position;
import org.traccar.Protocol;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedDecodeTagTest {

    @Test
    public void decodeTagTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("01020304", StandardCharsets.UTF_8);
        decoder.decodeTag(position, buf, 0x01);

        assert (position.get(Position.KEY_VERSION_HW) != null);
        assert ((int) position.get(Position.KEY_VERSION_HW) == 1);
    }

}