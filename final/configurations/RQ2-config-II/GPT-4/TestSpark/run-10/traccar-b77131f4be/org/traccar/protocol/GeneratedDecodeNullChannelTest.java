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
public class GeneratedDecodeNullChannelTest {

    @Test
    public void decodeNullChannelTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = new Object();

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Object decoded = decoder.decode(null, remoteAddress, msg);

        assertNull(decoded);
    }

}