package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.SocketAddress;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Protocol protocol = new Protocol("testProtocol");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = Mockito.mock(Channel.class);
        SocketAddress socketAddress = Mockito.mock(SocketAddress.class);
        Object msg = new Object();

        Object decodedObject = decoder.decode(channel, socketAddress, msg);

        Assert.assertNotNull(decodedObject);
    }

}