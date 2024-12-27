package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import org.traccar.Protocol;
import org.traccar.protocol.WatchProtocolDecoder;

import java.nio.channels.Channel;
import java.net.SocketAddress;

import io.netty.channel.Channel;
import org.jboss.netty.channel.Channel;

import static org.mockito.Mockito.*;

public class GeneratedGetHasIndexDefaultTest {

    @Test
    public void getHasIndexDefaultTest() {
        Protocol mockProtocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(mockProtocol);
        Assert.assertFalse(decoder.getHasIndex());
    }

}