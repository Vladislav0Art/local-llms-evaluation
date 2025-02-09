package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;

public class GeneratedDecodeWithUnknownMessageTest {

    @Test
    public void decodeWithUnknownMessageTest() throws Exception {
        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = Mockito.mock(Channel.class);
        SocketAddress address = Mockito.mock(SocketAddress.class);

        Position result = (Position) decoder.decode(channel, address, "unknown");

        Assert.assertNull(result);
    }

}