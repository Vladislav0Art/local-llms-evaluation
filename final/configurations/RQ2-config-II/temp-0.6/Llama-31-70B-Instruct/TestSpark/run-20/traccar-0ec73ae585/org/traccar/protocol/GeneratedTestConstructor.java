package org.traccar.protocol;

import static org.junit.Assert.assertNotNull;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;

public class GeneratedTestConstructor {

    @Test
    public void testConstructor() {
        final Protocol protocol = Mockito.mock(Protocol.class);
        final WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        assertNotNull(decoder);
    }

}