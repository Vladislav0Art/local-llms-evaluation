package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;

public class GeneratedGetHasIndexTest {

    @Test
    public void getHasIndexTest() {
        Protocol protocol = new Protocol("protocol");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        boolean result = decoder.getHasIndex();
        Assert.assertFalse(result);
    }

}