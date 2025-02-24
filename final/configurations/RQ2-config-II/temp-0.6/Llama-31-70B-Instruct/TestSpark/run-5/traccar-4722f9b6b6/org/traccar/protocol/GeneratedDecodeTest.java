package org.traccar.protocol;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(mock(Protocol.class));
        assertNull(watchProtocolDecoder.decode(mock(Channel.class), mock(SocketAddress.class), ""));
    }

}