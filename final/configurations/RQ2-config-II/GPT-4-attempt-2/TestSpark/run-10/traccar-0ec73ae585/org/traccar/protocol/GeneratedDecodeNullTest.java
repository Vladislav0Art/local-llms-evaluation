package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.BaseProtocolDecoder;

import java.net.SocketAddress;

import org.mockito.Mockito;

import java.nio.channels.Channel;

public class GeneratedDecodeNullTest {

    @Test
    public void decodeNullTest() throws Exception {
        Protocol protocol = new Protocol("testProtocol");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress address = Mockito.mock(SocketAddress.class);
        String msg = null;

        assertEquals(null, decoder.decode(channel, address, msg));
    }

}