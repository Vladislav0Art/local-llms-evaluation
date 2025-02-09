package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.SocketAddress;

public class GeneratedGetHasIndexDefaultTest {

    @Test
    public void getHasIndexDefaultTest() {
        Protocol protocol = new Protocol("testProtocol");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertFalse(decoder.getHasIndex());
    }

}