package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class GeneratedDecodeWithNullChannelTest {

    Protocol protocol = new Protocol("galileo", true);

    @Test
    public void decodeWithNullChannelTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = null;
        SocketAddress remoteAddress = new InetSocketAddress("127.0.0.1", 8888);
        String validMessage = "Valid Message";
        try {
            Position position = (Position) decoder.decode(channel, remoteAddress, validMessage);
            Assert.assertNotNull(position);
        } catch (Exception e) {
            Assert.fail("Exception should not be thrown");
        }
    }

}