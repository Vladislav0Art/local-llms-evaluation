package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithValidChannelAndValidRemoteAddressTest {

    @Mock
    Protocol protocol;

    @Test
    public void decodeWithValidChannelAndValidRemoteAddressTest() throws Exception {
        Channel channel = new NioServerSocketChannel();
        SocketAddress remoteAddress = new InetSocketAddress("127.0.0.1", 8080);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Object decodedObject = decoder.decode(channel, remoteAddress, null);
        assertNull(decodedObject);
    }

}