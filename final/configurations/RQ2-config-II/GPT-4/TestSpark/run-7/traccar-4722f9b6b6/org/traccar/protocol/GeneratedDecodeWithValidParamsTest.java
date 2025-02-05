package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;

import static org.mockito.Mockito.*;

import java.net.InetSocketAddress;

import io.netty.channel.Channel;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithValidParamsTest {

    @Test
    public void decodeWithValidParamsTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = mock(Channel.class);
        InetSocketAddress remoteAddress = new InetSocketAddress("localhost", 5000);
        Object msg = "TestMessage";

        decoder.decode(channel, remoteAddress, msg);
        verify(protocol, times(1)).getId();
    }

}