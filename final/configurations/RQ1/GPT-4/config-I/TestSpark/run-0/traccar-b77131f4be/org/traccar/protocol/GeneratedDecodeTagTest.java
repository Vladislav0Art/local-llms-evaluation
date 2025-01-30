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
public class GeneratedDecodeTagTest {

    @Mock
    private Protocol protocol;

    private GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

    @Test
    public void decodeTagTest() {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        ByteBuf buf = Unpooled.buffer().writeByte(1).writeShortLE(2).writeByte(15).writeByte(7);
        buf.writeByte(0x01); // add mock data for identification header
        buf.writeIntLE(1); // index
        buf.writeBytes("123456789012345".getBytes()); // device id
        buf.writeByte(1); // session status
        buf.writeIntLE(1); // reserved
        buf.writeIntLE(1); // date and time
        buf.writeBytes(new byte[23]); // coordinates block
        buf.writeShortLE(5); // data tag header
        buf.writeBytes(new byte[10]); // 10 bytes for minimal data set

        List<Position> positions = null;
        try {
            positions = (List<Position>) decoder.decode(channel, remoteAddress, buf);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull("Positions should not be null", positions);
        assertFalse("Positions should not be empty", positions.isEmpty());
        assertEquals(1, positions.get(0).get(Position.KEY_INDEX));
    }

}