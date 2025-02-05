package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeValidMessageTest {

    @Test
    public void decodeValidMessageTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Channel channel = Mockito.mock(Channel.class);
        ByteBuf msg = Unpooled.buffer();

        msg.writeBytes("validMessage".getBytes());

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Object decoded = decoder.decode(channel, remoteAddress, msg);

        assertNotNull(decoded);
    }

}