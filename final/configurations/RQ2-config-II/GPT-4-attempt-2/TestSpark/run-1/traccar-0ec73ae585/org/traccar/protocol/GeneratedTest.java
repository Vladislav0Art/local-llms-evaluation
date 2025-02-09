package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.traccar.Protocol;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    Channel channel;

    @Mock
    Protocol protocol;

    @Test
    public void WatchProtocolDecoderInitializationTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNull(decoder.getManufacturer());
        assertEquals(false, decoder.getHasIndex());
    }

    @Test
    public void decodeNonStringInputTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        int msg = 123;

        Object response = decoder.decode(channel, null, msg);

        assertNull(response);
    }

    @Test
    public void decodeStringInputTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String msg = "Test message";

        Object response = decoder.decode(channel, null, msg);

        assertNull(response);
    }

    @Test
    public void decodeWithChannelTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String msg = "Test message";

        Object response = decoder.decode(channel, null, msg);

        assertNull(response);
        verify(channel, times(1)).writeAndFlush(new NetworkMessage(response, channel.remoteAddress()));
    }

}