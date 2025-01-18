package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.session.DeviceSession;
import org.traccar.NetworkMessage;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithNetworkMessageTest {

    @Test
    public void decodeWithNetworkMessageTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test"));
        NetworkMessage networkMessage = new NetworkMessage("Test Message", new InetSocketAddress(80));
        Object result = decoder.decode(Mockito.mock(Channel.class), new InetSocketAddress(80), networkMessage);
        Assert.assertNotNull(result);
    }

}