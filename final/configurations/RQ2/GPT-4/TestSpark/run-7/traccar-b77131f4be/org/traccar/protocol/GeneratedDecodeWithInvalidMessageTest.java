package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class GeneratedDecodeWithInvalidMessageTest {

    Protocol protocol = new Protocol("galileo", true);

    @Test
    public void decodeWithInvalidMessageTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = new InetSocketAddress("127.0.0.1", 8888);
        String invalidMessage = "invalidMessage";
        try {
            Assert.assertNull(decoder.decode(channel, remoteAddress, invalidMessage));
        } catch (Exception e) {
            Assert.fail("Exception should not be thrown");
        }
    }

}