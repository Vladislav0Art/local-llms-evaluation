package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.network.Message;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedGetHasIndexDefaultTest {

    @Test
    public void getHasIndexDefaultTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));

        assertTrue(decoder.getHasIndex());
    }

}