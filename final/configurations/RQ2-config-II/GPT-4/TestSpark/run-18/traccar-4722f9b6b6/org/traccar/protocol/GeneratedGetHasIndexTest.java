package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.session.SessionManager;

import java.net.InetSocketAddress;

public class GeneratedGetHasIndexTest {

    @Test
    public void getHasIndexTest() {
        Protocol protocol = new Protocol("watchProtocol") {
        };
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals(false, decoder.getHasIndex());
    }

}