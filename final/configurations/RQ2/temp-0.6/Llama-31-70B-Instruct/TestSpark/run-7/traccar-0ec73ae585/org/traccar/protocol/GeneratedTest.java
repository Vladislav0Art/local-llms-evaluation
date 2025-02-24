package org.traccar.protocol;

import io.netty.channel.Channel;
import io.netty.channel.socket.DatagramChannel;
import io.netty.channel.socket.SocketChannel;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private WatchProtocolDecoder watchProtocolDecoder;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private Object msg;

    @Before
    public void setUp() {
        watchProtocolDecoder = new WatchProtocolDecoder(new WatchProtocol());
    }

    @Test
    public void decodeTest() throws Exception {
        assertNull(watchProtocolDecoder.decode(channel, remoteAddress, msg));
    }

}