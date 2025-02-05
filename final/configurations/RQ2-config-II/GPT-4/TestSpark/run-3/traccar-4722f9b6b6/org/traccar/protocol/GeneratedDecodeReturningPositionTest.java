package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodeReturningPositionTest {

    @Test
    public void decodeReturningPositionTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        // Assuming that this string will make the method return a Position
        String msg = "[3G*8800000015*0002*LK]";
        Object result = decoder.decode(null, remoteAddress, msg);
        assertNotNull(result);
        assertTrue(result instanceof Position);
    }

}