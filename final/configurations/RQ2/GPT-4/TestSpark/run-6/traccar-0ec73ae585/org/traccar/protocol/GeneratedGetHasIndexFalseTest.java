package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class GeneratedGetHasIndexFalseTest {

    private static Protocol protocolMock = Mockito.mock(Protocol.class);

    @Test
    public void getHasIndexFalseTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocolMock);
        Assert.assertFalse(decoder.getHasIndex());
    }

}