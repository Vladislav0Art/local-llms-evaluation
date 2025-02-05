package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import org.traccar.Protocol;

public class GeneratedDecodeReturnsNullWithNoRemoteAddressTest {

    @Test
    public void decodeReturnsNullWithNoRemoteAddressTest() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol("watch"));
        Channel channel = Mockito.mock(Channel.class);
        Object message = "valid_message";

        Assert.assertNull(watchProtocolDecoder.decode(channel, null, message));
    }

}