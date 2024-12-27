package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.traccar.Protocol;
import io.netty.channel.Channel;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Protocol mockProtocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(mockProtocol);
        Channel mockChannel = Mockito.mock(Channel.class);
        InetSocketAddress mockAddress = Mockito.mock(InetSocketAddress.class);

        Object object = decoder.decode(mockChannel, mockAddress, "test message");

        Assert.assertNull(object);
    }

}