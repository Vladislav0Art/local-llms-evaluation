package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.DeviceSession;

import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodeMessageWithUnknownProtocolTest {

    @Test
    public void decodeMessageWithUnknownProtocolTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.wrappedBuffer("UNKNOWNPROTOCOL".getBytes());

        assertEquals(null, decoder.decode(channel, remoteAddress, buf));
    }

}