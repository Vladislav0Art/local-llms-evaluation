package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeNullTest {

    @Test
    public void decodeNullTest() throws Exception {
        Protocol protocol = new Protocol("testProtocol");
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = null;
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);

        assertNull(watchProtocolDecoder.decode(channel, remoteAddress, msg));
    }

}