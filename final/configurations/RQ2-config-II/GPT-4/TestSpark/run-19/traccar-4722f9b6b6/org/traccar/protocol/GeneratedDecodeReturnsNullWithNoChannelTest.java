package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import org.traccar.Protocol;

public class GeneratedDecodeReturnsNullWithNoChannelTest {

    @Test
    public void decodeReturnsNullWithNoChannelTest() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol("watch"));
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object message = "valid_message";

        Assert.assertNull(watchProtocolDecoder.decode(null, remoteAddress, message));
    }

}