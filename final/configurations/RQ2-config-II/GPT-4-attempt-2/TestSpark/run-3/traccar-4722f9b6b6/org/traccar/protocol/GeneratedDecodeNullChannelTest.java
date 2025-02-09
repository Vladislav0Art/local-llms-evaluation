package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import io.netty.buffer.Unpooled;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedDecodeNullChannelTest {

    @Test
    public void decodeNullChannelTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Object msg = Unpooled.copiedBuffer("123456789", StandardCharsets.UTF_8);
        Object decoded = decoder.decode(null, null, msg);
        assertNull(decoded);
    }

}