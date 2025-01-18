package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class GeneratedDecodeThrowsExceptionTest {

    private static Protocol protocolMock = Mockito.mock(Protocol.class);

    @Test
    public void decodeThrowsExceptionTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocolMock);
        decoder.decode(channel, remoteAddress, new Object());
    }

}