package org.traccar.protocol;

import io.netty.channel.Channel;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.protocol.WatchProtocolDecoder;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Channel channel;
    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void getHasIndex_DefaultState_ReturnsFalse() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        assertEquals(false, decoder.getHasIndex());
    }

    @Test
    public void getManufacturer_DefaultState_ReturnsNull() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        assertEquals(null, decoder.getManufacturer());
    }

    @Test
    public void decode_NullMessage_ReturnsNull() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Object result = decoder.decode(channel, remoteAddress, null);
        assertEquals(null, result);
    }

    @Test
    public void decode_EmptyMessage_ReturnsNull() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        byte[] bytes = new byte[0];
        Object result = decoder.decode(channel, remoteAddress, Unpooled.wrappedBuffer(bytes));
        assertEquals(null, result);
    }

    @Test
    public void decode_InvalidTypeMessage_ReturnsNull() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Object result = decoder.decode(channel, remoteAddress, new Object());
        assertEquals(null, result);
    }

}