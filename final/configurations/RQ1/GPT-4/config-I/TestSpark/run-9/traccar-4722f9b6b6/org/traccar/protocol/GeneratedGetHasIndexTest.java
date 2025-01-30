package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;

import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;

public class GeneratedGetHasIndexTest {

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        assertEquals(decoder.getHasIndex(), false);
    }

}