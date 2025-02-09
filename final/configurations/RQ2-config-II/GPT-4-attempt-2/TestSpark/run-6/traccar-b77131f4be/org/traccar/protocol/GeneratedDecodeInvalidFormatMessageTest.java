package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.Assert;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import static org.mockito.Mockito.*;

public class GeneratedDecodeInvalidFormatMessageTest {

    private GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("gp"));

    @Test
    public void decodeInvalidFormatMessageTest() throws Exception {
        String msg = "invalid message format";
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);
        Assert.assertNull(decoder.decode(channel, remoteAddress, msg));
    }

}