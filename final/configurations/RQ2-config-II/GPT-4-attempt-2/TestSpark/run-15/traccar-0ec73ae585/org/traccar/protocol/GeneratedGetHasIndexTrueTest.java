package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.netty.channel.Channel;

import java.net.SocketAddress;

public class GeneratedGetHasIndexTrueTest {

    @Test
    public void getHasIndexTrueTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        assertTrue(decoder.getHasIndex());
    }

}