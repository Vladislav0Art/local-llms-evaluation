package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodePositionsTest {

    private Protocol mockProtocol = mock(Protocol.class);

    @Test
    public void decodePositionsTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(mockProtocol);
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(1);
        buf.writeShortLE(30);
        buf.writeByte(3);
        buf.writeBytes("12345678901".getBytes(StandardCharsets.US_ASCII));
        buf.writeByte(30);
        buf.writeByte(1);
        buf.writeInt(1);
        buf.writeInt(1);

        Channel channel = Mockito.mock(Channel.class);
        List<Position> positions = (List<Position>) decoder.decode(channel, null, buf);

        assertNotNull(positions);
        assertFalse(positions.isEmpty());
        assertTrue(positions.get(0).getValid());
    }

}