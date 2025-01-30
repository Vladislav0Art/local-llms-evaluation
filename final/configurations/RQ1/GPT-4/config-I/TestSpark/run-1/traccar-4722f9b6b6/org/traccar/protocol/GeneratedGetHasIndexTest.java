package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Device;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

public class GeneratedGetHasIndexTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("Test Protocol"));

    @Test
    public void getHasIndexTest() {
        boolean result = decoder.getHasIndex();
        Assert.assertEquals(false, result);
    }

}