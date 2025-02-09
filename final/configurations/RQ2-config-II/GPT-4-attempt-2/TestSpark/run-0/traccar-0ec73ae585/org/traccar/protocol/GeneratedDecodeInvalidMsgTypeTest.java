package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;

import static org.mockito.Mockito.*;

public class GeneratedDecodeInvalidMsgTypeTest {

    @Test
    public void decodeInvalidMsgTypeTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        String invalidMsg = "Invalid";
        try {
            decoder.decode(null, remoteAddress, invalidMsg);
            fail("Expected a ClassCastException to be thrown");
        } catch (ClassCastException cce) {
            assertTrue(true);
        }
    }

}