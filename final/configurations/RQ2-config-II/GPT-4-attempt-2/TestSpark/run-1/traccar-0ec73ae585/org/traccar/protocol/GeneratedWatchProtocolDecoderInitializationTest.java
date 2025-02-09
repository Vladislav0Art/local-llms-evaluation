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
public class GeneratedWatchProtocolDecoderInitializationTest {

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

}