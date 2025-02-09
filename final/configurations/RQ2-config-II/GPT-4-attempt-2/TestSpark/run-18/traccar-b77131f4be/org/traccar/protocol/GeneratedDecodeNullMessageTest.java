package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.SocketAddress;

import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.model.Position;

public class GeneratedDecodeNullMessageTest {

    @Test
    public void decodeNullMessageTest() throws Exception {
        Protocol protocol = new Protocol("test");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = null;

        Object result = decoder.decode(channel, remoteAddress, msg);
        Assert.assertNull(result);
    }

}