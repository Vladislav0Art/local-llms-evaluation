package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        assertNull(watchProtocolDecoder.decode(Mockito.mock(Channel.class), Mockito.mock(SocketAddress.class), "test"));
    }

}