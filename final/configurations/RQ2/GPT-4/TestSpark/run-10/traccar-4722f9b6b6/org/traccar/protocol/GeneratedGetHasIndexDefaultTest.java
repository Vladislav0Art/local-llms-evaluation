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
public class GeneratedGetHasIndexDefaultTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    SocketAddress remoteAddress;

    @Test
    public void getHasIndexDefaultTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        boolean hasIndex = decoder.getHasIndex();
        Assert.assertEquals(false, hasIndex);
    }

}