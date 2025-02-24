package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import java.net.SocketAddress;

public class GeneratedTestDecode {

    @Test
    public void testDecode() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        Object mockMessage = Mockito.mock(Object.class);
        SocketAddress mockAddress = Mockito.mock(SocketAddress.class);
        assertNull(watchProtocolDecoder.decode(Mockito.mock(Channel.class), mockAddress, mockMessage));
    }

}