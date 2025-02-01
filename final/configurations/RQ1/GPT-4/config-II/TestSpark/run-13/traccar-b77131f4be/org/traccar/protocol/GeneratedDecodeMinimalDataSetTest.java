package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodeMinimalDataSetTest {

    @Test
    public void decodeMinimalDataSetTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(null);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        ByteBuf buf = Unpooled.buffer().writeInt(1);
        Position position = new Position();
        try {
            decoder.decode(channel, remoteAddress, buf);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertTrue(position.getValid());
    }

}