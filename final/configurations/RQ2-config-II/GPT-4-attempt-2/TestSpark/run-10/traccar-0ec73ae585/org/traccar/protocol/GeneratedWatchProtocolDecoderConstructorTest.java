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

public class GeneratedWatchProtocolDecoderConstructorTest {

    @Test
    public void WatchProtocolDecoderConstructorTest() {
        Protocol protocol = new Protocol("testProtocol");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertTrue(decoder instanceof BaseProtocolDecoder);
    }

}