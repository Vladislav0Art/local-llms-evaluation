package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;

import java.net.SocketAddress;

import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTagOtherFuelLevelTest {

    @Mock
    private Protocol protocol;

    private GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

    @Test
    public void decodeTagOtherFuelLevelTest() {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);

        ByteBuf buf = Unpooled.wrappedBuffer(new byte[]{0, 1, 0, 15});
        buf.writeByte(0xc1); // tag to decode
        buf.writeByte(25);  // fuel level value for the tag
        buf.writeByte(-40); // temperature value for the tag
        buf.writeShort(0);  // rpm value for the tag

        List<Position> positions = null;
        try {
            positions = (List<Position>) decoder.decode(channel, remoteAddress, buf);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertNotNull("Positions should not be null", positions);
        assertFalse("Positions should not be empty", positions.isEmpty());
        assertEquals(10.0, positions.get(0).getDouble(Position.KEY_FUEL_LEVEL), 0.001);
    }

}