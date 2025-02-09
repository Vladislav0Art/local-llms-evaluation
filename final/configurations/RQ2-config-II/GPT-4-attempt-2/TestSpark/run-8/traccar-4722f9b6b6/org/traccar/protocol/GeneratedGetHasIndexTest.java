package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;

import java.nio.charset.StandardCharsets;

public class GeneratedGetHasIndexTest {

    @Test
    public void getHasIndexTest() {
        Protocol protocol = new Protocol("testProtocol");
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        Assert.assertTrue(watchProtocolDecoder.getHasIndex());
    }

}