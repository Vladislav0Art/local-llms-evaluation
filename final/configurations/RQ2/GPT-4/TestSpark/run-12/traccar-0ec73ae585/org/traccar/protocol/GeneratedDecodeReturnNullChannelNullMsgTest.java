package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class GeneratedDecodeReturnNullChannelNullMsgTest {

    @Test
    public void decodeReturnNullChannelNullMsgTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = null;
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);
        Object msg = null;
        Assert.assertNull(decoder.decode(channel, remoteAddress, msg));
    }

}