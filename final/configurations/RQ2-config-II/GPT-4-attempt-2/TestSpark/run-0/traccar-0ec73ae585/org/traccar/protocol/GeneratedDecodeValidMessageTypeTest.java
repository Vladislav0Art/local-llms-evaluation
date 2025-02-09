package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;

import static org.mockito.Mockito.*;

public class GeneratedDecodeValidMessageTypeTest {

    @Test
    public void decodeValidMessageTypeTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Position validMsg = mock(Position.class);
        try {
            decoder.decode(null, remoteAddress, validMsg);
        } catch (Exception ex) {
            fail("Expected no Exception to be thrown");
        }
    }

}