package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeNonNullTest {

    @Test
    public void decodeNonNullTest() throws Exception {
        Protocol protocol = new Protocol("testProtocol");
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = "Test message";
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);

        assertNull(watchProtocolDecoder.decode(channel, remoteAddress, msg));
    }

}