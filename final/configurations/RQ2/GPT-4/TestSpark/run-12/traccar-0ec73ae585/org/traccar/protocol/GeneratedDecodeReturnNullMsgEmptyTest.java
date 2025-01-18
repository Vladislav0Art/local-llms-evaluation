package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class GeneratedDecodeReturnNullMsgEmptyTest {

    @Test
    public void decodeReturnNullMsgEmptyTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);
        Object msg = "";
        Assert.assertNull(decoder.decode(channel, remoteAddress, msg));
    }

}