package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.channel.Channel;

import java.net.SocketAddress;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWatchProtocolDecoderConstructorTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    SocketAddress remoteAddress;

    @Test
    public void WatchProtocolDecoderConstructorTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertNotNull(decoder);
    }

}