package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class GeneratedGetHasIndexTest {

    private Protocol protocol = new Protocol();
    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

    @Test
    public void getHasIndexTest() {
        boolean result = decoder.getHasIndex();
        assertEquals(false, result);
    }

}