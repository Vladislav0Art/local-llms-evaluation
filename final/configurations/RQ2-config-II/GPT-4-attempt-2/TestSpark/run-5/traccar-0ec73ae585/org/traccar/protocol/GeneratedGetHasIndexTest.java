package org.traccar.protocol;

import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.junit.Assert;
import org.junit.Test;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

public class GeneratedGetHasIndexTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));

    @Test
    public void getHasIndexTest() {
        Assert.assertFalse(decoder.getHasIndex());
    }

}