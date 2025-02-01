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

public class GeneratedDecodeMinimalDataSetTest {

    @Test
    public void decodeMinimalDataSetTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("0189012e03380038003800780078007800", StandardCharsets.UTF_8);
        decoder.decodeMinimalDataSet(position, buf);

        assert (position.getFixTime() != null);
    }

}