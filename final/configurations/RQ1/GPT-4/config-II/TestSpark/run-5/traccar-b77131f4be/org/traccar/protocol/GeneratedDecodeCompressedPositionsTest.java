package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodeCompressedPositionsTest {

    @Test
    public void decodeCompressedPositionsTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("gl200"));
        Channel channel = mock(Channel.class, RETURNS_DEEP_STUBS);
        SocketAddress remoteAddress = mock(SocketAddress.class);

        ByteBuf buf = Unpooled.buffer();
        buf.writeInt(1000);
        List<Position> positions = decoder.decodeCompressedPositions(channel, remoteAddress, buf);
        Position position = positions.get(0);

        assertEquals(new Date(1000), position.getFixTime());
    }

}