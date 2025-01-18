package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class GeneratedDecodeWithEmptyMessageTest {

    Protocol protocol = new Protocol("galileo", true);

    @Test
    public void decodeWithEmptyMessageTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = new InetSocketAddress("127.0.0.1", 8888);
        String emptyMessage = "";
        try {
            Assert.assertNull(decoder.decode(channel, remoteAddress, emptyMessage));
        } catch (Exception e) {
            Assert.fail("Exception should not be thrown");
        }
    }

}