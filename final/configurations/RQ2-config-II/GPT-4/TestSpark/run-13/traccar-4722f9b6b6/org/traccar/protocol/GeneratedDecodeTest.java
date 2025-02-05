package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() {
        Protocol mockProtocol = Mockito.mock(Protocol.class);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(mockProtocol);
        Channel mockChannel = Mockito.mock(Channel.class);
        InetSocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);

        Object decoded = null;
        try {
            decoded = decoder.decode(mockChannel, remoteAddress, "sample message");
        } catch (Exception e) {
            Assert.fail("Exception thrown during test: " + e.toString());
        }

        Assert.assertEquals(Position.UNKNOWN, decoded);
    }

}