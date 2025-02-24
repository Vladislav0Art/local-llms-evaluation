package org.traccar.protocol;

import static org.junit.Assert.assertNotNull;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;

public class GeneratedTestGetHasIndex {

    @Test
    public void testGetHasIndex() {
        final WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));

        assertNotNull(decoder.getHasIndex());
    }

}