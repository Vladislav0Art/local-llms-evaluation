package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.Assert;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import static org.mockito.Mockito.*;

public class GeneratedDecodeValidMessageTest {

    private GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("gp"));

    @Test
    public void decodeValidMessageTest() throws Exception {
        String msg = "355227043578424,C,150721060058,,,,,000.000,000,0000,0,0000000000,00000000,313000*05:00,11,100";
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);
        Assert.assertNotNull(decoder.decode(channel, remoteAddress, msg));
    }

}