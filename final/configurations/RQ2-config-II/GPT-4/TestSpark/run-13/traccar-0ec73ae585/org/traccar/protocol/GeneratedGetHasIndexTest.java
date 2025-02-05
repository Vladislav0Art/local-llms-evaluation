package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.InetSocketAddress;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetHasIndexTest {

    private final WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());

    @Test
    public void getHasIndexTest() {
        assertEquals(false, decoder.getHasIndex());
    }

}