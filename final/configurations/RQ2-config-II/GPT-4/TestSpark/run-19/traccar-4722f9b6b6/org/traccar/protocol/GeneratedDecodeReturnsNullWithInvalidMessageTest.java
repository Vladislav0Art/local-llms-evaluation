package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import org.traccar.Protocol;

public class GeneratedDecodeReturnsNullWithInvalidMessageTest {

    @Test
    public void decodeReturnsNullWithInvalidMessageTest() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol("watch"));
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object message = "invalid_message";

        Assert.assertNull(watchProtocolDecoder.decode(channel, remoteAddress, message));
    }

}