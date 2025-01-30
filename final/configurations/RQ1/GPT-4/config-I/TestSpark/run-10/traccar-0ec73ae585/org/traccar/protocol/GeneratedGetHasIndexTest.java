package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;

import io.netty.channel.Channel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;

public class GeneratedGetHasIndexTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test"));

    @Test
    public void getHasIndexTest() {
        assertTrue(!decoder.getHasIndex());
    }

}