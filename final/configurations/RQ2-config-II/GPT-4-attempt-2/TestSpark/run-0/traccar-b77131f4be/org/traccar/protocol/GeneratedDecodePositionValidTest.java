package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.helper.UnitConverter;

import java.net.InetSocketAddress;

import io.netty.channel.Channel;
import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBuf;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodePositionValidTest {

    private GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("galileo", 0, null, null, null, null, null, null, null, null, null, null));

    @Test
    public void decodePositionValidTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);

        // Construct a legitimate msg object
        ByteBuf msg = Unpooled.buffer(16);
        msg.writeInt(1);
        msg.writeInt(2);
        msg.writeInt(3);

        String remoteAddress = "10.0.0.1:12345";
        Object result = decoder.decode(channel, new InetSocketAddress(remoteAddress), msg);

        assertTrue(result instanceof Position);
        Position position = (Position) result;

        assertEquals(1, position.getValid());
        assertEquals(2, position.getLatitude());
        assertEquals(3, position.getLongitude());
    }

}