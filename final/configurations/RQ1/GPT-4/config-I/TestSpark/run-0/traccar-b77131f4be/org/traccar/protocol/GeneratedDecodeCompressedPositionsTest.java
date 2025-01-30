package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

import java.net.SocketAddress;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeCompressedPositionsTest {

    @Mock
    private Protocol protocol;

    private GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

    @Test
    public void decodeCompressedPositionsTest() {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        ByteBuf buf = Unpooled.buffer().writeByte(1).writeShortLE(2).writeByte(15).writeByte(8);
        buf.writeShortLE(2);

        List<Position> positions = null;
        try {
            positions = (List<Position>) decoder.decode(channel, remoteAddress, buf);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertTrue("Positions should not be null and empty", positions != null && !positions.isEmpty());
    }

}