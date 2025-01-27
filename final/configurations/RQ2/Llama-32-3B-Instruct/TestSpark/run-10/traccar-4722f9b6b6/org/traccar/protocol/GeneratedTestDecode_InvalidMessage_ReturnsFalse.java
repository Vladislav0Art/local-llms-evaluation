package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDecode_InvalidMessage_ReturnsFalse {

    @Mock
    private Protocol protocol;

    public void testHasIndex() {
        assertTrue(WatchProtocolDecoder.getHasIndex());
    }

    public void testGetManufacturer() {
        when(protocol.getManufacturer()).thenReturn("test");
        assertEquals("test", WatchProtocolDecoder.getManufacturer(protocol));
    }

    @Test
    public void testDecode_InvalidMessage_ReturnsFalse() throws Exception {
        Channel channel = mockChannel();
        SocketAddress remoteAddress = mockSocketAddress();
        Object msg = Unpooled.buffer(0);

        Object result = WatchProtocolDecoder.decode(channel, remoteAddress, msg);
        assertFalse(result instanceof Boolean);
    }

}