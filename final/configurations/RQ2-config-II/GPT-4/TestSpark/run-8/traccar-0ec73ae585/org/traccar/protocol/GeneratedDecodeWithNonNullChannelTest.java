package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.InetSocketAddress;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithNonNullChannelTest {

    @Mock
    Channel channel;

    @Test
    public void decodeWithNonNullChannelTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watchProtocol"));
        decoder.decode(channel, new InetSocketAddress("localhost", 8080), "someMessage");

        verify(channel, times(2)).writeAndFlush(new NetworkMessage("response", new InetSocketAddress("localhost", 8080)));
    }

}