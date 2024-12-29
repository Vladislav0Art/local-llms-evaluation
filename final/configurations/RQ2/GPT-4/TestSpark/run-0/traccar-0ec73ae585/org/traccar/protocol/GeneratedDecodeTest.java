package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import java.net.SocketAddress;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Object msg = Mockito.mock(Object.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        assertNull(decoder.decode(null, remoteAddress, msg));
    }

}